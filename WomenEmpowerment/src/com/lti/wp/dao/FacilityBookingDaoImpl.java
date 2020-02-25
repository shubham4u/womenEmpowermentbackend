package com.lti.wp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Fetch;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.wp.entities.FacilityBooking;
import com.lti.wp.entities.NgoFacReg;
import com.lti.wp.exceptions.WpException;


@Repository
public class FacilityBookingDaoImpl implements FacilityBookingDao{

	@PersistenceContext
	private EntityManager manager;

	public ArrayList<FacilityBooking> getFacilityBooking() throws WpException {

		String strQry = "from FacilityBooking";
		Query qry = manager.createQuery(strQry);
		List<FacilityBooking> list = qry.getResultList();
		//System.out.println(list);
		return (ArrayList<FacilityBooking>) list;
	}


	@Override
	public int getCapacity(int nfacId) throws WpException {

		String strqry = "select n from NgoFacReg n where n.n_FacId=:facbkid";
		Query qry = manager.createQuery(strqry);
		qry.setParameter("facbkid", nfacId);
		NgoFacReg reg = (NgoFacReg) qry.getSingleResult();
		int capacity = reg.getN_FacCapacity();
		return capacity;
	}

	@Override
	public int facCount(int nfacId) throws WpException {

		String strqry = "select f.ngofacreg.n_FacId from FacilityBooking f where f.ngofacreg.n_FacId=:facbkid";
		Query qry = manager.createQuery(strqry);
		qry.setParameter("facbkid", nfacId);
		List<Integer> list = qry.getResultList();
		int count=list.size();
		return count;
	}

	

	@Transactional(propagation=Propagation.REQUIRED)
	public boolean postFacBooking(FacilityBooking facbk) throws WpException {
		boolean b =false;
		int nfacId=facbk.getNgofacreg();
		String strqry = "select n from NgoFacReg n where n.n_FacId=:facbkid";
		Query qry = manager.createQuery(strqry);
		qry.setParameter("facbkid", nfacId);
		NgoFacReg reg = (NgoFacReg) qry.getSingleResult();
		int capacity = reg.getN_FacCapacity();
		String strqry1 = "select f.ngofacreg from FacilityBooking f where f.ngofacreg=:facbkid";
		Query qry1 = manager.createQuery(strqry1);
		qry1.setParameter("facbkid", nfacId);
		List<Integer> list = qry1.getResultList();
		int count=list.size();
		if(count<=capacity) {
			manager.persist(facbk);
			b = true;
		}
			
		return b;
	}

}

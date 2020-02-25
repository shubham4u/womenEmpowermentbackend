package com.lti.wp.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.wp.entities.NgoFacReg;
import com.lti.wp.entities.NgoProgReg;
import com.lti.wp.entities.ProgrammeBooking;
import com.lti.wp.entities.StepRegister;
import com.lti.wp.exceptions.WpException;


@Repository
public class ProgrammeBookingDaoImpl implements ProgrammeBookingDao {
	
	@PersistenceContext
	private EntityManager manager;

	public ArrayList<ProgrammeBooking> getProgrammeBooking() throws WpException {
		String strQry = "from ProgrammeBooking";
		Query qry = manager.createQuery(strQry);
		List<ProgrammeBooking> list = qry.getResultList();
		return (ArrayList<ProgrammeBooking>) list;
		
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean postProgrammeBooking(ProgrammeBooking reg) throws WpException {
		boolean b =false;
		int nProgId=reg.getProgrammid();
		String strqry = "select n from NgoProgReg n where n.n_ProgId=:progbkid";
		Query qry = manager.createQuery(strqry);
		qry.setParameter("progbkid", nProgId);
		NgoProgReg prog = (NgoProgReg) qry.getSingleResult();
		int capacity = prog.getN_ProgCapacity();
		String strqry1 = "select f.programmid from ProgrammeBooking f where f.programmid=:progbkid";
		Query qry1 = manager.createQuery(strqry1);
		qry1.setParameter("progbkid", nProgId);
		List<Integer> list = qry1.getResultList();
		int count=list.size();
		
		if(count<=capacity) {
			manager.persist(reg);
			b = true;
		}
		
		return b;

	
	}
}

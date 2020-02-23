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

import com.lti.wp.entities.FacilityBooking;
import com.lti.wp.entities.NgoFacReg;
import com.lti.wp.exceptions.WpException;


@Repository
public class FacilityBookingDaoImpl implements FacilityBookingDao{

	@PersistenceContext
	private EntityManager manager;

	public ArrayList<FacilityBooking> getFacilityBooking() throws WpException {
//		String strQry = "select bk.bookingid  from FacilityBooking as bkdata where bkdata.facilitybk=1";
//		String strQry = "select f from FacilityBooking f join fetch f.fbk c, f.ngofbk s where f.bookingid=1";
		String strQry = "from FacilityBooking";
//		CriteriaQuery<FacilityBooking> q = cb.createQuery(FacilityBooking.class);
//		Root<FacilityBooking> c = q.from(FacilityBooking.class);
//		Fetch<FacilityBooking, NgoFacReg> p = c.fetch("facilitybk");
//		q.select(c);
//		String strQry = "select f from FacilityBooking f join fetch f.facilitybk, f.useridbk";
		
//		String userdata = "from StepLogin";
//		String ngodata = "from NgoFacReg";
//		Query userqry = manager.createQuery(userdata);
//		Query ngoqry = manager.createQuery(ngodata);
		Query qry = manager.createQuery(strQry);
		
//		List<StepLogin> userList = userqry.getResultList();
//		List<NgoFacReg> ngoList = ngoqry.getResultList();
		List<FacilityBooking> list = qry.getResultList();
//		System.out.println(list +","+userList +","+ ngoList);
//		List ngomerged = new ArrayList(ngoList);
//		List usermerged = new ArrayList(userList);
//		ngomerged.addAll(ngoList);
//		usermerged.addAll(userList);
//		usermerged = ListUtils.union(list, ngoList);
//		list = ListUtils.union(usermerged, userList);
		System.out.println(list);
		
		return (ArrayList<FacilityBooking>) list;
	}


	@Override
	public boolean postFacBooking(FacilityBooking ngofacbk) throws WpException {

		String strqry = "select count(facilityid)  from FacilityBooking  where facilityid=1";
		Query qry = manager.createQuery(strqry);
		int count = (int) qry.getSingleResult();
		System.out.println(count);
//		manager.persist(ngofacbk);
		return true;
	}

	
	

	
}

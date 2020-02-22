package com.lti.wp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.wp.entities.FacilityBooking;
import com.lti.wp.entities.ProgrammeBooking;
import com.lti.wp.exceptions.WpException;

@Repository
public class FacilityBookingDaoImpl implements FacilityBookingDao{

	@PersistenceContext
	private EntityManager manager;

	public ArrayList<FacilityBooking> getFacilityBooking() throws WpException {
		String strQry = "from FacilityBooking";
		Query qry = manager.createQuery(strQry);
		List<FacilityBooking> list = qry.getResultList();
		return (ArrayList<FacilityBooking>) list;
	}

	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean postFacilityBooking(FacilityBooking reg) throws WpException {
		
		manager.persist(reg);
		return true;

	}

	
	

	
}

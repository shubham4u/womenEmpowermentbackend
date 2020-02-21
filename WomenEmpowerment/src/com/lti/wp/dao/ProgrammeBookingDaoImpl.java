package com.lti.wp.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
		
		manager.persist(reg);
		return true;

	
	}
}

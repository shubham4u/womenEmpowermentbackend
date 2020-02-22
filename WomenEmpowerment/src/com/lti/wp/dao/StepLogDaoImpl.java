package com.lti.wp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.wp.entities.StepLogin;
import com.lti.wp.exceptions.WpException;

@Repository
public class StepLogDaoImpl implements StepLogDao {

	@PersistenceContext
	private EntityManager manager;


	public ArrayList<StepLogin> getStepLogin() throws WpException {
		String strQry = "from StepLogin";
		Query qry = manager.createQuery(strQry);
		List<StepLogin> list = qry.getResultList();
		return (ArrayList<StepLogin>) list;
	}


	@Transactional(propagation=Propagation.REQUIRED)
	public boolean postStepLoign(StepLogin log) throws WpException {
		manager.persist(log);
		return true;
	}
	
	

}

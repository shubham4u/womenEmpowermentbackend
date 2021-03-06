package com.lti.wp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.wp.entities.StepRegister;
import com.lti.wp.exceptions.WpException;

@Repository
public class StepRegDaoImpl implements StepRegDao {

	@PersistenceContext
	private EntityManager manager;
	
	public ArrayList<StepRegister> getStepRegister() throws WpException {
		String strQry = "from StepRegister";
		Query qry = manager.createQuery(strQry);
		List<StepRegister> list = qry.getResultList();
		return (ArrayList<StepRegister>) list;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)

	public boolean postStepRegister(StepRegister reg) throws WpException {
		manager.persist(reg);
		return true;
	}

	


}

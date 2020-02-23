package com.lti.wp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.lti.wp.entities.NgoProgReg;
import com.lti.wp.exceptions.WpException;

@Repository
public class NgoProgRegDaoImpl implements NgoProgRegDao {

	
	@PersistenceContext
	private EntityManager manager;
	
	
	@Override
	public ArrayList<NgoProgReg> getNgoProgReg() throws WpException {
		String strQry = "from NgoProgReg";
		Query qry = manager.createQuery(strQry);
		List<NgoProgReg> list = qry.getResultList();
		System.out.println(list);
		return (ArrayList<NgoProgReg>) list;
	}

	@Override
	public boolean postNgoProgReg(NgoProgReg reg) throws WpException {
		manager.persist(reg);
		return true;
	}

}

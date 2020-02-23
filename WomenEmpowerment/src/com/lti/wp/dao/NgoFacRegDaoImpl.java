package com.lti.wp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.wp.entities.NgoFacReg;
import com.lti.wp.exceptions.WpException;

@Repository
public class NgoFacRegDaoImpl implements NgoFacRegDao {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public ArrayList<NgoFacReg> getNgoFacReg() throws WpException {
		String strQry = "from NgoFacReg";
		Query qry = manager.createQuery(strQry);
		List<NgoFacReg> list = qry.getResultList();
		System.out.println(list);
		return (ArrayList<NgoFacReg>) list;
	}

	@Override
	public boolean postNgoFacReg(NgoFacReg nfreg) throws WpException {
		System.out.println(nfreg);
		manager.persist(nfreg);
		return true;
	}

}

package com.lti.wp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.wp.entities.Ngo;
import com.lti.wp.exceptions.WpException;


@Repository
public class NgoDaoImpl implements NgoDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public ArrayList<Ngo> getNgo() throws WpException {
		String strQry= "from Ngo";
		Query qry=manager.createQuery(strQry);
		List<Ngo> list=qry.getResultList();
		return (ArrayList<Ngo>) list;		
	}

	@Override
	public boolean postNgo(Ngo ngo) throws WpException {
		manager.persist(ngo);
		return true;
	}

	
}

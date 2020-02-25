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

	@Override
	public Ngo NgoLogin(Ngo n) throws WpException {
		System.out.println("I'm in dao" +n.getNgoemail() +","+n.getNgopassword() );
		String strQry="select n from Ngo n where n.ngoemail=:ngoemail and n.ngopassword=:ngopassword";
		Query qry = manager.createQuery(strQry);
		qry.setParameter("ngoemail", n.getNgoemail());
		qry.setParameter("ngopassword", n.getNgopassword());
		Ngo ngologin=(Ngo) qry.getSingleResult();
		System.out.println(ngologin);
		
		if(n.getNgopassword().equals(ngologin.getNgopassword()))
		{
//			System.out.println("true"+true);
			return ngologin;
		}
		else
		{
//			System.out.println("False"+false);
			Ngo ngolog=null;
			return ngolog;
		}
	}

	
}

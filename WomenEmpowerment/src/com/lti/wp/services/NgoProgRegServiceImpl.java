package com.lti.wp.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.wp.dao.NgoProgRegDao;
import com.lti.wp.entities.NgoProgReg;
import com.lti.wp.exceptions.WpException;

@Service
public class NgoProgRegServiceImpl implements NgoProgRegService {
	
	@Autowired
	public NgoProgRegDao dao;

	
	
	public ArrayList<NgoProgReg> getNgoProgReg() throws WpException {
	 return dao.getNgoProgReg();
		
	}


	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public boolean postNgoProgReg(NgoProgReg reg) throws WpException {
		
		return dao.postNgoProgReg(reg);
	}

}

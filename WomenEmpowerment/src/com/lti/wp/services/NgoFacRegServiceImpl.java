package com.lti.wp.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.wp.dao.NgoFacRegDao;
import com.lti.wp.entities.NgoFacReg;
import com.lti.wp.exceptions.WpException;

@Service
public class NgoFacRegServiceImpl implements NgoFacRegService {

	@Autowired
	private NgoFacRegDao dao;

	@Override
	public ArrayList<NgoFacReg> getNgoFacReg() throws WpException {
		return dao.getNgoFacReg();
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public boolean postNgoFacReg(NgoFacReg nfreg) throws WpException {
		return dao.postNgoFacReg(nfreg);
	}
}

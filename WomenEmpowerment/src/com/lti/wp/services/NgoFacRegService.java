package com.lti.wp.services;

import java.util.ArrayList;
import java.util.List;

import com.lti.wp.entities.NgoFacReg;
import com.lti.wp.exceptions.WpException;

public interface NgoFacRegService {

	public ArrayList<NgoFacReg> getNgoFacReg() throws WpException;
	public boolean postNgoFacReg(NgoFacReg nfreg) throws WpException;
}

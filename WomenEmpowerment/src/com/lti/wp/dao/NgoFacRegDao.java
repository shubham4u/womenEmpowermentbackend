package com.lti.wp.dao;

import java.util.ArrayList;

import com.lti.wp.entities.NgoFacReg;
import com.lti.wp.exceptions.WpException;

public interface NgoFacRegDao {

	public ArrayList<NgoFacReg> getNgoFacReg() throws WpException;
	public boolean postNgoFacReg(NgoFacReg nfreg) throws WpException;
}

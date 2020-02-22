package com.lti.wp.dao;

import java.util.ArrayList;


import com.lti.wp.entities.NgoProgReg;
import com.lti.wp.exceptions.WpException;

public interface NgoProgRegDao {

	
	public ArrayList<NgoProgReg> getNgoProgReg() throws WpException;
	public boolean postNgoProgReg(NgoProgReg reg) throws WpException;
}

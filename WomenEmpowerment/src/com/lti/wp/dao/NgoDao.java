package com.lti.wp.dao;

import java.util.ArrayList;

import com.lti.wp.entities.Ngo;
import com.lti.wp.exceptions.WpException;

public interface NgoDao {

	public ArrayList<Ngo> getNgo() throws WpException;
	public boolean postNgo(Ngo ngo) throws WpException;
	public Ngo NgoLogin(Ngo n) throws WpException;
}

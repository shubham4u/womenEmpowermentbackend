package com.lti.wp.dao;

import java.util.ArrayList;

import com.lti.wp.entities.StepLogin;

import com.lti.wp.exceptions.WpException;

public interface StepLogDao {
	
	public ArrayList<StepLogin> getStepLogin() throws WpException;
	
	public boolean postStepLoign(StepLogin log) throws WpException;
}

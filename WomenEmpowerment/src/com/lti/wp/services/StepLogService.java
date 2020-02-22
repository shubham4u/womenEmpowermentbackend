package com.lti.wp.services;

import java.util.ArrayList;

import com.lti.wp.entities.StepLogin;

import com.lti.wp.exceptions.WpException;

public interface StepLogService {

	public ArrayList<StepLogin> getStepLogin() throws WpException;
	
	public boolean postStepLoign(StepLogin log) throws WpException;

}

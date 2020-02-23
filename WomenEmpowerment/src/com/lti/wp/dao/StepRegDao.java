package com.lti.wp.dao;

import java.util.ArrayList;

import com.lti.wp.entities.StepRegister;
import com.lti.wp.exceptions.WpException;

public interface StepRegDao {

	public ArrayList<StepRegister> getStepRegister() throws WpException;
	
	public boolean postStepRegister(StepRegister reg) throws WpException;
	public boolean UserLogin(String email, String password) throws WpException;
}

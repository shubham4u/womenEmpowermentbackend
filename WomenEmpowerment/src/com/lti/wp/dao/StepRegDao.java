package com.lti.wp.dao;

import java.util.ArrayList;

import com.lti.wp.entities.StepRegister;
import com.lti.wp.exceptions.WpException;

public interface StepRegDao {

	public ArrayList<StepRegister> getStepRegister() throws WpException;
	
	public boolean postStepRegister(StepRegister reg) throws WpException;
	public StepRegister UserLogin(StepRegister u) throws WpException;
}

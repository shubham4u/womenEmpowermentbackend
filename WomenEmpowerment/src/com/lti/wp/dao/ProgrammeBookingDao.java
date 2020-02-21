package com.lti.wp.dao;

import java.util.ArrayList;

import com.lti.wp.entities.ProgrammeBooking;
import com.lti.wp.entities.StepRegister;
import com.lti.wp.exceptions.WpException;


public interface ProgrammeBookingDao {

	public ArrayList<ProgrammeBooking> getProgrammeBooking() throws WpException;
	public boolean postProgrammeBooking(ProgrammeBooking reg) throws WpException;
}

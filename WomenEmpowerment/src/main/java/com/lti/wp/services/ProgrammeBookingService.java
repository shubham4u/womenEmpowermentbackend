package com.lti.wp.services;

import java.util.ArrayList;

import com.lti.wp.entities.ProgrammeBooking;
import com.lti.wp.entities.StepRegister;
import com.lti.wp.exceptions.WpException;



public interface ProgrammeBookingService {

	public ArrayList<ProgrammeBooking> getProgrammeBooking() throws WpException;
	public boolean postProgrammeBooking(ProgrammeBooking reg) throws WpException;
}

package com.lti.wp.dao;

import java.util.ArrayList;

import com.lti.wp.entities.FacilityBooking;
import com.lti.wp.entities.NgoFacReg;
import com.lti.wp.entities.StepRegister;
import com.lti.wp.exceptions.WpException;

public interface FacilityBookingDao {

	public ArrayList<FacilityBooking> getFacilityBooking() throws WpException;
//	public boolean postFacilityBooking(FacilityBooking reg) throws WpException;
	
	public boolean postFacBooking(FacilityBooking ngofacbk) throws WpException;
}

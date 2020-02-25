package com.lti.wp.dao;

import java.util.ArrayList;

import com.lti.wp.entities.FacilityBooking;
import com.lti.wp.entities.NgoFacReg;
import com.lti.wp.entities.StepRegister;
import com.lti.wp.exceptions.WpException;

public interface FacilityBookingDao {

	public ArrayList<FacilityBooking> getFacilityBooking() throws WpException;

	public int facCount(int facbkId) throws WpException;

	public boolean postFacBooking(FacilityBooking facbk) throws WpException;
	public int getCapacity(int nfacId) throws WpException;
	
}

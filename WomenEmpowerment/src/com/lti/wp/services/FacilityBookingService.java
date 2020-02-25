package com.lti.wp.services;

import java.util.ArrayList;

import com.lti.wp.entities.FacilityBooking;
import com.lti.wp.entities.NgoFacReg;
import com.lti.wp.entities.ProgrammeBooking;
import com.lti.wp.exceptions.WpException;

public interface FacilityBookingService {
	public ArrayList<FacilityBooking> getFacilityBooking() throws WpException;

//	public int facCount(int facbkId) throws WpException;

	public boolean postFacBooking(FacilityBooking facbk) throws WpException;

	public boolean facCount(int nfacId, int facBkCount)  throws WpException;
}


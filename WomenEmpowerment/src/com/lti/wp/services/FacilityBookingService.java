package com.lti.wp.services;

import java.util.ArrayList;

import com.lti.wp.entities.FacilityBooking;
import com.lti.wp.entities.ProgrammeBooking;
import com.lti.wp.exceptions.WpException;

public interface FacilityBookingService {
	public ArrayList<FacilityBooking> getFacilityBooking() throws WpException;
	public boolean postFacilityBooking(FacilityBooking reg) throws WpException;
}


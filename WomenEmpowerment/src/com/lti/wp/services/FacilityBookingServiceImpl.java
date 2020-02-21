package com.lti.wp.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.wp.dao.FacilityBookingDao;
import com.lti.wp.entities.FacilityBooking;
import com.lti.wp.entities.ProgrammeBooking;
import com.lti.wp.exceptions.WpException;

@Service
public class FacilityBookingServiceImpl implements FacilityBookingService {
	
	@Autowired
	public FacilityBookingDao dao;
	
	public ArrayList<FacilityBooking> getFacilityBooking() throws WpException {
		return dao.getFacilityBooking();
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public boolean postFacilityBooking(FacilityBooking reg) throws WpException {
		
			return dao.postFacilityBooking(reg);
	}

}

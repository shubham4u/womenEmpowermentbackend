package com.lti.wp.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.wp.dao.FacilityBookingDao;
import com.lti.wp.entities.FacilityBooking;
import com.lti.wp.entities.NgoFacReg;
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
	public boolean facCount(int nfacId,int facBkCount) throws WpException {
		boolean b = false;
		int capacity=dao.getCapacity(nfacId);
		int count = dao.facCount(nfacId);
		count = count+facBkCount;
		if(count<=capacity){
			b=true;
		}
		return b;
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public boolean postFacBooking(FacilityBooking facbk) throws WpException {
		
		return dao.postFacBooking(facbk);
	}

}

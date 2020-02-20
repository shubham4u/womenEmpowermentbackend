package com.lti.wp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.wp.entities.FacilityBooking;
import com.lti.wp.entities.ProgrammeBooking;
import com.lti.wp.entities.StepRegister;
import com.lti.wp.exceptions.WpException;
import com.lti.wp.services.FacilityBookingService;
import com.lti.wp.services.ProgrammeBookingService;
import com.lti.wp.services.StepRegService;

@RestController

public class WpController {

	@Autowired
	private StepRegService service;
	@Autowired
	private ProgrammeBookingService pbservice;
	
	@Autowired
	private FacilityBookingService fbservice;

//	http://localhost:8989/WomenEmpowerment/getstepregList
//	http://localhost:8989/WomenEmpowerment/poststepregList
//	http://localhost:8989/WomenEmpowerment/getPrgBooking
//	http://localhost:8989/WomenEmpowerment/getFacBooking


	@GetMapping(value="/getstepregList",produces="application/json")
	public @ResponseBody List<StepRegister> getStepRegister() {
		ArrayList<StepRegister> list = null;
		try {
			list = service.getStepRegister();
			System.out.println(list);
		} catch (WpException e) {
			e.printStackTrace();
		}
		return list;
	}

	@PostMapping(value="/poststepregList", consumes="application/json")
	public void postStepRegister(@RequestBody StepRegister reg) {
		System.out.println(reg);
		try {
			boolean recInserted=service.postStepRegister(reg);
		} catch (WpException e) {
			e.printStackTrace();
		}

	}
	
	@GetMapping(value="/getPrgBooking",produces="application/json")
	public @ResponseBody List<ProgrammeBooking> getProgrammeBooking() {
		ArrayList<ProgrammeBooking> pblist = null;
		try {
			pblist = pbservice.getProgrammeBooking();
			System.out.println(pblist);
		} catch (WpException e) {
			e.printStackTrace();
		}
		return pblist;
	}
	
	@GetMapping(value="/getFacBooking",produces="application/json")
	public @ResponseBody List<FacilityBooking> getFacilityBooking() {
		ArrayList<FacilityBooking> fblist = null;
		try {
			fblist = fbservice.getFacilityBooking();
			System.out.println(fblist);
		} catch (WpException e) {
			e.printStackTrace();
		}
		return fblist;
	}
}

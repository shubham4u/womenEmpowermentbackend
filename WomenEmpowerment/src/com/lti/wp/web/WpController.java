package com.lti.wp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.wp.entities.FacilityBooking;
import com.lti.wp.entities.Ngo;
import com.lti.wp.entities.ProgrammeBooking;
import com.lti.wp.entities.StepLogin;
import com.lti.wp.entities.StepRegister;
import com.lti.wp.exceptions.WpException;
import com.lti.wp.services.FacilityBookingService;
import com.lti.wp.services.NgoService;
import com.lti.wp.services.ProgrammeBookingService;
import com.lti.wp.services.StepLogService;
import com.lti.wp.services.StepRegService;


/**
 * 
 * @author Virago
 *	Checked changes on 20-02 :- correct 
 *
 */
@RestController
@CrossOrigin
public class WpController {

	@Autowired
	private StepRegService service;

	@Autowired
	private StepLogService steplogservice;
	
	@Autowired
	private ProgrammeBookingService pbservice;
	
	@Autowired
	private FacilityBookingService fbservice;

	@Autowired
	private NgoService ngservice;

	// http://localhost:8686/WomenEmpowermentV2/getstepregList
	//http://localhost:8989/WomenEmpowerment/postStepLogList
	// http://localhost:8989/WomenEmpowerment/poststepregList
	//	http://localhost:8989/WomenEmpowerment/getPrgBooking
	//	http://localhost:8989/WomenEmpowerment/getFacBooking

	@GetMapping(value = "/getstepregList", produces = "application/json")
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

	@PostMapping(value = "/poststepregList", consumes = "application/json")
	public void postStepRegister(@RequestBody StepRegister reg) {
		System.out.println(reg);
		try {
			boolean recInserted = service.postStepRegister(reg);
		} catch (WpException e) {
			e.printStackTrace();
		}

	}

	@GetMapping(value = "/getstepLogList", produces = "application/json")
	public @ResponseBody List<StepLogin> getStepLogin() {
		ArrayList<StepLogin> list1 = null;
		try {
			list1 = steplogservice.getStepLogin();
			System.out.println(list1);
		} catch (WpException e) {
			e.printStackTrace();
		}
		return list1;
	}
	
	
	@PostMapping(value = "/postStepLogList", consumes = "application/json")
	public void postStepLogin(@RequestBody StepLogin log) {
		System.out.println(log);
		try {
			boolean recInserted = steplogservice.postStepLoign(log);
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
	
	@GetMapping(value="/getngo", produces="application/json")
	public @ResponseBody List<Ngo> getNgo() {
		List<Ngo> nglist = null;
		try {
			nglist = ngservice.getNgo();
			System.out.println(nglist);
		} catch (WpException e) {
			e.printStackTrace();
		}
		return nglist;
	}
}

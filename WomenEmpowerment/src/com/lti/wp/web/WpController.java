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
import com.lti.wp.entities.NgoFacReg;
import com.lti.wp.entities.NgoProgReg;
import com.lti.wp.entities.ProgrammeBooking;
import com.lti.wp.entities.StepLogin;
import com.lti.wp.entities.StepRegister;
import com.lti.wp.exceptions.WpException;
import com.lti.wp.services.FacilityBookingService;
import com.lti.wp.services.NgoFacRegService;
import com.lti.wp.services.NgoProgRegService;
import com.lti.wp.services.NgoService;
import com.lti.wp.services.ProgrammeBookingService;
import com.lti.wp.services.StepLogService;
import com.lti.wp.services.StepRegService;

/**
 * 
 * @author Virago Checked changes on 20-02 :- correct
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

	@Autowired
	private NgoProgRegService nprservice;
	
	@Autowired
	private NgoFacRegService nfservice;

	// http://localhost:8686/WomenEmpowermentV2/getstepLogList    
	// http://localhost:8989/WomenEmpowerment/getFacBooking
	
	// http://localhost:8686/WomenEmpowermentV2/getregList
	//	http://localhost:8989/WomenEmpowerment/getPrgBooking
	//	http://localhost:8989/WomenEmpowerment/getngo
	//	http://localhost:8989/WomenEmpowerment/getNgoProgReg
	//	http://localhost:8989/WomenEmpowerment/getNgoFacReg

	
	// http://localhost:8989/WomenEmpowerment/postregList
	//	http://localhost:8989/WomenEmpowerment/poststepLogList
	//	http://localhost:8989/WomenEmpowerment/postngo
	//	http://localhost:8989/WomenEmpowerment/postNgoProgReg
	//	http://localhost:8989/WomenEmpowerment/postNgoFacReg

	@GetMapping(value = "/getregList", produces = "application/json")
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
	@GetMapping(value="/getNgoFacReg", produces="application/json")
	public @ResponseBody List<NgoFacReg> getNgoFacReg() {
		List<NgoFacReg> ngfaclist = null;
		try {
			ngfaclist = nfservice.getNgoFacReg();
			System.out.println(ngfaclist);
		} catch (WpException e) {
			e.printStackTrace();
		}
		return ngfaclist;
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


	@GetMapping(value = "/getPrgBooking", produces = "application/json")
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

	@GetMapping(value = "/getFacBooking", produces = "application/json")
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

	@GetMapping(value = "/getNgoProgReg", produces = "application/json")
	public @ResponseBody List<NgoProgReg> getNgoProgReg() {
		List<NgoProgReg> nprlist = null;
		try {
			nprlist = nprservice.getNgoProgReg();
			System.out.println("-------------------------------------"+nprlist);
		} catch (WpException e) {
			e.printStackTrace();
		}
		return nprlist;
	}

	@PostMapping(value = "/poststepLogList", consumes = "application/json")
	public void postStepLogin(@RequestBody StepLogin log) {
		System.out.println(log);
		try {
			boolean recInserted = steplogservice.postStepLoign(log);
		} catch (WpException e) {
			e.printStackTrace();
		}
	}
	
	@PostMapping(value = "/postregList", consumes = "application/json")
	public void postStepRegister(@RequestBody StepRegister reg) {
		System.out.println(reg);
		try {
			boolean recInserted = service.postStepRegister(reg);
		} catch (WpException e) {
			e.printStackTrace();
		}

	}

	@PostMapping(value = "/postNgoProgReg", consumes = "application/json")
	public void postNgoProgReg(@RequestBody NgoProgReg reg) {
		System.out.println(reg);
		try {
			System.out.println(reg.getNgo().getNgoid());
			boolean recInserted = nprservice.postNgoProgReg(reg);
		} catch (WpException e) {
			e.printStackTrace();
		}
	}
	
	@PostMapping(value = "/postNgoFacReg", consumes = "application/json")
	public void postNgoFacReg(@RequestBody NgoFacReg nfreg) {
		System.out.println(nfreg);
		try {
			System.out.println(nfreg.getNgo().getNgoid());
			boolean recInserted = nfservice.postNgoFacReg(nfreg);
		} catch (WpException e) {
			e.printStackTrace();
		}
	}
	
	@PostMapping(value = "/postngo", consumes = "application/json")
	public void postngo(@RequestBody Ngo ngo) {
		System.out.println(ngo);
		try {
			boolean recInserted = ngservice.postNgo(ngo);
		} catch (WpException e) {
			e.printStackTrace();
		}
	}
	
	@PostMapping(value = "/validateUser", consumes = "application/json")
	public boolean UserLogin(@RequestBody StepRegister u) throws WpException{
		System.out.println(u);
		return service.UserLogin(u.getEmail(), u.getPassword());
	}
	
	// http://localhost:8989/WomenEmpowerment/postFacBooking
	@PostMapping(value = "/postFacBooking", consumes = "application/json")
	public void postFacBooking(@RequestBody FacilityBooking ngofacbk) {
		System.out.println(ngofacbk);
		try {
			boolean recInserted = fbservice.postFacBooking(ngofacbk);
		} catch (WpException e) {
			e.printStackTrace();
		}
	}
	
	
}

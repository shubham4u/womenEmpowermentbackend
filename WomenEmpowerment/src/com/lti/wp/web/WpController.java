package com.lti.wp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.wp.entities.StepLogin;
import com.lti.wp.entities.StepRegister;
import com.lti.wp.exceptions.WpException;
import com.lti.wp.services.StepLogService;
import com.lti.wp.services.StepRegService;

@RestController

public class WpController {

	@Autowired
	private StepRegService service;

	@Autowired
	private StepLogService service1;

	// http://localhost:8686/WomenEmpowermentV2/getstepregList
	//http://localhost:8686/WomenEmpowermentV2/postStepLogList
	// http://localhost:8282/WomenEmpowermentV2/poststepregList

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
			list1 = service1.getStepLogin();
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
			boolean recInserted = service1.postStepLoign(log);
		} catch (WpException e) {
			e.printStackTrace();
		}

	}
	
	
	
}

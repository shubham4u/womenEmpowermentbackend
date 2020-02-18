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
import com.lti.wp.entities.StepRegister;
import com.lti.wp.exceptions.WpException;
import com.lti.wp.services.StepRegService;

@RestController

public class WpController {

	@Autowired
	private StepRegService service;

//	http://localhost:8282/WomenEmpowerment/getstepregList
//	http://localhost:8282/WomenEmpowerment/poststepregList
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
}

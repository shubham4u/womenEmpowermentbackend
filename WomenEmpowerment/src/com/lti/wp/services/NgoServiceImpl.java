package com.lti.wp.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.wp.dao.NgoDao;
import com.lti.wp.entities.Ngo;
import com.lti.wp.exceptions.WpException;

@Service
public class NgoServiceImpl implements NgoService {
	
	@Autowired
	public NgoDao dao;
	
	public ArrayList<Ngo> getNgo() throws WpException {
		
		return dao.getNgo();
	}
}

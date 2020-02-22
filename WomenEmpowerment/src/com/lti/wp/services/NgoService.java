package com.lti.wp.services;

import java.util.ArrayList;

import com.lti.wp.entities.Ngo;
import com.lti.wp.exceptions.WpException;

public interface NgoService {

		public ArrayList<Ngo> getNgo() throws WpException;
		public boolean postNgo(Ngo ngo) throws WpException;
}

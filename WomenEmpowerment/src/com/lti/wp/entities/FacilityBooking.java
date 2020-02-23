package com.lti.wp.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="facility_booking")
@JsonIgnoreProperties(value = { "fbk", "ngofacreg" }, allowSetters=true)
public class FacilityBooking {

	@Id
	@Column(name="F_BOOKING_ID")
	private int bookingid;
	
	@ManyToOne
	@JoinColumn(name="N_FACILITY_ID")
	private NgoFacReg ngofacreg;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private StepLogin fbk;

}

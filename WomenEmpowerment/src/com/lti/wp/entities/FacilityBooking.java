package com.lti.wp.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="facility_booking")
//@JsonIgnoreProperties(value = { "fbk"}, allowSetters=true)
public class FacilityBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "facbook_seq")
	@SequenceGenerator(name = "facbook_seq", sequenceName = "FACBOOK_SEQ", allocationSize = 1, initialValue = 500)
	@Column(name="F_BOOKING_ID")
	private int bookingid;
	
	/*@ManyToOne(fetch=FetchType.EAGER)*/
	
	@Column(name="N_FACILITY_ID")
	private int ngofacreg;
	
	/*@ManyToOne(fetch=FetchType.EAGER)*/
	@Column(name = "USER_ID")
	private int fbk;

	public FacilityBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacilityBooking(int bookingid, NgoFacReg ngofacreg, StepLogin fbk) {
		super();
		this.bookingid = bookingid;
		/*this.ngofacreg = ngofacreg;
		this.fbk = fbk;*/
	}

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public int getNgofacreg() {
		return ngofacreg;
	}

	public void setNgofacreg(int ngofacreg) {
		this.ngofacreg = ngofacreg;
	}

	public int getFbk() {
		return fbk;
	}

	public void setFbk(int fbk) {
		this.fbk = fbk;
	}

	@Override
	public String toString() {
		return "FacilityBooking [bookingid=" + bookingid + ", ngofacreg=" + ngofacreg + ", fbk=" + fbk + "]";
	}
	
	
	
}

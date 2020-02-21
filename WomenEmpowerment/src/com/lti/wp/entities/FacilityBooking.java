package com.lti.wp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facility_booking")
public class FacilityBooking {

	@Id
	@Column(name="F_BOOKING_ID")
	private int bookingid;
	
	@Column(name="N_FACILITY_ID")
	private int facilityid;
	
	@Column(name="USER_ID")
	private int userid;

	
	public FacilityBooking(int bookingid, int facilityid, int userid) {
		super();
		this.bookingid = bookingid;
		this.facilityid = facilityid;
		this.userid = userid;
	}


	public FacilityBooking() {
		super();
	}


	public int getBookingid() {
		return bookingid;
	}


	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}


	public int getFacilityid() {
		return facilityid;
	}


	public void setFacilityid(int facilityid) {
		this.facilityid = facilityid;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	@Override
	public String toString() {
		return "FacilityBooking [bookingid=" + bookingid + ", facilityid=" + facilityid + ", userid=" + userid + "]";
	}
}

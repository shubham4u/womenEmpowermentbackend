package com.lti.wp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="programme_booking")
public class ProgrammeBooking {
	
	@Id
	@Column(name="P_BOOKING_ID")
	private int bookingid;
	
	@Column(name="N_PROGRAMME_ID")
	private int programmid;
	
	@Column(name="USER_ID")
	private int userid;

	public ProgrammeBooking(int bookingid, int programmid, int userid) {
		super();
		this.bookingid = bookingid;
		this.programmid = programmid;
		this.userid = userid;
	}

	public ProgrammeBooking() {
		super();
	}

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public int getProgrammid() {
		return programmid;
	}

	public void setProgrammid(int programmid) {
		this.programmid = programmid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "ProgrammeBooking [bookingid=" + bookingid + ", programmid=" + programmid + ", userid=" + userid + "]";
	}
	
	
	
}

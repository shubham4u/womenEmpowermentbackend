package com.lti.wp.entities;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "userinfo")
@JsonIgnoreProperties(value = { "register" }, allowSetters=true)
public class StepLogin {

	@Column(name = "USERINFO_AGE")
	private int age;
	
	@Column(name = "USERINFO_ADHAR_NUMBER")
	private long adhar_Number;
	
	@Column(name = "USERINFO_ADDRESS")
	private String address;
	
	@Column(name = "USERINFO_STATE")
	private String state;
	
	@Column(name = "USERINFO_DISTRICT")
	private String district;
	
	@Column(name = "USERINFO_PINCODE")
	private int pincode;
	
	@Column(name = "USERINFO_CONTACT_NO")
	private long contact_No;
	
	@Column(name = "USERINFO_MARITAL_STATUS")
	private String maritial_Status;
	
	@Column(name = "USERINFO_HIGHEST_QUALIFICATION")
	private String highest_Qualification;
	
	@Id
	@Column(name = "USER_ID")
	private int userId;

	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
	private StepRegister register;
	
	@JsonIgnore
	@OneToMany(
			cascade = CascadeType.ALL,
			mappedBy = "fbk"
			)
	private List<FacilityBooking> facilitybooking;
	
	public StepLogin() {
		super();
	}


	public StepLogin(int age, long adhar_Number, String address, String state, String district, int pincode,
			long contact_No, String maritial_Status, String highest_Qualification, int userId) {
		super();
		this.age = age;
		this.adhar_Number = adhar_Number;
		this.address = address;
		this.state = state;
		this.district = district;
		this.pincode = pincode;
		this.contact_No = contact_No;
		this.maritial_Status = maritial_Status;
		this.highest_Qualification = highest_Qualification;
		this.userId = userId;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getAdhar_Number() {
		return adhar_Number;
	}


	public void setAdhar_Number(long adhar_Number) {
		this.adhar_Number = adhar_Number;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public long getContact_No() {
		return contact_No;
	}


	public void setContact_No(long contact_No) {
		this.contact_No = contact_No;
	}


	public String getMaritial_Status() {
		return maritial_Status;
	}


	public void setMaritial_Status(String maritial_Status) {
		this.maritial_Status = maritial_Status;
	}


	public String getHighest_Qualification() {
		return highest_Qualification;
	}


	public void setHighest_Qualification(String highest_Qualification) {
		this.highest_Qualification = highest_Qualification;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public StepRegister getRegister() {
		return register;
	}


	public void setRegister(StepRegister register) {
		this.register = register;
	}


	@Override
	public String toString() {
		return "StepLogin [age=" + age + ", adhar_Number=" + adhar_Number + ", address=" + address + ", state=" + state
				+ ", district=" + district + ", pincode=" + pincode + ", contact_No=" + contact_No
				+ ", maritial_Status=" + maritial_Status + ", highest_Qualification=" + highest_Qualification
				+ ", userId=" + userId + "]";
	}
	
	
	
	}
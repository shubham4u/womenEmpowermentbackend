package com.lti.wp.entities;


import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name="usertable")
public class StepRegister {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userinfo_seq")
	@SequenceGenerator(name = "userinfo_seq", sequenceName = "USERINFO_SEQ", allocationSize = 1, initialValue = 500)
	@Column(name="USER_ID")
	private int userid;
	
	@Column(name="USER_FULLNAME")
	private String fullname;
	
	@Column(name="USER_EMAIL")
	private String email;
	
	@Column(name="USER_DOB")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date userDob;
	
	@Column(name="USER_PASSWORD")
	private String password;

	/*@OneToOne(
			fetch = FetchType.EAGER,
            cascade =  CascadeType.ALL,
            mappedBy = "register")
	private StepLogin login;*/

	public StepRegister() {
		super();
	}

	public StepRegister(int userid, String fullname, String email, Date userDob, String password, StepLogin login) {
		super();
		this.userid = userid;
		this.fullname = fullname;
		this.email = email;
		this.userDob = userDob;
		this.password = password;
//		this.login = login;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getUserDob() {
		return userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*public StepLogin getLogin() {
		return login;
	}

	public void setLogin(StepLogin login) {
		this.login = login;
	}*/

	/*@Override
	public String toString() {
		return "StepRegister [userid=" + userid + ", fullname=" + fullname + ", email=" + email + ", userDob=" + userDob
				+ ", password=" + password +"]";
	}*/

	
	
}

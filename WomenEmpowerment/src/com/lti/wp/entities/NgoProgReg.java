package com.lti.wp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "ngo_programme")
@JsonIgnoreProperties(value = { "ngo" }, allowSetters=true)
public class NgoProgReg {

	@Id
	@Column(name = "N_PROGRAMME_ID")
	private int n_ProgId;

	@Column(name = "N_PROGRAMME_NAME")
	private String n_ProgName;

	@Column(name = "N_PROGRAMME_CITY")
	private String n_ProgCity;

	@Column(name = "N_PROGRAMME_CAPACITY")
	private int n_ProgCapacity;

	@ManyToOne
	@JoinColumn(name = "NGO_ID")
	private Ngo ngo;

	public NgoProgReg(int n_ProgId, String n_ProgName, String n_ProgCity, int n_ProgCapacity, Ngo ngo) {
		super();
		this.n_ProgId = n_ProgId;
		this.n_ProgName = n_ProgName;
		this.n_ProgCity = n_ProgCity;
		this.n_ProgCapacity = n_ProgCapacity;
		this.ngo = ngo;
	}

	public NgoProgReg() {
		super();
	}

	public int getN_ProgId() {
		return n_ProgId;
	}

	public void setN_ProgId(int n_ProgId) {
		this.n_ProgId = n_ProgId;
	}

	public String getN_ProgName() {
		return n_ProgName;
	}

	public void setN_ProgName(String n_ProgName) {
		this.n_ProgName = n_ProgName;
	}

	public String getN_ProgCity() {
		return n_ProgCity;
	}

	public void setN_ProgCity(String n_ProgCity) {
		this.n_ProgCity = n_ProgCity;
	}

	public int getN_ProgCapacity() {
		return n_ProgCapacity;
	}

	public void setN_ProgCapacity(int n_ProgCapacity) {
		this.n_ProgCapacity = n_ProgCapacity;
	}

	public Ngo getNgo() {
		return ngo;
	}

	public void setNgo(Ngo ngo) {
		this.ngo = ngo;
	}

	@Override
	public String toString() {
		return "NgoProgReg [n_ProgId=" + n_ProgId + ", n_ProgName=" + n_ProgName + ", n_ProgCity=" + n_ProgCity
				+ ", n_ProgCapacity=" + n_ProgCapacity + ", ngo=" + ngo + "]";
	}
	
	

}

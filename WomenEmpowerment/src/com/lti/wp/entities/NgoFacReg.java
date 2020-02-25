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

import org.hibernate.annotations.Proxy;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "NGO_FACILITY")
//@JsonIgnoreProperties(value = { "ngo" }, allowSetters=true)
public class NgoFacReg {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ngofacreg_seq")
	@SequenceGenerator(name = "ngofacreg_seq", sequenceName = "NGO_FAC_SEQ", allocationSize = 1, initialValue = 500)
	@Column(name = "N_FACILITY_ID")
	private int n_FacId;

	@Column(name = "N_FACILITY_NAME")
	private String n_FacName;

	@Column(name = "N_FACILITY_CAPACITY")
	private int n_FacCapacity;

	@Column(name = "N_FACILITY_CITY")
	private String n_FacCity;

	@Column(name="NGO_ID")
	private int ngofc;
	
	/*@JsonIgnore
	@OneToMany(
			fetch = FetchType.EAGER,
			cascade=CascadeType.ALL,
			mappedBy ="ngofacreg"
			)
	private List<FacilityBooking> facilitybooking;*/

	public NgoFacReg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NgoFacReg(int n_FacId, String n_FacName, int n_FacCapacity, String n_FacCity, int ngofc,
			List<FacilityBooking> facilitybooking) {
		super();
		this.n_FacId = n_FacId;
		this.n_FacName = n_FacName;
		this.n_FacCapacity = n_FacCapacity;
		this.n_FacCity = n_FacCity;
		this.ngofc = ngofc;
//		this.facilitybooking = facilitybooking;
	}

	public int getN_FacId() {
		return n_FacId;
	}

	public void setN_FacId(int n_FacId) {
		this.n_FacId = n_FacId;
	}

	public String getN_FacName() {
		return n_FacName;
	}

	public void setN_FacName(String n_FacName) {
		this.n_FacName = n_FacName;
	}

	public int getN_FacCapacity() {
		return n_FacCapacity;
	}

	public void setN_FacCapacity(int n_FacCapacity) {
		this.n_FacCapacity = n_FacCapacity;
	}

	public String getN_FacCity() {
		return n_FacCity;
	}

	public void setN_FacCity(String n_FacCity) {
		this.n_FacCity = n_FacCity;
	}

	public int getNgofc() {
		return ngofc;
	}

	public void setNgofc(int ngofc) {
		this.ngofc = ngofc;
	}

	/*public List<FacilityBooking> getFacilitybooking() {
		return facilitybooking;
	}

	public void setFacilitybooking(List<FacilityBooking> facilitybooking) {
		this.facilitybooking = facilitybooking;
	}*/

	/*@Override
	public String toString() {
		return "NgoFacReg [n_FacId=" + n_FacId + ", n_FacName=" + n_FacName + ", n_FacCapacity=" + n_FacCapacity
				+ ", n_FacCity=" + n_FacCity + "]";
	}*/

	
}

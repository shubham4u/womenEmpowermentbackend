package com.lti.wp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="ngo")
public class Ngo {

	@Id
	@Column(name="NGO_ID")
	@JsonFormat(shape=JsonFormat.Shape.NUMBER)
	private int ngoid;
	
	@Column(name="NGO_NAME")
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private String ngoname;
	
	@Column(name="NGO_EMAIL")
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private String ngoemail;
	
	@Column(name="NGO_ADDRESS")
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private String ngoaddress;
	
	@Column(name="NGO_CONTACT")
	@JsonFormat(shape=JsonFormat.Shape.NUMBER)
	private long ngocontact;
	
	@Column(name="NGO_INCHARGE_NAME")
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private String ngoinchargename;
	
	@Column(name="NGO_INCHARGE_EMAIL")
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private String ngoinchargeemail;
	
	@Column(name="NGO_PASSWORD")
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private String ngopassword;
	
	@Column(name="NGO_INCHARGE_CONTACT_NO")
	@JsonFormat(shape=JsonFormat.Shape.NUMBER)
	private long ngoinchargecontactno;
	
	@Column(name="NGO_INCHARGE_ADDRESS")
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private String ngoinchargeaddress;
	
	@Column(name="NGO_INCHARGE_ADHAR_NO")
	@JsonFormat(shape=JsonFormat.Shape.NUMBER)
	private long ngoinchargeadharno;
	
	@Column(name="NGO_CERTIFICATE_NO")
	@JsonFormat(shape=JsonFormat.Shape.NUMBER)
	private int ngocertificateno;
	
	@Column(name="NGO_ESTABLISHMENT_YEAR")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	private Date ngoestablishmentyear;

	public Ngo(int ngoid, String ngoname, String ngoemail, String ngoaddress, long ngocontact, String ngoinchargename,
			String ngoinchargeemail, String ngopassword, long ngoinchargecontactno, String ngoinchargeaddress,
			long ngoinchargeadharno, int ngocertificateno, Date ngoestablishmentyear) {
		super();
		this.ngoid = ngoid;
		this.ngoname = ngoname;
		this.ngoemail = ngoemail;
		this.ngoaddress = ngoaddress;
		this.ngocontact = ngocontact;
		this.ngoinchargename = ngoinchargename;
		this.ngoinchargeemail = ngoinchargeemail;
		this.ngopassword = ngopassword;
		this.ngoinchargecontactno = ngoinchargecontactno;
		this.ngoinchargeaddress = ngoinchargeaddress;
		this.ngoinchargeadharno = ngoinchargeadharno;
		this.ngocertificateno = ngocertificateno;
		this.ngoestablishmentyear = ngoestablishmentyear;
	}

	public Ngo() {
		super();
	}

	@Override
	public String toString() {
		return "Ngo [ngoid=" + ngoid + ", ngoname=" + ngoname + ", ngoemail=" + ngoemail + ", ngoaddress=" + ngoaddress
				+ ", ngocontact=" + ngocontact + ", ngoinchargename=" + ngoinchargename + ", ngoinchargeemail="
				+ ngoinchargeemail + ", ngopassword=" + ngopassword + ", ngoinchargecontactno=" + ngoinchargecontactno
				+ ", ngoinchargeaddress=" + ngoinchargeaddress + ", ngoinchargeadharno=" + ngoinchargeadharno
				+ ", ngocertificateno=" + ngocertificateno + ", ngoestablishmentyear=" + ngoestablishmentyear + "]";
	}
	
	

	
}

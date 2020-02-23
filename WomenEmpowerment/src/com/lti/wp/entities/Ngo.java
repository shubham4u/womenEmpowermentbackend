package com.lti.wp.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="ngo")
public class Ngo {

	@Id
	@Column(name="NGO_ID")
	private int ngoid;
	
	@Column(name="NGO_NAME")
	private String ngoname;
	
	@Column(name="NGO_EMAIL")
	private String ngoemail;
	
	@Column(name="NGO_ADDRESS")
	private String ngoaddress;
	
	@Column(name="NGO_CONTACT")
	private long ngocontact;
	
	@Column(name="NGO_INCHARGE_NAME")
	private String ngoinchargename;
	
	@Column(name="NGO_INCHARGE_EMAIL")
	private String ngoinchargeemail;
	
	@Column(name="NGO_PASSWORD")
	private String ngopassword;
	
	@Column(name="NGO_INCHARGE_CONTACT_NO")
	private long ngoinchargecontactno;
	
	@Column(name="NGO_INCHARGE_ADDRESS")
	private String ngoinchargeaddress;
	
	@Column(name="NGO_INCHARGE_ADHAR_NO")
	private long ngoinchargeadharno;
	
	@Column(name="NGO_CERTIFICATE_NO")
	private int ngocertificateno;
	
	@Column(name="NGO_ESTABLISHMENT_YEAR")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date ngoestablishmentyear;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL, mappedBy="ngo")
	private List<NgoProgReg> ngoprogreg;

	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL, mappedBy="ngo")
	private List<NgoFacReg> ngofacreg;
	
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
	
	



	public List<NgoFacReg> getNgofacreg() {
		return ngofacreg;
	}

	public void setNgofacreg(List<NgoFacReg> ngofacreg) {
		this.ngofacreg = ngofacreg;
	}

	public List<NgoProgReg> getNgoprogreg() {
		return ngoprogreg;
	}

	public void setNgoprogreg(List<NgoProgReg> ngoprogreg) {
		this.ngoprogreg = ngoprogreg;
	}

	public int getNgoid() {
		return ngoid;
	}

	public void setNgoid(int ngoid) {
		this.ngoid = ngoid;
	}

	public String getNgoname() {
		return ngoname;
	}

	public void setNgoname(String ngoname) {
		this.ngoname = ngoname;
	}

	public String getNgoemail() {
		return ngoemail;
	}

	public void setNgoemail(String ngoemail) {
		this.ngoemail = ngoemail;
	}

	public String getNgoaddress() {
		return ngoaddress;
	}

	public void setNgoaddress(String ngoaddress) {
		this.ngoaddress = ngoaddress;
	}

	public long getNgocontact() {
		return ngocontact;
	}

	public void setNgocontact(long ngocontact) {
		this.ngocontact = ngocontact;
	}

	public String getNgoinchargename() {
		return ngoinchargename;
	}

	public void setNgoinchargename(String ngoinchargename) {
		this.ngoinchargename = ngoinchargename;
	}

	public String getNgoinchargeemail() {
		return ngoinchargeemail;
	}

	public void setNgoinchargeemail(String ngoinchargeemail) {
		this.ngoinchargeemail = ngoinchargeemail;
	}

	public String getNgopassword() {
		return ngopassword;
	}

	public void setNgopassword(String ngopassword) {
		this.ngopassword = ngopassword;
	}

	public long getNgoinchargecontactno() {
		return ngoinchargecontactno;
	}

	public void setNgoinchargecontactno(long ngoinchargecontactno) {
		this.ngoinchargecontactno = ngoinchargecontactno;
	}

	public String getNgoinchargeaddress() {
		return ngoinchargeaddress;
	}

	public void setNgoinchargeaddress(String ngoinchargeaddress) {
		this.ngoinchargeaddress = ngoinchargeaddress;
	}

	public long getNgoinchargeadharno() {
		return ngoinchargeadharno;
	}

	public void setNgoinchargeadharno(long ngoinchargeadharno) {
		this.ngoinchargeadharno = ngoinchargeadharno;
	}

	public int getNgocertificateno() {
		return ngocertificateno;
	}

	public void setNgocertificateno(int ngocertificateno) {
		this.ngocertificateno = ngocertificateno;
	}

	public Date getNgoestablishmentyear() {
		return ngoestablishmentyear;
	}

	public void setNgoestablishmentyear(Date ngoestablishmentyear) {
		this.ngoestablishmentyear = ngoestablishmentyear;
	}
		
}

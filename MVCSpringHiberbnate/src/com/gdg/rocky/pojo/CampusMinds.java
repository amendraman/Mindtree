package com.gdg.rocky.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="campusmind")
public class CampusMinds {
	
	private int campusmindId;
	private String campusmindName;
	private String campusMindTrack;
	private String campusmindEmail;
	private Leads lead;
	
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="leadid")
	public Leads getLead() {
		return lead;
	}
	public void setLead(Leads lead) {
		this.lead = lead;
	}
	
	@Column(name="campusmindid")
	public int getCampusmindId() {
		return campusmindId;
	}
	public void setCampusmindId(int campusmindId) {
		this.campusmindId = campusmindId;
	}
	
	@Column(name="campusmindname")
	public String getCampusmindName() {
		return campusmindName;
	}
	public void setCampusmindName(String campusmindName) {
		this.campusmindName = campusmindName;
	}
	
	@Column(name="campusmindtrack")
	public String getCampusMindTrack() {
		return campusMindTrack;
	}
	public void setCampusMindTrack(String campusMindTrack) {
		this.campusMindTrack = campusMindTrack;
	}
	
	@Column(name="campusmindemail")
	public String getCampusmindEmail() {
		return campusmindEmail;
	}
	public void setCampusmindEmail(String campusmindEmail) {
		this.campusmindEmail = campusmindEmail;
	}
	
	

}

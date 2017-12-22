package com.gdg.rocky.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="leads")
public class Leads {
	
	
	private int leadid;
	private String leadname;
	private Track tr;
	private String leadEmail;
	
	@Id
	@Column(name="leadid")
	public int getLeadid() {
		return leadid;
	}
	public void setLeadid(int leadid) {
		this.leadid = leadid;
	}
	
	@Column(name="leadname")
	public String getLeadname() {
		return leadname;
	}
	public void setLeadname(String leadname) {
		this.leadname = leadname;
	}
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="trackid")
	public Track getTr() {
		return tr;
	}
	public void setTr(Track tr) {
		this.tr = tr;
	}
	
	@Column(name="leademail")
	public String getLeadEmail() {
		return leadEmail;
	}
	public void setLeadEmail(String leadEmail) {
		this.leadEmail = leadEmail;
	}
	
	

}

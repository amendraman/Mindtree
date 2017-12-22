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
@Table(name="Lead")
public class Lead {
	
	private int lid;
	private String lname;
	private Track tr;
	
	@Id
	@Column(name="l_id")
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	
	@Column(name="l_name")
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@ManyToOne(cascade=CascadeType.REFRESH, fetch=FetchType.EAGER)
	@JoinColumn(name="t_id")
	public Track getTr() {
		return tr;
	}
	public void setTr(Track tr) {
		this.tr = tr;
	}
	
	public Lead()
	{
		
	}
	
	

}

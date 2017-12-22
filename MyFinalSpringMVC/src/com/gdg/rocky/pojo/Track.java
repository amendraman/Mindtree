package com.gdg.rocky.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Track")
public class Track {
	
	private int tid;
	private String tname;
	
	public Track()
	{
		
	}

	@Id
	@Column(name="t_id")
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	@Column(name="t_name")
	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Track(int tid, String tname) {
		
		this.tid = tid;
		this.tname = tname;
	}
	
	
	

}

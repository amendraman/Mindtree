package com.gdg.rocky.pojoClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orchardsignin")
public class OrchardSignIn {
	
	private String name;
	private String email;
	private int phone;
	private String mid;
	private String password;
	
	
	
	public OrchardSignIn() {
		super();
	}
	@Column(name="OrchardName")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="OrchardEmail")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "OrchardPhone")
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	@Id
	@Column(name = "OrchardMid")
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	
	@Column(name="OchardPassword")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString()
	{
		return " Name is " + name + " email is " + email + " phone number is " + phone;
	}

}

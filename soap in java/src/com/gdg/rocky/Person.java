package com.gdg.rocky;

import java.io.Serializable;

public class Person implements Serializable {
	
	// we are implementing Serializable interface because we will be transporting it over the network
	
	private static final long serialVersionUID = -5577579081118070434L;
	
	private String name;
	private int id;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString()
	{
		return id+"::"+name+"::"+age;
	}
	/* We have also provided toString method implementation that will be used when we will print this object at client side */
}

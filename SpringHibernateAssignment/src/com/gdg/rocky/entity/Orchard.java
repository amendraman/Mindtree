package com.gdg.rocky.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "Orchards")
public class Orchard implements Serializable{
	
	private static final long serialVersionUID = -7988799579036225137L;
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long mid;
	    
	    @Column
	    private String name;
	    
	    @Column
	    private String password;
	    
	    @Column
	    private int phone;
	    
	    @Column
	    private String email;

		public long getMid() {
			return mid;
		}

		public void setMid(long mid) {
			this.mid = mid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getPhone() {
			return phone;
		}

		public void setPhone(int phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	    
		@Override
	    public String toString() {
	        return "Orchards{" +
	                "Mid=" + mid +
	                ", name='" + name + '\'' +
	                ", phone no is=" + phone +
	                ", email=" + email +
	                '}';
	    }

}

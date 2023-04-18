package com.asminds.EmpModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emp")
public class EmpModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private String address;
	private int mobile;

	
	public  EmpModel()
	{
		
	}
	
	
	
	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getMobile() {
		return mobile;
	}



	public void setMobile(int mobile) {
		this.mobile = mobile;
	}



	public EmpModel(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "EmpModel [address=" + address + ", mobile=" + mobile + "]";
	}



	public EmpModel(String address, int mobile) {
		super();
		this.address = address;
		this.mobile = mobile;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
 
	
	

}

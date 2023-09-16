package com.tnsif.practice.Customerinterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@Autowired
	@Qualifier("groceries")
	//qualifier - switch concept
	//same as class name but should begin with small letter to be considered as object
	private Orderinterface oi;
	
	private int cuid;
	private String cuname;
	
	public int getCuid() {
		return cuid;
	}
	public void setCuid(int cuid) {
		this.cuid = cuid;
	}
	public String getCuname() {
		return cuname;
	}
	public void setCuname(String cuname) {
		this.cuname = cuname;
	}
	
	public void order()
	{
		oi.order();
	}
	
}

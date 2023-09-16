package com.tns.Customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customercontroller {
	
	@Autowired
	Customerservice cservice;
	
	@PostMapping("/customerservice")
	public void add(@RequestBody Customer cust)
	{
		cservice.save(cust);
	}
}

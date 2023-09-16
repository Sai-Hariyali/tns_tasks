package com.tns.Customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Customerservice {

	@Autowired
	Customerrepository crepo;
	
	public void save (Customer cust)
	{
		crepo.save(cust);
	}
}

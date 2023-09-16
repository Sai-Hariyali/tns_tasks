package com.tnsif.practice.Customerinterface;

import org.springframework.stereotype.Component;

@Component
public class Foods implements Orderinterface{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("food items ordered by customers");
	}

}

package com.tnsif.practice.Customerinterface;

import org.springframework.stereotype.Component;

@Component
public class Groceries implements Orderinterface{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("grocery items ordered by customers");
	}

}

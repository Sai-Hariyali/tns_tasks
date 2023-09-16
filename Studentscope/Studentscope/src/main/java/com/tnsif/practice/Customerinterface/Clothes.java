package com.tnsif.practice.Customerinterface;

import org.springframework.stereotype.Component;

@Component
public class Clothes implements Orderinterface{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("dress items ordered by customers");
	}

}

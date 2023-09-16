package com.tnsif.practice.Restcontrol;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/hello")
	public String Welcome () {
		return ("springboot project welcomes you");
	}
	
	@RequestMapping("/hi")
	public String Welcomes () {
		return ("springboot project says hi");
	}
}

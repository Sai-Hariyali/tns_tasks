package com.tnsif.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//import com.tnsif.practice.Customerinterface.Customer;
//import com.tnsif.practice.Studentscope.Student;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(PracticeApplication.class, args);
		
//		student scope package program class and objects
//		Student st1 = var.getBean(Student.class);
//		Student st2 = var.getBean(Student.class);
		
//		customer interface package program class and objects
//		Customer cu = var.getBean(Customer.class);
//		cu.order();
	}

}

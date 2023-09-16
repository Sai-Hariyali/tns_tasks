package com.tnsif.practice.Studentscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") //stops automatic creation of object memory by springboot
//prototype means object can be created manually by developer
public class Student {
	
		private int stid;
		private String stname;
		public int getStid() {
			return stid;
		}
		public void setStid(int stid) {
			this.stid = stid;
		}
		public String getStname() {
			return stname;
		}
		public void setStname(String stname) {
			this.stname = stname;
		}
		
		public Student() {
			System.out.println("constructor has been called");
		}
		
}

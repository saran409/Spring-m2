package com.org.dem.main;

import com.org.dem.entity.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext spring = new ClassPathXmlApplicationContext("Spring.xml");
	
		Account a1 = spring.getBean("account", Account.class);
		System.out.println(a1);
		 
		
		
		
	}

}

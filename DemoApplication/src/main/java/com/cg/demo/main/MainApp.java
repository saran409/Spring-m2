package com.cg.demo.main;

import com.cg.demo.entity.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext spring = new ClassPathXmlApplicationContext("Spring.xml");
	
		Account a1 = spring.getBean("a1",Account.class);
		System.out.println(a1);
		System.out.println("------------------------------------");

		Account a2 = spring.getBean("a2",Account.class);
		System.out.println(a2);
		System.out.println(a2.getPolicy());
		System.out.println(a2.getAllTransactions());

		System.out.println("------------------------------------");

		Account a3 = spring.getBean("a3",Account.class);
		System.out.println(a3);
		System.out.println(a3.getPolicy());
		System.out.println(a3.getAllTransactions());
	}
}



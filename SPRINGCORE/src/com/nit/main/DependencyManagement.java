package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.WishMessageGenerator;

public class DependencyManagement {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nit/config/ApplicationConfig.xml");

		Object obj = ctx.getBean("wmg");
		
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		String msg = generator.generateWishMessage("Snehasish");
		System.out.println(msg);
	}

}

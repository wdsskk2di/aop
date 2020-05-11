package com.care.aop_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationAOP_02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		CoreClass tc = ctx.getBean("core",CoreClass.class);
		
		System.out.println("MainClass start");
		tc.corePrint();
		System.out.println("MainClass end");
		ctx.close();
	}
}

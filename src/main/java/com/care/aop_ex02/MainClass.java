package com.care.aop_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationAOP_02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		CoreClass tc = ctx.getBean("core",CoreClass.class);
		
		System.out.println("MainClass start");
		tc.corePrint();//corePrint()실행 -> aop:around로 CommonClass의 commonAOP()실행. 
						// CommonClass의 beforeAdvice() 실행조건인 test() 메소드는 부르지 않았으므로 실행x
		System.out.println("MainClass end");
		ctx.close();
	}
}

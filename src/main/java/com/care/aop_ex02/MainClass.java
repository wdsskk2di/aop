package com.care.aop_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationAOP_02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		CoreClass tc = ctx.getBean("core",CoreClass.class);
		
		System.out.println("MainClass start");
		tc.corePrint(); //corePrint()실행 -> aop:around로 CommonClass의 commonAOP()실행. 
						// CommonClass의 beforeAdvice() 실행조건인 test() 메소드는 부르지 않았으므로 실행x		
		tc.corePrint02();
		
						//aop:around로 tes()메소드 실행 전, 후로  CommonClass의 commonAOP()실행(CoreClass안의 어느 메소드가 불려지든 그 전후에 호출되게되어 있다). 
		tc.test();  	// CommonClass의 beforeAdvice() 실행조건인 test() 메소드 호출. test()실행 전에 beforeAdvice() 실행.
		System.out.println("MainClass end");
		ctx.close();
	}
}

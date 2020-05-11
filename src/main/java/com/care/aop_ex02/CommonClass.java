package com.care.aop_ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //공통기능으로 쓰겠다는 어노테이션
public class CommonClass {//공통 기능
	@Around("within(com.care.aop_ex02.*)")  //around로 쓸거란걸 알려주는 어노테이션
	public void commonAOP(ProceedingJoinPoint joinpoint) {	//"within(com.care.aop_ex02.*)" == CoreClass안의 어느 메소드가 불려지든 그 전후에 호출된다
		try {
			System.out.println("===공통 기능 시작===");
			joinpoint.proceed();	//일시중지. CoreClass실행
			System.out.println("===공통 기능 종료===");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Before("execution(*com.care.aop_ex02.CoreClass.test()") //before로 쓸거란걸 알려주는 어노테이션
	public void beforeAdvice(ProceedingJoinPoint joinpoint) { //"execution(*com.care.aop_ex02.CoreClass.test()" == CoreClass의 test()가 불려지면 test()실행 전에 호출됨
		System.out.println("test() 핵심 기능 전에 실행"); 	
	}
}

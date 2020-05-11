package com.care.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class CommonClass {//공통 기능
	public void commonAOP(ProceedingJoinPoint joinpoint) {//aop:around는 ProceedingJoinPoint
		try {
			System.out.println("===공통 기능 시작===");
			joinpoint.proceed();	//일시중지. CoreClass실행
			System.out.println("===공통 기능 종료===");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public void beforeAdvice(JoinPoint joinpoint) {//aop:before는 JoinPoint
		System.out.println("beforeAdvice() 핵심 기능 전에 실행");
	}
}

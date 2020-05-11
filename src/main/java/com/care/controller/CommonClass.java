package com.care.controller;

import org.aspectj.lang.ProceedingJoinPoint;

public class CommonClass {//공통 기능
	public void commonAOP(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("===공통 기능 시작===");
			joinpoint.proceed();
			System.out.println("===공통 기능 종료===");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}

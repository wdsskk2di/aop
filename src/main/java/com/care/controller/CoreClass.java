package com.care.controller;

public class CoreClass {//이미 만든 프로그램
	public void corePrint() {
		for(int i=0; i<10 ;i++) {
			try {
				Thread.sleep(100);
				System.out.println("핵심 기능 실행(이미 만든 프로그램)");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

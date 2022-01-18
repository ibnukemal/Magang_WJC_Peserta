package com.peserta.wjc.utils;

public enum TestCases {

	T1("Testing Home Page"),
	T2("Testing About Page"),
	T3("Testing Blog Page"),
	T4("Testing Contact Page");
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}

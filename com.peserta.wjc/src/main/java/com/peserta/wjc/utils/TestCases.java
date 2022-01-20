package com.peserta.wjc.utils;

public enum TestCases {

	T1("Testing Home Page"),
	T2("Testing Bootcamp Page"),
	T3("Testing Syllabus Page"),
	T4("Testing Course Page"),
	T5("Testing About Page"),
	T6("Testing Blog Page"),
	T7("Testing Contact Page"),
	T8("Testing Register Page");
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}

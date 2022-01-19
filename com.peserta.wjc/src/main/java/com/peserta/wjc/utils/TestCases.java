package com.peserta.wjc.utils;

public enum TestCases {

	T1("Testing Home Page"),
	T2("Testing Learning Page"),
	T3("Testing Bootcamp Page"),
	T4("Testing Syllabus Page"),
	T5("Testing Course Page"),
	T6("Testing About Page"),
	T7("Testing Blog Page"),
	T8("Testing Contact Page"),
	T9("Testing Register Page");
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}

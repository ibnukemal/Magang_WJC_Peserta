package com.peserta.wjc.utils;

public enum TestCases {

	T1("Testing Home Page"),
	T2("Testing About Page");
	
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}

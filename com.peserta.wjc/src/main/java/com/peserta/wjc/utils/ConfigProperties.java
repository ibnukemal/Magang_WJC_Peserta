package com.peserta.wjc.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${email}")
	private String email;

	@Value("${displayabout}")
	private String displayAbout;

	@Value("${fullname}")
	private String fullname;
	
	@Value("${email2}")
	private String email2;

	@Value("${phone}")
	private String phone;
	
	@Value("${subject}")
	private String subject;
	
	@Value("${message}")
	private String message;
	
	public String getBrowser() {
		return browser;
	}

	public String getEmail() {
		return email;
	}
	
	public String getDisplayAbout() {
		return displayAbout;
	}
	
	public String getFullName() {
		return fullname;
	}
	
	public String getEmail2() {
		return email2;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public String getMessage() {
		return message;
	}
	
}

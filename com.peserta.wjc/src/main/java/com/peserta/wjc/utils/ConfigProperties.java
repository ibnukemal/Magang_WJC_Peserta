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

	public String getBrowser() {
		return browser;
	}

	public String getemail() {
		return email;
	}
	
	public String getDisplayAbout() {
		return displayAbout;
	}
	
}

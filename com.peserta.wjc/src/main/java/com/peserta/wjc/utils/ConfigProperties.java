package com.peserta.wjc.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigProperties {

	@Value("${browser}")
	private String browser;
	
	//Email Suscribe
	@Value("${email}")
	private String email;

	//
	@Value("${course}")
	private String course;
	
	//Contact 
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
	
	//Register Form
	@Value("${firstName}")
	private String firstName;
	
	@Value("${lastName}")
	private String lastName;
	
	@Value("${emailStudents}")
	private String emailStudents;
	
	@Value("${dateOfBirth}")
	private String dateOfBirth;
	
	@Value("${address}")
	private String address;
	
	@Value("${city}")
	private String city;
	
	@Value("${postCode}")
	private String postCode;
	
	@Value("${mobilePhone}")
	private String mobilePhone;
	
	@Value("${relativesPhone}")
	private String relativesPhone;
	
	@Value("${motivation}")
	private String motivation;
	
	///
	public String getBrowser() {
		return browser;
	}

	public String getEmail() {
		return email;
	}
	
	public String getCourse() {
		return course;
	}

	public String getFullname() {
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

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailStudents() {
		return emailStudents;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getPostCode() {
		return postCode;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public String getRelativesPhone() {
		return relativesPhone;
	}

	public String getMotivation() {
		return motivation;
	}

	
}

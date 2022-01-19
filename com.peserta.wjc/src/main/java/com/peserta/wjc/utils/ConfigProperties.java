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
	
	@Value("${namadepan}")
	private String namadepan;
	
	@Value("${namabelakang}")
	private String namabelakang;
	
	@Value("${emailsiswa}")
	private String emailsiswa;
	
	@Value("${tanggallahir}")
	private String tanggallahir;
	
	@Value("${alamat}")
	private String alamat;
	
	@Value("${kota}")
	private String kota;
	
	@Value("${kodepos}")
	private String kodepos;
	
	@Value("${handphone")
	private String handphone;
	
	@Value("${handphoneKerabat}")
	private String handphoneKerabat;
	
	@Value("${motivasi}")
	private String motivasi;

	public String getBrowser() {
		return browser;
	}

	public String getEmail() {
		return email;
	}

	public String getDisplayAbout() {
		return displayAbout;
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

	public String getNamadepan() {
		return namadepan;
	}

	public String getNamabelakang() {
		return namabelakang;
	}

	public String getEmailsiswa() {
		return emailsiswa;
	}

	public String getTanggallahir() {
		return tanggallahir;
	}

	public String getAlamat() {
		return alamat;
	}

	public String getKota() {
		return kota;
	}

	public String getKodepos() {
		return kodepos;
	}

	public String getHandphone() {
		return handphone;
	}

	public String getHandphoneKerabat() {
		return handphoneKerabat;
	}

	public String getMotivasi() {
		return motivasi;
	}
	
	
	
	
}

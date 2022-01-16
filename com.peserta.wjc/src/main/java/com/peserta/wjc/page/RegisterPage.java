package com.peserta.wjc.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.peserta.wjc.driver.DriverSingleton;

public class RegisterPage {

	private WebDriver driver;
	
	public RegisterPage() {
		
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"id_program\"]/option[3]")
	private WebElement clickProgram;
	
	@FindBy(xpath = "//*[@id=\"id_batch\"]/option[2]")
	private WebElement clickBatch;
	
	public void programAndBatch() {
		clickProgram.click();
		clickBatch.click();
	}

	@FindBy(xpath = "//*[@id=\"frmregister\"]/div[5]/div[1]/div/div[1]/label")
	private WebElement btnMetode;
	
	public void metode() {
		btnMetode.click();
	}
	
	@FindBy(css = "#frmregister > div:nth-child(8) > div > div:nth-child(1) > inputl")
	private WebElement namadepan;
	
	@FindBy(css = "#frmregister > div:nth-child(8) > div > div:nth-child(2) > input")
	private WebElement namabelakang;
	
	@FindBy(css = "#frmregister > div:nth-child(9) > input")
	private WebElement email;
	
	@FindBy(css = "#frmregister > div:nth-child(10) > div > div:nth-child(1) > select > option:nth-child(2)")
	private WebElement gender;
	
	@FindBy(xpath = "")
	
}

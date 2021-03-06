package com.peserta.wjc.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.peserta.wjc.driver.DriverSingleton;

public class DashboardPage {

	private WebDriver driver;
	
	public DashboardPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#frmsubrek > div > input.form-control.jc-newslette-form")
	private WebElement txtEmail;
	
	@FindBy(id = "button-addon2")
	private WebElement subscribe;
	
	public void sendEmailandSubscribe(String email) {
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		txtEmail.sendKeys(email);
		subscribe.click();
	}
	
	
}

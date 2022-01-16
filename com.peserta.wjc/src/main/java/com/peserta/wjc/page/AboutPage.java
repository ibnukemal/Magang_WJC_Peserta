package com.peserta.wjc.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.peserta.wjc.driver.DriverSingleton;

public class AboutPage {

	private WebDriver driver;
//	WebDriverWait wait = new WebDriverWait(driver, 5);

	public AboutPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"navbarsMenu\"]/ul/li[3]/a")
	private WebElement about;
	
	public void clickAbout() {
//		wait.until(ExpectedConditions.elementToBeClickable(about));
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		about.click();
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/a")
	private WebElement btnJoinNow;
	
	public void clickJoinNow() {
		btnJoinNow.click();
	}
	
}

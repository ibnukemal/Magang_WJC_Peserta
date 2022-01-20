package com.peserta.wjc.page;

import java.util.List;
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

	public AboutPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#navbarsMenu > ul > li")
	private List<WebElement> about;
	
	public void clickAbout() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		about.get(2).click();
	}
	

}

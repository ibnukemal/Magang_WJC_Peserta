package com.peserta.wjc.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.peserta.wjc.driver.DriverSingleton;

public class BootcampPage {
	
	private WebDriver driver;
	
	public BootcampPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#navbarsMenu > ul > li.nav-item.dropdown.show > div")
	private List<WebElement> menuBootcamp;

	public void pageBootcamp() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menuBootcamp.get(0).click();
	}
}

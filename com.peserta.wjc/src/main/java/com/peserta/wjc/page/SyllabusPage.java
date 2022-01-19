package com.peserta.wjc.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.peserta.wjc.driver.DriverSingleton;

public class SyllabusPage {

private WebDriver driver;
	
	public SyllabusPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#navbarsMenu > ul > li.nav-item.dropdown.show > div")
	private List<WebElement> menuSyllabus;
	
	public void pageSyllabus() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menuSyllabus.get(1).click();
	}
}

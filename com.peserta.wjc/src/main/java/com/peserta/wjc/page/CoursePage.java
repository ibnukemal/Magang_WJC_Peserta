package com.peserta.wjc.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.peserta.wjc.driver.DriverSingleton;

public class CoursePage {
	
	private WebDriver driver;
	
	public CoursePage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#navbarsMenu > ul > li.nav-item.dropdown.show > div")
	private List<WebElement> menuCourse;
	
	public void pageCourse() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menuCourse.get(2).click();
	}
	
}

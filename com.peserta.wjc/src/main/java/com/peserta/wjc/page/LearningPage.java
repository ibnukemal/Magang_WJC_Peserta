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

public class LearningPage {

private WebDriver driver;
	
	public LearningPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Dropdown Menu Learning
	@FindBy(css = "#navbarsMenu > ul")
	private List<WebElement> menuLearning;
	
	public void learningDropDown() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menuLearning.get(1).click();
	}
	
	//Bootcamp Page
//	@FindBy(css = "#navbarsMenu > ul > li.nav-item.dropdown.show > div")
//	private List<WebElement> menuBootcamp;
//
//	public void pageBootcamp() {
//		menuBootcamp.get(0).click();
//	}
	
	//Syllabus Page
//	@FindBy(css = "#navbarsMenu > ul > li.nav-item.dropdown.show > div")
//	private List<WebElement> menuSyllabus;
//	
//	public void pageSyllabus() {
//		menuSyllabus.get(1).click();
//	}
	
	//Course Page
//	@FindBy(css = "#navbarsMenu > ul > li.nav-item.dropdown.show > div")
//	private List<WebElement> menuCourse;
//	
//	public void pageCourse() {
//		menuCourse.get(2).click();
//	}
	
	
}

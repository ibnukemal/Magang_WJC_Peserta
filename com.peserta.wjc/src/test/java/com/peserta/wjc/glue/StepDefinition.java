package com.peserta.wjc.glue;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.peserta.wjc.driver.DriverSingleton;

import com.peserta.wjc.page.DashboardPage;
import com.peserta.wjc.page.AboutPage;
import com.peserta.wjc.config.AutomationFrameworkConfig;
import com.peserta.wjc.utils.ConfigProperties;
import com.peserta.wjc.utils.Constants;
import com.peserta.wjc.utils.TestCases;
import com.peserta.wjc.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {

	private WebDriver driver;
	private DashboardPage dashboard;
	private AboutPage about;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigProperties configProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configProperties.getBrowser());
		dashboard = new DashboardPage();
	    about = new AboutPage();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testcount].getTestName());
		Utils.testcount++;
	}
	
	@Given("^User enter to the website")
	public void homePage() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User enter to the website");
	}
	
	//Home
	@When("^User insert Email")
	public void User_insert_Email() {
		dashboard.sendEmail(configProperties.getemail());
		extentTest.log(LogStatus.PASS, "User insert Email");
	}
	
	//About
	@When("^User click About")
	public void User_click_About() {
		about.clickAbout();
		extentTest.log(LogStatus.PASS, "User click About");
	}
		
	//Home
	@Then("^User click Subscribe")
	public void User_click_Subscribe() {
		dashboard.clickSubscribe();
		extentTest.log(LogStatus.PASS, "User click Subscribe");
	}
	
	//About
	@Then("^User click Join Now")
	public void User_click_Join_Now() {
		about.clickJoinNow();
		extentTest.log(LogStatus.PASS, "User click Join Now");
	}
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
	
}

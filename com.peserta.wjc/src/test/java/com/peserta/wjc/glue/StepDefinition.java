package com.peserta.wjc.glue;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.peserta.wjc.driver.DriverSingleton;
import com.peserta.wjc.page.AboutPage;
import com.peserta.wjc.page.BlogPage;
import com.peserta.wjc.page.BootcampPage;
import com.peserta.wjc.page.ContactPage;
import com.peserta.wjc.page.CoursePage;
import com.peserta.wjc.page.DashboardPage;
import com.peserta.wjc.page.RegisterPage;
import com.peserta.wjc.page.SyllabusPage;
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
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {

	private WebDriver driver;
	private DashboardPage dashboard;
	private BootcampPage bootcamp;
	private SyllabusPage syllabus;
	private CoursePage course;
	private AboutPage about;
	private BlogPage blog;
	private ContactPage contact;
	private RegisterPage regist;
//	private BucketPage bucket;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigProperties configProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configProperties.getBrowser());
		dashboard = new DashboardPage();
		about = new AboutPage();
//		learning = new LearningPage();
	    bootcamp = new BootcampPage();
	    syllabus = new SyllabusPage();
	    course = new CoursePage();
		blog = new BlogPage();
		contact = new ContactPage();
		regist = new RegisterPage();
//		bucket = new BucketPage();
	    TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testcount].getTestName());
		Utils.testcount++;
	}
	
	//Menu Home
	@Given("^User masuk halaman Web Juara Coding")
	public void homePage() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User masuk halaman Web Juara Coding");
	}
	
	@Then("^User masukkan email dan tekan subscribe")
	public void User_masukkan_email_dan_tekan_subscribe() {
		dashboard.sendEmailandSubscribe(configProperties.getEmail());
		extentTest.log(LogStatus.PASS, "User masukkan email dan tekan subscribe");
	}
	
	//Submenu Bootcamp
	//Dropdown Learning
	@When("^User click list Learning satu")
	public void User_click_list_Learning_satu() {
		bootcamp.learningDropDown();
		extentTest.log(LogStatus.PASS, "User click list Learning satu");
	}
	
	@Then("^User pindah ke halaman Bootcamp")
	public void User_pindah_ke_halaman_Bootcamp() {
		driver = DriverSingleton.getDriver();
		driver.get("https://dev.ptdika.com/juaracodingv1/bootcamp");
//		bootcamp.pageBootcamp();
		extentTest.log(LogStatus.PASS, "User pindah ke halaman Bootcamp");
	}
	
	//Submenu Syllabus
	
	//Dropdown Learning
		@When("^User click list Learning dua")
		public void User_click_list_Learning_dua() {
			bootcamp.learningDropDown();
			extentTest.log(LogStatus.PASS, "User click list Learning dua");
		}
	
	@And("^User pindah ke halaman Syllabus")
	public void User_pindah_ke_halaman_Syllabus() {
		syllabus.pageSyllabus();
		extentTest.log(LogStatus.PASS, "User pindah ke halaman Syllabus");
	}
	
	@When("^User click profile tab Syllabus")
	public void User_click_profile_tab_Syllabus() {
		syllabus.ProfileTabQualification();
		extentTest.log(LogStatus.PASS, "User click profile tab Syllabus");
	}
	
	@Then("^User click profile tab Qualfication")
	public void User_click_profile_tab_Qualfication() {
		syllabus.ProfileTabQualification();
		extentTest.log(LogStatus.PASS, "User click profile tab Qualfication");
	}
	
	
	//Submenu Course
	@When("^User click list Learning tiga")
	public void User_click_list_Learning_tiga() {
		bootcamp.learningDropDown();
		extentTest.log(LogStatus.PASS, "User click list Learning tiga");
	}
	
	
	@And("^User pindah ke halaman Course")
	public void User_pindah_ke_halaman_Course() {
		course.pageCourse();
		extentTest.log(LogStatus.PASS, "User pindah ke halaman Course");
	}
	
	@And("^User click List Course")
	public void User_click_List_Course() {
		course.listCourse();
		extentTest.log(LogStatus.PASS, "User click List Course");
	}
	
	@And("^User search Course")
	public void User_search_Course() {
		course.searchCourses(configProperties.getCourse());
		extentTest.log(LogStatus.PASS, "User search Course");
	}
	
	@Then("^User click Search")
	public void User_click_Search() {
		course.clickSearch();
		extentTest.log(LogStatus.PASS, "User click Search");
	}
	
	//Menu About
	@Then("^User pindah ke halaman About")
	public void User_pindah_ke_halaman_About() {
		about.clickAbout();
		extentTest.log(LogStatus.PASS, "User pindah ke halaman About");
	}
	
	//Menu Blog
	@When("^User pindah ke halaman Blog")
	public void User_pindah_ke_halaman_Blog() {
		blog.menuBlog();
		extentTest.log(LogStatus.PASS, "User pindah ke halaman Blog");
	}
	
	@And("^User pindah nomor halaman")
	public void User_pindah_nomor_halaman() {
		blog.clickPageNumb();
		extentTest.log(LogStatus.PASS, "User pindah nomor halaman");
	}
		
	@Then("^User click Detail Blog")
	public void User_click_Detail_Blog() {
		blog.chooseBlog();
		extentTest.log(LogStatus.PASS, "User click Detail Blog");
	}
	
	
	//Menu Contact
	@When("^User click Contact")
	public void User_click_Contact() {
		contact.pageContact();
		extentTest.log(LogStatus.PASS, "User click Contact");
	}
	
	@And("^User input data Contact")
	public void User_input_data_Contact() {
		contact.formContact(configProperties.getFullname(), configProperties.getEmail2(), 
				configProperties.getPhone(), configProperties.getSubject(), configProperties.getMessage());
		extentTest.log(LogStatus.PASS, "User input data Contact");
	}
	
	@Then("^User click Send Message")
	public void User_click_Send_Message() {
		contact.sendMessage();
		extentTest.log(LogStatus.PASS, "User click Send Message");
	}
	
	//Register Page
	@When("^User masuk halaman registrasi")
	public void User_masuk_halaman_registrasi() {
		regist.registerPage();
		extentTest.log(LogStatus.PASS, "User masuk halaman registrasi");
	}
	
	@And("^User input formulir")
	public void User_input_formulir() {
		regist.formPendaftaran(configProperties.getFirstName(), configProperties.getLastName(), configProperties.getEmailStudents(),
				configProperties.getDateOfBirth(), configProperties.getAddress(), configProperties.getCity(), 
				configProperties.getPostCode(), configProperties.getMobilePhone(), configProperties.getRelativesPhone(),
				configProperties.getMotivation());
		extentTest.log(LogStatus.PASS, "User input formulir");
	}
	
	@Then("^User kirim formulir")
	public void User_kirim_formulir() {
		regist.clickSend();
		extentTest.log(LogStatus.PASS, "User kirim formulir");
	}
	
	//Bucket Page
//	@Then("^User tekan button pay")
//	public void User_tekan_button_pay() {
//		bucket.pay();
//		extentTest.log(LogStatus.PASS, "User tekan button pay");
//	}
	
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
	
}

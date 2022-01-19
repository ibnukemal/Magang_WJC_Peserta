package com.peserta.wjc.page;

import java.util.concurrent.TimeUnit;

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
	
	@FindBy(css ="#navbarsMenu > form > a.btn.btn-red.my-2.my-sm-0")
	private WebElement btnRegister;
	
	public void registerPage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnRegister.click();
	}
	
	@FindBy(css = "#id_program > option:nth-child(11)")
	private WebElement listProgram;
	
	@FindBy(css = "#id_batch > option:nth-child(2)")
	private WebElement listBatch;
	
	@FindBy(css = "#frmregister > div:nth-child(6) > div.switch-field > div > div.col-md-5 > label")
	private WebElement btnPayMethod;
	
	@FindBy(css = "#frmregister > div:nth-child(8) > div > div:nth-child(1) > input")
	private WebElement formNamaDepan;
	
	@FindBy(css = "#frmregister > div:nth-child(8) > div > div:nth-child(2) > input")
	private WebElement formNamaBelakang;
	
	@FindBy(css = "#frmregister > div:nth-child(9) > input")
	private WebElement formEmailSiswa;
	
	@FindBy(css = "#frmregister > div:nth-child(10) > div > div:nth-child(1) > select > option:nth-child(2)")
	private WebElement listGender;
	
	@FindBy(css = "#frmregister > div:nth-child(10) > div > div:nth-child(2) > input")
	private WebElement tglLahir;
	
	@FindBy(css = "#frmregister > div:nth-child(11) > select > option:nth-child(4)")
	private WebElement listKesibukan;
	
	@FindBy(css = "#frmregister > div:nth-child(12) > select > option:nth-child(3)")
	private WebElement listPendidikanTerakhir;
	
	@FindBy(css = "#frmregister > div:nth-child(13) > select > option:nth-child(2)")
	private WebElement listProgramStudi;
	
	@FindBy(css = "#frmregister > div:nth-child(14) > textarea")
	private WebElement txtAlamat;
	
	@FindBy(css = "#frmregister > div:nth-child(15) > div > div:nth-child(1) > input")
	private WebElement txtKota;
	
	@FindBy(css = "#frmregister > div:nth-child(15) > div > div:nth-child(2) > input")
	private WebElement txtKodePos;
	
	@FindBy(css = "##frmregister > div:nth-child(16) > div > div:nth-child(1) > input")
	private WebElement txtNoHp;
	
	@FindBy(css = "#frmregister > div:nth-child(16) > div > div:nth-child(2) > input")
	private WebElement txtNoHpKerabat;
	
	@FindBy(css = "#frmregister > div:nth-child(17) > select > option:nth-child(7)")
	private WebElement lstProgramKnowledge;
	
	@FindBy(css = "#frmregister > div:nth-child(18) > input")
	private WebElement txtMotivasi;
	
	@FindBy(css = "#flexCheckChecked")
	private WebElement checkSdanK;
	
	public void formulirPendaftaran(String namadepan, String namabelakang, String emailsiswa, String tanggallahir,
			String alamat, String kota, String kodepos, String handphone, String handphoneKerabat, String motivasi) {
		listProgram.click();
		listBatch.click();
		btnPayMethod.click();
		formNamaDepan.sendKeys(namadepan);
		formNamaBelakang.sendKeys(namabelakang);
		formEmailSiswa.sendKeys(emailsiswa);
		listGender.click();
		tglLahir.sendKeys(tanggallahir);
		listKesibukan.click();
		listPendidikanTerakhir.click();
		listProgramStudi.click();
		txtAlamat.sendKeys(alamat);
		txtKota.sendKeys(kota);
		txtKodePos.sendKeys(kodepos);
		txtNoHp.sendKeys(handphone);
		txtNoHpKerabat.sendKeys(handphoneKerabat);
		lstProgramKnowledge.click();
		txtMotivasi.sendKeys(motivasi);
		checkSdanK.click();
	}
	
	@FindBy(css = "#frmregister > button")
	private WebElement btnKirim;
	
	public void clickSend() {
		btnKirim.click();
	}
	
	
}

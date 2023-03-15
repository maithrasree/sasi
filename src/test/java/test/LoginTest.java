package test;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pageObject.LoginPage;

public class LoginTest extends BaseClass {
	public WebDriver driver;
	
	@Before
	public void chromelaunch() throws IOException {
		driver=browserlanch("https://www.redbus.in/");	
	}
	@Test
	public void logintest() throws IOException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.ClickSignIn().click();
		loginpage.enterSign1().click();
		loginpage.enterUserPhone().sendKeys(exceldata("loginname", 1, 1));
		//loginpage.enterPassword().sendKeys(exceldata("loginname", 1, 1));
		//loginpage.clickLoginButton().click();
	}
}
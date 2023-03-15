package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	public LoginPage() {
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div[@class='icon ich dib icon-down_WO_BAL icon-down']")
	private WebElement clickSignIn;

	public WebElement ClickSignIn() {
		return clickSignIn;
	}
	@FindBy(id="signInLink")
	private WebElement sign1;
	
	public WebElement enterSign1() {
		return sign1;
	}
	@FindBy(xpath="//input[@type='number']")
	private WebElement userPhone;
	
	public WebElement enterUserPhone() {
		return userPhone;
	}
	@FindBy(id="pass")
	private WebElement password;
	
	public WebElement enterPassword() {
		return password;
	}
	@FindBy(name="login")
	private WebElement loginButton;

	
	public WebElement clickLoginButton() {
		return loginButton;
	}

}

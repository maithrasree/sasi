package org.elementRef;

import org.baseclass.UtilClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginFun extends UtilClass{
public LoginFun(){
PageFactory.initElements(driver, this);	
}
@FindBy(id="username")
private WebElement username;//right click--source--getters and setter--selece all--select getters
//public WebElement getUsername() {
	//return username;
//}
@FindBys({
	//@FindBy(name="password"),
	@FindBy(id="password"),
	@FindBy(xpath="//input[@type='password']")
})
private WebElement password;

@FindAll({
	
	@FindBy(name="login"),
	@FindBy(xpath="//input[@type='Submit']")	
})

private WebElement loginBtn;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}
public WebElement getLoginBtn() {
	return loginBtn;
}
}

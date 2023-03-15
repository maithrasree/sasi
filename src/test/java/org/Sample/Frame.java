package org.Sample;


import java.io.IOException;

import org.baseclass.UtilClass;
import org.elementRef.LoginFun;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Frame extends UtilClass {
	
		@Test
	public void tc1() throws IOException
	{
	chromeBrowser();
	maxi();
		impWait(5);
		url("https://www.facebook.com/");
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("long"));
		LoginFun l=new LoginFun();
		
textPass(l.getUsername(),excelData("loginname", 1, 1));
textPass(l.getPassword(),excelData("loginname", 0, 1));	
	}
		
	@Test
	public void tc2() {
		LoginFun l=new LoginFun();
		
		elementClick(l.getLoginBtn());
		WebElement actual = driver.findElement(By.xpath("//div[contains(text(),'The password that ')]"));
		String act=actual.getText();
		Assert.assertEquals("The password that you've entered is incorrect. Forgotten password?", act);

	}
	}


		
	



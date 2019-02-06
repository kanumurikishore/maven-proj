package com.smp.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.smp.qa.launching.Launchwebsite;

public class FBLoginPage extends Launchwebsite{
	
	public FBLoginPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
@FindBy(name="email")
WebElement userName;
@FindBy(name="pass")
WebElement password;
@FindBy(id="u_0_2")
WebElement  logIn;

public void fBLogin(String us, String pw)
{
	userName.sendKeys(properties.getProperty("Username"));
	password.sendKeys(properties.getProperty("Password"));
	logIn.click();
	
}



	
	
	
	

}

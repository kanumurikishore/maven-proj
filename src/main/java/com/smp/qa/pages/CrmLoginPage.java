package com.smp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.smp.qa.launching.Launchwebsite;

public class CrmLoginPage extends Launchwebsite
{

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginButton;
	@FindBy(className="intercom-borderless-dismiss-button")
	WebElement dismiss;
	
	
	public CrmLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickDismiss()
	{
		dismiss.click();
	}
	
	

	public CrmHomePage userlogin(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
		return new CrmHomePage();
		
	}

}

package Testcases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.smp.qa.launching.Launchwebsite;
import com.smp.qa.pages.CrmLoginPage;

public class CrmLoginTest extends Launchwebsite {
	String node="https://";
	public CrmLoginTest ()
	{
		super();
	}
	@Test
	public void tc1() throws MalformedURLException
	{
		setup();
		CrmLoginPage clp=new CrmLoginPage();
		driver.switchTo().frame("intercom-borderless-frame");
		clp.clickDismiss();
		driver.switchTo().defaultContent();
		clp.userlogin(properties.getProperty("Username"),properties.getProperty("Password"));
		
//		DesiredCapabilities dc=new DesiredCapabilities();
//		dc.setBrowserName("chrome");
//		dc.setPlatform(Platform.WIN8);
//		RemoteWebDriver rw=new RemoteWebDriver(new URL(node),dc);
	}
	
	

}

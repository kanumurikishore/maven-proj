package com.smp.qa.launching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchwebsite {
	
public static	WebDriver driver;
public static Properties properties;
public Launchwebsite() 
{
	properties=new Properties();
	FileInputStream fielinputstream = null;
	try {
		fielinputstream = new FileInputStream("C:\\Iswarya\\SampleMavenProj\\src\\main\\java\\com\\smp\\qa\\config\\configuration.properties");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		properties.load(fielinputstream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void setup()
{
if(properties.getProperty("Browser").equals("chrome"))
		{
	System.setProperty("webdriver.chrome.driver","C:\\Iswarya\\workspace\\Jar files\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
		}
else
{
	System.setProperty("webdriver.chrome.driver","C:\\Iswarya\\workspace\\Jar files\\chromedriver_win32\\chromedriver.exe");
	driver=new FirefoxDriver();	
		}
driver.get(properties.getProperty("Url"));
driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
driver.manage().window().maximize();
	
}

}

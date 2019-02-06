package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.smp.qa.launching.Launchwebsite;

public class Getscreenshot extends Launchwebsite {
	public void captureScreenshot(String name) throws IOException
	{
	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("C:\\Iswarya\\SampleMavenProj\\src\\main\\java\\Screenshots\\"+name+"pics.png"));
	}
}

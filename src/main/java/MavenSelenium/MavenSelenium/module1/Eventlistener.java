package MavenSelenium.MavenSelenium.module1;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Eventlistener implements ITestListener
{
  static WebDriver driver;
	public void onTestSuccess(ITestResult result) 
	{
	TakesScreenshot t1 = (TakesScreenshot)driver;
	File Source = t1.getScreenshotAs(OutputType.FILE);
	File Destination = new File ("C:\\Users\\windows\\eclipse-workspace\\MavenSelenium\\MavenSelenium-module1\\Screenshots\\passed " + Math.random());
	try {
		FileHandler.copy(Source, Destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public void onTestFailure(ITestResult result) 
	{
		{
			TakesScreenshot t1 = (TakesScreenshot)driver;
			File Source = t1.getScreenshotAs(OutputType.FILE);
			File Destination = new File ("C:\\Users\\windows\\eclipse-workspace\\MavenSelenium\\MavenSelenium-module1\\Screenshots\\failed " + Math.random());
			try {
				FileHandler.copy(Source, Destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}

}

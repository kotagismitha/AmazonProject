package MavenSelenium.MavenSelenium.module1;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
	public class BeforeAndAfter
	{
		WebDriver driver;	
		@BeforeTest
		public void Launch_the_Application() throws InterruptedException
		{
			driver = new ChromeDriver();
			driver.get ("https://www.amazon.in/");
			 System.out.println(driver.getTitle());
			 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement Actualpage = driver.findElement(By.id("twotabsearchtextbox"));		
		    Assert.assertTrue(Actualpage.isDisplayed()==true);
	       }
		@AfterTest
		public void closebrowser()
		{
			driver.quit();
		}
	}
//			public void onTestSuccess(ITestResult result) 
//		{
//	Reporter.log("My Test case is passed");
//	TakesScreenshot t2 =   (TakesScreenshot) driver;
//	File source= t2.getScreenshotAs(OutputType.FILE);
//	File destination = new File ("C:\\Users\\windows\\eclipse-workspace\\Selenium\\src\\main\\java\\Screenshot\\tc "+ Math.random()+".png");
//				try {
//					FileHandler.copy(source, destination);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//
//			@Override
//			public void onTestFailure(ITestResult result) {
//			
//				Reporter.log("My Test case is passed");
//			}
//
//			@Override
//			public void onTestSkipped(ITestResult result) {
//				
//				Reporter.log("My Test case is skipped");
//			}
//		}

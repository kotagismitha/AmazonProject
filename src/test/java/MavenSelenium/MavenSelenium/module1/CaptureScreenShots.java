package MavenSelenium.MavenSelenium.module1;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
public class CaptureScreenShots implements ITestListener {
	ChromeDriver driver;
@Override

public void onTestStart(ITestResult result)
		{
			Reporter.log("My Test case begins here");
		}

		@Override
		public void onTestSuccess(ITestResult result) {
		
			Reporter.log("My Test case is passed");
			screenshots s1= new screenshots();
			s1.callScreenshots();
		}
		@Override
		public void onTestFailure(ITestResult result) {
		
			Reporter.log("My Test case is failed");
			screenshots s1= new screenshots();
			s1.callScreenshotsfailure();
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			
			Reporter.log("My Test case is skipped");
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
			ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			
			ITestListener.super.onTestFailedWithTimeout(result);
		}

		@Override
		public void onStart(ITestContext context) {
			
			ITestListener.super.onStart(context);
		}

		@Override
		public void onFinish(ITestContext context) {
			
			ITestListener.super.onFinish(context);
		}

	}


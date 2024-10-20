package MavenSelenium.MavenSelenium.module1;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class screenshots 
{
	WebDriver driver;
	public void callScreenshots()
	{
		//driver=new ChromeDriver();
	TakesScreenshot t2 =   (TakesScreenshot) driver;
	File source= t2.getScreenshotAs(OutputType.FILE);
	File destination = new File ("C:\\Users\\windows\\eclipse-workspace\\MavenSelenium\\MavenSelenium-module1\\src\\Screenshot\\pass\\tc "+ Math.random()+".png");
				try {
					FileHandler.copy(source, destination);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	public void callScreenshotsfailure()
	{
		TakesScreenshot t2 =   (TakesScreenshot) driver;
		File source= t2.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\windows\\eclipse-workspace\\MavenSelenium\\MavenSelenium-module1\\src\\Screenshot\\fail\\tc "+ Math.random()+".png");
					try {
						FileHandler.copy(source, destination);
					} catch (IOException e) {
						e.printStackTrace();
					}	
	}
}

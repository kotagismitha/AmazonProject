//Test if a new user can register successfully
package MavenSelenium.MavenSelenium.module1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import MavenSelenium.MavenSelenium.module1.RegistrationPage;
//@Listeners(MavenSelenium.MavenSelenium.module1.CaptureScreenShots.class)
	public class Test1 extends BeforeAndAfter
	{
		@Test
		public void Register_On_Amazon()
		{	
		RegistrationPage reg= new RegistrationPage(driver);
			reg.hoveron();
			reg.Rgsn();
			reg.un();
			reg.num();
			reg.pw();
			reg.proceeds();
WebElement registeredPage = driver.findElement(By.id("auth-warning-message-box"));
Assert.assertTrue(registeredPage.isDisplayed(), "Registeration is successful");
		}
		}

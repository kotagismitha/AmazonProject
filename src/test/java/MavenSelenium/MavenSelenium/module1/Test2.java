//Verify that the login is successful with valid username and pwd 
package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import MavenSelenium.MavenSelenium.module1.SignUppage;
//@Listeners(MavenSelenium.MavenSelenium.module1.CaptureScreenShots.class)
public class Test2 extends BeforeAndAfter {
  @Test
  public void Signup_validationTest() {
	SignUppage logIn = new SignUppage(driver);
	logIn.signInlink();
	logIn.UserID();
	logIn.continueto();
	logIn.pwd();
	logIn.LoginToApp();
	WebElement homepage= driver.findElement(By.id("twotabsearchtextbox"));
	Assert.assertTrue(homepage.isDisplayed(), "Login succeeds, landed on home");
//AssertTrue if (Isdisplayed text!="Hello, sign in");////span[.='Hello, sign in']
//add listener to capture screenshots
	}
  }

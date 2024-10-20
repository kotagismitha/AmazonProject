//Check if a user can successfully edit their profile information.
package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;
import MavenSelenium.MavenSelenium.module1.ProfileInformationPage;
public class Test4 extends BeforeAndAfter
{
@Test
public void Edit_Amazon_Profile() throws InterruptedException
{
	//driver = new ChromeDriver();
ProfileInformationPage prof = new ProfileInformationPage(driver);
SignUppage logIn = new SignUppage(driver);
logIn.signInlink();
logIn.UserID();
logIn.continueto();
logIn.pwd();
logIn.LoginToApp();
prof.navigate();
prof.loginEdit();
Thread.sleep(6000);
//prof.reauth();
//prof.relog();
prof.nameEdit();
WebElement acknowNameUpdate = driver.findElement(By.id("SUCCESS_MESSAGES"));
Assert.assertTrue (acknowNameUpdate.isDisplayed(), "name is updated");
prof.mailEdit();
String acknowmailUpdate = driver.getTitle();
Assert.assertEquals (acknowmailUpdate, "Authentication required");
driver.navigate().back();
Thread.sleep(6000);
prof.phedit();
String acknowphUpdate = driver.getTitle();
Assert.assertEquals (acknowphUpdate, "Amazon Change Name, E-mail, Password");
//WebElement closeOTP = driver.findElement(By.xpath("//span[@id='auth-verification-cancel-announce']"));
//closeOTP.click();
driver.navigate().back();
prof.auth2step();
String acknow2step = driver.getTitle();
Assert.assertEquals (acknow2step, "Amazon Two-Step Verification");
driver.navigate().back();
prof.pwdEdit();
WebElement SignInNewpwd = driver.findElement(By.xpath("//h1[@class='a-spacing-small']"));
Assert.assertTrue(SignInNewpwd.isDisplayed(), "Login using new pwd");
//WebElement reLogin = driver.findElement(By.id("ap_password"));
//reLogin.sendKeys("aMaze_1711");
//WebElement reLogin = driver.findElement(By.id("//span[@class='a-size-base transaction-approval-word-break']"));
//reLogin.sendKeys("aMaze_1711");

}
}


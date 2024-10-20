//Give 5 star rating to the last purchased order
package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import MavenSelenium.MavenSelenium.module1.HomePage;
public class Test14 extends BeforeAndAfter
{
	@Test
	public void Rate_A_Product() throws InterruptedException
	{
	SignUppage sn = new SignUppage(driver);	
	sn.signInlink();
	sn.UserID();
	sn.continueto();
	sn.pwd();
	sn.LoginToApp();
    Thread.sleep(8000);
	sn.navigatetoOrders();
	sn.selectYear();
	sn.reviewOrd();
	sn.starRating();
	sn.submitcomments();
	sn.submitdesc();
	sn.submitReview();
WebElement ackmessage = driver.findElement(By.cssSelector("[class='a-box a-alert a-alert-success ryp__thank-you-alert']"));
Assert.assertTrue(ackmessage.isDisplayed(), "Product review is submitted successfully");
	

}
}

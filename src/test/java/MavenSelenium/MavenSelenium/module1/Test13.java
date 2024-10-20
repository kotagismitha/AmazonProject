//verify if user is able to apply coupoun code during order
package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import MavenSelenium.MavenSelenium.module1.ProductCheckOutPage; 
public class Test13 extends BeforeAndAfter
{
	@Test
	public void Verify_Coupoun_code_application()
	{
	ProductCheckOutPage coup = new ProductCheckOutPage(driver);
	coup.applycoupoun();
	//soft assertion for verification of the error message
	WebElement actual = driver.findElement(By.linkText("not valid."));
	String actualMessage = actual.getText();
  
  //String expectedmessage = 
	//Assert.assertTrue(false);
}
}

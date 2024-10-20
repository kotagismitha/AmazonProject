//verify searching with filters to yield accurate results
package MavenSelenium.MavenSelenium.module1;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import MavenSelenium.MavenSelenium.module1.HomePage;
public class  Test6 extends BeforeAndAfter
{
		@Test
		public void Filters_On_Amazon() throws InterruptedException
		{
			 HomePage ls = new HomePage(driver);
			 ls.itemsearch();
			 ls.searchicon();
			 ls.deliveryfilter();
			 Thread.sleep(6000);
String Atitle = driver.getTitle();
Assert.assertEquals(Atitle, "Amazon[[.in: Decor - All Discounts]]");
//String stateDelivery= driver.findElement(By.xpath("//input[@type='checkbox']")).getAttribute("Checked");

     }
}


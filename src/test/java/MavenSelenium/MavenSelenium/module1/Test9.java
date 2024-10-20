//verify addition of items to cart from prod details
package MavenSelenium.MavenSelenium.module1;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import MavenSelenium.MavenSelenium.module1.ProductDetails;
	public class Test9 extends BeforeAndAfter
	{
		@Test
			public void Add_Prod_to_cart() throws InterruptedException
			{
			HomePage home = new HomePage(driver);
		     String Parenthandle = driver.getWindowHandle();
				 home.itemsearch();
				 home.searchicon();
				 home.Itemselection();
				 Thread.sleep(5000);
				 Set<String> handles = driver.getWindowHandles();
				for (String handle : handles)
				{
				System.out.println(handle);
				if (!handle.equals(Parenthandle)) 
				   {
					driver.switchTo().window(handle);
				   }
				}
//add assertion to verify the landing on the product details screen
			 String ActualPagetitle = driver.getTitle();
			 String ExpectedPageTitle = "Amazon.in : Decor";
			 Assert.assertNotEquals(ActualPagetitle, ExpectedPageTitle);
				 System.out.println(driver.getTitle());
				 ProductDetails prdct = new ProductDetails(driver);
				 System.out.println(driver.getWindowHandle());
				 prdct.addToKart();
				 Thread.sleep(4000);
WebElement Itemaddition = driver.findElement(By.xpath("//div[@id='sw-atc-details-single-container']"));
Assert.assertTrue((Itemaddition.isDisplayed()==true), "Added item to cart");	
	}
	}

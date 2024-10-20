//verify the details of the product on the product details screen
package MavenSelenium.MavenSelenium.module1;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import MavenSelenium.MavenSelenium.module1.ProductDetails;
import junit.framework.Assert;
	public class Test7  extends BeforeAndAfter
	{
		@Test
		public void Product_details_verification() throws InterruptedException
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
			 ProductDetails prod = new ProductDetails(driver);
			 prod.verifypricetag();
			 SoftAssert s1 = new SoftAssert();
			 s1.assertTrue(prod.ItemPrice != null);
			 prod.verifyItemdesc();
			 s1.assertTrue(prod.Itemdesc != null);
			 //add scroll to view
//			Point p1 = prod.prodReview.getLocation();
//			int x= p1.getX();
//			int y= p1.getY();
//			JavascriptExecutor js= (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(x,y)", "");
			prod.verifyreviews();
			s1.assertTrue(prod.prodReview != null);
			s1.assertAll();

			 
	}
	}

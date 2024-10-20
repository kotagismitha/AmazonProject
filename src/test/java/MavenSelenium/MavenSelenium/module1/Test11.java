//Validate the checkout process
package MavenSelenium.MavenSelenium.module1;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MavenSelenium.MavenSelenium.module1.HomePage;
import MavenSelenium.MavenSelenium.module1.ProductCheckOutPage;
public class Test11 extends BeforeAndAfter
{
		@Test
		public void Validate_CheckOut() throws InterruptedException
		{
		HomePage home = new HomePage(driver);
		SignUppage sign = new SignUppage(driver);
		sign.signInlink();
		sign.UserID();
		sign.continueto();
		sign.pwd();
		sign.LoginToApp();
		//Add assertion to check if the cart is empty
		home.itemsearch();
		home.searchicon();
		home.addcart();
		Thread.sleep(2000);
		home.goTocart();
		//add assertion to check if we landed on the cart page
		 ProductCheckOutPage chkout = new  ProductCheckOutPage(driver);
		 chkout.proceedToBuy();
		 
//	     String Parenthandle = driver.getWindowHandle();
//	      chkout.addAddress();
//			 Thread.sleep(5000);
//			Set<String> handles = driver.getWindowHandles();
//			for (String handle : handles)
//			{
//			System.out.println(handle);
//			if (!handle.equals(Parenthandle)) 
//			   {
//				driver.switchTo().window(handle);
//			   }
//			}
//		 chkout.addName();
//		 System.out.println("Username is added");
//		 chkout.addnumber();
//		 chkout.addAddress();
//		 chkout.addPIN();
//		 chkout.aptDtl();
//		 chkout.areaDtl();
//		 chkout.city();
//		 chkout.idenitifier();
//		 chkout.statesel();
//		 chkout.savenewaddress();
//		 chkout.selectAddedAddress();
		 chkout.selectnewAddress();
		 Thread.sleep(5000);
//		 chkout.payCOD();
		 chkout.payment();
Assert.assertTrue(chkout.verificationPoint.isDisplayed()==true);
//		 chkout.OrderPlacement();
//		 chkout.reviewOrder();
//		 chkout.ListOrders();
		 //add assertion to check if we landed on the checkout page and also switch the page
		 
}
}



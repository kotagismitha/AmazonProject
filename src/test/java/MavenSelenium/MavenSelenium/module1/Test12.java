//verify if user can select all the payment methods
//pre-req: user should be on the checkout page and at the payment step
package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import MavenSelenium.MavenSelenium.module1.ProductCheckOutPage;
public class Test12 extends BeforeAndAfter
	{
		@Test
			public void Validate_All_Payment_Methods() throws InterruptedException
			{
			HomePage home = new HomePage(driver);
			SignUppage sign = new SignUppage(driver);
			sign.signInlink();
			sign.UserID();
			sign.continueto();
			sign.pwd();
			sign.LoginToApp();
			home.itemsearch();
			home.searchicon();
			home.addcart();
			Thread.sleep(2000);
			home.goTocart();	
		ProductCheckOutPage pay= new ProductCheckOutPage(driver);
		pay.proceedToBuy();
		pay.selectnewAddress();
		 Thread.sleep(5000);
		pay.OptionsPay();
		pay.OptionsToPay();
		driver.switchTo().frame(pay.paymentframe);
		pay.ProvideCardDetails();
		pay.CardHolderName();
		pay.selectmonth();
		pay.selectyear();
		pay.savecrd();
		pay.carddetailsSave();
		pay.payment();
		pay.provideCVV();
		pay.reviewOrder();
		pay.ListOrders();
		pay.payopt3();
		pay.selectBank();
		pay.payment();
		pay.UPI();
		pay.UPI_ID();
		pay.UPI_ID_verify();
		pay.payment();
		
	}
	}

//Reach till cart page without login in amazon application
package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Test15 extends BeforeAndAfter {
  WebDriver driver;
  @Test
  public void Search_An_Item_AddToCartTest() throws InterruptedException {
	  driver= new ChromeDriver();
    HomePage reg = new HomePage(driver);
	System.out.println("started item search");
	reg.itemsearch();
	System.out.println("finished item search");
	reg.searchicon();
	System.out.println("Sleeping 8 secs after item search");
	Thread.sleep(8000);
	//reg.Itemselection();
	System.out.println("adding to cart");
	reg.addcart();
	System.out.println("added to cart");
	reg.goTocart();
	System.out.println("went to cart");
//	Thread.sleep(4000);
//	System.out.println(driver.getTitle());
//	Thread.sleep(4000);
//	prod.Add_to_cart();
//	prod.buyItems();
String ActualPageTitle = driver.getTitle();
String ExpectedPageTitle ="Amazon.in Shopping cart";
Assert.assertEquals(ExpectedPageTitle, ExpectedPageTitle, "Landed on Cart page");
	}
  }

//Test updating item quantities and removing items from the cart.
package MavenSelenium.MavenSelenium.module1;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import MavenSelenium.MavenSelenium.module1.HomePage;
import MavenSelenium.MavenSelenium.module1.ProductCheckOutPage;
public class Test10 extends BeforeAndAfter {
    	@Test
    	public void Edit_Items_In_Cart() throws InterruptedException {
    	SignUppage sn = new SignUppage(driver);	
    		sn.signInlink();
    		sn.UserID();
    		sn.continueto();
    		sn.pwd();
    		sn.LoginToApp();
    	HomePage hm = new HomePage(driver);
    	hm.navigatetoKart();
    	ProductCheckOutPage prd = new ProductCheckOutPage(driver);
    	prd.ItemRemove();
    	Thread.sleep(2000);
WebElement itemremovedack = driver.findElement(By.xpath("//div[@class='sc-list-item-removed-msg'][1]"));
Assert.assertTrue(itemremovedack.isDisplayed(), "Product removal is successful");
          prd.updatecount();
WebElement itemupdate = driver.findElement(By.xpath("//span[.='4']"));
Assert.assertTrue(itemupdate.isDisplayed(), "Product update is successful");         
    }
    }
//Test searching for products using it's name
package MavenSelenium.MavenSelenium.module1;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import MavenSelenium.MavenSelenium.module1.HomePage;
public class Test5 extends BeforeAndAfter
	{
	@Test
	public void Edit_Amazon_Profile () throws InterruptedException
	{
	HomePage home = new HomePage(driver);
	{
		home.itemsearch();
		home.searchicon();
		Thread.sleep(9000);
		System.out.println(driver.getTitle());
//Assert to check if the search criteria is listed
String Asearchtext = driver.getTitle();
String Esearchtext="Amazon.in : Decor";
Assert.assertEquals(Asearchtext, Esearchtext, "Search criteria matches");
//Can take the description for the items listed as list of webelements and check if the partial link test has the word "decor" in it
//String heading = driver.findElement(By.cssSelector("[class='a-color-state a-text-bold']")).getAttribute("LinkText");
//assertEquals(heading, Esearchtext, "Search criteria matches");
	}
}
	}


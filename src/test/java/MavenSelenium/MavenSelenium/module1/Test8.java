//Check if products can be sorted by relevance, price, rating, etc.
package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import MavenSelenium.MavenSelenium.module1.HomePage;
public class Test8 extends BeforeAndAfter
	{
	@Test
	public void Sort_Search_results() throws InterruptedException
	{
	HomePage home = new HomePage(driver);
	{
		home.itemsearch();
		home.searchicon();
     	home.Sortsearch();				
		SoftAssert s1 = new SoftAssert();
		s1.assertTrue(home.valueselected.getText()=="Featured");
//		home.SortBestSell();
//		s1.assertTrue(home.valueselected.getText()=="Best Sellers");
//		Thread.sleep(5000);
//		home.SortbyPriceasc();
//		s1.assertTrue(home.valueselected.getText()=="Price: High to Low");
//		Thread.sleep(5000);
//		home.SortbyPricedes();
//		s1.assertTrue(home.valueselected.getText()=="Price: Low to High");
//		Thread.sleep(5000);
//		home.Sortresults();
//		s1.assertTrue(home.valueselected.getText()=="Avg. Customer Review");
//		Thread.sleep(5000);
//		s1.assertAll();
		
	}	
	}
	} 

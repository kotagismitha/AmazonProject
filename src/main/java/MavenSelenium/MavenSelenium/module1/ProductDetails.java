package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Reporter;
public class ProductDetails 
	{
	@FindBy(xpath="//span[@class='a-price-whole'][1]")
	WebElement ItemPrice;
	@FindBy(xpath="//h1[contains (text(),'About this item')]")
	WebElement Itemdesc;
	@FindBy(xpath="//div[@id='averageCustomerReviews_feature_div']")
	WebElement prodReview;
	@FindBy(xpath="//input[@title='Add to Shopping Cart']")
	WebElement addCart;
	public void verifypricetag()
	{
		if(ItemPrice.isDisplayed()==true)
		{
		 System.out.println(ItemPrice.getText());
		// Reporter.log(ItemPrice.getText());
		}
	}
	public void verifyItemdesc()
		{
			if(Itemdesc.isDisplayed()==true)
			{
			 System.out.println(Itemdesc.getText());
		//	 Reporter.log(Itemdesc.getText());
			}
	}
	public void verifyreviews()
	{
		if(prodReview.isDisplayed()==true)
		{
		 System.out.println(prodReview.getText());
		// Reporter.log(prodReview.getText());
		}

	}
	public void addToKart()
	{
	addCart.click();
	}

	public ProductDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	}

package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class HomePage 
	{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	@FindBy(id="nav-search-submit-button")
	WebElement iconsearch;
	@FindBy(xpath="//div [@class='a-section aok-relative s-image-square-aspect']")
	WebElement firstitem;
	@FindBy(xpath="//button[contains(text(), \"Add to cart\")][1]")
	WebElement add2cart;
	@FindBy(id="nav-cart-count-container")
	WebElement cart;
	@FindBy(partialLinkText="All Discounts")
	WebElement del;
	@FindBy(xpath="//span[.='Vases']")
	WebElement itm;
	@FindBy(xpath="//span[.='Indoor']")
	WebElement loc;
	@FindBy(xpath="//select[@id='s-result-sort-select']")
	WebElement sortres;
	@FindBy(xpath="//div[@class='a-popover-inner']")
	WebElement dropdown;
	@FindBy(xpath="//option[@value='relevanceblender']")
	WebElement valueselected;
	@FindBy(css="#nav-cart-count-container")
	WebElement carticon;
	@FindBy(css="[class='a-button a-button-dropdown']")
	WebElement dropdownyear;
	@FindBy(css="[id='a-autoid-4-announce']")
	WebElement reviewlink;
	@FindBy(css="[data-hook=ryp-error-page-text]") //can be used for assertion
	WebElement errorReview;
	//@FindBy(css="#nav-orders")
	//WebElement Orders;
	//@FindBy(css="#nav-orders")
	//WebElement Orders;
	public void itemsearch()
	{
		search.sendKeys("Decor");
	}
	public void searchicon()
	{
		iconsearch.click();
	}
	public void Itemselection()
	{
		firstitem.click();
	}
	public void addcart()
	{
		add2cart.click();
	}
	public void goTocart()
	{
		cart.click();
	}
	public void deliveryfilter() throws InterruptedException
	{
		del.click();
		Thread.sleep(2000);
	}
	public void specItem() throws InterruptedException
	{
		itm.click();
		Thread.sleep(2000);
	}
	public void itmtype() throws InterruptedException
	{
		loc.click();
		Thread.sleep(2000);
	}
	public void Sortsearch() throws InterruptedException
	{
		//sortres.click();
		Select s1 = new Select(sortres);
		s1.selectByIndex(2);
		Thread.sleep(5000);
		//		s1.selectByVisibleText("Best Sellers");
//		s1.selectByValue("review-rank");
	    //Write logic to select the value from the dropdown
	    System.out.println(valueselected.getText());
	}
	public void SortbyPricedes()
	{
		//sortres.click();
		Select s1 = new Select(sortres);
		s1.selectByValue("price-desc-rank");
		sortres.sendKeys(Keys.ENTER);
	}
	public void SortbyPriceasc()
	{
		//sortres.click();
		Select s1 = new Select(sortres);
		s1.selectByValue("price-asc-rank");
		sortres.sendKeys(Keys.ENTER);
	}
	public void Sortresults()
	{
		//sortres.click();
		Select s1 = new Select(sortres);
		s1.selectByValue("review-rank");
		sortres.sendKeys(Keys.ENTER);
	}
	public void SortBestSell()
	{
		//sortres.click();
		Select s1 = new Select(sortres);
		s1.selectByValue("exact-aware-popularity-rank");
		sortres.sendKeys(Keys.ENTER);
	}
	public void drpdwn()
	{
	 //dropdown.findElm();
	}
	public void navigatetoKart()
	{
		carticon.click();
	}
	public void selectyear()
	{
		dropdownyear.click();
		dropdownyear.sendKeys("2023");
	}
	public void goToReviewPage()
	{
		reviewlink.click();
	}
	public void errorReviewpage()
	{
		errorReview.click();
	}

	//public void navigatetoOrders()
	//{
//		Orders.click();
	//}

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	}

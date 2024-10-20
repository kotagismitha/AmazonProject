package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RegistrationPage
{
	WebDriver driver;
	//Step 1:Locating each Element using the FindBy annotation
	@FindBy(id="nav-link-accountList")
	WebElement hover;
	@FindBy(id="createAccountSubmit")
	WebElement CreateAcc;
	@FindBy(id= "ap_customer_name")
	WebElement fname;
	@FindBy(id="ap_phone_number")
	WebElement phnum;
	@FindBy(id="ap_password")
	WebElement pwd;
	@FindBy(id="continue")
	WebElement proceed;
	@FindBy(id="auth-warning-message-box")
	WebElement Asserter;
	//Step 2 : Creating seperate methods for each component
	public void hoveron()
	{
		hover.click();
	}
	public void Rgsn()
	{
		CreateAcc.click();
	}
	public void un()
	{
		fname.sendKeys("smitha");
	}
	public void num()
	{
		phnum.sendKeys("8149692711");
	}
	public void pw()
	{
		pwd.sendKeys("aMaze_1711");
	}
	
	public void proceeds() 
	{
		proceed.click();
	}
//	public void validationMessage() 
//	{
//		if (Asserter.isDisplayed()==true)
//		{
//			System.out.println("Tc passed");
//		}
//	}
	//Step3 : Initializing the element
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	}

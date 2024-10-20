package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class SignUppage 
{
WebDriver driver;
@FindBy(id="nav-link-accountList")
WebElement LinkToSignIn;
@FindBy(id="ap_email")
WebElement InputID;
//@FindBy(xpath="//h4[.='Incorrect phone number']")
//WebElement validationID;
@FindBy(id="continue")
WebElement ContinueBtn;
@FindBy(id="ap_password")
WebElement Password;
@FindBy (id="signInSubmit")
WebElement BtnSign;
@FindBy(css="#nav-orders")
WebElement Orders;
@FindBy(xpath="//a[contains(text(),'Write a product review')][1]")
WebElement OrderReview;
@FindBy(css="[class= 'a-button-text a-declarative']")
WebElement icondrop;
@FindBy(xpath="//select[@name='timeFilter']")
WebElement yearselect;
@FindBy(css="[alt='select to rate item five star.']")
WebElement StarRate;
@FindBy(css="[id='scarface-review-title-label']")
WebElement comments;
@FindBy(css="[id='scarface-review-text-card-title']")
WebElement desc;
@FindBy(css="[value='Submit']")
WebElement Submitreview;
@FindBy(css="[class='a-box a-alert a-alert-success ryp__thank-you-alert']")
WebElement alrt;

public void signInlink()
{
	LinkToSignIn.click();
}
public void UserID()
{
	InputID.clear();
	InputID.sendKeys("8149692711");
}
//public void validate()
//{
//	if(validationID.isDisplayed()==true)
//	{
//		System.out.println("Provide valid userID");
//	}
//	else
//	{
//		System.out.println("Provide valid:");
//		continueto();
//	}
//}
public void continueto()
{
	ContinueBtn.click();
}
public void pwd()
{
	Password.sendKeys("gRotech_1711");
}
public void LoginToApp()
{
	BtnSign.click();
}
public void navigatetoOrders()
{
	Orders.click();
	Select s1 = new Select(yearselect);
	s1.selectByValue("year-2023");
}
public void selectYear()
{
	icondrop.click();
	
}
public void reviewOrd()
{
	OrderReview.click();
}
public void starRating()
{
	StarRate.click();
}
public void submitReview()
{
	Submitreview.click();
}
public void submitcomments()
{
	comments.sendKeys("Good product");
}
public void submitdesc()
{
	desc.sendKeys("Satisfied with the product");
}


public SignUppage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}


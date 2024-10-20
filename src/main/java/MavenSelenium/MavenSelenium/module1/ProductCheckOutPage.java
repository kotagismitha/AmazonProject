package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
	public class ProductCheckOutPage 
	{
	WebDriver driver;
	@FindBy(xpath="//select[@name='quantity'][1]")
	WebElement quantityedit;
	@FindBy(xpath="//input[@value='Delete'][1]")
	WebElement Itemdelete;
	@FindBy(css="[name=proceedToRetailCheckout]")
	WebElement proceedBuy;
	@FindBy(css="#address-ui-widgets-enterAddressFullName") 
	WebElement Newname;
	@FindBy(css="#add-new-address-popover-link") 
	WebElement NewAddress;
	@FindBy(xpath="//span[.='Mobile number']") 
	WebElement Newnum;
	@FindBy(xpath="//span[.='Pincode']") 
	WebElement codePin;
	@FindBy(partialLinkText="Apartment") 
	WebElement NewApt;
	@FindBy(xpath="//span[.='Area, Street, Sector, Village']") 
	WebElement NewArea;
	@FindBy(xpath="//span[.='Landmark']") 
	WebElement Landmark;
	@FindBy(xpath="//span[.='Town/City']") 
	WebElement citi;
	@FindBy(xpath="//span[.='State']") 
	WebElement state;
	@FindBy(xpath="//span[.='Use this address']") 
	WebElement submitform;
	@FindBy(partialLinkText="560062") 
	WebElement selAdd;
	@FindBy(css="#shipToThisAddressButton") ////span[@id='shipToThisAddressButton']
	WebElement selectnewaddress;
	@FindBy(partialLinkText="Cash on Delivery/Pay on Delivery") 
	WebElement COD;
	@FindBy(xpath="//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent' and @type='submit']") 
	WebElement addPaymethod;
	@FindBy(css="[aria-labelledby=bottomSubmitOrderButtonId-announce]") 
	WebElement placeOrder;
	@FindBy(partialLinkText="Review or edit your recent orders") 
	WebElement orderReview;
	@FindBy(partialLinkText="View order details") 
	WebElement orderlist;
	@FindBy(css="[value=SelectableAddCreditCard]")
	WebElement payOpt1;
	@FindBy(xpath="//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']")
	WebElement payOpt2;
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	WebElement addCrdnum;
	@FindBy(xpath="//iframe[@name='ApxSecureIframe']")
	WebElement paymentframe;
	@FindBy(css="[name='ppw-accountHolderName']")
	WebElement nickname;
	@FindBy(xpath="//span[.='2024']/span/span/span")
	WebElement yearsel;
	@FindBy(xpath="//span[.='01']/span/span/span")
	WebElement monthsel;
	@FindBy(xpath="//span[.='Enter card details']")
	WebElement submitcarddetails;
	@FindBy(xpath="//input[@id='field']")
	WebElement submitCVV;
	@FindBy(partialLinkText="Continue without saving")
	WebElement SaveNo;
	@FindBy(partialLinkText="Net Banking")
	WebElement nEtBanking;
	@FindBy(xpath="//span[.='Choose an Option']/span/span/span")
	WebElement optbank;
	@FindBy(partialLinkText="Payment through ICICI Bank")
	WebElement redirected;
	@FindBy(partialLinkText="Other UPI Apps")
	WebElement upi;
	@FindBy(css="[placeholder='Enter UPI ID']")
	WebElement IDupi;
	@FindBy(css="[for=spc-gcpromoinput]")
	WebElement coupoun;
	@FindBy(css="#gcApplyButtonId-announce")
	WebElement Apply;
	@FindBy(partialLinkText="Verify")
	WebElement verifyUPI;
@FindBy(xpath="//span[@id='shipToThisAddressButton-announce']")
WebElement verificationPoint;


	{

	}
		public void updatecount() throws InterruptedException
		{
			//quantityedit.click();
			Select s1= new Select(quantityedit);
			s1.selectByValue("4");
			
		}
		public void ItemRemove()
		{
			Itemdelete.click();

		}
		public void proceedToBuy()
		{
			proceedBuy.click();

		}
		public void addAddress()
		{
			NewAddress.click();

		}
		public void addName()
		{
			Newname.sendKeys("Smeetha");

		}
		public void addnumber()
		{
			Newnum.sendKeys("8149692711");

		}
		public void addPIN()
		{
			codePin.sendKeys("560062");

		}
		public void aptDtl()
		{
			NewApt.sendKeys("#103, Aadya Residency");

		}
		public void areaDtl()
		{
			NewArea.sendKeys("Yelachenahalli");

		}
		public void idenitifier()
		{
			Landmark.sendKeys("ISKCON");

		}
		public void city()
		{
			citi.sendKeys("Bangalore");

		}
		public void statesel()
		{
			state.click();
			state.sendKeys("Karnataka");

		}
		public void savenewaddress()
		{
			submitform.click();

		}
		public void selectAddedAddress()
		{
			selAdd.click();

		}
		public void selectnewAddress()
		{
			selectnewaddress.click();

		}
		public void payCOD()
		{
			COD.click();

		}
		public void payment()
		{
			addPaymethod.click();

		}	
		public void OrderPlacement()
		{
			placeOrder.click();

		}
		public void reviewOrder()
		{
		orderReview.click();
		}
		public void ListOrders()
		{
			orderlist.click();
		}
		public void OptionsPay()
		{
			payOpt1.click();
		}
		public void OptionsToPay()
		{
			payOpt2.click();
		}
		public void ProvideCardDetails()
		{
			
			addCrdnum.sendKeys("0000 0000 0000 0000");
		}
		public void CardHolderName()
		{
			nickname.sendKeys("Smithi");
		}
		public void selectmonth()
		{
			monthsel.click();
			monthsel.sendKeys("07");
		}
		public void selectyear()
		{
			yearsel.click();
			yearsel.sendKeys("2027");
		}
		public void savecrd()
		{
			submitcarddetails.click();
		}
		
		public void provideCVV()
		{
			submitCVV.sendKeys("593");
		}
		public void carddetailsSave()
		{
			SaveNo.click();
		}
		public void payopt3()
		{
			nEtBanking.click();
		}
		public void selectBank()
		{
			optbank.click();
			optbank.sendKeys("ICICI");
		}
		public void redirect()
		{
			redirected.isDisplayed();
			//modify for better 
		}
		public void UPI()
		{
			upi.click();
		}
		public void UPI_ID()
		{
			IDupi.sendKeys("smithabvb@icici");
		}
		public void UPI_ID_verify()
		{
			verifyUPI.click();
		}
		public void applycoupoun()
		{
			coupoun.sendKeys("SALE");
			Apply.click();
		}
		
	public ProductCheckOutPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	}

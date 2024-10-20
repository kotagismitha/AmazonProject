package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
public class ProfileInformationPage 
	{
	WebDriver driver;
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement Options;
	@FindBy(partialLinkText="Edit login")
	WebElement editbox;
	@FindBy(id="ap_password")
	WebElement pwd;
	@FindBy(id="signInSubmit")
	WebElement login;
	@FindBy(id="NAME_BUTTON")
	WebElement editName;
	@FindBy(id="EMAIL_BUTTON")
	WebElement editMail;
	@FindBy(id="MOBILE_NUMBER_BUTTON")
	WebElement edditcontactnum;
	@FindBy(id="PASSKEY_BUTTON")
	WebElement keypass;
	@FindBy(id="PASSWORD_BUTTON")
	WebElement passwrd;
	@FindBy(id="TWO_STEP_VERIFICATION_BUTTON")
	WebElement twowayauth;
	@FindBy(id="SECURE_YOUR_ACCOUNT_BUTTON")
	WebElement accsecure;
	@FindBy(id="ap_customer_name")
	WebElement newName;
	@FindBy(id="cnep_1C_submit_button")
	WebElement SaveChange;
	@FindBy(id="cvfEmail")
	WebElement newMail;
//	@FindBy(id="cvf_action")
//	WebElement cntnu;
	//assert to check if the enter OTP page is displayed name=code
	//press back twice to see edit page
	@FindBy(id="ap_phone_number")
	WebElement editphnum;
	//add assertion to identify if pop up to send OTP appears
	@FindBy(id="a-popover-header-1")
	WebElement cnfrmpopup;
	@FindBy(id="ap_password")
	WebElement oldpwd;
	@FindBy(id="ap_password_new")
	WebElement npwd;
	@FindBy(id="ap_password_new_check")
	WebElement rpwd;
	@FindBy(id="cnep_1D_submit_button")
	WebElement changeSave;
	@FindBy(id="ap_password")
	WebElement lgnpwd;
	@FindBy(id="signInSubmit")
	WebElement loggedIn;
	//Add assertion for the display of the OTP window
	@FindBy(id="TWO_STEP_VERIFICATION_BUTTON")
	WebElement verfndisable;
	@FindBy(id="confirm-disable-dialog-modal-submit")
	WebElement popconf;
	@FindBy(linkText="You have turned off the Two-step Verification")
	WebElement msgcnf;
	public void navigate() 
	{
		Options.click();
	}
	public void loginEdit() 
	{
		editbox.click();
	}
	public void reauth() 
	{
		 pwd.sendKeys("gRotech_1711");
	}
	public void relog() 
	{
		login.click();
	}
	public void nameEdit() 
	{
		editName.click();
		newName.clear();
		newName.sendKeys("Guest");
		SaveChange.click();
	}
	public void phedit() 
	{
		edditcontactnum.click();
	}
	public void mailEdit() 
	{
		editMail.click();
		newMail.sendKeys("ksmitha1229@gmail.com");
		newMail.sendKeys(Keys.ENTER);
		//cntnu.click();
		//Assert.assertEquals(true, true);
		//Assert.assertFalse((true, "Found the link"));
	}
	public void pwdEdit() 
	{
		passwrd.click();
		oldpwd.sendKeys("aMaze_1711");
		npwd.sendKeys("nEwadd_1711");
		rpwd.sendKeys("nEwadd_1711");
		changeSave.click();
//		lgnpwd.sendKeys("nEwadd_1711");
//		loggedIn.click();
		//Assert.assertEquals(false, false);
	}
	public void pskey() 
	{
		keypass.click();
	}
	public void auth2step() 
	{
		twowayauth.click();
//		verfndisable.click();
//		popconf.click();
//		msgcnf.click();
	}
	public void acsecure() 
	{
	accsecure.click();
	}
	public ProfileInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	}

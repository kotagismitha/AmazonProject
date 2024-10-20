//verify failure of login when invalid data is provided
package MavenSelenium.MavenSelenium.module1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import MavenSelenium.MavenSelenium.module1.SignUppage;
	public class Test3 extends BeforeAndAfter
	{
			@Test
			public void Verfiy_Login_failure_invalid_Credentails() throws InterruptedException{
			SignUppage logIn = new SignUppage(driver);
			logIn.signInlink();
			logIn.UserID();
			logIn.continueto();
			try
			{
			WebElement PwdField = driver.findElement(By.id("ap_password"));
			if (PwdField.isDisplayed()==true)
			{
				System.out.println("Username is correct");
				logIn.pwd();
				logIn.LoginToApp(); 
				Thread.sleep(2000);
				try
				{
	WebElement errmsg = driver.findElement(By.id("auth-error-message-box"));
	      if ( errmsg.isDisplayed()==true)
	      {
	    	  System.out.println("Pwd is incorrect");
			}
	      else
	      {
	    	  logIn.LoginToApp();  
	      }
			}
			catch (Exception NoSuchElementException)
			{
				System.out.println("Username is incorrect");	
			}
			}
			}
				finally
				{
					System.out.println("Test done");	
				}
WebElement errormessage = driver.findElement(By.id("auth-error-message-box"));
Assert.assertTrue((errormessage.isDisplayed()==true), "Incorrect credentials verification succeeds");	
	}
	}


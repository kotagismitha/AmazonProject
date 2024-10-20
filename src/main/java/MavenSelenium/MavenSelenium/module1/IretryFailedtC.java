package MavenSelenium.MavenSelenium.module1;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class IretryFailedtC implements IRetryAnalyzer {
	int retryCount=2;
	int CurrentCount=0;
	public boolean retry(ITestResult result) 
	{
		if(CurrentCount<retryCount)
		{
			CurrentCount++;
			return true;
		}
		return false;
	}

}

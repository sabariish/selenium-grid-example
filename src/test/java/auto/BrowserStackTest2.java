package auto;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class BrowserStackTest2 extends WebDriverTestCase{

	
@Test(invocationCount=5, threadPoolSize=5)
public void test ()  {
	
	getDriver().get("https:\\www.google.com");
	getDriver().findElement(By.name("q")).verifyPresent();
	getDriver().quit();
	

}
	
}

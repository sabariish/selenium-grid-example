package auto;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class BrowserTest extends WebDriverTestCase{

	
@Test(invocationCount=7,threadPoolSize=11)
public void test () {
	
	getDriver().get("https:\\www.google.com");
	getDriver().findElement(By.name("q")).verifyPresent();
	getDriver().quit();
	
}
	
}

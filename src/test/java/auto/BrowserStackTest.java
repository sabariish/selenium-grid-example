package auto;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class BrowserStackTest extends WebDriverTestCase{
	public static final String USERNAME = "sabarishsasidhar1";
	public static final String AUTOMATE_KEY = "mWRNWyb9fPhVCy1QK2T6";
	public static final String browserStackURL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	
@Test()
public void test () throws MalformedURLException {
	
	/*getDriver().get("https:\\www.google.com");
	getDriver().findElement(By.name("q")).verifyPresent();
	getDriver().quit();*/
	
	
	DesiredCapabilities caps = new DesiredCapabilities();
    
	caps.setCapability("os", "Windows");
	caps.setCapability("os_version", "10");
	caps.setCapability("browser", "Chrome");
	caps.setCapability("browser_version", "80");
	caps.setCapability("name", "sabarishsasidhar1's First Test");

	WebDriver driver = new RemoteWebDriver(new URL(browserStackURL), caps);
	driver.get("http://www.google.com");
	WebElement element = driver.findElement(By.name("q"));

    element.sendKeys("BrowserStack");
    element.submit();

    System.out.println(driver.getTitle());
	driver.quit();
}
	
}

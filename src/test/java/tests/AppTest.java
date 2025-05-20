package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppTest {
	@Test
	public void appTest() throws MalformedURLException {

		UiAutomator2Options options = new UiAutomator2Options();

//		options.setCapability("platformName", "android");
//		options.setCapability("appium:automationName", "uiautomator2");
		options.setCapability("appium:deviceName", "emulator-5554");
		options.setCapability("appium:app",
				"C:\\StarAgile\\AndroidMobileAppTesting\\src\\test\\resources\\ApiDemos-debug.apk");

//	  WebDriver driver = new ChromeDriver(chromeOptions);

//	  ChromeDriver driver = new ChromeDriver(chromeOptions);

		// Server URL

		URL serverURL = new URL(" http://127.0.0.1:4723");

//	  AppiumDriver driver = new AndroidDriver(serverURL, options);

		AndroidDriver driver = new AndroidDriver(serverURL, options);

		System.out.println("The session is create : " + driver.getSessionId());
		
		
	WebElement home = 	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"API Demos\"]"));
		
	System.out.println(home.getText());
		
		

	}
}

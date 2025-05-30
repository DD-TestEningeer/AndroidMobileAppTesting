package codes;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import utils.DriverUtil;

public class AndroidLocators {

	

	@Test

	public void testLocators() throws MalformedURLException {

		AndroidDriver driver = DriverUtil.getAndroidDriver();

		// The session is created
		System.out.println("The driver session is created with id : " + driver.getSessionId());

		// Find the element by Accessibility ID
		WebElement element1 = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
		System.out.println("The element1 text is : " + element1.getText());

		// Find the element by the Resource ID
		WebElement element2 = driver.findElement(AppiumBy.id("android:id/text1"));
		System.out.println("The element2 text is : " + element2.getText());

		// Find the element by the Class Name
		WebElement element3 = driver.findElement(AppiumBy.className("android.widget.TextView"));
		System.out.println("The element3 text is : " + element3.getText());

		// Find the element by the xPath
		WebElement element4 = driver
				.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Content\"]"));
		System.out.println("The element4 text is : " + element4.getText());

		// Find the element by the UiAutomator
		WebElement element5 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Graphics\")"));
		System.out.println("The element5 text is : " + element5.getText());

		driver.quit();

	}

}

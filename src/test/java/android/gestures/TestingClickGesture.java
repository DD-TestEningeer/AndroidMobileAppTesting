package android.gestures;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import utils.DriverUtil;
import utils.ElementUtil;

public class TestingClickGesture {
	@Test
	public void testClickGesture() throws MalformedURLException

	{
		// create driver session

		AppiumDriver driver = DriverUtil.getAndroidDriver();

		// element
		WebElement ele = driver.findElement(AppiumBy.accessibilityId("Views"));

		// click gesture

		ElementUtil.clickButton(driver, ele);

		System.out.println("Click Completed!");

	}
}

package android.gestures;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import utils.DriverUtil;
import utils.ElementUtil;

public class TestScrollGesture {
	@Test
	public void testGesture() throws MalformedURLException {
		// create driver session

		AppiumDriver driver = DriverUtil.getAndroidDriver();

		// views
		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		// area to scroll
		WebElement area = driver.findElement(AppiumBy.id("android:id/list"));

		ElementUtil.scrollDownUpToCount(driver, area, 2);

		System.out.println("Scroll action ");

	}
}

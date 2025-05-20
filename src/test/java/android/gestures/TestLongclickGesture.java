package android.gestures;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import utils.DriverUtil;

public class TestLongclickGesture {
	@Test
	public void testGesture() throws MalformedURLException {
		// create driver session
		AppiumDriver driver = DriverUtil.getAndroidDriver();

		// clicked on Views
		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		// clicked on drag and drop
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

		// long click 1st dot
		WebElement ele = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

		// longclickGesture

		driver.executeScript("mobile:longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 4000

				));

		System.out.println("Long Click gesture is completed!");

	}
}

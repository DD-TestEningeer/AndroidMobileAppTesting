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

public class TestSwipeGesture {
	@Test
	public void testGesture() throws InterruptedException, MalformedURLException {

		// create a driver session

		AppiumDriver driver = DriverUtil.getAndroidDriver();

		// views
		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		// Gallery
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();

		// photos
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		// area
		WebElement area = driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));

		// gesture

		ElementUtil.swipeLeft(driver, area);

		Thread.sleep(2000);

		ElementUtil.swipeRight(driver, area);

	}
}

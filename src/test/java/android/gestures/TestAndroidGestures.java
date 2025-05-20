package android.gestures;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import utils.DriverUtil;

public class TestAndroidGestures {

	@Test
	public void testGestures() throws InterruptedException, MalformedURLException {
		AndroidDriver driver = DriverUtil.getAndroidDriver(); // Initialize your driver

		WebElement button = driver.findElement(AppiumBy.id("android:id/text1"));
		
		// Tab the element
		AndroidGestures.tapElement(driver, button);
		System.out.println("Tab the element");
		Thread.sleep(3000);
		
		// Long press the element
		AndroidGestures.longPressElement(driver, button);
		System.out.println("Long Press the element");
		Thread.sleep(3000);

		// Swipe right to left
		AndroidGestures.swipe(driver, 500, 1200, 100, 1200); // right to left
		System.out.println("Swipe right to left");
		Thread.sleep(3000);
		
		// Vertical Scroll
		AndroidGestures.verticalScroll(driver, 80, 20);
		System.out.println("Vertical Scroll");
		Thread.sleep(3000);

		// Landscape Mode on device
		AndroidGestures.setLandscape(driver);
		System.out.println("Landscape Mode on device");
		Thread.sleep(3000);
		
		
		// Portrait Mode on device
		AndroidGestures.setPortrait(driver);
		System.out.println("Portrait mode on device");
	}

}

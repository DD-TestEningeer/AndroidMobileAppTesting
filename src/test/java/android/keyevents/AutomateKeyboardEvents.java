package android.keyevents;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import utils.DriverUtil;
import utils.ElementUtil;

public class AutomateKeyboardEvents {
	@Test
	public void testKeyPressEvent() throws MalformedURLException {
		// create driver session
		AppiumDriver driver = DriverUtil.getAndroidDriver();

		// views
		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		// area
		WebElement area = driver.findElement(AppiumBy.id("android:id/list"));

		// sroll 3 time
		ElementUtil.scrollDownUpToCount(driver, area, 3);

		// textFields
		driver.findElement(AppiumBy.accessibilityId("TextFields")).click();

		// tyeparea
		WebElement editArea = driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));

		// sendKeys()
		 editArea.sendKeys("HELLO");

		// virtual keyboard

//		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.H));
//		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.E));
//		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.L));
//		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.L));
//		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.O));

	}
}

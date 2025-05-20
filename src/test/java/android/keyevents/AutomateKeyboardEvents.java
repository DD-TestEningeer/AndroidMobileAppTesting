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
import io.appium.java_client.android.nativekey.PressesKey;
import utils.DriverUtil;
import utils.ElementUtil;

public class AutomateKeyboardEvents {
	@Test
	public void testKeyPressEvent() throws MalformedURLException {
		
		
		try {
		
		// create driver session
		AppiumDriver driver = DriverUtil.getAppiumDriver();

		// views
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		Thread.sleep(3000);

		// area
		WebElement area = driver.findElement(AppiumBy.id("android:id/list"));
		
		Thread.sleep(3000);

		// sroll 3 time
		ElementUtil.scrollDownUpToCount(driver, area, 3);
		
		Thread.sleep(3000);

		// textFields
		driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
		
		Thread.sleep(3000);

		// tyeparea
		WebElement editArea = driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
		
		Thread.sleep(3000);

		// sendKeys()
//		 editArea.sendKeys("HELLO");
		 
		 
			// virtual keyboard
		 
		 
		 // If Appium Driver instance is created then we can use below code

		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.H));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.E));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.L));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.L));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.O));
		 
		 
		 
		} catch (Exception e) {
			
		
		System.out.println("Exception is : " + e.getMessage());
		
		
		}
		 
		 
		 



	}
}

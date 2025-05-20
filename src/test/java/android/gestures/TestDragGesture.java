package android.gestures;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import utils.DriverUtil;
import utils.ElementUtil;

public class TestDragGesture {
	@Test
	public void testDragGesture() throws MalformedURLException {
		// create a driver session
		AppiumDriver driver = DriverUtil.getAndroidDriver();
		ElementUtil.getScreenshot(driver, "HomePage");

		// views
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		ElementUtil.getScreenshot(driver, "ViewPage");

		// drag and drop
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		ElementUtil.getScreenshot(driver, "DragPage");
		// dot1
		WebElement ele = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		ElementUtil.getScreenshot(driver, "Dotpage");
		// gesture

		driver.executeScript("mobile:dragGesture", ImmutableMap.of(

				"elementId", ((RemoteWebElement) ele).getId(), "endX", 804, "endY", 1543

		));

		// result message
		String resultText = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();

		ElementUtil.getScreenshot(driver, "Completion");
		String exp = "Dropped!";
		AssertJUnit.assertEquals(resultText, exp);
		System.out.println("Result Text is: " + resultText);

	}
}

package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import utils.DriverUtil;

public class TestLocators {

	

	@Test

	public void testLocators() throws MalformedURLException {

		AndroidDriver driver = DriverUtil.getAndroidDriver();

		// Finding out the title element of App using xpath

		WebElement home = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"API Demos\"]"));

		String expTitle = "API Demos";

		String actTitle = home.getText();

		System.out.println("The actual title of the app is : " + actTitle);

		Assert.assertEquals(actTitle, expTitle);

		// Another locator => accessibilityId

		WebElement element2 = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));

		String expText = "Access'ibility";

		String actText = element2.getText();

		System.out.println("The actual text of the element2 : " + actText);

		Assert.assertEquals(actText, expText);

	}

}

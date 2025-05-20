package utils;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverUtil {

	public static AndroidDriver getAndroidDriver() throws MalformedURLException {

		UiAutomator2Options options = new UiAutomator2Options();

		options.setCapability("platformName", "android");
		options.setCapability("appium:automationName", "uiautomator2");
		options.setCapability("appium:deviceName", "emulator-5554");
		options.setCapability("appium:app",
				"C:\\StarAgile\\AndroidMobileAppTesting\\src\\test\\resources\\ApiDemos-debug.apk");

		// Server URL

		URL serverURL = new URL(" http://127.0.0.1:4723");

		AndroidDriver driver = new AndroidDriver(serverURL, options);

		System.out.println("The session is created with id : " + driver.getSessionId());
		
		return driver;

	}
	
	
	public static AppiumDriver getAppiumDriver() throws MalformedURLException {

		UiAutomator2Options options = new UiAutomator2Options();

		options.setCapability("platformName", "android");
		options.setCapability("appium:automationName", "uiautomator2");
		options.setCapability("appium:deviceName", "emulator-5554");
		options.setCapability("appium:app",
				"C:\\StarAgile\\AndroidMobileAppTesting\\src\\test\\resources\\ApiDemos-debug.apk");

		// Server URL

		URL serverURL = new URL(" http://127.0.0.1:4723");

		AppiumDriver driver = new AndroidDriver(serverURL, options);

		System.out.println("The session is created with id : " + driver.getSessionId());
		
		return driver;

	}


}

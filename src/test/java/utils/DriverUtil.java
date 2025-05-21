package utils;

import java.net.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverUtil {

	static AndroidDriver androidDriver;
	static AppiumDriver appiumDriver;
	// please replace with your actual apk file location
	static String appPath = System.getProperty("user.dir") + "\\src\\test\\resources\\ApiDemos-debug.apk";

	public static AndroidDriver getAndroidDriver() {

		try {

			UiAutomator2Options options = new UiAutomator2Options();

			options.setCapability("platformName", "android");
			options.setCapability("appium:automationName", "uiautomator2");
			options.setCapability("appium:deviceName", "emulator-5554");
			options.setCapability("appium:app", appPath);

			// Server URL

			URL serverURL = new URL(" http://127.0.0.1:4723");

			androidDriver = new AndroidDriver(serverURL, options);

			System.out.println("The Android Driver Session is created with id : " + androidDriver.getSessionId());

		} catch (Exception e) {

			e.printStackTrace();
		}

		return androidDriver;

	}

	public static AppiumDriver getAppiumDriver() {

		try {

			UiAutomator2Options options = new UiAutomator2Options();

			options.setCapability("platformName", "android");
			options.setCapability("appium:automationName", "uiautomator2");
			options.setCapability("appium:deviceName", "emulator-5554");
			options.setCapability("appium:app", appPath);

			// Server URL

			URL serverURL = new URL(" http://127.0.0.1:4723");

			appiumDriver = new AndroidDriver(serverURL, options);

			System.out.println("The Appium Driver session is created with id : " + appiumDriver.getSessionId());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return appiumDriver;

	}

}

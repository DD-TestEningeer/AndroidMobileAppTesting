package codes;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppManagementAndroid {

    private static final String DEVICE_NAME = "emulator-5554";
    private static final String APPIUM_SERVER_URL = "http://127.0.0.1:4723";
    private static final String APP_PACKAGE = "io.appium.android.apis";
    private static final String APK_PATH = "C:\\StarAgile\\AndroidMobileAppTesting\\src\\test\\resources\\ApiDemos-debug.apk";

    @Test
    public void testAppManagement() throws MalformedURLException {

        AndroidDriver driver = null;

        try {
            // Set up device options
            UiAutomator2Options options = new UiAutomator2Options()
                    .setDeviceName(DEVICE_NAME);

            // Create Android driver
            driver = new AndroidDriver(new URL(APPIUM_SERVER_URL), options);
            System.out.println("Session created with ID: " + driver.getSessionId());

            // Check if app is installed
            boolean isInstalled = driver.isAppInstalled(APP_PACKAGE);
            System.out.println("App installed: " + isInstalled);

            // Install app if not already installed
            if (!isInstalled) {
                driver.installApp(APK_PATH);
                System.out.println("App installed successfully.");
            } else {
                System.out.println("App is already installed.");
            }

            Thread.sleep(2000);

            // Activate app
            driver.activateApp(APP_PACKAGE);
            System.out.println("App launched.");
            System.out.println("App state: " + driver.queryAppState(APP_PACKAGE));

            Thread.sleep(2000);

            // Terminate the app
            driver.terminateApp(APP_PACKAGE);
            System.out.println("App terminated.");

            Thread.sleep(2000);

            // Reactivate the app
            driver.activateApp(APP_PACKAGE);
            System.out.println("App reactivated.");

            Thread.sleep(2000);

            // Run app in background
            driver.runAppInBackground(Duration.ofSeconds(5));
            System.out.println("App is running in background for 5 seconds.");

//            Thread.sleep(2000);

            // Query app state after running in background
            System.out.println("App state after running in background: " + driver.queryAppState(APP_PACKAGE));

            // Uninstall the app
            driver.removeApp(APP_PACKAGE);
            System.out.println("App uninstalled.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Quit the driver to close the session
            if (driver != null) {
                driver.quit();
                System.out.println("Driver session closed.");
            }
        }
    }
    
    
    
    
}

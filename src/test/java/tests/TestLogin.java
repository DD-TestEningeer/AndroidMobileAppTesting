package tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import utils.DriverUtil;
import utils.LogUtil;

public class TestLogin {
	
	
	@Test
	
	
	public void loginTest() throws MalformedURLException {		
		
		
		// 1: Write automation script for connecting android device and capture the session
//		       Id for connection.
		
		AndroidDriver driver = DriverUtil.getAndroidDriver();
		
		LogUtil.info("The session id is : " + driver.getSessionId());
		
		
		
	}

}

package assignments;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import utils.DriverUtil;
import utils.ElementUtil;

public class Question4 {
	
//	4: Write automation script to open APIdemos application and capture the screenshot
	
	@Test
	
	public void testScreenshot() {
		
//		open APIdemos application
		
		AndroidDriver driver = DriverUtil.getAndroidDriver();		
		
//	 capture the screenshot		
		
		ElementUtil.getScreenshot(driver, "home_page");
		
		
	}
	
	

}

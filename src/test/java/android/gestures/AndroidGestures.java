package android.gestures;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.android.AndroidDriver;

public class AndroidGestures {

	public static void tapElement(AndroidDriver driver, WebElement element) {
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence tap = new Sequence(finger, 1);

		int x = element.getLocation().getX();
		int y = element.getLocation().getY();

		tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
		tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singletonList(tap));
	}
	
	public static void longPressElement(AndroidDriver driver, WebElement element) {
	    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	    Sequence longPress = new Sequence(finger, 1);

	    int x = element.getLocation().getX();
	    int y = element.getLocation().getY();

	    longPress.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y));
	    longPress.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	    longPress.addAction(new Pause(finger, Duration.ofSeconds(2))); // Long press duration
	    longPress.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

	    driver.perform(Collections.singletonList(longPress));
	}
	
	public static void swipe(AndroidDriver driver, int startX, int startY, int endX, int endY) {
	    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	    Sequence swipe = new Sequence(finger, 1);

	    swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));
	    swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	    swipe.addAction(new Pause(finger, Duration.ofMillis(200)));
	    swipe.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endX, endY));
	    swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

	    driver.perform(Collections.singletonList(swipe));
	}

	public static void verticalScroll(AndroidDriver driver, int scrollStart, int scrollEnd) {
	    int width = driver.manage().window().getSize().width;
	    int height = driver.manage().window().getSize().height;

	    int x = width / 2;
	    int startY = (int) (height * scrollStart / 100.0);
	    int endY = (int) (height * scrollEnd / 100.0);

	    swipe(driver, x, startY, x, endY);
	}

	public static void setLandscape(AndroidDriver driver) {
	    if (!driver.getOrientation().equals(ScreenOrientation.LANDSCAPE)) {
	        driver.rotate(ScreenOrientation.LANDSCAPE);
	    }
	}

	
	public static void setPortrait(AndroidDriver driver) {
	    if (!driver.getOrientation().equals(ScreenOrientation.PORTRAIT)) {
	        driver.rotate(ScreenOrientation.PORTRAIT);
	    }
	}



}

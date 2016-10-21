package com.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

public class Action {

	public  enum DIRECTION{
		UP,
		DOWN,
		LEFT,
		RIGHT
	}

	public static void scroll(AppiumDriver driver,  DIRECTION direction){
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();

		switch(direction){
		case UP:
			scrollObject.put("direction", "up");
		case DOWN:
			scrollObject.put("direction", "down");
		default:
			scrollObject.put("direction", "down");
		}
		js.executeScript("mobile: scroll", scrollObject); */
	}

	public static void swipe(AppiumDriver driver,DIRECTION direction){
		try {
			switch(direction){
			case UP:
				scrollUp(driver);
				break;
			case DOWN:
				scrollDown(driver);
				break;
			case LEFT:
				swipeLeft(driver);
				break;
			case RIGHT:
				swipeRight(driver);
				break;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isElementPresent(AppiumDriver driver, By by) {
	    return ((driver.findElements(by).size() > 0) ? true : false);
	}

	private static  void scrollDown(AppiumDriver driver) throws Exception{
	    Dimension size = driver.manage().window().getSize();
	    int starty = (int) (size.getHeight() * 0.50);
	    int endy = (int) (size.getHeight() * 0.20);
	    int startx = size.getWidth() /2;
	    driver.swipe(startx, starty, startx, endy, 3000);
	    Thread.sleep(1000);
	}
	private static void scrollUp(AppiumDriver driver) throws Exception{
	    Dimension size = driver.manage().window().getSize();
	    int starty = (int) (size.getHeight() * 0.80);
	    int endy = (int) (size.getHeight() * 0.20);
	    int startx = size.getWidth() /2;
	    driver.swipe(startx, endy, startx, starty, 3000);
	    Thread.sleep(1000);
	}

	private static void swipeRight(AppiumDriver driver) throws Exception{
	    Dimension size = driver.manage().window().getSize();
	    int startx = (int) (size.getWidth() * 0.90);
	    int endx = (int) (size.getWidth() * 0.10);
	    int starty = size.getHeight() /2;
	    driver.swipe(endx, starty, startx, starty, 3000);
	    Thread.sleep(1000);
	}

	private static void swipeLeft(AppiumDriver driver) throws Exception{
	    Dimension size = driver.manage().window().getSize();
	    int startx = (int) (size.width * 0.90);
	    int endx = (int) (size.width * 0.10);
	    int starty = size.height /2;
	    driver.swipe(startx, starty, endx, starty, 3000);
	    Thread.sleep(1000);
	}

	public void act(IOSDriver<IOSElement> driver){
		/*
		//lock screen
		//driver.lockScreen(3);

		//Send the currently active app to the background.
		//driver.runAppInBackground(5);

		//hide KEYBOARD
		//driver.hideKeyboard();

		//Check if an app is installed
		//driver.isAppInstalled("com.example.android.apis")

		//INSTALL APP
		//driver.installApp("path/to/my.apk")

		//REMOVE APP
		//driver.removeApp("com.example.android.apis")

		//CLOSE APP
		//driver.closeApp()

		LAUNCH
		driver.launchApp()

		RESET
		driver.resetApp()

		AVAILABLE CONTEXTS

		List all available contexts

		// java
		driver.getContextHandles()
		// objective c
		NSArray *contexts = driver.allContexts;
		CURRENT CONTEXT

		List the current context

		// java
		driver.getContext()
		// objective c
		NSString *context = driver.context;
		SWITCH TO DEFAULT CONTEXT

		Change the context to the default.

		// java
		driver.context();
		// objective c
		[driver setContext:nil];
		APP STRINGS

		Get the app’s strings.
		// java
		driver.getAppStrings();
		// objective c
		[driver appStrings];
		[driver appStringsForLanguage:"@ru"];
		KEY EVENT

		Send a key event to the device.

		// java
		driver.sendKeyEvent(AndroidKeyCode.HOME);
		// objective c
		NSError *err;
		[driver triggerKeyEvent:176 metastate:0 error:&err];
		CURRENT ACTIVITY

		Android only. Get the current activity.

		// java
		driver.currentActivity();
		// objective c
		NSError *err;
		[driver currentActivity];
		TOUCHACTION / MULTITOUCHACTION

		An API for generating touch actions. This section of the documentation will be expanded upon soon.

		// java
		TouchAction action = new TouchAction(driver)
		.press(mapview, 10, 10)
		.release().
		perform();

				SWIPE

				Simulate a user swipe.

				// java
				driver.swipe(75, 500, 75, 0, 0.8)
				PINCH

				Pinch the screen.

				// java
				driver.pinch(element);
				ZOOM

				Zoom the screen.

				// java
				driver.zoom(element);
				SCROLL TO

				Scroll to an element.

				// java
				JavascriptExecutor js = (JavascriptExecutor) driver;
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", "down");
				scrollObject.put("element", ((RemoteWebElement) element).getId());
				js.executeScript("mobile: scroll", scrollObject);
				PULL FILE

				Pulls a file from the device.

				// java
				driver.pullFile("Library/AddressBook/AddressBook.sqlitedb");
				PUSH FILE

				Pushes a file to the device.

				// java
				byte[] data = Base64.encodeBase64("some data for the file".getBytes());
				String path = "/data/local/tmp/file.txt";
				driver.pushFile(path, data)
				SETTINGS

				Here you will find sample code for getting/setting appium serverSetting. For more information on how they work, and which settings are supported, see [the settings docs][/docs/en/advanced-concepts/settings.md]

				JsonObject settings = driver.getSettings()
				// java-client doesn't support setting arbitrary settings, just settings which are already provided by appium.
				// So for the 'ignoreUnimportantViews' setting, the following method exists:
				driver.ignoreUnimportantViews(true);

						*/
	}
}

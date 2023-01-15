package com.shubham_automaton_V1.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class WrapperClass {

	WebDriver localdriver;

	public WrapperClass(WebDriver remotedriver) {
		localdriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}

	public void windowHandle(WebDriver remotedriver) throws InterruptedException {
		String parent = remotedriver.getWindowHandle();
		for (String windowHandle : remotedriver.getWindowHandles()) {
			if (!parent.contentEquals(windowHandle)) {
				Thread.sleep(2000);
				localdriver.switchTo().window(windowHandle);
				System.out.println("---------------------->" + localdriver.getTitle());
				break;
			}
		}
	}

	public void waitTillPageLoad() {
		localdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void mouseHoverOnElement(WebElement element) {
		Actions action = new Actions(localdriver);
		action.moveToElement(element).perform();
	}
}

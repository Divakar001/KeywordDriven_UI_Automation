package com.learning.Utilities;

import org.openqa.selenium.By;

public class Locators {

	
	public static By getId(String LocatorValue) {
		return By.id(LocatorValue);

	}

	public static By getName(String LocatorValue) {
		return By.name(LocatorValue);

	}
	public static By getXpath(String LocatorValue) {
		return By.xpath(LocatorValue);

	}
	public static By getTagName(String LocatorValue) {
		return By.tagName(LocatorValue);


	}
	public static By getLinkText(String LocatorValue) {
		return By.linkText(LocatorValue);

	}
	public static By getPartialLinkText(String LocatorValue) {
		return By.partialLinkText(LocatorValue);

	}
	
	
	
	public static By getCssSelector(String LocatorValue) {
		return By.cssSelector(LocatorValue);

	}
	
	public static By getClassName(String LocatorValue) {
		return By.className(LocatorValue);

	}
	
	
}


package com.failuresharing.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * DriverFactory
 */
public class DriverFactory {

    private DriverFactory() {}

    private static DriverFactory instance = new DriverFactory();

    /**
	 * @return DriverFactory
	 */
	public static DriverFactory getInstance() {
		return instance;
	}

    public static WebDriver openPcChromeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/woohyeok.kim/Desktop/study/webdriverdemo/chromedriver");
        return new ChromeDriver();
    }
}
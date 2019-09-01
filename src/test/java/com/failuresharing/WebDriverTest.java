package com.failuresharing;

import static com.failuresharing.factory.DriverFactory.openPcChromeWebDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class WebDriverTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = openPcChromeWebDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void testApp() {
        driver.get("https://www.naver.com"); 
        assertTrue(true);
    }
}

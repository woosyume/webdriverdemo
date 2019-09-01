package com.failuresharing.testscript;

import java.util.concurrent.TimeUnit;

import com.failuresharing.pageobject.TopPage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.failuresharing.factory.DriverFactory.openPcChromeWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopPageTest {

    private static WebDriver driver;
    private static TopPage page;

    @BeforeAll
    public static void setUp() {
        driver = openPcChromeWebDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        page = new TopPage(driver);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void failToLogin() {
        driver.get("https://www.rakuten.co.jp/");

        page.moveToLoginPage();
        page.inputUserName();
        page.inputWrongPassword();
        page.clickLoginButton();

        String expected = "Either the password is incorrect or the specified user ID does not exist.\nIf you believe you typed in the correct user ID and password, please check if you received an email from Rakuten with account recovery instructions.";
        assertEquals(expected, page.getDisplayedComment(), () -> "エラーメッセージ");
    }
}
package com.failuresharing.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * TopPage
 */
public class TopPage {
    private WebDriver driver;

    public TopPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void moveToLoginPage() {
        driver.findElement(By.className("button--D43XX")).click();
    }

    public void inputUserName() {
        driver.findElement(By.id("loginInner_u")).sendKeys("testuser@gmail.com");
    }

    public void inputWrongPassword() {
        driver.findElement(By.id("loginInner_p")).sendKeys("abcde");
    }

    public void clickLoginButton() {
        driver.findElement(By.className("loginButton")).click();
    }

    public String getDisplayedComment() {
        return driver.findElement(By.className("comment")).getText();
    }
}
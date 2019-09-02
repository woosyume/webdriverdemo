package com.failuresharing.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopPage {
    private WebDriver driver;

    @FindBy(id="loginInner_u")
    @CacheLookup
    private WebElement usernameField;

    @FindBy(id="loginInner_p")
    @CacheLookup
    private WebElement passwordField;

    public TopPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void moveToLoginPage() {
        driver.findElement(By.className("button--D43XX")).click();
    }

    public void inputUserName() {
        usernameField.sendKeys("testuser@gmail.com");
    }

    public void inputWrongPassword() {
        passwordField.sendKeys("abcde");
    }

    public void clickLoginButton() {
        driver.findElement(By.className("loginButton")).click();
    }

    public String getDisplayedComment() {
        return driver.findElement(By.className("comment")).getText();
    }
}
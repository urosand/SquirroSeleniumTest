package com.example.squirroseleniumtest.utility.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageObject {

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//span[contains(text(),'Sign In')]")
    public WebElement signInButton;

    @FindBy(xpath = "//a[contains(text(),'Forgot Password?')]")
    public WebElement forgotPasswordLink;


    public LogInPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

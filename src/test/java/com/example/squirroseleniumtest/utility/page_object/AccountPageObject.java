package com.example.squirroseleniumtest.utility.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPageObject {

    @FindBy(css = ".MuiAvatar-root")
    public WebElement avatarIcon;

    @FindBy(xpath= " //a[contains(text(),'Logout')]")
    public WebElement accountLogOutBtn;


    @FindBy(xpath= "//div[contains(text(),'You have been logged out.')]")
    public WebElement loggOutMessage;


    public AccountPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

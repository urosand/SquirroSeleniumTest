package com.example.squirroseleniumtest.utility.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstancesPageObject {

    @FindBy(xpath = "//span[contains(text(),'Instances')]")
    public WebElement instancesOption;

    public InstancesPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    }

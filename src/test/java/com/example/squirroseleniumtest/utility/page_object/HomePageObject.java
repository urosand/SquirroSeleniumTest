package com.example.squirroseleniumtest.utility.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {


    @FindBy(xpath = "//span[contains(text(),'My instances')]")
    public WebElement myInstances;

    @FindBy(xpath = "//h4[contains(text(),'SquirroGPT - Company Data')]")
    public WebElement squirroGPTCompanyDataOption;

    public HomePageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}

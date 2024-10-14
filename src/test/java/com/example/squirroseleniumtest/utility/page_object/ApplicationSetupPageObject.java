package com.example.squirroseleniumtest.utility.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationSetupPageObject {

    @FindBy(xpath = "//h2[contains(text(),'SquirroGPT - Company Data')]")
    public WebElement SquirroGPTTextH2;

    @FindBy(xpath = "//span[contains(text(),'Install App')]")
    public WebElement installAppButton;

    @FindBy(xpath = "//a[contains(text(),'Add a new instance')]")
    public WebElement addNewInstance;

    @FindBy(xpath = " //h2[contains(text(),'Setting up your instance')]")
    public WebElement settingInstanceText;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]\n")
    public WebElement subDomainField;

    @FindBy(xpath = "//span[contains(text(),'Create instance')]")
    public WebElement createInstanceButton;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]\n")
    public WebElement jobTitle;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    public WebElement company;

    @FindBy(xpath = "//div[@id='mui-component-select-industry']")
    public WebElement industry;

    @FindBy(xpath = "//body/div[@id='menu-industry']/div[3]/ul[1]/li[4]")
    public WebElement selectIndustry;


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[2]/div/div/div[1]/div/div[3]/form/div/div[5]/div/div/input")
    public WebElement phone;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[6]/mapbox-address-autofill[1]/div[1]/div[1]/input[1]" )
    public WebElement address;

    @FindBy(xpath = "//div/div/div[2]/div[2]")
    public WebElement selectAddress;


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[2]/div/div/div[1]/div/div[3]/form/div/div[9]/label[1]/span[1]/span[1]/input")
    public WebElement iAgree;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[2]/div/div/div[1]/div/div[3]/form/div/div[9]/label[2]/span[1]/span[1]/input")
    public WebElement iAgreeAgain;

    @FindBy(xpath = "//span[contains(text(),'Send form')]")
    public WebElement sendFormButton;

    @FindBy(css = "#mbx00f7478f > div.mbx01668c99--Button.mbx01668c99--ButtonSecondary.mbx01668c99--ButtonReject")
    public WebElement yes;

    @FindBy(xpath = "//div[contains(text(),'Thank you for using Squirro.')]")
    public WebElement thankYouMessage;

    @FindBy(xpath = "//a[contains(text(),'https://mydomainuros.squirro.cloud/')]")
    public WebElement myLink;

    @FindBy(xpath = "//body/div[5]/div[3]/div[1]/div[2]/button[2]")
    public WebElement connectData;

    @FindBy(xpath = " //body/div[6]/div[3]/div[1]/div[2]/button[1]")
    public WebElement cancel;

    @FindBy(xpath = "//a[contains(text(),'Chat')]")
    public WebElement chatOption;

    public static By tnaksYouMessageAppears = By.xpath("//div[contains(text(),'Thank you for using Squirro.')]");

    public ApplicationSetupPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    }

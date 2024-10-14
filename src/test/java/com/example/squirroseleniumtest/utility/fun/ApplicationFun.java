package com.example.squirroseleniumtest.utility.fun;

import com.example.squirroseleniumtest.utility.config_env.ConfigEnv;
import com.example.squirroseleniumtest.utility.coverage.BeforeAll;
import com.example.squirroseleniumtest.utility.page_object.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ApplicationFun extends BeforeAll {


    static HomePageObject home = new HomePageObject(driver);
    static ApplicationSetupPageObject appSetup = new ApplicationSetupPageObject(driver);

    public static void makeSquirroGPTCompanyData () throws InterruptedException {

        home.squirroGPTCompanyDataOption.click();
        //SquirroGPT - Company Data
        appSetup.SquirroGPTTextH2.isDisplayed();
        appSetup.installAppButton.click();
        appSetup.addNewInstance.click();
        appSetup.settingInstanceText.isDisplayed();

        String prefix = "myDomain";
        String myD0mainName = prefix + RandomStringUtils.randomAlphanumeric(5).toLowerCase();

        appSetup.subDomainField.sendKeys(myD0mainName);
        appSetup.createInstanceButton.click();
        //Fill In
        appSetup.jobTitle.clear();
        appSetup.jobTitle.sendKeys("mr");
        Thread.sleep(1000);
        appSetup.company.clear();
        appSetup.company.sendKeys("mytest123");
        appSetup.industry.click();
        appSetup.selectIndustry.click();
        appSetup.phone.clear();
        appSetup.phone.sendKeys("0706648434524");
        appSetup.address.clear();
        appSetup.address.sendKeys("Test 33");
        appSetup.selectAddress.click();
        //appSetup.iAgree.click();
       // appSetup.iAgreeAgain.click();
        appSetup.sendFormButton.click();
        driver.findElement(By.xpath("//div[contains(text(),'Use the address I provided')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.
                xpath("//div[contains(text(),'Thank you for using Squirro.')]")));

    }

    public static void verified () {



    }

}



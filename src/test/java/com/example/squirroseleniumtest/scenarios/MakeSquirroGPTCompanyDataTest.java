package com.example.squirroseleniumtest.scenarios;

import com.example.squirroseleniumtest.utility.coverage.BeforeAll;
import com.example.squirroseleniumtest.utility.fun.AccountFun;
import com.example.squirroseleniumtest.utility.fun.ApplicationFun;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class MakeSquirroGPTCompanyDataTest extends BeforeAll {


    @Test(priority = 1)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Create squirro GPT Company Data")
    public void squirroGPTCompanyData() throws InterruptedException{

        //Set Up wait 20 min during Long, Long, Application Creation (this must be fix!)
        // driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
       // wait = new WebDriverWait(driver, Duration.ofMinutes(30));

        //Log in Valid Account
        AccountFun.logInValidAccount();
        driver.get(baseURL);
        //Make Squirro GPT Company Data
        ApplicationFun.makeSquirroGPTCompanyData();

    }
}

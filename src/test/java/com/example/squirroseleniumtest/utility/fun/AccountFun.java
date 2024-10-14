package com.example.squirroseleniumtest.utility.fun;

import com.example.squirroseleniumtest.utility.config_env.ConfigEnv;
import com.example.squirroseleniumtest.utility.coverage.BeforeAll;
import com.example.squirroseleniumtest.utility.page_object.AccountPageObject;
import com.example.squirroseleniumtest.utility.page_object.HomePageObject;
import com.example.squirroseleniumtest.utility.page_object.InstancesPageObject;
import com.example.squirroseleniumtest.utility.page_object.LogInPageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AccountFun extends BeforeAll {

    static LogInPageObject logInPage = new LogInPageObject(driver);
    static InstancesPageObject instances = new InstancesPageObject(driver);
    static AccountPageObject account = new AccountPageObject(driver);
    static HomePageObject home = new HomePageObject(driver);

    public static void logInValidAccount () {

        home.myInstances.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(logInPage.inputUsername));
        logInPage.inputUsername.sendKeys(ConfigEnv.config.userName());
        logInPage.inputPassword.sendKeys(ConfigEnv.config.password());
        logInPage.signInButton.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(instances.instancesOption));

    }

    public static void logOutAccount ()  {

        account.avatarIcon.isDisplayed();
        account.avatarIcon.click();
        account.accountLogOutBtn.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(account.loggOutMessage));
    }
}



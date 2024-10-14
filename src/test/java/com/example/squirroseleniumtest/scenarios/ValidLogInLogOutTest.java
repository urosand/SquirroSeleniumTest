package com.example.squirroseleniumtest.scenarios;

import com.example.squirroseleniumtest.utility.coverage.BeforeAll;
import com.example.squirroseleniumtest.utility.fun.AccountFun;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;


public class ValidLogInLogOutTest extends BeforeAll {


    @Test(priority = 1)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Log In valid account and Log out")
    public void logInLogOut()  {

        //Log in Valid Account
        AccountFun.logInValidAccount();
        //Log out Valid Account
        AccountFun.logOutAccount();
    }
}

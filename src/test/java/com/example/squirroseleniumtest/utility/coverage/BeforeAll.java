package com.example.squirroseleniumtest.utility.coverage;

import com.example.squirroseleniumtest.utility.config_env.ConfigEnv;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BeforeAll {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public String baseURL;
    ChromeOptions options = new ChromeOptions();

    @BeforeTest
    public void setUp() {

        //options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*" , "--window-size=1920,1200");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));
        wait = new WebDriverWait(driver, Duration.ofMinutes(20));
        baseURL = ConfigEnv.config.baseURL();
        driver.get(baseURL);

    }

    @AfterMethod
    public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {

        if (testResult.getStatus() == ITestResult.FAILURE) {
            String className = testResult.getTestClass().getName();
            String methodName = testResult.getMethod().getMethodName();

            String timestamp = new SimpleDateFormat("yyyy_MM_dd_HH:mm").format(new Date());
            String screenshotName = className + "_" + methodName + "_" + timestamp + ".png";
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("./src/test/resources/ScreenshotsFailure/" + screenshotName));
        }
    }

    @AfterTest
    public void endTest() {
        driver.quit();
    }
}

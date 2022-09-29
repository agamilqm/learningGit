package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

@SuppressWarnings("ALL")
public class Hooks {

    //Declaration for WebDriver
    public static WebDriver driver = null;


    @Before
    public static void openBrowser()
    {
        //1-Define Bridge System.setProperty or WebDriverManager
        WebDriverManager.chromedriver().setup();

        //2- Create new object (Initialize driver)
        driver = new ChromeDriver();

        //3- Configurations
        //3.1 Maximize window
        driver.manage().window().maximize();
        //3.2 set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //4- Navigate
        driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @After()
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }



}

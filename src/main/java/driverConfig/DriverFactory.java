package driverConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver getDriver (BROWSER brows){
        WebDriver driver=null;
        //driverConfig.BROWSER browser = driverConfig.BROWSER.valueOf(brows);
        switch (brows) {
          case CHROME:
              driver = initChrome();
              break;
          case FIREFOX:
              driver= initFirefox();
              break;
        }
      return driver;
    }

    private static WebDriver initFirefox() {
        return new FirefoxDriver();
    }

    private static WebDriver initChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito"); //режим инкогнито
        options.addArguments("--start-maximized"); //открытие в развернутом виде
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;}
}

package com.automate.tests.date20;

import com.automate.utilities.BrowserUtils;
//import com.automate.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WarmUp_ {

    private static WebDriver driver;

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().version("83.0").setup();
  //      driver = DriverFactory.createDriver("chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebbay.com");
        driver.findElements(By.id("gh-aac"));
        
  //      ebbay();
//        amazon();
//        wikipedia();
//




    }

    public static void ebbay() throws Exception{

 //       driver = DriverFactory.createDriver("chrome");
        driver.get("https://ebbay.com");
    //    driver.findElements(By.id("gh-ac"))


        BrowserUtils.wait(10);

    }

    public static void amazon(){
 //       WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("https://amazon.com");
        BrowserUtils.wait(4);
    }
    public static void wikipedia(){
//        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("https://wikipedia.com");
        BrowserUtils.wait(4);

    }
}

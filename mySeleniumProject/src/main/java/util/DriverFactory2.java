package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory2 {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver==null){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\MTN\\selenium\\chromedriver");
            driver=new ChromeDriver();

        }
        return driver;
    }
    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}

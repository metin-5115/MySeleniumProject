package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ThreadGuard;
import org.testng.annotations.Parameters;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {


    static WebDriver driver;
    static Properties properties;

    public static final ThreadLocal<WebDriver> driver2=new ThreadLocal<WebDriver>();


    @Parameters("browser")
    public static WebDriver initialize_Driver(String browser){

        properties = ConfigReader.getProperties();
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions opt=new ChromeOptions();
            opt.addArguments("--incognito");
            DesiredCapabilities cap=new DesiredCapabilities();
            cap.setCapability(ChromeOptions.CAPABILITY,opt);
            opt.merge(cap);
            //driver = new ChromeDriver(opt);
            driver2.set(new ChromeDriver());


        } else if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            WebDriverManager.edgedriver().setup();    //Bos gonderirse
            driver2.set(new EdgeDriver());

        }
        //String url = properties.getProperty("url");
        //int impWait = Integer.parseInt(properties.getProperty("implicityWait"));
        //int pageWait = Integer.parseInt(properties.getProperty("pageLoadTimeout"));
        //driver.get(url);
        getDriver().manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(impWait, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(pageWait, TimeUnit.SECONDS);
        return getDriver();

    }

    public static WebDriver getDriver(){
        return driver2.get();
    }


}
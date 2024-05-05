package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.DriverFactory;

public class abstractClass {

    private WebDriver driver= DriverFactory.getDriver();

    WebDriverWait wait=new WebDriverWait(driver,10);

    public void ClickFunction(WebElement ClickElement){
        wait.until(ExpectedConditions.elementToBeClickable(ClickElement));
        ClickElement.click();

    }
    public void sendKeysFunction(WebElement sendKeysElement,String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }
    public void selectElementFromDropdown(WebElement dropDown,String element){
        Select slc=new Select(dropDown);
        slc.selectByVisibleText(element);
    }

    public void Assertion(WebElement actual,String expected){
        Assert.assertEquals(actual.getText(),expected);
        System.out.println("My message " +  actual.getText());
    }

    public void Assetion2(WebElement actual){
        Assert.assertTrue(actual.isDisplayed());
    }



}

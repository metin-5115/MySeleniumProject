package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pages.loginPage;
import util.DriverFactory;

import java.util.concurrent.TimeUnit;


public class recordSteps {

    loginPage loginPage=new loginPage();

    private WebDriver driver;




    @Given("go to record page")
    public void go_to_record_page() {
        driver= DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.tr%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=trflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @And("write {string} name field")
    public void writeNameField(String name) {
        loginPage.WriteNameInput(name);

    }



    @Given("Write {string} email field")
    public void write_email_field(String email) {
        loginPage.WriteEmailInput(email);

    }

    @Given("write {string} password field")
    public void write_password_field(String password) {
        loginPage.WritePasswordInput(password);

    }

    @Given("write {string} passwordCheck field")
    public void write_password_check_field(String passwordCheck) {
        loginPage.WritePasswordCheckInput(passwordCheck);

    }

    @And("click legalMarketingCheckBox")
    public void click_legal_marketing_check_box() {
        loginPage.clickMarketCheckButton();

    }

    @When("click record button")
    public void click_record_button() {
        loginPage.clickRecordButton();

    }

    @And("Write invalid {string} email field")
    public void writeInvalidEmailField(String email) {
        loginPage.WriteEmailInput(email);
    }

    @Then("check the error email message")
    public void check_the_error_email_message() {
        loginPage.CheckErrorMessage(1);

    }

    @Given("write invalid {string} password field")
    public void write_invalid_password_field(String password) {
        loginPage.WritePasswordInput(password);

    }

    @Then("check the error password message")
    public void check_the_error_password_message() {
        loginPage.CheckErrorMessage(2);

    }

    @Given("Write recorded  {string} recorded email field")
    public void write_recorded_recorded_email_field(String email) {
        loginPage.WriteEmailInput(email);

    }

    @Then("check the error recorded email message")
    public void check_the_error_recorded_email_message() {
        loginPage.CheckErrorMessage(4);

    }

    @Given("write other {string} passwordCheck field")
    public void write_other_password_check_field(String passwordCheck) {
        loginPage.WritePasswordCheckInput(passwordCheck);

    }

    @Then("check the error different password message")
    public void check_the_error_different_password_message() {
        loginPage.CheckErrorMessage(3);

    }



}

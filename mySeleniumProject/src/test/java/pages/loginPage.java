package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverFactory;

public class loginPage extends abstractClass{
    private WebDriver driver;

    public loginPage(){
        driver= DriverFactory.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='ap_customer_name']")
    private WebElement nameButton;

    @FindBy(name = "email")
    private WebElement emailButton;

    @FindBy(name = "password")
    private WebElement passButton;

    @FindBy(name = "passwordCheck")
    private WebElement passcButton;

    @FindBy(name = "legalMarketingCheckBox")
    private WebElement marketCheckButton;

    @FindBy(className = "a-button-input")
    private WebElement recordButton;

    @FindBy(xpath = "//span[@class='a-list-item']")
    private WebElement checkErrorMessage4;

    @FindBy(xpath = "//div[@id='auth-password-invalid-password-alert']/div/div[@class='a-alert-content']")
    private WebElement checkErrorMessage3;

    @FindBy(xpath = "//div[@id='auth-password-mismatch-alert']/div/div[@class='a-alert-content']")
    private WebElement checkErrorMessage5;

    @FindBy(xpath = "//div[@id='auth-email-invalid-claim-alert']/div/div[@class='a-alert-content']")
    private WebElement checkErrorMessage2;


    public void WriteNameInput(String name){

        sendKeysFunction(nameButton,name);
    }
    public void WriteEmailInput(String email){
        sendKeysFunction(emailButton,email);
    }
    public void WritePasswordInput(String password){
        sendKeysFunction(passButton,password);
    }
    public void WritePasswordCheckInput(String passwordCheck){
        sendKeysFunction(passcButton,passwordCheck);
    }
    public void clickMarketCheckButton(){
        ClickFunction(marketCheckButton);
    }
    public void clickRecordButton(){
        ClickFunction(recordButton);
    }
    public void CheckErrorMessage(int i){
        if(i==1){
            Assertion(checkErrorMessage2,"Yanlış veya geçersiz e-posta adresi veya cep telefonu numarası. Lütfen düzeltin ve tekrar deneyin.");
        }
        if (i==2){
            Assertion(checkErrorMessage3,"Minimum 6 karakter gerekli");
        }
        if(i==3){
            Assertion(checkErrorMessage5,"Şifreler eşleşmiyor");
        }
        if (i==4){
            Assetion2(checkErrorMessage4);
        }
    }











}

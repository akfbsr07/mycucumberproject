package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaRegisterPage {

    public MedunnaRegisterPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(xpath = "//div[text()='Your SSN is invalid']")
    public WebElement ssnInvalidMessage;

    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement ssnRequiredMessage;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameRequiredMessage;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastNameRequiredMessage;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(xpath = "//div[text()='Your username is required.']")
    public WebElement userNameRequiredMessage;

    @FindBy(xpath = "//div[text()='Your username is invalid.']")
    public WebElement userNameInvalidMessage;

    @FindBy(id = "email")
    public  WebElement email;

    @FindBy(xpath = "//div[text()='Your email is required.']")
    public WebElement emailRequiredMessage;

    @FindBy(xpath = "//div[text()='Your email is required to be at least 5 characters.']")
    public WebElement emailAtLeast5CharsMessage;

    @FindBy(xpath = "//div[text()='This field is invalid']")
    public WebElement emailInvalidMessage;

    @FindBy(id = "firstPassword")
    public  WebElement password;

    @FindBy(id = "secondPassword")
    public WebElement passwordConfirm;

    @FindBy(id = "register-submit")
    public WebElement registerButton;








}


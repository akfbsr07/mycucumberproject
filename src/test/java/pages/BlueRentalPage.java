package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalPage {

    public BlueRentalPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement defaultLoginButton;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@id='dropdown-basic-button']")
    public WebElement profile;

}

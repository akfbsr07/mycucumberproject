package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaHomePage {

    public MedunnaHomePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement userIcon;

    @FindBy(xpath = "//a[@href='/account/register']")
    public WebElement registerButton;






}


package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaHomePage;
import pages.MedunnaRegisterPage;

import static utilities.WaitUtils.waitFor;

public class MedunnaStepDefs02 {

    MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
    MedunnaRegisterPage medunnaRegisterPage = new MedunnaRegisterPage();

    @Given("US002AC01TC01: User leaves the username blank, there should be Your username is required. error message")
    public void us002ac01tc01_user_leaves_the_username_blank_there_should_be_your_username_is_required_error_message() {
        medunnaRegisterPage.userName.sendKeys(""+ Keys.ENTER);
        Assert.assertTrue(medunnaRegisterPage.userNameRequiredMessage.isDisplayed());
    }
    @When("US002AC01TC02: User enters username special chars £#$€, there should be Your username is invalid. error message")
    public void us002ac01tc02_user_enters_username_special_chars_£_$€_there_should_be_your_username_is_invalid_error_message() {
        medunnaRegisterPage.userName.clear();
        medunnaRegisterPage.userName.sendKeys("Luna$€#£"+Keys.ENTER);
        Assert.assertTrue(medunnaRegisterPage.userNameInvalidMessage.isDisplayed());
    }
    @When("US002AC01TC03: User enters username  that can contain any chars, there should not be any error message")
    public void us002ac01tc03_user_enters_username_that_can_contain_any_chars_there_should_not_be_any_error_message() {
        medunnaRegisterPage.userName.clear();
        medunnaRegisterPage.userName.sendKeys("Luna_Rawenclaw"+Keys.ENTER);


    }

    @Given("US002AC02TC01: User enters blank e-mail and then only space e-mail, there should be Your email is required.")
    public void us002ac02tc01_user_enters_blank_e_mail_and_then_only_space_e_mail_there_should_be_your_email_is_required() {
        medunnaRegisterPage.email.sendKeys(""+Keys.ENTER);
        Assert.assertTrue(medunnaRegisterPage.emailRequiredMessage.isDisplayed());
        waitFor(2);
        medunnaRegisterPage.email.clear();
        medunnaRegisterPage.email.sendKeys(" "+Keys.ENTER);
        Assert.assertTrue(medunnaRegisterPage.emailRequiredMessage.isDisplayed());
    }
    @When("US002AC02TC02: User enters an e-mail less than {int} chars, there should be Your email is required to be at least {int} characters.")
    public void us002ac02tc02_user_enters_an_e_mail_less_than_chars_there_should_be_your_email_is_required_to_be_at_least_characters(Integer int1, Integer int2) {
        medunnaRegisterPage.email.clear();
        medunnaRegisterPage.email.sendKeys("abc@"+Keys.ENTER);
        Assert.assertTrue(medunnaRegisterPage.emailAtLeast5CharsMessage.isDisplayed());
    }
    @When("US002AC02TC03: User enters an e-mail with a wrong format, there should be This field is invalid message")
    public void us002ac02tc03_user_enters_an_e_mail_with_a_wrong_format_there_should_be_this_field_is_invalid_message() {
        medunnaRegisterPage.email.clear();
        medunnaRegisterPage.email.sendKeys("Lunahotmail.com"+Keys.ENTER);
        Assert.assertTrue(medunnaRegisterPage.emailInvalidMessage.isDisplayed());

    }
    @When("US002AC02TC04: User enters a valid e-mail, there should be not any error messages")
    public void us002ac02tc04_user_enters_a_valid_e_mail_there_should_be_not_any_error_messages() {
        medunnaRegisterPage.email.clear();
        medunnaRegisterPage.email.sendKeys("LunaLove_Ravenclaw@hotmail.com"+Keys.ENTER);


    }

    @When("US002AC03TC01: User enters a valid password")
    public void us002ac03tc01_user_enters_a_valid_password() {
        medunnaRegisterPage.password.sendKeys("OrderOfThePhoenix_2007!!!"+Keys.ENTER);

    }
    @When("US002AC03TC02: And make password confirmation")
    public void us002ac03tc02_and_make_password_confirmation() {
        medunnaRegisterPage.passwordConfirm.sendKeys("OrderOfThePhoenix_2007!!!"+Keys.ENTER);

    }
    @Then("US002AC03TC03: verify that registration is successful")
    public void us002ac03tc03_verify_that_registration_is_successful() {
        medunnaRegisterPage.registerButton.click();

    }





}

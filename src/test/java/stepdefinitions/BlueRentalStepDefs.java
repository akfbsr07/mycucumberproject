package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentalPage;
import utilities.WaitUtils;

import java.util.List;

public class BlueRentalStepDefs {

    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        blueRentalPage.defaultLoginButton.click();
    }

    @And("enters user name {string}")
    public void entersUserName(String string) {
        blueRentalPage.username.sendKeys(string);
    }

    @And("enters password {string}")
    public void entersPassword(String string) {
        blueRentalPage.password.sendKeys(string);
    }

    @When("click on login button")
    public void click_on_login_button() {
        blueRentalPage.loginButton.click();
        WaitUtils.waitFor(2);
    }

    @Then("verify login is successfull")
    public void verify_login_is_successfull() {
        Assert.assertTrue(blueRentalPage.profile.isDisplayed());
    }

    @When("user enters the admin email and password")
    public void user_enters_the_admin_email_and_password(io.cucumber.datatable.DataTable dataTable) {
        List<String> credentials = dataTable.row(1); //index starts at 0
        // credentials: {jack1@gmail.com, 12345}
        blueRentalPage.username.sendKeys(credentials.get(0));
        blueRentalPage.password.sendKeys(credentials.get(1));

    }



}

package steps;

import impl.LoginImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.ConfigReader;
import utils.WebDriverUtils;

public class LoginSteps {
    LoginImpl impl = new LoginImpl();

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
    }

    @When("I input {string} as the username")
    public void i_input_as_the_username(String username) {
        impl.getLoginPageElements().usernameInput.sendKeys(username);
    }

    @When("I input {string} as the password")
    public void i_input_as_the_password(String password) {
        impl.getLoginPageElements().passwordInput.sendKeys(password);
    }

    @When("I click the {string} button")
    public void i_click_the_button(String btnName) {
        impl.clickButton(btnName);
    }

    @Then("Url should be {string}")
    public void urlShouldBe(String expectedUrl) {
        Assert.assertEquals(expectedUrl, WebDriverUtils.getDriver().getCurrentUrl());
    }

    @Then("{string} error message is displayed")
    public void errorMessageIsDisplayed(String expectedErrorMessage) {
        Assert.assertEquals(expectedErrorMessage, impl.getLoginPageElements().errorMessage.getText());
    }

    @Given("I am logged into Swag Labs")
    public void iAmLoggedIntoSwagLabs() {
        impl.logIntoSwagLabs();
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    // WebElements

    @FindBy(id = "user-name")
    public WebElement usernameInput;


    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "login-button")
    public WebElement loginBtn;

    @FindBy(tagName = "h3")
    public WebElement errorMessage;
}

package impl;

import pages.LoginPage;
import utils.ConfigReader;
import utils.WebDriverUtils;

public class LoginImpl {
    private LoginPage loginPageElements;

    HomeImpl implHome = new HomeImpl();



    public LoginPage getLoginPageElements(){
        if (loginPageElements == null){
            loginPageElements = new LoginPage();
        }

        return loginPageElements;
    }

    // methods for impl

    public void clickButton(String buttonName){
        switch (buttonName.toLowerCase()){
            case "submit":
                getLoginPageElements().loginBtn.click();
                break;
            case "first item add to cart":
                implHome.getHomePageElements().firstItemAddToCartBtn.click();
                break;
            case "linkedin":
                implHome.getHomePageElements().linkedInBtn.click();
                break;
            default:
                System.err.println("Invalid Button Name");
        }
    }

    public void logIntoSwagLabs() {
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
        getLoginPageElements().usernameInput.sendKeys(ConfigReader.readProperty("username"));
        getLoginPageElements().passwordInput.sendKeys(ConfigReader.readProperty("password"));
        getLoginPageElements().loginBtn.click();
    }
}

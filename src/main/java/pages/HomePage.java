package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    // WebElements

    @FindBy(xpath = "//div[@class='inventory_list']/div")
    public List<WebElement> items;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement firstItemAddToCartBtn;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement firstItemRemoveFromCartBtn;

    @FindBy(linkText = "LinkedIn")
    public WebElement linkedInBtn;
}

package steps;

import impl.HomeImpl;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

public class HomeSteps {

    HomeImpl impl = new HomeImpl();

    @Then("there are {int} items on the page")
    public void thereAreItemsOnThePage(int num) {

        Assert.assertEquals(num, impl.getHomePageElements().items.size());
    }

    @Then("ADD TO CARD button text changes to REMOVE")
    public void addTOCARDButtonTextChangesToREMOVE() {
        Assert.assertTrue(impl.getHomePageElements().firstItemRemoveFromCartBtn.isDisplayed());
    }

    @Then("Title should be {string}")
    public void titleShouldBe(String expectedTitle) {
        SeleniumUtils.switchToNextWindow();
        Assert.assertEquals(expectedTitle, WebDriverUtils.getDriver().getTitle());
    }
}

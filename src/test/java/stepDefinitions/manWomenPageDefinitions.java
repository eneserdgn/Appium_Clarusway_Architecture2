package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.manWomenPage;
import utils.driverFactory;

public class manWomenPageDefinitions {

    manWomenPage homePage = new manWomenPage(driverFactory.getDriver());

    @Given("user is on the Home Page")
    public void userIsOnTheHomePage() {
        homePage.checkImage();
    }
}

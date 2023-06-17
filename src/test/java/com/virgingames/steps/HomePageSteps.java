package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Accept Cookies Button$")
    public void iClickOnAcceptCookiesButton() {
        new HomePage().clickOnAcceptAllCookiesButton();
    }


    @And("^I click on Join Now Button$")
    public void iClockOnJoinNowButton() {
        new HomePage().clickOnJoinNowButton();
    }


    @Then("^I should Navigate to Interruption Page$")
    public void iShouldNavigateToInterruptionPage() {

    }





    @And("^I should be able to click on Pocker Tab$")
    public void iShouldBeAbleToClickOnPockerTab() {
    }

    @And("^I should be able to verify the text Play our exciting Online Pocker Games$")
    public void iShouldBeAbleToVerifyTheTextPlayOurExcitingOnlinePockerGames() {
    }
}

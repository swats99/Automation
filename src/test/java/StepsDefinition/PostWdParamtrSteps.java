package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostWdParamtrSteps {
    @Given("Should be logged on your home page in instagram")
    public void shouldBeLoggedOnYourHomePageInInstagram() {
        System.out.println("Should be logged on your home page in instagram");
    }

    @When("Attach picture of {string} on your instagram account")
    public void attachPictureOfOnYourInstagramAccount(String arg0) {
        System.out.println("Attach picture of " + arg0 + " on your instagram account");
    }

    @And("Click on post")
    public void clickOnPost() {
        System.out.println("Click on post");
    }

    @Then("Pic should be uploaded.")
    public void picShouldBeUploaded() {
        System.out.println("Pic should be uploaded.");
    }

    @When("Writing a poem on {string} on your wall")
    public void writingAPoemOnOnYourWall(String arg0) {
        System.out.println("Writing a Poem on " + arg0 + " on your wall");
    }

    @And("Click on post button")
    public void clickOnPostButton() {
        System.out.println("Click on post button");
    }

    @Then("Poem should be seen by all your friends")
    public void poemShouldBeSeenByAllYourFriends() {
        System.out.println("Poem should be seen by all your friends");
    }
}

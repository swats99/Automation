package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DebitCardPinFunctionalitySteps {
    @Given("user should have valid stanc debit card")
    public void userShouldHaveValidStancDebitCard() {
        System.out.println("userShouldHaveValidStancDebitCard");
        System.out.println("This demo for gitrebase1 from intellij");
       
    }

    @When("user should insert debit card into ATM")
    public void userShouldInsertDebitCardIntoATM() {
        System.out.println("userShouldInsertDebitCardIntoATM");
    }

    @And("insert correct pin")
    public void insertHisHerCorrectPin() {
        System.out.println("insertHisHerCorrectPin");
    }

    @And("click on proceed")
    public void clickOnProceed() {
        System.out.println("clickOnProceed");
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        System.out.println("serIsNavigatedToTheHomePage");
    }
}

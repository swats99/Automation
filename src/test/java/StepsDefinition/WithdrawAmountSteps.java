package StepsDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithdrawAmountSteps {
    @Given("^The sufficient balance Rs1000 should be there$")
    public void the_sufficient_balance_rs1000_should_be_there() throws Throwable {
        System.out.println("the_sufficient_balance_rs1000_should_be_there");
    }

    @When("user should withdraw Rs100 from account")
    public void user_should_withdraw_rs100_from_ac() throws Throwable {
        System.out.println("user_should_withdraw_rs100_from_ac");
    }

    @Then("The ATM should dispense the money to user")
    public void the_atm_should_dispense_the_money_to_user() throws Throwable {
        System.out.println("the_atm_should_dispense_the_money_to_user");
    }

    @And("click on the proceed button")
    public void click_on_proceed() throws Throwable {
       System.out.println(" click_on_proceed");

    }

    @And("balance should be Rs900")
    public void balance_should_be_rs900() throws Throwable {
       System.out.println("balance_should_be_rs900");

    }

}


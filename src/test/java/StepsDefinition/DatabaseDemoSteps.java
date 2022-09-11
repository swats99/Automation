package StepsDefinition;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.List;

public class DatabaseDemoSteps {
    @Given("User should be on login page")
    public void userShouldBeOnLoginPage() {
        System.out.println("User should be on login page");
    }

    @When("User should enter username and password")
    public void userShouldEnterUsernameAndPassword(DataTable dth){
        List<List<String>> noOfRows = dth.cells();
        for(List<String> row : noOfRows){
            for(String str : row)
                System.out.println(str);
        }
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        System.out.println("Click on login button");
    }

    @Then("User should navigated to the home page")
    public void userShouldNavigatedToTheHomePage() {
        System.out.println("User should navigated to the home page");
    }

}

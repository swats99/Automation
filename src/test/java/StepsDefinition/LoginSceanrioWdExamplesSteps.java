package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSceanrioWdExamplesSteps {

    private WebDriver d;
    @Given("User should be on login pg")
    public void userShouldBeOnLoginPg() {
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
        d.get("https://www.saucedemo.com/");


    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        System.out.println("user name is " + username + " passowrd is " + password);
        d.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
        d.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        d.findElement(By.xpath("//*[@id=\"login-button\"]")).submit();
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        System.out.println("Click on login button");
    }

    @Then("User should be navigated to the home page")
    public void userShouldBeNavigatedToTheHomePage() throws InterruptedException {
        System.out.println("User should be navigated to the home page");
        Thread.sleep(2000);
        WebElement text = d.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        System.out.println(text.getText());
        Assert.assertEquals("PRODUCTS",text.getText());
    }
}

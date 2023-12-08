package TestBDD.StepDefinitions;

import TestBDD.Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HomePageSteps {

    HomePage homePage = new HomePage();
    @Given("Browser is open")
    public void browser_is_open() {
        homePage.openHomePage();
    }

    @Given("I am on the main site")
    public void i_am_on_the_main_site() {
    }
    @When("Click Log In")
    public void clickLogIn(){
        homePage.clickLogIn();
    }
    @When("Click cookie confirmation")
    public void clickCookieConfirmation() {
        homePage.clickCookieConfirmation();
    }
    @When("Fill email input with {string}")
    public void fillEmailInputWith(String email) {
        homePage.inputEmail(email);
    }
    @When("Fill password input with  {string}")
    public void inputPassword(String password) {
        homePage.inputPassword(password);
    }
    @When("Click login button")
    public void clickLoginButton() {
        homePage.clickLoginButton();
    }
    @Then("Welcome inscription is visible and return text")
    public void waitForTheWelcomeInscription() {
        String inscription = homePage.welcomeInscriptionIsVisible();
        Assertions.assertEquals("Twoje konto",inscription);
    }
    @When("Wait for login button")
    public void waitForLoginButton() {homePage.waitForLoginButton();
    }



}



package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.AutomationSteps;

import java.util.List;

public class AutomationDefinitions {
    @Steps
    AutomationSteps automationSteps;
    @Given("^The user is on Homepage$")
    public void theUserIsOnHomepage() {
        automationSteps.openHomePage();
    }

    @Then("^the user clicks on Sign in$")
    public void theUserClicksOnSignIn() {
        automationSteps.SignIn();

    }

    @Then("^user enters email$")
    public void userEntersEmail(List<String> parameters) {
        automationSteps.userEmail(parameters);

    }

    @Then("^User Clicks create an account$")
    public void userClicksCreateAnAccount() {
        automationSteps.submitCreateAccount();
    }

    @Then("^User fills sign up form$")
    public void userFillsSignUpForm(List<String> parameters) {
        automationSteps.fillsForms(parameters);
    }

    @Then("^user clicks register$")
    public void userClicksRegister() {
        automationSteps.userClicksRegister();
    }

    @Then("^the user is taken my account page$")
    public void theUserIsTakenMyAccountPage(List<String> parameters) {
        automationSteps.verifyMyAccount(parameters);
    }



    @Given("^the user has a valid account$")
    public void theUserHasAValidAccount() {
        automationSteps.openHomePage();
    }

    @Then("^the clicks on sign in$")
    public void theClicksOnSignIn() {
        automationSteps.SignIn();
    }

    @Then("^enters email$")
    public void entersEmail(List<String> parameters) {
        automationSteps.emailRegister(parameters);
    }

    @Then("^enters password$")
    public void entersPassword(List<String> parameters) {
        automationSteps.enterPassword(parameters);

    }

    @Then("^clicks sign in$")
    public void clicksSignIn() {
        automationSteps.clickSignInRegister();

    }

    @Then("^the user is successfully logged in$")
    public void theUserIsSuccessfullyLoggedIn(List<String> parameters) {
        automationSteps.verifyMyAccount(parameters);

    }

    @Given("^add product to cart$")
    public void addProductToCart() {
        automationSteps.openHomePage();
        automationSteps.selectProduct();
    }

    @When("^the click on preceed to checkout$")
    public void theClickOnPreceedToCheckout() {
        automationSteps.clickOnPreceed();
    }

    @When("^clic sign in$")
    public void clicSignIn(List<String> parameters) {
        automationSteps.singInPay(parameters);
        automationSteps.clickSignInRegister();
    }

    @Then("^go to Payment$")
    public void goToPayment(List<String> parameters) {
        automationSteps.goPayment(parameters);

    }





}

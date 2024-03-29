package co.wedevx.digitalbank.automation.ui.steps;

import co.wedevx.digitalbank.automation.ui.pages.RegistrationPage;
import co.wedevx.digitalbank.automation.ui.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static co.wedevx.digitalbank.automation.ui.utils.Driver.getDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationSteps {

    RegistrationPage registrationPage = new RegistrationPage(getDriver());

    @Given("User navigates to Digital Bank signup page")
    public void user_navigates_to_digital_bank_signup_page() {
     getDriver().get(ConfigReader.getPropertiesValue("digitalbank.registrationpageurl"));
     assertEquals("Digital Bank",getDriver().getTitle(),"Registration page Title mismatch");
    }
    @When("User creates account with following fields with mocked email ans ssn")
    public void user_creates_account_with_following_fields_with_mocked_email_ans_ssn(List<Map<String,String>> registrationTestDataListOfMap) {
        registrationPage.fillOutRegistrationForm(registrationTestDataListOfMap);
    }
    @Then("User should be displayed with the message {string}")
    public void user_should_be_displayed_with_the_message(String expectedSuccessfulMessage) {
       assertEquals(expectedSuccessfulMessage,registrationPage.getMessage(),"SuccessMessage Mismatch");
    }

    @Then("The user should see the {string} required field error message {string}")
    public void theUserShouldSeeTheRequiredFieldErrorMessage(String fieldName, String expectedErrorMessage) {
        String actualErrorMessage = registrationPage.getRequiredErrorMessage(fieldName);
        assertEquals(expectedErrorMessage,actualErrorMessage,"The error message of required" + fieldName + " field mismatch");
    }
}

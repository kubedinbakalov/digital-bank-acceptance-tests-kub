package co.wedevx.digitalbank.automation.ui.steps;

import co.wedevx.digitalbank.automation.ui.pages.UserAvatarPage;
import co.wedevx.digitalbank.automation.ui.utils.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeUserNameSteps {

    WebDriver driver = Driver.getDriver();

    private final UserAvatarPage userAvatarPage = new UserAvatarPage(driver);

    @Then("user in photo click My Profile change firstName {string} click submit")
    public void user_in_photo_click_my_profile_change_first_name_click_submit(String name) {

        userAvatarPage.userFirstNameChange(name);
    }

    @Then("user should see {string}")
    public void user_should_see(String message) {
        String expectedFirstName = userAvatarPage.getFirstName().getAttribute("value");
        System.out.println("firstName: " + expectedFirstName);
        WebElement successfulMessage = driver.findElement(By.xpath("//span[contains(text(),'Profile Updated Successfully.')]"));
        //browserHelper.waitForTheElementToBeDisplayed(successfulMessage);
        assertEquals(message, successfulMessage.getText(), "Invalid message");
    }

    @Then("user in photo click My Profile change lastName {string} click submit")
    public void user_in_photo_click_my_profile_change_last_name_click_submit(String lastname) {
        userAvatarPage.userLastNameChange(lastname);
    }

    @Then("user should see lastName {string}")
    public void user_should_see_last_name(String lastName) {

        String expectedLastName = userAvatarPage.getLastName().getAttribute("value");
        System.out.println("lastName: " + expectedLastName);
        assertEquals(expectedLastName, lastName);
    }

    @Then("user in photo click My Profile change address {string} click submit")
    public void user_in_photo_click_my_profile_change_address_click_submit(String address) {
        userAvatarPage.userAddressChange(address);
    }

    @Then("user should see address {string}")
    public void user_should_see_address(String address) {

        String expectedAddress = userAvatarPage.getAddress().getAttribute("value");
        System.out.println("Address: " + expectedAddress);
        assertEquals(expectedAddress, address);
    }

}

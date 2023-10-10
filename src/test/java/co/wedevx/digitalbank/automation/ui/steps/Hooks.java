package co.wedevx.digitalbank.automation.ui.steps;

import co.wedevx.digitalbank.automation.ui.utils.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;

import static co.wedevx.digitalbank.automation.ui.utils.Driver.getDriver;

public class Hooks {

    @Before("not @Registration")
    public void the_user_is_on_d_bank_homepage(){

        getDriver().get("https://dbank-qa.wedevx.co/bank/login");
    }
    @After("not @NegativeRegistrationCases")
    public void afterEachScenario(Scenario scenario) {
        Driver.takeScreenShot(scenario);
        Driver.closeDriver();
    }
}

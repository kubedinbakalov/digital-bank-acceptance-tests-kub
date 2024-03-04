package co.wedevx.digitalbank.automation.ui.steps;

import co.wedevx.digitalbank.automation.ui.utils.ConfigReader;
import co.wedevx.digitalbank.automation.ui.utils.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;

import static co.wedevx.digitalbank.automation.ui.utils.Driver.getDriver;

public class Hooks {

    @Before("not @Registration")
    public void the_user_is_on_d_bank_homepage(){
        getDriver().get(ConfigReader.getPropertiesValue("digialbank.createnewcheckingurl"));
       // getDriver().get("http://kubedinbakalov.mydevx.com/bank/login");
    }
    @After()
    public void afterEachScenario(Scenario scenario) {
        Driver.takeScreenShot(scenario);
        Driver.closeDriver();
    }
}

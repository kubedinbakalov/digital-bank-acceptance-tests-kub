package co.wedevx.digitalbank.automation.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseMenuPage extends BasePage {
    public BaseMenuPage(WebDriver driver){

        super(driver);
    }
    @FindBy(id = "checking-menu")
    protected WebElement checkingMenu;

    @FindBy(id = "view-checking-menu-item")
    protected WebElement viewCheckingMenu;

    @FindBy(id = "new-checking-menu-item")
    protected WebElement newCheckingButton;

    @FindBy(id = "home-menu-item")
    protected WebElement homeButton;

    @FindBy(id = "savings-menu")
    protected WebElement savingsMenu;

    @FindBy(id = "view-savings-menu-item")
    protected WebElement viewSavingsMenu;

    @FindBy(id = "new-savings-menu-item")
    protected WebElement newSavingMenu;

    @FindBy(id = "external-accounts-menu")
    protected WebElement externalMenu;

    @FindBy(id = "link-external-menu-item")
    protected WebElement linkExternalMenu;

    @FindBy(id = "view-external-menu-item")
    protected WebElement viewExternalMenu;

    @FindBy(id = "deposit-menu-item")
    protected WebElement depositMenu;

    @FindBy(id = "withdraw-menu-item")
    protected WebElement withdrawMenu;

    @FindBy(id = "transfer-menu-item")
    protected WebElement transferMenu;

    @FindBy(id = "visa-transfer-menu-item")
    protected WebElement visaTransferMenu;

    @FindBy(xpath = "//img[@class='user-avatar rounded-circle']")
    protected WebElement userAvatar;


    public void doToHomePage(){
        homeButton.click();
    }
}

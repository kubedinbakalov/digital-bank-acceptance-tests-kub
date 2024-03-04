package co.wedevx.digitalbank.automation.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAvatarPage extends BaseMenuPage{

    public UserAvatarPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//img[@class='user-avatar rounded-circle']")
    protected WebElement userAvatar;

    @FindBy(xpath = "//a[@href='/bank/user/profile']")
    protected WebElement userProfile;

    @FindBy(xpath = "//a[@href='/bank/user/password']")
    protected WebElement userPassword;

    @FindBy(xpath = "//a[@href='/bank/logout']")
    protected WebElement logout;

    @FindBy(id = "firstName")
    protected WebElement firstName;

    @FindBy(id = "lastName")
    protected WebElement lastName;

    @FindBy(name = "address")
    protected WebElement address;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
    protected WebElement submitButton;

    public void userFirstNameChange(String name){
        userAvatar.click();
        userProfile.click();
        firstName.clear();
        firstName.sendKeys(name);
        submitButton.click();
        submitButton.click();
    }

    public void userLastNameChange(String lastNameNew){
        userAvatar.click();
        userProfile.click();
        lastName.clear();
        lastName.sendKeys(lastNameNew);
        submitButton.click();
        submitButton.click();
    }

    public void userAddressChange(String addressNew){
        userAvatar.click();
        userProfile.click();
        address.clear();
        address.sendKeys(addressNew);
        submitButton.click();
        submitButton.click();
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getAddress() {
        return address;
    }
}

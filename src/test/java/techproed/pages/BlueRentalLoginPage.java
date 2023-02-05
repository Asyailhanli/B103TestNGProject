package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalLoginPage {
    public BlueRentalLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="email")
    public WebElement emailBox;

    @FindBy(name="password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath="//div[@role='alert']")
    public WebElement error_message_1;

    @FindBy(xpath = "//div[text()='Bad credentials']")
    public WebElement error_message_2;

    @FindBy(xpath = "//div[.='email must be a valid email']")
    public WebElement gecersizMail;

}
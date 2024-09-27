package com.fasset.automation.Pages.PageRepos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static Driver.DriverManager.getDriver;

public class CreateAccountPageRepo {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Registration_Email_continueButton']")
    public WebElement createAccount_Button;
    @FindBy(xpath = "//*[@text='Create Your Account']")
    public WebElement screen_Text;

    @FindBy(xpath = "//*[@content-desc='Registration_Email_fnameInput']")
    public WebElement firstName_Input;

    @FindBy(xpath = "//*[@content-desc='Registration_Email_lnameInput']")
    public WebElement lastName_Input;

    @FindBy(xpath = "//*[@content-desc='Registration_Email_usernameInput']")
    public WebElement userName_Input;

    @FindBy(xpath = "//*[@content-desc='Registration_Email_jerseynumberInput']")
    public WebElement shirtNumber_Input;

    @FindBy(xpath = "//*[@text='Select Date']")
    public WebElement dob_Input;

    @FindBy(id = "android:id/date_picker_header")
    public WebElement year_Input;

    @FindBy(xpath = "//*[@text='Done']")
    public WebElement gender_Select;

    @FindBy(xpath = "//*[@content-desc='Registration_Email_emailInput']")
    public WebElement emailAddress_Input;

    @FindBy(xpath = "//*[@content-desc='Registration_Email_passwordInput']")
    public WebElement password_Input;

    @FindBy(xpath = "(//*[@content-desc='Registration_Email_agreeCheckbox'])[1]")
    public WebElement termAndConditions_Checkbox;

    @FindBy(xpath = "(//*[@content-desc='Registration_Email_agreeCheckbox'])[2]")
    public WebElement emailSubscription_Checkbox;

    @FindBy(xpath = "//*[@text='CONTINUE']")
    public WebElement continue_Button;

    @FindBy(xpath = "//*[@text='Email Validation']")
    public WebElement emailValidation_Text;

    @FindBy(xpath = "//*[@text=\"Email 'auto@alreadyexist.com' already exists\"]")
    public WebElement existingEmailValidation_Text;
    @FindBy(xpath = "//*[@text=\"Email 'gulraizshah@rocketmail.com' already exists\"]")
    public WebElement existingFacebookEmailValidation_Text;
    @FindBy(xpath = "//*[@text=\"username 'autoexistingusername' already exists\"]")
    public WebElement existingUsernameValidation_Text;
    @FindBy(xpath = "//*[@text='Email is invalid']")
    public WebElement invalidEmailValidation_Text;


    @FindBy(xpath = "//*[text()='Already Registered? Login']")
    public WebElement screen_TextWeb;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailAddress_InputWeb;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password_InputWeb;

    @FindBy(xpath = "//*[@name='phone']")
    public WebElement phoneNumber_InputWeb;
    @FindBy(xpath = "//*[@name='confirm']")
    public WebElement confirmPassword_InputWeb;

    @FindBy(xpath = "//*[text()='Signup']")
    public WebElement signUp_web;
    @FindBy(xpath = "//*[text()='EMAIL Verification']")
    public WebElement emailValidation_TextWeb;

    @FindBy(xpath = "//*[text()='Incorrect Email Format!']")
    public WebElement invalidEmailValidation_TextWeb;

    @FindBy(xpath = "//*[text()='Phone must have at least 10 characters']")
    public WebElement invalidPhoneValidation_TextWeb;


    @FindBy(xpath = "//*[text()='Password requires a symbol']")
    public WebElement invalidPasswordValidation_TextWeb;


    @FindBy(xpath = "//*[text()='Must match \"password\" field value']")
    public WebElement invalidConfirmValidation_TextWeb;

    @FindBy(xpath = "//*[text()='Email already exists']")
    public WebElement emailAlreadyExist_TextWeb;

}
package com.fasset.automation.Pages.PageRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageRepo {

    @FindBy(xpath = "//*[@text='Have an account? Login']")
    public WebElement login_Button;

    @FindBy(xpath = "//*[text()='Have an account? Login']")
    public WebElement login_ButtonWeb;
    @FindBy(xpath = "//*[@text = 'Total asset balance']")
    public static WebElement totalAsset_Text;

    @FindBy(xpath = "//*[@text='Login to your']")
    public WebElement login_screen_text;

    @FindBy(xpath = "//*[@text='Login with Google']")
    public WebElement login_google_text;

    @FindBy(xpath = "//*[@text='Login with Facebook']")
    public WebElement login_facebook_text;

    @FindBy(xpath = "//*[@text='Log in with Email']")
    public WebElement login_email_text;

    @FindBy(xpath = "//*[text()='Login to your']")
    public WebElement login_screen_textWeb;

    @FindBy(xpath = "//*[@resource-id='heading']")
    public WebElement otp_selection_screen_text;

    @FindBy(xpath = "//*[text()='Select Verification Method']")
    public WebElement otp_selection_screen_textWeb;

    @FindBy(xpath = "//*[@text='Forgot password?']")
    public WebElement loginCreds_screen_text;
    @FindBy(xpath = "//*[text()='Forgot Password?']")
    public WebElement loginCreds_screenWeb_text;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='emailTest']")
    public WebElement email_Input;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email_InputWeb;

    @FindBy(xpath = "//*[@text='Enter Password']")
    public WebElement password_Input;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password_InputWeb;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Login']/android.widget.TextView")
    public WebElement loginMain_button;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginMain_buttonWeb;

    @FindBy(xpath = "//*[@text = 'Invalid email or password']")
    public WebElement userNotFoundErrorText;
    @FindBy(xpath = "//*[text()='Invalid email or password']")
    public WebElement userNotFoundErrorTextWeb;

    @FindBy(xpath = "//*[@text = 'Email is required']")
    public WebElement emailIsRequiredError_text;
    @FindBy(xpath = "//*[@text = 'Password is required']")
    public WebElement passwordIsRequiredError_text;

    @FindBy(xpath = "//*[@text = 'Email is required']")
    public WebElement emailIsRequiredError_textWeb;
    @FindBy(xpath = "//*[text = 'Password is required']")
    public WebElement passwordIsRequiredError_textWeb;

    @FindBy(xpath = "//*[@text='Log in with Email']")
    public WebElement loginButton;

    @FindBy(xpath="//*[text()='Log in with Email']")
    public WebElement loginButtonWeb;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement loginCreds_screenAdmin_text;

    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement loginCreds_screenAdmin_btn;

    @FindBy(xpath = "//*[@id='basic_email']")
    public WebElement email_InputAdmin;

    @FindBy(xpath = "//*[@id='basic_password']")
    public WebElement password_InputAdmin;

    @FindBy(xpath = "//*[text()='Invalid email or password']")
    public WebElement userNotFoundErrorTextAdmin;

    @FindBy(xpath = "//*[@id='basic']/div[1]/div/div[2]")
    public WebElement inputIsNotValidEmailText;

}

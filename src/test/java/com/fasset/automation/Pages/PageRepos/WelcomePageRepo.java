package com.fasset.automation.Pages.PageRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePageRepo {

    @FindBy(xpath = "//*[@text='Have an account? Login']")
    public WebElement welcomeSignUp_Text;
    @FindBy(xpath = "//*[@text='Have an account? Login']")
    public WebElement welcomeLogin_Text;
    @FindBy(xpath="//*[text()='Have an account? Login']")
    public WebElement welcome_TextWeb;

    @FindBy(xpath="//*[@text='Sign Up']")
    public WebElement createAccount_Button;
    @FindBy(xpath="//*[text()='Sign Up']")
    public WebElement createAccount_ButtonWeb;

    @FindBy(xpath = "//*[@text='Have an account? Login']")
    public WebElement login_Button;
    @FindBy(xpath = "//*[text()='Have an account? Login']")
    public WebElement login_ButtonWeb;

    @FindBy(xpath = "//*[@id='com.fasset.cashapp:id/SignUp-text']")
    public WebElement signup_Button;
     
    @FindBy(xpath = "//*[@id='com.fasset.cashapp:id/SignUp-text']")
    public WebElement signup_Button_WelcomeScreen;

}

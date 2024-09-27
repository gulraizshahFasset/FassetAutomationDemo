package com.fasset.automation.Pages.PageRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPageRepo {

    @FindBy(xpath = "//*[@id='com.fasset.cashapp:id/Createanew-text']")
    public WebElement signupScreen_Text;

    @FindBy(xpath = "//*[@id='@com.fasset.cashapp:id/Login-btn']")
    public WebElement login_Button;
    public WebElement signup_screen_text;

    @FindBy(xpath = "//*[@id='@com.fasset.cashapp:id/Login-btn']")
    public WebElement signupscreen_login_button ;
}

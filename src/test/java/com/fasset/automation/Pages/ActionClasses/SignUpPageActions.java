package com.fasset.automation.Pages.ActionClasses;
import ConfigFiles.Factory.ConfigFactory;
import com.fasset.automation.Pages.PageRepos.SignupPageRepo;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static Utilities.CommonFunctions.*;

public class SignUpPageActions extends SignupPageRepo {
    WebDriver driver = null;

    public SignUpPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyUserIsOnScreen() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(signupScreen_Text, 5));
        }
    }
    public void userClickOnSignupScreenLoginButton(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            waitUntilElementClickable(login_Button);
            click(login_Button);
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(signup_screen_text, 5));
        }}
/*    public void userClickOnSignupScreenLoginButton(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            waitUntilElementClickable(signupscreen_login_button);
            click(signupscreen_login_button);

        }
        }*/

}

package com.fasset.automation.Pages.ActionClasses;

import ConfigFiles.Factory.ConfigFactory;
import com.fasset.automation.Pages.PageRepos.LoginPageRepo;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;
import java.util.logging.Logger;

import static DataReader.EnvConfig.*;
import static Utilities.CommonFunctions.*;

public class LoginPageActions extends LoginPageRepo {

    WebDriver driver = null;

    public LoginPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void userClickOnLoginButton() {
            click(login_Button);
    }

    public void verifyUserIsOnScreen() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(login_screen_text, 5));
            Assert.assertTrue("Element is not displayed",waitUntilElementDisplayed(login_google_text, 5));
            Assert.assertTrue("Element is not displayed",waitUntilElementDisplayed(login_facebook_text, 5));
            Assert.assertTrue("Element is not displayed",waitUntilElementDisplayed(login_email_text,5));
        }
        else{
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(login_screen_textWeb, 5));
        }
    }
    public void verifyUserIsOnOtpSelectionScreen() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(otp_selection_screen_text, 5));
        }
        else {
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(otp_selection_screen_textWeb, 5));
        }
    }
    public void verifyUserIsOnLoginCredentialsScreen() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(loginCreds_screen_text, 5));
        }
        else if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(loginCreds_screenAdmin_text, 5));
        }
        else{
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(loginCreds_screenWeb_text, 5));
        }
    }
    public void loginUsingEmail(String user){
        switch (user.toUpperCase()) {
            case "INDONESIANAUTOMATION":
                loginUsingEmailFullFlow(LoginIndoAutomationData);
                break;
            case "GLOBALAUTOMATION":
                loginUsingEmailFullFlow(LoginGlobalAutomationData);
                break;
        }
    }
    private void loginUsingEmailFullFlow(Map<String, String> LoginAutomationData) {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            waitUntilElementDisplayed(login_Button,10);
            click(login_Button);
            click(login_email_text);
            clickAndEnterDataInInputField(email_Input, LoginAutomationData.get("Email"));
            clickAndEnterDataInInputField(password_Input, LoginAutomationData.get("Password"));
            hideKeyboard_Android();
            waitUntilElementClickable(loginMain_button);
            click(loginMain_button);
            click(loginMain_button);
            Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(totalAsset_Text,10));
        }
        else{
            // Change the xpaths for web
            waitUntilElementDisplayed(login_Button,10);
            click(login_Button);
            click(login_email_text);
            clickAndEnterDataInInputField(email_Input, LoginAutomationData.get("Email"));
            clickAndEnterDataInInputField(password_Input, LoginAutomationData.get("Password"));
            hideKeyboard_Android();
            waitUntilElementClickable(loginMain_button);
            click(loginMain_button);
            click(loginMain_button);
            Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(totalAsset_Text,10));
        }
    }
    public void enterDataInForm(String formData) {
        switch (formData.toUpperCase()) {
            case "VALID":
                enterDataInFullForm();
                break;
            case "INVALID ACCOUNT":
                enterInvalidEmailInForm();
                break;
        }


    }

    private void enterDataInFullForm() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            clickAndEnterDataInInputField(email_Input, LoginValidData.get("Email"));
            clickAndEnterDataInInputField(password_Input, LoginValidData.get("Password"));
            hideKeyboard_Android();
            waitUntilElementClickable(loginMain_button);
            click(loginMain_button);
            //click(loginMain_button);
        }
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            clickAndEnterDataInInputField(email_InputAdmin, LoginValidDataAdmin.get("Email"));
            clickAndEnterDataInInputField(password_InputAdmin, LoginValidDataAdmin.get("Password"));
            click(loginCreds_screenAdmin_text);
        }
        else{
            clickAndEnterDataInInputField(email_InputWeb, LoginValidData.get("Email"));
            clickAndEnterDataInInputField(password_InputWeb, LoginValidData.get("Password"));
            waitUntilElementClickable(loginMain_buttonWeb);
            click(loginMain_buttonWeb);
        }
    }
    public void userClickOnLoginScreenButton(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            click(loginButton);
        }
        else if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            click(loginCreds_screenAdmin_btn);
        }
        else{
            click(login_ButtonWeb);
        }
    }

    public void userClickOnLoginCredentialScreenButton(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            waitUntilElementClickable(loginMain_button);
            click(loginMain_button);
        }
        else{
            click(loginMain_buttonWeb);
        }
    }

    private void enterInvalidEmailInForm(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            clickAndEnterDataInInputField(email_Input, InvalidEmailAccountDetails.get("Email"));
            clickAndEnterDataInInputField(password_Input, InvalidEmailAccountDetails.get("Password"));
            hideKeyboard_Android();
            waitUntilElementClickable(loginMain_button);
            click(loginMain_button);
            click(loginMain_button);
        }
        else if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            clickAndEnterDataInInputField(email_InputAdmin, InvalidEmailAccountDetails.get("Email"));
            clickAndEnterDataInInputField(password_InputAdmin, InvalidEmailAccountDetails.get("Password"));
            click(loginCreds_screenAdmin_text);
        }

        else{
            clickAndEnterDataInInputField(email_InputWeb, InvalidEmailAccountDetails.get("Email"));
            clickAndEnterDataInInputField(password_InputWeb, InvalidEmailAccountDetails.get("Password"));
            waitUntilElementClickable(loginMain_buttonWeb);
            click(loginMain_buttonWeb);
        }
    }

    public void userNotFoundError(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(userNotFoundErrorText, 20));
        }
        else if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(userNotFoundErrorTextAdmin, 20));
        }
        else{
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(userNotFoundErrorTextWeb, 20));
        }
    }

    public void emailRequiredError(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(emailIsRequiredError_text, 20));
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(passwordIsRequiredError_text,20));
        }
        else if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(inputIsNotValidEmailText, 20));
        }
        else{
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(emailIsRequiredError_textWeb, 20));
        }
    }


}

package com.fasset.automation.Pages.ActionClasses;

import ConfigFiles.Factory.ConfigFactory;
import com.fasset.automation.Pages.PageRepos.CreateAccountPageRepo;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

import static DataReader.EnvConfig.*;
import static Utilities.CommonFunctions.*;

public class CreateAccountPageActions extends CreateAccountPageRepo {
    WebDriver driver = null;
    Random rand = new Random();

    public CreateAccountPageActions(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyUserIsOnScreen(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(screen_Text, 5));
        }
        else
        {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(screen_TextWeb, 5));
        }
    }
    public void verifyCreateAccountButton(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(createAccount_Button,5));
    }
    public void verifyUserIsOnEmailValidationScreen(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(emailValidation_Text, 5));
        }
        else {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(emailValidation_TextWeb, 30));
        }
    }
    public void enterDataInForm(String formData){
        switch (formData.toUpperCase()){
            case "ALL":
                enterDataInFullForm();
                break;
            case "FAIL":
                enterDataInFullFormFail();
                break;
            case "INVALID EMAIL":
                enterInvalidEmailDataInForm();
                break;
            case "EXISTING EMAIL":
                enterExistingEmailDataInForm();
                break;
            case "EXISTING USERNAME":
                enterExistingUserNameDataInForm();
                break;
            case "PASSWORD MISSING":
                passwordMissingInForm();
                break;
            case "INVALID PASSWORD":
                invalidPasswordForm();
                break;
            case "SOCIAL EXISTING EMAIL":
                enterExistingSocialEmailDataInForm();
                break;
            case "EXISTING PHONE NUMBER":
                enterExistingPhoneDataInForm();
                break;
        }
    }
    public void enterDataInFullForm(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("web".toUpperCase())) {
            clickAndEnterDataInInputField(emailAddress_InputWeb, randomEmail());
            String phoneNumber = String.valueOf(rand.nextInt(9000000) + 1000000) +String.valueOf(rand.nextInt(900) + 100);
            clickAndEnterDataInInputField(phoneNumber_InputWeb, phoneNumber);
            String password = randomPassword();
            clickAndEnterDataInInputField(password_InputWeb, password);
            clickAndEnterDataInInputField(confirmPassword_InputWeb, password);
            click(signUp_web);
        }
    }
    public void passwordMissingInForm(){
        clickAndEnterDataInInputField(firstName_Input,"Auto");
        clickAndEnterDataInInputField(lastName_Input,"Mation");
        clickAndEnterDataInInputField(userName_Input,"Auto" + String.valueOf(randInt()));
        clickAndEnterDataInInputField(shirtNumber_Input, String.valueOf(randInt()));
       // selectDateDropDown(dob_Input,"01 November 2008");
        scrollDownUntilTextDisplayed("CONTINUE");
        clickAndEnterDataInInputField(emailAddress_Input,randomEmail());
        click(termAndConditions_Checkbox);
        click(termAndConditions_Checkbox);
        click(emailSubscription_Checkbox);
    }
    public void invalidPasswordForm(){
        clickAndEnterDataInInputField(firstName_Input,"Auto");
        clickAndEnterDataInInputField(lastName_Input,"Mation");
        clickAndEnterDataInInputField(userName_Input,"Auto" + String.valueOf(randInt()));
        clickAndEnterDataInInputField(shirtNumber_Input, String.valueOf(randInt()));
       // selectDateDropDown(dob_Input,"01 November 2008");
        scrollDownUntilTextDisplayed("CONTINUE");
        clickAndEnterDataInInputField(emailAddress_Input,randomEmail());
        clickAndEnterDataInInputField(password_Input,CreateAccountInValidData.get("password"));
        click(termAndConditions_Checkbox);
        click(termAndConditions_Checkbox);
        click(emailSubscription_Checkbox);
    }
    public void enterExistingUserNameDataInForm(){
        clickAndEnterDataInInputField(userName_Input,CreateAccountExistingData.get("userName"));
        clickAndEnterDataInInputField(lastName_Input,"Mation");
    }
    public void enterInvalidEmailDataInForm(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            scrollDownUntilTextDisplayed("CONTINUE");
            clickAndEnterDataInInputField(emailAddress_Input, CreateAccountInValidData.get("emailAddress"));
            clickAndEnterDataInInputField(password_Input, randomPassword());
        }
        else
        {
            clickAndEnterDataInInputField(emailAddress_InputWeb, "naveen@yopmail");
        }
    }
    public void enterExistingEmailDataInForm(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("web".toUpperCase())) {
            clickAndEnterDataInInputField(emailAddress_InputWeb,  LoginValidData.get("Email"));
            String phoneNumber = String.valueOf(rand.nextInt(9000000) + 1000000) +String.valueOf(rand.nextInt(900) + 100);
            clickAndEnterDataInInputField(phoneNumber_InputWeb, phoneNumber);
            String password = randomPassword();
            clickAndEnterDataInInputField(password_InputWeb, password);
            clickAndEnterDataInInputField(confirmPassword_InputWeb, password);
            click(signUp_web);
        }
    }

    public void enterExistingPhoneDataInForm(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("web".toUpperCase())) {
            clickAndEnterDataInInputField(emailAddress_InputWeb,  randomEmail());
            clickAndEnterDataInInputField(phoneNumber_InputWeb, "4573783893");
            String password = randomPassword();
            clickAndEnterDataInInputField(password_InputWeb, password);
            clickAndEnterDataInInputField(confirmPassword_InputWeb, password);
            click(signUp_web);
        }
    }
    public void enterExistingSocialEmailDataInForm(){
        scrollDownUntilTextDisplayed("CONTINUE");
        clickAndEnterDataInInputField(emailAddress_Input,CreateAccountExistingData.get("facebookEmailAddress"));
        clickAndEnterDataInInputField(password_Input,randomPassword());
    }
    public void existingEmailValidationError(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("web".toUpperCase())) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(emailAlreadyExist_TextWeb, 30));
        }
    }
    public void existingFacebookEmailValidationError(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(existingFacebookEmailValidation_Text,10));
    }
    public void existingUserNameError(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(existingUsernameValidation_Text,10));
    }
    public void invalidEmailError(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(invalidEmailValidation_Text, 10));
        }
        else {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed( invalidEmailValidation_TextWeb, 10));
        }
    }
    public void enterDataInFullFormFail(){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            waitUntilElementDisplayed(firstName_Input, 5);
            enterDataInInputField(firstName_Input, "Auto");
            enterDataInInputField(lastName_Input, "Mation");
            enterDataInInputField(userName_Input, "Auto" + String.valueOf(randInt()));
            enterDataInInputField(shirtNumber_Input, String.valueOf(randInt()));
            scrollDownUntilTextDisplayed("CONTINUE");
            // selectDateDropDownFail(dob_Input);
            enterDataInInputField(emailAddress_Input, randomEmail());
            enterDataInInputField(password_Input, randomPassword());
            click(termAndConditions_Checkbox);
            click(emailSubscription_Checkbox);
            click(continue_Button);
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(emailValidation_Text, 5));
        }
        else {
            clickAndEnterDataInInputField(emailAddress_InputWeb, "naveen@yopmail");
            String phoneNumber = String.valueOf(rand.nextInt(9000000) + 1000000);
            clickAndEnterDataInInputField(phoneNumber_InputWeb, phoneNumber);
            clickAndEnterDataInInputField(password_InputWeb, "Test1234");
            clickAndEnterDataInInputField(confirmPassword_InputWeb, "Test12");
            click(signUp_web);
        }
    }

    public void invalidSingUpData(){
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed( invalidEmailValidation_TextWeb, 10));
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed( invalidPhoneValidation_TextWeb, 10));
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed( invalidPasswordValidation_TextWeb, 10));
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed( invalidConfirmValidation_TextWeb, 10));
    }

}

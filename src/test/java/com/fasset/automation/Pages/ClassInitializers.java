package com.fasset.automation.Pages;

import com.fasset.automation.Pages.ActionClasses.*;
import org.openqa.selenium.WebDriver;

public class ClassInitializers {
    public static WelcomePageActions welcomePageActions;
    public static CreateAccountPageActions createAccountPageActions;
    public static LoginPageActions loginPageActions;
    public static HomePageActions homePageActions;
    public static DepositPageActions depositPageActions;
    public static BuyPageActions buyPageActions;
    public static AccountPageActions accountPageActions;
    public static CustomerPageActions customersPageActions;
    public static SignUpPageActions signUpPageActions;

    public static KycPageActions kycPageActions;
    public void initializePages(WebDriver driver) {
        welcomePageActions = new WelcomePageActions(driver);
        createAccountPageActions = new CreateAccountPageActions(driver);
        loginPageActions = new LoginPageActions(driver);
        homePageActions = new HomePageActions(driver);
        depositPageActions = new DepositPageActions(driver);
        buyPageActions = new BuyPageActions(driver);
        accountPageActions = new AccountPageActions(driver);
        customersPageActions = new CustomerPageActions(driver);
        signUpPageActions = new SignUpPageActions(driver);
        accountPageActions = new AccountPageActions(driver);
        kycPageActions = new KycPageActions(driver);
    }
}

package com.fasset.automation.StepDefinitions;
import com.fasset.automation.Pages.ActionClasses.AccountPageActions;
import com.fasset.automation.Pages.ActionClasses.CustomerPageActions;
import com.fasset.automation.Pages.ActionClasses.HomePageActions;
import com.fasset.automation.Pages.ActionClasses.SignUpPageActions;
import com.fasset.automation.Pages.ActionClasses.CustomerPageActions;
import com.fasset.automation.Pages.ActionClasses.KycPageActions;
import com.fasset.automation.Pages.ClassInitializers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;


import static APIToBeUsed.UsefulApi.*;
import static DataReader.JsonReader.getSizeofObject;
import static Driver.DriverManager.getDriver;
import static Utilities.CommonFunctions.*;
import static com.fasset.automation.Pages.PageRepos.HomePageRepo.*;

public class StepDefinition extends ClassInitializers {
    public StepDefinition() {
        initializePages(getDriver());
    }
    @Given("User is able to {string} via Api")
    public void user_is_able_to_use_api(String task) {
        boolean flag = false;
        switch (task.toUpperCase()){
            case "CREATE ACCOUNT RANDOM":
                //createRandomUser();
                break;
        }
    }
    @Given("Verify user is on {string} screen")
    public void user_is_on_screen(String screenName) {
        boolean flag = false;
        switch (screenName.toUpperCase()){
            case "LOGIN CREDENTIALS":
                loginPageActions.verifyUserIsOnLoginCredentialsScreen();
                break;
            case "WELCOME":
                welcomePageActions.verifyUserIsOnScreen();
                break;
            case "CREATE ACCOUNT":
                createAccountPageActions.verifyUserIsOnScreen();
                break;
            case "EMAIL VALIDATION":
                createAccountPageActions.verifyUserIsOnEmailValidationScreen();
                break;
            case "LOGIN":
                loginPageActions.verifyUserIsOnScreen();
                break;
            case "HOMEPAGE":
                homePageActions.verifyUserIsOnScreen(screenName.toUpperCase());
                break;
            case "OTP SELECTION":
                loginPageActions.verifyUserIsOnOtpSelectionScreen();
                break;
            case "CREATE ACCOUNT BUTTON":
                createAccountPageActions.verifyCreateAccountButton();
                break;
            case "SIGNUP":
                signUpPageActions.verifyUserIsOnScreen();
            case "ACCOUNT":
                accountPageActions.verifyUserIsOnScreen();
            case "DEPOSIT INDONESIA":
                depositPageActions.verifyUserIsOnDepositIndoScreen();
                break;
            case "DEPOSIT GLOBAL":
                depositPageActions.verifyUserIsOnDepositGlobalScreen();
                break;
            case "DEPOSIT ENTRY":
                depositPageActions.verifyUserIsOnDepositEntryIndoScreen();
                break;
            case "DEPOSIT SUMMARY":
                depositPageActions.verifyUserIsOnDepositSummaryIndoScreen();
                break;
            case "DEPOSIT SUMMARY GLOBAL":
                depositPageActions.verifyUserIsOnDepositSummaryGlobalScreen();
                break;
            case "DEPOSIT SUCCESSFULLY":
                depositPageActions.verifyUserIsOnDepositSuccessfullyIndoScreen();
                break;
            case "DEPOSIT SUCCESSFULLY GLOBAL":
                depositPageActions.verifyUserIsOnDepositSuccessfullyGlobalScreen();
                break;
            case "ASSET SELECTION":
                buyPageActions.verifyUserIsOnAssetSelectionScreen();
                break;
            case "BUY SUMMARY":
                buyPageActions.verifyUserIsOnBuySummaryScreen();
                break;
            case "BUY SUCCESSFULLY":
                buyPageActions.verifyUserIsOnBuySuccessfulScreen();
                break;
        }
    }
    @Given("Verify {string} element is present")
    public void element_is_present_on_screen(String elementName) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "MENU":
                homePageActions.verifyElementIsPresentOnScreen();
                break;
            case "MENU HAMBURGER":
                homePageActions.verifyMenuHamburgerIsPresentOnScreen();
                break;
            case "TOP BANNER IMAGE":
                homePageActions.verifyTopBannerImageIsPresentOnScreen();
                break;
            case "TOP BANNER SUBCATEGORY":
                homePageActions.verifyTopBannerSubcategoryIsPresentOnScreen();
                break;
            case "TOP BANNER DESCRIPTION":
                homePageActions.verifyTopBannerDescriptionIsPresentOnScreen();
                break;
            case "NEWS SECTION":
                homePageActions.verifyNewsSectionIsPresentOnScreen();
                break;
            case "NEWS TITLE":
                homePageActions.verifyNewsTitleIsPresentOnScreen();
                break;
            case "NEWS DESCRIPTION":
                homePageActions.verifyNewsDescriptionIsPresentOnScreen();
                break;
            case "NEWS CREATER":
                homePageActions.verifyNewsCreaterIsPresentOnScreen();
                break;
            case "NEWS MAIN TITLE":
                homePageActions.verifyNewsMainTitleIsPresentOnScreen();
                break;
            case "NEWS MAIN DESCRIPTION":
                homePageActions.verifyNewsMainDescriptionIsPresentOnScreen();
                break;
            case "SEE OTHER NEWS":
                homePageActions.verifyOtherNewsIsPresentOnScreen();
                break;
            case "BACK BUTTON":
                homePageActions.verifyBackButtonIsPresentOnScreen();
                break;
            case "ARTICLE SECTION":
                homePageActions.verifyArticleSectionIsPresentOnScreen();
                break;
            case "ARTICLE SEE ALL":
                homePageActions.verifyArticleSeeAllIsPresentOnScreen();
                break;
            case "ARTICLE TILE":
                homePageActions.verifyArticleTileIsPresentOnScreen();
                break;
            case "TOP VIEWED SECTION":
                homePageActions.verifyTopViewedSectionIsPresentOnScreen();
                break;
            case "TOP VIEWED TILE":
                homePageActions.verifyTopViewedTileIsPresentOnScreen();
                break;
            case "TOP VIEWED CREATER":
                homePageActions.verifyTopViewedCreaterIsPresentOnScreen();
                break;
            case "TOP VIEWED TITLE":
                homePageActions.verifyTopViewedTitleIsPresentOnScreen();
                break;
            case "DISCOVER":
                homePageActions.verifyDiscoverBadgeIsPresentOnScreen();
                break;
            case "RECENTLY VIEW":
                homePageActions.verifyRecentlyViewBadgeIsPresentOnScreen();
                break;
            case "QUIZ CHOICE":
                homePageActions.verifyQuizChoiceIsPresentOnScreen();
                break;
            case "POLL CHOICE":
                homePageActions.verifyPollChoiceIsPresentOnScreen();
                break;
            case "MATCHES TILE":
                homePageActions.verifyMatchesIsPresentOnScreen();
                break;
        }
    }
    @Given("Verify {string} element is not present")
    public void element_is_not_present_on_screen(String elementName) {
        boolean flag = false;
        switch (elementName.toUpperCase()) {
            case "QUIZ COUNT":
                homePageActions.verifyQuizCountElementIsNotPresentOnScreen();
                break;
            case "POLL COUNT":
                homePageActions.verifyPollCountElementIsNotPresentOnScreen();
                break;
        }
    }
    @Given("Verify {string} element is present on top")
    public void element_is_present_on_top_of_screen(String elementName) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifyTopBannerIsPresentOnTopOfScreen();
                break;
        }
    }
    @Given("Verify {string} element count is {string}")
    public void element_count_to_be(String elementName,String countOfElement) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifyTopBannerCount(countOfElement);
                break;
            case "ARTICLES":
                homePageActions.verifyArticlesCount(countOfElement);
                break;
        }
    }
    @Given("Verify {string} element count is greater than {string}")
    public void element_count_to_be_greater(String elementName,String countOfElement) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifyTopBannerCountIsGreater(countOfElement);
                break;
        }
    }
    @Given("Verify {string} element count can have maximum {string}")
    public void element_count_to_be_less(String elementName,String countOfElement) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifyTopBannerCountIsLesser(countOfElement);
                break;
        }
    }
    @Given("Verify {string} element to be swipe {string}")
    public void element_to_be_swipe(String elementName,String direction) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifySwipeActionTopBanner(direction);
                break;
            case "TOP BANNER COUNT":
                homePageActions.verifyTopBannerSwipeAccordingToCountOfCarousal(direction);
                break;
        }
    }
    @Given("Verify {string} element to be swipe {string} with a count of {string}")
    public void element_to_be_swipe_with_count(String elementName,String direction,String count) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifySwipeActionTopBannerCount(direction,count);
                break;
        }
    }
    @Given("Scroll {string} into view {string} Section")
    public void scroll_into_view_section(String direction,String elementName) {
        switch (elementName.toUpperCase()){
            case "NEWS":
                scrollToElement(direction,news_Time);
                break;
            case "ARTICLES":
                scrollToElement(direction,article_Title_End);
                break;
            case "ARTICLES HEADING":
                scrollToElement(direction,article_Section);
                break;
            case "TOP VIEWED":
                scrollToElement(direction,topViewed_Title);
                scrollByDirection(direction);
                break;
            case "QUIZ":
                if(getSizeofObject("questionsData","data","total_quizzes") > 0) {
                    scrollToElement(direction, quiz_Choice);
                    scrollByDirection(direction);
                }

                break;
            case "POLL":
                if(getSizeofObject("questionsData","data","total_polls") > 0) {
                    scrollToElement(direction, poll_Choice);
                    scrollByDirection(direction);
                }

                break;

            case "MATCHES":
                scrollToElement(direction, matches_Tile);
                scrollByDirection(direction);
                break;
        }
    }
    @Given("Verify {string} screen according to file name {string}")
    public void screen_to_be_verified_with_fileData(String elementName,String fileName) {
        boolean flag = false;
        switch (elementName.toUpperCase()){
            case "TOP BANNER":
                homePageActions.verifyTopBannerAccordingToFile(fileName);
                break;
            case "6TH NEWS":
                homePageActions.verify6thNewsAccordingToFile(fileName);
                break;
            case "NEWS":
                homePageActions.verifyNewsAccordingToFile(fileName);
                break;
            case "QUIZ":
                homePageActions.verifyQuizAccordingToFile(fileName);
                break;
            case "POLL":
                homePageActions.verifyPollAccordingToFile(fileName);
                break;
            case "QUIZ SUMMARY":
                homePageActions.verifyQuizSummaryScreen();
                break;
            case "QUIZ SUMMARY ARROW":
                homePageActions.verifyQuizSummaryArrow();
                break;
            case "QUIZ SUMMARY ARROW FORWARD":
                homePageActions.answerMultipleQuizAccordingToFile(fileName);
                break;
            case "QUIZ SUMMARY ARROW REVIEWING COUNT":
                homePageActions.reviewingQuizCount(fileName);
                break;
            case "POLL SUMMARY":
                homePageActions.verifyPollSummaryScreen();
                break;
            case "POLL SUMMARY ARROW FORWARD":
                homePageActions.answerMultiplePollsAccordingToFile(fileName);
                break;
            case "POLL SUMMARY ARROW REVIEWING COUNT":
                homePageActions.reviewingPollCount(fileName);
                break;
            case "RIGHT QUIZ SUMMARY":
                homePageActions.verifyQuestionSummaryScreenAccordingToFile(fileName,"right");
                break;
            case "WRONG QUIZ SUMMARY":
                homePageActions.verifyQuestionSummaryScreenAccordingToFile(fileName,"wrong");
                break;
            case "QUIZ ICON":
                homePageActions.verifyQuestionAnsweredScreenAccordingToFile(fileName,"quiz");
                break;
            case "POLL PERCENTAGE":
                homePageActions.verifyQuestionAnsweredScreenAccordingToFile(fileName,"poll");
                break;
            case "LEAGUE":
                homePageActions.verifyMatchesLeagueScreen();
                break;
            case "LEAGUE HEADER":
                homePageActions.verifyLeaguesHeader(fileName);
                break;
        }
    }
    @When("Verify Validation Error {string} present on {string} screen")
    public void validation_error_on_screen(String error,String screenName) {
        switch (screenName.toUpperCase()) {
            case "CREATE ACCOUNT":
                switch (error.toUpperCase()) {
                    case "EXISTING EMAIL":
                        createAccountPageActions.existingEmailValidationError();
                        break;
                    case "EXISTING FACEBOOK EMAIL":
                        createAccountPageActions.existingFacebookEmailValidationError();
                        break;
                    case "EXISTING USERNAME":
                        createAccountPageActions.existingUserNameError();
                        break;
                    case "INVALID EMAIL":
                        createAccountPageActions.invalidEmailError();
                        break;
                    case "INVALID DATA":
                        createAccountPageActions.invalidSingUpData();
                        break;
                }
            case "LOGIN":
                switch (error.toUpperCase()) {
                    case "USER NOT FOUND":
                        loginPageActions.userNotFoundError();
                        break;
                }
            case "LOGIN CREDENTIAL":
                switch (error.toUpperCase()) {
                    case "EMAIL IS REQUIRED":
                        loginPageActions.emailRequiredError();
                        break;
                }
        }
    }
    @When("User clicks {string} button on {string} screen")
    public void user_click_on_button(String button,String screenName) {
        switch (screenName.toUpperCase()) {
            case "WELCOME":
                switch (button.toUpperCase()) {
                    case "CREATE ACCOUNT":
                        welcomePageActions.userClickOnCreateAccountButton();
                        break;
                    case "LOGIN":
                        welcomePageActions.userClickOnLoginButton();
                        break;
                    case "SIGNUP":
                        welcomePageActions.userClickOnSignupButton();
                }
                break;
            case "LOGIN":
                switch (button.toUpperCase()) {
                    case "LOGIN":
                        loginPageActions.userClickOnLoginScreenButton();
                        break;
                    case "SIGN IN":
                        loginPageActions.userClickOnLoginScreenButton();
                        break;
                }
                break;
            case "LOGIN CREDENTIALS":
                switch (button.toUpperCase()) {
                    case "LOGIN":
                        loginPageActions.userClickOnLoginCredentialScreenButton();
                        break;
                }
                break;
            case "CUSTOMERS":
                switch (button.toUpperCase()) {
                    case "SEARCH":
                        customersPageActions.userClicksOnSearchButton();
                        break;
                }
                break;
            case "KYC REQUEST":
                switch (button.toUpperCase()) {
                    case "SEARCH":
                        kycPageActions.userClicksOnSearchButton();
                        break;
                }
                break;
            case "HOMEPAGE":
                switch (button.toUpperCase()) {
                    case "DEPOSIT":
                        homePageActions.clickOnDepositButton();
                        break;
                    case "WITHDRAW":
                        homePageActions.clickOnWithdrawButton();
                        break;
                    case "BUY":
                        homePageActions.clickOnBuyButton();
                        break;
                }
                break;
            case "DEPOSIT INDONESIA":
                switch (button.toUpperCase()) {
                    case "OVO":
                        depositPageActions.clickOnOVODepositMethod();
                        break;
                }
                break;
            case "DEPOSIT ENTRY":
                switch (button.toUpperCase()) {
                    case "PREVIEW DEPOSIT":
                        depositPageActions.clickOnPreviewDepositButton();
                        break;
                }
                break;
            case "DEPOSIT GLOBAL":
                switch (button.toUpperCase()) {
                    case "SUBMIT":
                        depositPageActions.clickOnSubmitButton();
                        break;
                }
                break;
            case "DEPOSIT SUMMARY":
                switch (button.toUpperCase()) {
                    case "DEPOSIT NOW":
                        depositPageActions.clickOnDepositNowButton();
                        break;
                }
                break;
            case "SIGNUP":
                switch (button.toUpperCase()) {
                    case "LOGIN":
                        signUpPageActions.userClickOnSignupScreenLoginButton();
                    case "DEPOSIT SUMMARY GLOBAL":
                        switch (button.toUpperCase()) {
                            case "CONFIRM":
                                depositPageActions.clickOnConfirmButton();
                                break;
                            case "TRANSFER COMPLETE":
                                depositPageActions.clickOnTransferCompleteButton();
                                break;
                        }
                        break;
                    case "ASSET SELECTION":
                        switch (button.toUpperCase()) {
                            case "BITCOIN":
                                buyPageActions.userSelectsCoin(button);
                                break;
                        }
                        break;
                    case "BUY ENTRY":
                        switch (button.toUpperCase()) {
                            case "PREVIEW BUY":
                                buyPageActions.clickOnPreviewBuyButton();
                                break;
                        }
                }
        }
    }
    @And("User clicks {string} tab on {string} screen")
    public void user_click_on_tab(String tab, String screenName) {
        switch (screenName.toUpperCase()) {
            case "KYC REQUEST":
                switch (tab.toUpperCase()) {
                    case "RECOMMENDED BY VIDA":
                        kycPageActions.userClicksOnTab(tab);
                        break;
                }
        }
    }

    @Then("User fills {string} form data on {string} screen")
    public void user_fills_form_data(String formData,String screenName) throws InterruptedException {
        switch (screenName.toUpperCase()) {
            case "CREATE ACCOUNT":
                createAccountPageActions.enterDataInForm(formData);
                break;
            case "LOGIN":
                loginPageActions.enterDataInForm(formData);
                break;
            case "LOGIN FORM DATA":
                loginPageActions.enterDataInForm(formData);
                break;
            case "CUSTOMERS":
                customersPageActions.userCustomerFormData(formData);
                break;
            case "KYC REQUEST":
                kycPageActions.userKycFormData(formData);
                break;
        }
    }

    @Given("Create account from {string}")
    public void createAccountFrom(String user) {
        switch (user.toUpperCase()){
            case "SKIP":
                break;
            case "API ACCOUNT":
                //createRandomUser();
                break;
            case "UI":
                createAccountPageActions.verifyCreateAccountButton();
                createAccountPageActions.enterDataInForm("ALL");
                break;
        }
    }
    @Given("{string} Login using email")
    public void loginUsingEmail(String user) {
        switch (user.toUpperCase()){
            case "INDONESIANAUTOMATION":
                loginPageActions.loginUsingEmail(user);
                break;
            case "GLOBALAUTOMATION":
                loginPageActions.loginUsingEmail(user);
                break;
        }
    }

    @And("User enters amount {string}")
    public void userEntersAmount(String amount) {
        enterAmount(amount);
    }

    @And("User select {string} as {string} on {string} screen")
    public void userSelectOnScreen(String method,String bank, String screen) {
        switch (screen.toUpperCase()) {
            case "DEPOSIT GLOBAL":
                switch (method.toUpperCase()) {
                    case "PAYMENT METHOD":
                        depositPageActions.userSelectBankInPaymentMethod(bank);
                        break;
                }
                break;
        }
    }
    @Then("Verify Validation Error {string} is not present on {string} screen")
    public void verifyValidationErrorIsNotPresentOnScreen(String error, String screenName) {
        switch (screenName.toUpperCase()) {
            case "LOGIN":
                switch (error.toUpperCase()) {
                    case "The input is not valid E-mail!":
                        loginPageActions.emailRequiredError();
                        break;
                }
        }
    }

    @When("User clicks {string} link on {string} menu from sidebar")
    public void userClicksSubmenuOnMenuFromSidebar(String link, String menu) {
        switch (menu.toUpperCase()) {
            case "CUSTOMERS":
                switch (link.toUpperCase()) {
                    case "CUSTOMERS":
                        customersPageActions.userClicksOnCustomersLink();
                        break;
                    case "KYC REQUEST":
                        kycPageActions.userClicksOnKycLink();
                        break;
                }
        }
    }

    @And("User clicks {string} dropdown on {string} screen")
    public void userClicksDropdownOnScreen(String dropDown, String screen) {
        switch (screen.toUpperCase()) {
            case "CUSTOMERS":
                customersPageActions.userClicksOnDropDown(dropDown);
                break;
            case "KYC REQUEST":
                kycPageActions.userClicksOnDropDown(dropDown);
                break;
        }
    }

    @Then("Verify {string} present on {string} screen and click")
    public void verifyPresentOnScreen(String user, String screen) {
        switch (screen.toUpperCase()) {
            case "CUSTOMERS":
                switch (user.toUpperCase()) {
                    case "CUSTOMER LIST":
                        customersPageActions.verifyCustomerListIsPresent();
                        break;
                    case "SELECTED USER":
                        customersPageActions.verifyUserIsPresentAndClick();
                        break;
                }
                break;
            case "KYC REQUEST":
                switch (user.toUpperCase()) {
                    case "KYC LIST":
                        kycPageActions.verifyKycListIsPresent();
                        break;
                    case "SELECTED USER":
                        kycPageActions.verifyKycUserIsPresentAndClick();
                        break;
                }
        }
    }
}

package com.fasset.automation.Pages.ActionClasses;

import com.fasset.automation.Pages.PageRepos.DepositPageRepo;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static Utilities.CommonFunctions.*;

public class DepositPageActions extends DepositPageRepo {
    WebDriver driver = null;
    public DepositPageActions(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyUserIsOnDepositIndoScreen(){
        Assert.assertTrue("Deposit Screen Not Found",waitUntilElementDisplayed(depositIndoScreen,10));
    }
    public void verifyUserIsOnDepositGlobalScreen(){
        Assert.assertTrue("Deposit Screen Not Found",waitUntilElementDisplayed(depositGlobalScreen,10));
    }
    public void verifyUserIsOnDepositEntryIndoScreen(){
        Assert.assertTrue("Deposit Entry Screen Not Found",waitUntilElementDisplayed(depositEntryIndoScreen,10));
    }
    public void verifyUserIsOnDepositSummaryIndoScreen(){
        Assert.assertTrue("Deposit Summary Screen Not Found",waitUntilElementDisplayed(depositSummaryIndoScreen,10));
    }
    public void verifyUserIsOnDepositSummaryGlobalScreen(){
        Assert.assertTrue("Deposit Summary Screen Not Found",waitUntilElementDisplayed(depositSummaryGlobalScreen,10));
    }
    public void verifyUserIsOnDepositSuccessfullyIndoScreen(){
        Assert.assertTrue("Deposit Successful Screen Not Found",waitUntilElementDisplayed(depositSuccessfulIndoScreen,10));
    }
    public void verifyUserIsOnDepositSuccessfullyGlobalScreen(){
        Assert.assertTrue("Deposit Successful Screen Not Found",waitUntilElementDisplayed(depositSuccessfulGlobalScreen,10));
    }
    public void clickOnOVODepositMethod(){
        click(OVODepositMethod);
    }
    public void clickOnPreviewDepositButton(){
        click(previewDepositButton);
    }
    public void clickOnSubmitButton(){
        click(submitButton);
    }
    public void clickOnDepositNowButton(){
        click(depositNowButton);
    }
    public void clickOnConfirmButton(){
        click(confirmButton);
    }
    public void clickOnTransferCompleteButton(){
        scrollDownUntilTextDisplayed("Transfer Complete");
        click(transferCompleteButton);
    }
    public void userSelectBankInPaymentMethod(String bank)
    {
        click(depositPaymentMethod);
        clickOnText(bank);
    }
}

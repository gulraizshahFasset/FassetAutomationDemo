package com.fasset.automation.Pages.ActionClasses;

import ConfigFiles.Factory.ConfigFactory;
import com.fasset.automation.Pages.PageRepos.BuyPageRepo;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static Utilities.CommonFunctions.*;

public class BuyPageActions extends BuyPageRepo {
    WebDriver driver = null;
    public BuyPageActions(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void verifyUserIsOnAssetSelectionScreen(){
        Assert.assertTrue("Asset Selection Screen Not Found", waitUntilElementDisplayed(assetSelectionScreen, 10));
    }
    public static void verifyUserIsOnBuySummaryScreen(){
        Assert.assertTrue("Buy Summary Screen Not Found", waitUntilElementDisplayed(buySummaryScreen, 10));
    }
    public static void verifyUserIsOnBuySuccessfulScreen(){
        Assert.assertTrue("Buy Successful Screen Not Found", waitUntilElementDisplayed(buySuccessfulScreen, 10));
    }
    public static void userSelectsCoin(String coin){
        scrollDownUntilTextDisplayed(coin);
        clickOnText(coin);
    }
    public void clickOnPreviewBuyButton(){
        click(previewBuyButton);
    }
}

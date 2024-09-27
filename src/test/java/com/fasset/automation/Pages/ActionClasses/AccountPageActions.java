package com.fasset.automation.Pages.ActionClasses;


import ConfigFiles.Factory.ConfigFactory;
import com.fasset.automation.Pages.PageRepos.AccountPageRepo;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static Utilities.CommonFunctions.waitUntilElementDisplayed;


public class AccountPageActions extends AccountPageRepo {
    WebDriver driver = null;
    public AccountPageActions(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

        public void verifyUserIsOnScreen() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element is not displayed", waitUntilElementDisplayed(accountScreen_text, 5));
        }
        }
}

package com.fasset.automation.Pages.ActionClasses;

import ConfigFiles.Factory.ConfigFactory;
import com.fasset.automation.Pages.PageRepos.KycPageRepo;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static DataReader.EnvConfig.ValidCustomerDetails;
import static Utilities.CommonFunctions.*;


public class KycPageActions extends KycPageRepo {
    WebDriver driver = null;

    public KycPageActions(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void userClicksOnKycLink() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            click(kycSubMenuLink);
        }
    }

    public void userClicksOnDropDown(String dropdown) {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            switch (dropdown.toUpperCase()) {
                case "USER ID":
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(dropdownMenu, 20));
                    click(dropdownMenu);
                    waitUntilElementClickable(dropdownUserId);
                    click(dropdownUserId);
                    break;
                case "LEGAL NAME":
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(dropdownMenu, 20));
                    click(dropdownMenu);
                    waitUntilElementClickable(dropdownLegalName);
                    click(dropdownLegalName);
                    break;
                case "NAME":
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(dropdownMenu, 20));
                    click(dropdownMenu);
                    waitUntilElementClickable(dropdownName);
                    click(dropdownName);
                    break;
                case "EMAIL":
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(dropdownMenu, 20));
                    click(dropdownMenu);
                    waitUntilElementClickable(dropdownEmail);
                    click(dropdownEmail);
                    break;
                case "PHONE":
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(dropdownMenu, 20));
                    click(dropdownMenu);
                    waitUntilElementClickable(dropdownPhone);
                    click(dropdownPhone);
                    break;
                case "REGISTERED DATE":
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(dropdownMenu, 20));
                    click(dropdownMenu);
                    waitUntilElementClickable(dropdownRegisteredDate);
                    click(dropdownRegisteredDate);
                    break;
                case "SUBMITTED DATE":
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(dropdownMenu, 20));
                    click(dropdownMenu);
                    waitUntilElementClickable(dropdownSubmittedDate);
                    click(dropdownSubmittedDate);
                    break;
            }
        }
    }

    public void userKycFormData(String formData) {
        if (ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            switch (formData.toUpperCase()) {
                case "VALID USER ID":
                    clickAndEnterDataInInputField(searchBar, ValidCustomerDetails.get("Id"));
                    break;
                case "VALID LEGAL NAME":
                    clickAndEnterDataInInputField(searchBar, ValidCustomerDetails.get("Legal Name"));
                    break;
                case "VALID NAME":
                    clickAndEnterDataInInputField(searchBar, ValidCustomerDetails.get("Name"));
                    break;
                case "VALID EMAIL":
                    clickAndEnterDataInInputField(searchBar, ValidCustomerDetails.get("Email"));
                    break;
                case "VALID PHONE":
                    clickAndEnterDataInInputField(searchBar, ValidCustomerDetails.get("Phone"));
                    break;
                case "VALID REGISTERED DATE":
                    clickAndEnterDataInInputField(formStartDate, "2023-11-01");
                    clickAndEnterDataInInputField(formEndDate, "2023-12-01");
                    break;
                case "VALID SUBMITTED DATE":
                    clickAndEnterDataInInputField(formStartDate, "2023-11-01");
                    clickAndEnterDataInInputField(formEndDate, "2023-12-01");
                    break;
            }
        }
    }

    public void userClicksOnTab(String tab) {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            switch (tab.toUpperCase()) {
                case "RECOMMENDED BY VIDA":
                    click(recommendedTab);
                    break;
            }
        }
    }

    public void userClicksOnSearchButton() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            if (googleNotification.isDisplayed()){
                waitForInvisibilityOfElement(googleNotification);
                click(searchBtn);
            } else {
                click(searchBtn);
            }
        }
    }

    public void verifyKycUserIsPresentAndClick() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            if (emptyData.isDisplayed()){
                Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(emptyData, 20));
            } else {
                Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(validUserIdEmail, 20));
                click(validUserIdEmail);
            }
        }
    }

    public void verifyKycListIsPresent() {
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(kycTable, 20));
        }
    }
}


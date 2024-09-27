package com.fasset.automation.Pages.PageRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KycPageRepo {

    @FindBy(xpath = "//a[@href=\"/kyc\"]")
    public WebElement kycSubMenuLink;

    @FindBy(xpath = "//*[@class='ant-table-cell' and text()='User ID']")
    public WebElement kycTable;

    @FindBy(xpath = "//a[text()='No Data']")
    public WebElement emptyKycList;

    @FindBy(xpath = "//*[text()='Recommended by VIDA']")
    public WebElement recommendedTab;

    @FindBy(xpath = "//span[@class='ant-select-selection-item']")
    public WebElement dropdownMenu;

    @FindBy(xpath = "//*[@class='ant-select-item-option-content' and text()='User ID']")
    public WebElement dropdownUserId;

    @FindBy(xpath = "//*[@class='ant-select-item-option-content' and text()='Legal Name']")
    public WebElement dropdownLegalName;

    @FindBy(xpath = "//*[@class='ant-select-item-option-content' and text()='Name']")
    public WebElement dropdownName;

    @FindBy(xpath = "//*[@class='ant-select-item-option-content' and text()='Email']")
    public WebElement dropdownEmail;

    @FindBy(xpath = "//*[@class='ant-select-item-option-content' and text()='Phone']")
    public WebElement dropdownPhone;

    @FindBy(xpath = "//*[@class='ant-select-item-option-content' and text()='Registered Date']")
    public WebElement dropdownRegisteredDate;

    @FindBy(xpath = "//*[@class='ant-select-item-option-content' and text()='Submitted Date']")
    public WebElement dropdownSubmittedDate;

    @FindBy(xpath = "//input[@placeholder='Start date']")
    public WebElement formStartDate;

    @FindBy(xpath = "//input[@placeholder='End date']")
    public WebElement formEndDate;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@type='button']//span[text()='Search']")
    public WebElement searchBtn;

    @FindBy(xpath = "//*[@class='ant-empty-image']")
    public WebElement emptyData;

    @FindBy(xpath = "//a[text()='akk@mailinator.com']")
    public WebElement validUserIdEmail;

    @FindBy(xpath = "//*[@class='ant-notification ant-notification-topRight']")
    public WebElement googleNotification;

}

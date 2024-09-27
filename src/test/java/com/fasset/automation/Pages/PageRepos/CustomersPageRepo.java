package com.fasset.automation.Pages.PageRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPageRepo {

    @FindBy(xpath = "//*[@id='root']/section/section/header/h2")
    public WebElement customerHeaderText;

    @FindBy(xpath = "//a[@href=\"/users\"]")     //span[text()='Customers']
    public WebElement customersSubMenuLink;

    @FindBy(xpath = "//*[@class='ant-table-cell' and text()='User ID']")
    public WebElement customersTable;

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

    @FindBy(xpath = "//*[@class='ant-select-item-option-content' and text()='User Type']")
    public WebElement dropdownUserType;

    @FindBy(xpath = "//*[@class='ant-select-selection-item' and text()='all']")
    public WebElement searchBarUserType;

    @FindBy(xpath = "//*[@class='ant-select-item-option-content' and text()='mobile']")
    public WebElement selectMobileUserType;

    @FindBy(xpath = "//*[@class='ant-select-item-option-content' and text()='Phone']")
    public WebElement dropdownPhone;

    @FindBy(xpath = "//*[@class='ant-select-item-option-content' and text()='Registered Date']")
    public WebElement dropdownRegisteredDate;

    @FindBy(xpath = "//input[@placeholder='Start date']")
    public WebElement formStartDate;

    @FindBy(xpath = "//input[@placeholder='End date']")
    public WebElement formEndDate;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@type='button']//span[text()='Search']")
    public WebElement searchBtn;

    @FindBy(xpath = "//*[@class='ant-notification ant-notification-topRight']")
    public WebElement googleNotification;

    @FindBy(xpath = "//a[text()='akk@mailinator.com']")
    public WebElement validUserIdEmail;

}

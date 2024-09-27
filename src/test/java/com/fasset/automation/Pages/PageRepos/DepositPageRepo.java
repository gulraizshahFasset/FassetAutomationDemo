package com.fasset.automation.Pages.PageRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositPageRepo {
    @FindBy(xpath = "//*[@text='Select deposit method']")
    public static WebElement depositIndoScreen;
    @FindBy(xpath = "//*[@text='Payment method']")
    public static WebElement depositGlobalScreen;
    @FindBy(xpath = "//*[@text='Select a payment method']")
    public static WebElement depositPaymentMethod;
    @FindBy(xpath = "//*[@text='Minimum Deposit 50,000 IDR']")
    public static WebElement depositEntryIndoScreen;
    @FindBy(xpath = "//*[@text='Deposit confirmation']")
    public static WebElement depositSummaryIndoScreen;
    @FindBy(xpath = "//*[@text='Confirm Deposit']")
    public static WebElement depositSummaryGlobalScreen;
    @FindBy(xpath = "//*[@text='Deposit request created, open your OVO App and confirm your deposit']")
    public static WebElement depositSuccessfulIndoScreen;
    @FindBy(xpath = "//*[@text='Deposit Receipt']")
    public static WebElement depositSuccessfulGlobalScreen;

    @FindBy(xpath = "//android.widget.TextView[@text='Digital wallet']/parent::android.view.ViewGroup//android.widget.ImageView")
    public static WebElement OVODepositMethod;
    @FindBy(xpath = "//*[@text='Preview deposit']")
    public static WebElement previewDepositButton;
    @FindBy(xpath = "//*[@text='Submit']")
    public static WebElement submitButton;
    @FindBy(xpath = "//*[@text='Deposit Now']")
    public static WebElement depositNowButton;
    @FindBy(xpath = "//*[@text='Confirm']")
    public static WebElement confirmButton;
    @FindBy(xpath = "//*[@text='Transfer Complete']")
    public static WebElement transferCompleteButton;
}

package com.fasset.automation.Pages.PageRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyPageRepo {
    @FindBy(xpath = "//*[@text = 'Select asset to buy']")
    public static WebElement assetSelectionScreen;
    @FindBy(xpath = "//*[@text = 'Purchase confirmation']")
    public static WebElement buySummaryScreen;
    @FindBy(xpath = "//*[@text = 'Purchase complete']")
    public static WebElement buySuccessfulScreen;
    @FindBy(xpath = "//*[@text = 'Preview buy']")
    public static WebElement previewBuyButton;
}

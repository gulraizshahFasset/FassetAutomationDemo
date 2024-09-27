package com.fasset.automation.Pages.PageRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPageRepo {
    @FindBy(xpath = "//*[@id='com.fasset.cashapp:id/Account-text']")
    public WebElement accountScreen_text;
    @FindBy(xpath = "//*[@text = 'Select asset to buy']")
    public static WebElement assetSelectionScreen;
}

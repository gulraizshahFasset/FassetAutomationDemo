package com.fasset.automation.Pages.PageRepos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import static Driver.DriverManager.getDriver;



public class HomePageRepo {

    @FindBy(xpath = "//*[@text='Latest News']")
    public static WebElement news_Text;

    @FindBy(xpath = "//(android.widget.TextView[@text='Home'])")
    public static WebElement home_Icon;

    @FindBy(xpath = "//(android.widget.TextView[@text='Market'])")
    public static WebElement market_Icon;

    @FindBy(xpath = "//(android.widget.TextView[@text='Wallet'])")
    public static WebElement wallet_Icon;

    @FindBy(xpath = "//(android.widget.TextView[@text='Account'])")
    public static WebElement account_Icon;

    @FindBy(xpath = "//*[@text = 'Total asset balance']")
    public static WebElement totalAsset_Text;

    @FindBy(xpath="(//android.view.ViewGroup[@content-desc='Home_Button'])[2]")
    public static WebElement home_Button;
    @FindBy(xpath="//*[@text='\uE915']")
    public static WebElement home_Button_Text;

    @FindBy(xpath="//android.widget.ImageView[contains(@content-desc,'Home_Top_Banner_Tile')]")
    public static WebElement topBanner_Image;

    @FindBy(xpath="//android.widget.TextView[contains(@content-desc,'Home_Top_Banner_Creater')]")
    public static WebElement topBanner_SubCategory;

    @FindBy(xpath="//android.widget.TextView[contains(@content-desc,'Home_Top_Banner_Title_')]")
    public static WebElement topBanner_Description;
    @FindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[contains(@content-desc,'Home_Top_Banner_Tile')]")
    public static WebElement topBanner_Alignment;

    @FindBy(xpath="(//*[contains(@content-desc,'Home_Top_Banner_Tile')])[1]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup")
    public static List<WebElement> topBanner_Count;

    @FindBy(xpath="(//android.widget.ImageView[contains(@content-desc,'Home_Top_Banner_Tile')])[1]")
    public static WebElement topBanner_Image_1;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc='Back_Button']")
    public static WebElement back_Button;


    @FindBy(xpath="//android.view.ViewGroup[@content-desc='Share_Button']")
    public static WebElement share_Button;

    @FindBy(xpath="//android.widget.TextView[@content-desc='Main_Label']")
    public static WebElement main_Label;

    @FindBy(xpath="//android.widget.TextView[@content-desc='Main_Title']")
    public static WebElement main_Title;

    @FindBy(xpath="//android.widget.TextView[@content-desc='News_Title']")
    public static WebElement news_main_Title;

    @FindBy(xpath="//android.widget.TextView[@content-desc='News_Description']")
    public static WebElement news_main_Description;

    @FindBy(xpath="//android.widget.TextView[@content-desc='Other_News_Link']")
    public static WebElement other_news_Link;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc='Play_Button']")
    public static WebElement play_Button;

    @FindBy(xpath="//android.widget.TextView[@content-desc='Latest_News_Heading']")
    public static WebElement news_Section;

    @FindBy(xpath="(//android.view.ViewGroup)[58]")
    public static WebElement deposit_Button;
    @FindBy(xpath="(//android.view.ViewGroup)[61]")
    public static WebElement withdraw_Button;
    @FindBy(xpath="(//android.view.ViewGroup)[64]")
    public static WebElement buy_Button;

    @FindBy(xpath="(//android.widget.TextView[contains(@content-desc,'Latest_News_Title_')])[1]")
    public static WebElement news_Title;

    @FindBy(xpath="(//android.widget.TextView[contains(@content-desc,'Latest_News_Name_')])[1]")
    public static WebElement news_Creater;

    @FindBy(xpath="(//android.widget.TextView[contains(@content-desc,'Latest_News_Description_')])[1]")
    public static WebElement news_Description;

    @FindBy(xpath="(//android.widget.TextView[contains(@content-desc,'Latest_News_Time_')])[1]")
    public static WebElement news_Time;

    @FindBy(xpath="(//*[contains(@content-desc,'Article_Title_')])[4]")
    public static WebElement article_Title_End;

    @FindBy(xpath="//*[contains(@content-desc,'Article_Title_')]")
    public static List<WebElement> article_Title_Count;

    @FindBy(xpath="(//*[contains(@content-desc,'Article_Tile_')])[1]")
    public static WebElement article_Tile;

    @FindBy(xpath="//*[@content-desc='Article_See_All']")
    public static WebElement article_See_All;

    @FindBy(xpath="//*[@content-desc='Article_Heading']")
    public static WebElement article_Section;

    @FindBy(xpath="//*[@content-desc='TopViewed_Heading']")
    public static WebElement topViewed_Section;

    @FindBy(xpath="(//android.widget.ImageView[contains(@content-desc,'TopViewed_Tile_')])[1]")
    public static WebElement topViewed_Tile;

    @FindBy(xpath="(//android.widget.ImageView[contains(@content-desc,'TopViewed_Tile_')])[2]")
    public static WebElement topViewed_Tile_End;

    @FindBy(xpath="(//*[contains(@content-desc,'TopViewed_Creater')])[1]")
    public static WebElement topViewed_Creater;

    @FindBy(xpath="(//*[contains(@content-desc,'TopViewed_Title_')])[1]")
    public static WebElement topViewed_Title;

    @FindBy(xpath="(//*[contains(@content-desc,'Polls_Choice_')])[1]")
    public static WebElement poll_Choice;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc='Match_Tile']")
    public static WebElement matches_Tile;
    @FindBy(xpath="//android.view.ViewGroup[@content-desc='Match_Tile']")
    public static WebElement matches_Star_Button;

    @FindBy(xpath="(//*[contains(@content-desc,'Quiz_Choice_')])[1]")
    public static WebElement quiz_Choice;

    @FindBy(xpath="(//*[contains(@content-desc,'Quiz_Choice_')])[1]")
    public static WebElement quiz_FirstAnswer;

    @FindBy(xpath="//android.widget.TextView[@content-desc='Quiz_Summary_Heading']")
    public static WebElement quiz_Summary_Text;

    @FindBy(xpath="//android.widget.TextView[@content-desc='Poll_Summary_Text']")
    public static WebElement poll_Summary_Text;
    @FindBy(xpath="//android.view.ViewGroup[@content-desc='Poll_Share']")
    public static WebElement poll_SummaryShort_Button;
    @FindBy(xpath="//android.widget.TextView[@content-desc='Quiz_Short_Summary']")
    public static WebElement quiz_SummaryShort_Text;
    @FindBy(xpath="//android.widget.TextView[@content-desc='Right_Answer_Text']")
    public static WebElement quiz_Summary_Right_Text;
    @FindBy(xpath="//android.widget.TextView[@content-desc='Wrong_Answer_Text']")
    public static WebElement quiz_Summary_Wrong_Text;

    @FindBy(xpath="//android.widget.TextView[@content-desc='Right_Answers']")
    public static WebElement quiz_Summary_Right_Count;
    @FindBy(xpath="//android.widget.TextView[@content-desc='Wrong_Answers']")
    public static WebElement quiz_Summary_Wrong_Count;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc='Sharing_Button']/android.view.ViewGroup/android.widget.TextView")
    public static WebElement quiz_Summary_Footer_Text;

    @FindBy(xpath="//*[@resource-id='android:id/content_preview_text']")
    public static WebElement sharing_Main_Heading;
    @FindBy(xpath="//*[@resource-id='android:id/chooser_copy_button']")
    public static WebElement sharing_Copy_Button;
    @FindBy(xpath="//*[@resource-id='android:id/chooser_nearby_button']")
    public static WebElement sharing_Nearby_Button;
    @FindBy(xpath="//*[@resource-id='android:id/icon']")
    public static WebElement sharing_Icon_Button;
    @FindBy(xpath="//*[@text='\uE962']")
    public static WebElement quiz_Summary_Arrow_Text;
    @FindBy(xpath="//*[@text='\uE962']")
    public static WebElement poll_Summary_Arrow_Text;
    @FindBy(xpath="//android.view.ViewGroup[@content-desc='Poll_Share']/android.view.ViewGroup/android.widget.TextView")
    public static WebElement poll_Summary_Sharing_Button;

    @FindBy(xpath="//*[contains(@content-desc,'Quiz_Choice_')]")
    public static WebElement quiz_Choices;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc='Search_Icon']")
    public static WebElement search_Button;

    @FindBy(xpath="//android.widget.TextView[@content-desc='Match_See_All']")
    public static WebElement matches_SeeAll_Button;

    @FindBy(xpath="//android.widget.TextView[@content-desc='Discover_Badge']")
    public static WebElement discover_Badge;

    @FindBy(xpath="//android.widget.TextView[@content-desc='RecentlyViewed_Badge']")
    public static WebElement recentlyViewed_Badge;

    public static WebElement getTopBannerTitleElement(String text){
        try{
            return getDriver().findElement(By.xpath("//*[@content-desc=\"Home_Top_Banner_Title_"+text+"\"]"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getTopBannerIdElement(String text){
        try{
            return getDriver().findElement(By.xpath("//*[@content-desc='Home_Top_Banner_Tile_"+text+"']"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getTopBannerTypeElement(String text){
        try{
            return getDriver().findElement(By.xpath("//*[@content-desc='Home_Top_Banner_Creater_"+text+"']"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getNewsTitleElement(String text){
        try{
            return getDriver().findElement(By.xpath("(//*[@content-desc='Latest_News_Title_"+text+"'])[1]"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getNewsIdElement(String text){
        try{
            return getDriver().findElement(By.xpath("(//*[@content-desc='Latest_News_Tile_"+text+"'])[1]"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getNewsDescriptionElement(String text){
        try{
            return getDriver().findElement(By.xpath("(//*[@content-desc='Latest_News_Description_"+text+"'])[1]"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getNewsCreaterElement(String text){
        try{
            return getDriver().findElement(By.xpath("(//*[@content-desc='Latest_News_Name_"+text+"'])[1]"));
        }catch (Exception ex){
            return null;
        }
    }

    public static WebElement getQuizTileElement(String text){
        try{
            return getDriver().findElement(By.xpath("//android.view.ViewGroup[@content-desc='Quiz_Question_"+text+"']"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getQuizImageElement(String text){
        try{
            return getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc='Quiz_Question_"+text+"']"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getQuizQuestionElement(String text){
        try{
            return getDriver().findElement(By.xpath("//android.widget.TextView[@content-desc='Quiz_Question_"+text+"']"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getQuizQuestionTextElement(String text){
        try{
            return getDriver().findElement(By.xpath("//android.widget.TextView[@text='"+text+"']"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getQuizAnswerElement(String text){
        try{
            return getDriver().findElement(By.xpath("(//android.view.ViewGroup[@content-desc='Quiz_Choice_"+text+"'])[1]"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getQuizRightAnswerIconElement(String text){
        try{
            return getDriver().findElement(By.xpath("(//android.view.ViewGroup[@content-desc='Quiz_Choice_"+text+"'])[1]//android.widget.TextView[@content-desc='Quiz_Right']"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getQuizWrongAnswerIconElement(String text){
        try{
            return getDriver().findElement(By.xpath("(//android.view.ViewGroup[@content-desc='Quiz_Choice_"+text+"'])[1]//android.widget.TextView[@content-desc='Quiz_Wrong']"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getPollPercentageIconElement(String text){
        try{
            return getDriver().findElement(By.xpath("(//android.view.ViewGroup[@content-desc='Polls_Choice_"+text+"'])[1]//android.widget.TextView[@content-desc='Poll_Percentage']"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getQuizCountElement(String text){
        try{
            return getDriver().findElement(By.xpath("(//android.widget.TextView[@text='"+text+"'])[1]"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getQuizAnswerTextElement(String text){
        try{
            return getDriver().findElement(By.xpath("(//android.widget.TextView[@text='"+text+"'])[1]"));
        }catch (Exception ex){
            return null;
        }
    }

    public static WebElement getPollTileElement(String text){
        try{
            return getDriver().findElement(By.xpath("//android.view.ViewGroup[@content-desc='Polls_Question_"+text+"']"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getPollImageElement(String text){
        try{
            return getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc='Polls_Question_"+text+"']"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getPollQuestionElement(String text){
        try{
            return getDriver().findElement(By.xpath("//android.widget.TextView[@content-desc='Polls_Question_"+text+"']"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getPollQuestionTextElement(String text){
        try{
            return getDriver().findElement(By.xpath("//android.widget.TextView[@text='"+text+"']"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getPollAnswerElement(String text){
        try{
            return getDriver().findElement(By.xpath("(//android.view.ViewGroup[@content-desc='Polls_Choice_"+text+"'])[1]"));
        }catch (Exception ex){
            return null;
        }
    }
    public static WebElement getPollAnswerTextElement(String text){
        try{
            return getDriver().findElement(By.xpath("(//android.widget.TextView[@text='"+text+"'])[1]"));
        }catch (Exception ex){
            return null;
        }
    }

    @FindBy(xpath = "//*[text()='Naveen Zehra']")
    public static WebElement userFoundAdmin;

    @FindBy(xpath = "//*[text()='Home']")
    public static WebElement homePageWeb;

    @FindBy(xpath = "//p[text()='Total Asset Balance']")
    public static WebElement totalAsset;
    @FindBy(xpath = "//p[text()='Cash Balance']")
    public static WebElement cashBalance;

    @FindBy(xpath = "//button[text()='Deposit']")
    public static WebElement depositButton;
    @FindBy(xpath = "//button[text()='Withdraw']")
    public static WebElement withdrawButton;
    @FindBy(xpath = "//button[text()='buy']")
    public static WebElement buyButton;
    @FindBy(xpath = "//button[text()='Sell']")
    public static WebElement sellButton;
    @FindBy(xpath = "//button[text()='Swap']")
    public static WebElement swapButton;

    @FindBy(xpath = "//span[text()='More']")
    public static WebElement moreButton;

    @FindBy(xpath = "//*[text()='Watchlist']")
    public static WebElement watchList;

    @FindBy(xpath = "//*[text()='Coin list']")
    public static WebElement coinList;

    @FindBy(xpath = "//*[text()='Home | Indosat']")
    public static WebElement homePage;
    @FindBy(xpath = "//*[text()='Market']")
    public static WebElement marketWeb;

    @FindBy(xpath = "//*[text()='Wallet']")
    public static WebElement walletWeb;

    @FindBy(xpath = "//*[text()='Account']")
    public static WebElement accountWeb;

    @FindBy(xpath = "//*[@class='dashboardNotificationBar_notificationDot__l6VDe']")
    public static WebElement notiWeb;

    @FindBy(xpath = "//*[text()='All Assets']")
    public static WebElement allAssets;

    @FindBy(xpath = "//*[@placeholder ='Search']")
    public static WebElement searchMarket;

    @FindBy(xpath = "//*[text()='Account Information']")
    public static WebElement accountInformation;

    @FindBy(xpath = "//*[@id='com.fasset.cashapp:id/Account-btn']")
    public static WebElement accountButtonMobile;


    @FindBy(xpath = "//*[@id='com.fasset.cashapp:id/watchlist-text']")
    public static WebElement homePageText;
}

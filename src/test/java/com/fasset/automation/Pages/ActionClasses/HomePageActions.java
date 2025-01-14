package com.fasset.automation.Pages.ActionClasses;

import ConfigFiles.Factory.ConfigFactory;
import Utilities.CommonFunctions;
import com.fasset.automation.Pages.PageRepos.HomePageRepo;
import org.apache.poi.ss.formula.atp.Switch;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.lang.module.Configuration;

import static DataReader.JsonReader.*;
import static Utilities.CommonFunctions.*;

public class HomePageActions extends HomePageRepo {
    WebDriver driver = null;
    public HomePageActions(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnDepositButton(){
        click(deposit_Button);
    }
    public void clickOnWithdrawButton(){
        click(withdraw_Button);
    }
    public void clickOnBuyButton(){
        click(buy_Button);
    }
    public void clickOnSearchButton(){
        click(search_Button);
    }
    public void clickOnMatchesSeeAllButton(){
        click(matches_SeeAll_Button);
    }

    public static void verifyUserIsOnScreen(String screen){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase())) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(userFoundAdmin, 10));
        }
        else if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("web".toUpperCase())) {
            switch (screen.toUpperCase())
            {
                case "HOMEPAGE":
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(totalAsset, 30));
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(cashBalance, 30));
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(depositButton, 30));
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(withdrawButton, 30));
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(buyButton, 30));
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(sellButton, 30));
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(moreButton, 30));
                    click(moreButton);
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(swapButton, 30));
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(watchList, 30));
                    scrollToElement("down",coinList);
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(homePageWeb, 30));
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(marketWeb, 30));
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(walletWeb, 30));
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(accountWeb, 30));

                    break;
                case "WALLET":
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(allAssets, 30));
                    break;
                case "ACCOUNT":
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(accountInformation, 30));
                    break;
                case "MARKET":
                    Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(searchMarket, 30));
                    break;
            }
        }
        else if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(homePageText, 10));
        }
        else {
            Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(totalAsset_Text,10));
            Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(home_Icon,10));
            Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(market_Icon,10));
            Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(wallet_Icon,10));
            Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(account_Icon,10));
        }
    }
    public static void verifyElementIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(home_Button,10));
    }
    public static void verifyQuizCountElementIsNotPresentOnScreen(){
        int numberOfQuiz = getSizeofObject("questionsData","data","total_quizzes");
        if(numberOfQuiz > 1) {
            Assert.assertTrue("Quiz Count Element Found on Summary Screen", elementNotPresent(getQuizCountElement(" / ")));
        }
    }
    public static void verifyPollCountElementIsNotPresentOnScreen(){
        int numberOfPolls = getSizeofObject("questionsData","data","total_polls");
        if(numberOfPolls > 1) {
            Assert.assertTrue("Poll Count Element Found on Summary Screen", elementNotPresent(getQuizCountElement(" / ")));
        }
    }
    public static void verifyMenuHamburgerIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(home_Button_Text,10));
    }
    public static void verifyTopBannerImageIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(topBanner_Image,10));
    }
    public static void verifyTopBannerSubcategoryIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(topBanner_SubCategory,10));
    }
    public static void verifyTopBannerDescriptionIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(topBanner_Description,10));
    }
    public static void verifyNewsSectionIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(news_Section,10));
    }
    public static void verifyArticleSectionIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(article_Section,10));
    }
    public static void verifyTopViewedSectionIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(topViewed_Section,10));
    }
    public static void verifyArticleSeeAllIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(article_See_All,10));
    }
    public static void verifyArticleTileIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(article_Tile,10));
    }
    public static void verifyTopViewedTileIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(topViewed_Tile,10));
    }
    public static void verifyTopViewedTitleIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(topViewed_Title,10));
    }
    public static void verifyDiscoverBadgeIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(discover_Badge,10));
    }
    public static void verifyRecentlyViewBadgeIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(recentlyViewed_Badge,10));
    }
    public static void verifyQuizChoiceIsPresentOnScreen(){
        int numberOfQuiz = getSizeofObject("questionsData","data","total_quizzes");
        if(numberOfQuiz > 0) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(quiz_Choice, 10));
        }
    }
    public static void verifyPollChoiceIsPresentOnScreen(){
        int numberOfPolls = getSizeofObject("questionsData","data","total_polls");
        if(numberOfPolls > 0) {
            Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(poll_Choice, 10));
        }
    }
    public static void verifyMatchesIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found", waitUntilElementDisplayed(matches_Tile, 10));
    }
    public static void verifyTopViewedCreaterIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(topViewed_Creater,10));
    }
    public static void verifyNewsTitleIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(news_Title,10));
    }
    public static void verifyNewsMainTitleIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(news_main_Title,10));
    }
    public static void verifyNewsMainDescriptionIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(news_main_Description,10));
    }
    public static void verifyOtherNewsIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(other_news_Link,10));
    }
    public static void verifyBackButtonIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(back_Button,10));
    }
    public static void verifyNewsDescriptionIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(news_Description,10));
    }
    public static void verifyNewsCreaterIsPresentOnScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(news_Creater,10));
    }
    public static void verifyTopBannerIsPresentOnTopOfScreen(){
        Assert.assertTrue("Element Not Found",waitUntilElementDisplayed(topBanner_Alignment,10));
    }
    public static void verifyTopBannerCount(String countOfElements){
        Assert.assertEquals(getCount(topBanner_Count),countOfElements);
    }
    public static void verifyArticlesCount(String countOfElements){
        Assert.assertEquals(getCount(article_Title_Count),countOfElements);
    }
    public static void verifyTopBannerCountIsGreater(String countOfElements){
        Boolean flag = false;
        String actualCount = getCount(topBanner_Count);
        if(Integer.parseInt(actualCount) > Integer.parseInt(countOfElements)){
            flag = true;
        }

        Assert.assertTrue("Count of Top banner is less",flag);
    }

    public static void verifyUserClickOn(String button){
        if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("web".toUpperCase())) {
            switch (button.toUpperCase()) {
                case "HOME":
                    waitUntilElementClickable(homePageWeb);
                    click(homePageWeb);
                    break;
                case "WALLET":
                    waitUntilElementClickable(walletWeb);
                    click(walletWeb);
                    break;
                case "ACCOUNT":
                    waitUntilElementClickable(accountWeb);
                    click(accountWeb);
                    break;
                case "MARKET":
                    waitUntilElementClickable(marketWeb);
                    click(marketWeb);
                    break;
            }
        }
        else if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("mobile".toUpperCase())) {
            switch (button.toUpperCase()) {
                case "ACCOUNT":
                    waitUntilElementClickable(accountButtonMobile);
                    click(accountButtonMobile);
                    break;
        }
    }}
    public static void verifyTopBannerCountIsLesser(String countOfElements){
        Boolean flag = false;
        String actualCount = getCount(topBanner_Count);
        if(Integer.parseInt(actualCount) <= Integer.parseInt(countOfElements)){
            flag = true;
        }

        Assert.assertTrue("Count of Top banner is less",flag);
    }
    public static void verifySwipeActionTopBanner(String direction){
        boolean flag = false;
        String firstID = getAttributeValue(topBanner_Image_1,"resourceId");
        flag = swipeElementAndroidHorizontal(topBanner_Image_1,direction.toUpperCase());
        String secondID = getAttributeValue(topBanner_Image_1,"resourceId");
        Assert.assertNotEquals(firstID,secondID);
    }
    public static void verifySwipeActionTopViewed(String direction){
        String firstID = getAttributeValue(topViewed_Tile,"resourceId");
        swipeNewsElementAndroidHorizontal(topViewed_Tile,direction.toUpperCase());
        String secondID = getAttributeValue(topViewed_Tile,"resourceId");
        Assert.assertNotEquals(firstID,secondID);
    }


    public static void verifySwipeActionTopViewedCount(String direction,String countOfTopViewed){
        boolean flag = false;
        int count = Integer.parseInt(countOfTopViewed);
        String[] idArray = new String[count];
        for (int i = 0; i < count ;i++){
            if(i==count-1){
                idArray[i] = getAttributeValue(topViewed_Tile_End,"resourceId");
            }
            else{
                idArray[i] = getAttributeValue(topViewed_Tile,"resourceId");
            }
            swipeNewsElementAndroidHorizontal(topViewed_Tile,direction.toUpperCase());
        }
        Assert.assertEquals(true,stringArrayDuplicates(idArray));
    }
    public static void verifySwipeActionTopBannerCount(String direction,String fileName){
        boolean flag = false;
        int numberOfCarousal =  getSizeofRecords(fileName,"data");
        String firstID = getAttributeValue(topBanner_Image_1,"resourceId");
        flag = swipeElementAndroidHorizontalCounted(topBanner_Image_1,direction.toUpperCase(),numberOfCarousal);
        String secondID = getAttributeValue(topBanner_Image_1,"resourceId");
        Assert.assertEquals(firstID,secondID);
    }
    public static void verifyTopBannerAccordingToFile(String fileName){
        boolean flag = false;
        String idOfBanner = "";
        String titleOfBanner = "";
        String typeOfBanner = "";
        String bannerTypeOfBanner = "";
        int countOfTopBannersInFile = getSizeofRecords(fileName,"data");
        int countOfElementsOnScreen = Integer.parseInt(getCount(topBanner_Count));
        Assert.assertEquals(countOfTopBannersInFile,countOfElementsOnScreen);
        JSONArray arrayForData = getJsonArray("bannersData","data","records");
        for(int i = 0; i < countOfTopBannersInFile; i++){
            JSONObject tempObj = (JSONObject) arrayForData.get(i);
            bannerTypeOfBanner = tempObj.get("model_name").toString();
            JSONObject contentObj = (JSONObject) tempObj.get("content_info");
            idOfBanner = contentObj.get("id").toString();
            titleOfBanner = contentObj.get("title").toString();
            contentObj = (JSONObject) contentObj.get("child_category");
            typeOfBanner = contentObj.get("name").toString();
            Assert.assertEquals(true,waitUntilElementDisplayed(getTopBannerTitleElement(titleOfBanner),5));
            Assert.assertEquals(true,waitUntilElementDisplayed(getTopBannerIdElement(idOfBanner),5));
            Assert.assertEquals(true,waitUntilElementDisplayed(getTopBannerTypeElement(typeOfBanner),5));
            click(getTopBannerTitleElement(titleOfBanner));
            if(bannerTypeOfBanner.toLowerCase().equals("Article".toLowerCase())){
                Assert.assertEquals(true,waitUntilElementDisplayed(back_Button,5));
                Assert.assertEquals(true,waitUntilElementDisplayed(share_Button,5));
                Assert.assertEquals(typeOfBanner.toLowerCase(),getText(main_Label).toLowerCase());
                Assert.assertEquals(titleOfBanner.toLowerCase(),getText(main_Title).toLowerCase());
                Assert.assertEquals(false,waitForInvisibilityOfElement(home_Button));
                click(back_Button);
            }
            else if(bannerTypeOfBanner.toLowerCase().equals("Media".toLowerCase())){
                Assert.assertEquals(true,waitUntilElementDisplayed(back_Button,5));
                Assert.assertEquals(true,waitUntilElementDisplayed(share_Button,5));
                Assert.assertEquals(true,waitUntilElementDisplayed(play_Button,5));
                Assert.assertEquals(titleOfBanner.toLowerCase(),getText(main_Title).toLowerCase());
                Assert.assertEquals(false,waitForInvisibilityOfElement(home_Button));
                click(back_Button);
            }
            else if(bannerTypeOfBanner.toLowerCase().equals("News".toLowerCase())){
                Assert.assertEquals(true,waitUntilElementDisplayed(back_Button,5));
                Assert.assertEquals(true,waitUntilElementDisplayed(other_news_Link,5));
                Assert.assertEquals(false,waitForInvisibilityOfElement(home_Button));
                //Assert.assertEquals(titleOfBanner.toLowerCase(),getText(news_main_Title).toLowerCase());
                click(back_Button);
            }
            else {

            }
            swipeElementAndroidHorizontal(topBanner_Image_1,"LEFT");
        }
    }
    public static void verifyNewsAccordingToFile(String fileName){
        boolean flag = false;
        String idOfNews = "";
        String titleOfNews = "";
        String newsDescription = "";
        String newsCreater = "";
        JSONArray arrayForData = getJsonArray(fileName,"data","records");
        for(int i = 0; i < 5; i++){
            JSONObject tempObj = (JSONObject) arrayForData.get(i);
            idOfNews = tempObj.get("id").toString();
            JSONArray tempArray = (JSONArray) tempObj.get("news_slides");
            JSONObject contentObj = (JSONObject) tempArray.get(0);
            titleOfNews = contentObj.get("title").toString();
            newsDescription = contentObj.get("description").toString();
            newsCreater = contentObj.get("name").toString();
            if(newsCreater.equals("")){

            }
            else {
                Assert.assertEquals(true, waitUntilElementDisplayed(getNewsTitleElement(titleOfNews), 5));
                Assert.assertEquals(true, waitUntilElementDisplayed(getNewsIdElement(idOfNews), 5));
                Assert.assertEquals(true, waitUntilElementDisplayed(getNewsDescriptionElement(newsDescription), 5));
                //Assert.assertEquals(true, waitUntilElementDisplayed(getNewsCreaterElement(newsCreater), 5));
                click(getNewsTitleElement(titleOfNews));

                Assert.assertEquals(true, waitUntilElementDisplayed(back_Button, 5));
                Assert.assertEquals(true, waitUntilElementDisplayed(other_news_Link, 5));
                Assert.assertEquals(titleOfNews.toLowerCase(),getText(news_main_Title).toLowerCase());
                Assert.assertEquals(newsDescription.toLowerCase(),getText(news_main_Description).toLowerCase());
                Assert.assertEquals(false, waitForInvisibilityOfElement(home_Button));
                click(back_Button);
            }
            swipeNewsElementAndroidHorizontal(getNewsIdElement(idOfNews),"LEFT");
        }
    }
    public static void verify6thNewsAccordingToFile(String fileName){
        boolean flag = false;
        String idOfNews = "";
        String titleOfNews = "";
        String newsDescription = "";
        String newsCreater = "";
        JSONArray arrayForData = getJsonArray(fileName,"data","records");
        JSONObject tempObj = (JSONObject) arrayForData.get(5);
        idOfNews = tempObj.get("id").toString();
        JSONArray tempArray = (JSONArray) tempObj.get("news_slides");
        JSONObject contentObj = (JSONObject) tempArray.get(0);
        titleOfNews = contentObj.get("title").toString();
        newsDescription = contentObj.get("description").toString();
        newsCreater = contentObj.get("name").toString();
        if(newsCreater.equals("")){

        }
        else {
            click(getNewsIdElement(idOfNews));
            Assert.assertEquals(true, waitUntilElementDisplayed(back_Button, 5));
            Assert.assertEquals(true, waitUntilElementDisplayed(other_news_Link, 5));
            Assert.assertEquals(titleOfNews.toLowerCase(),getText(news_main_Title).toLowerCase());
            Assert.assertEquals(newsDescription.toLowerCase(),getText(news_main_Description).toLowerCase());
            Assert.assertEquals(false, waitForInvisibilityOfElement(home_Button));
        }
    }
    public static void verifyQuizAccordingToFile(String fileName){
        boolean flag = false;
        String idOfQuiz = "";
        String questionOfQuiz = "";
        String answerID = "";
        String answerText = "";
        int numberOfQuiz = getSizeofObject("questionsData","data","total_quizzes");
        if(numberOfQuiz > 0) {
            JSONArray arrayForData = getJsonArray(fileName, "data", "records");
            for (int i = 0; i < arrayForData.size(); i++) {
                JSONObject tempObj = (JSONObject) arrayForData.get(i);
                if (tempObj.get("question_type").toString().toUpperCase().equals("QUIZ")) {
                    idOfQuiz = tempObj.get("id").toString();
                    questionOfQuiz = tempObj.get("question").toString();
                    Assert.assertEquals(true, waitUntilElementDisplayed(getQuizTileElement(idOfQuiz), 5));
                    Assert.assertEquals(true, waitUntilElementDisplayed(getQuizImageElement(idOfQuiz), 5));
                    Assert.assertEquals(true, waitUntilElementDisplayed(getQuizQuestionElement(idOfQuiz), 5));
                    Assert.assertEquals(true, waitUntilElementDisplayed(getQuizQuestionTextElement(questionOfQuiz), 5));
                    JSONArray tempArray = (JSONArray) tempObj.get("answers");
                    for (int j = 0; j < tempArray.size(); j++) {
                        JSONObject contentObj = (JSONObject) tempArray.get(j);
                        answerID = contentObj.get("id").toString();
                        answerText = contentObj.get("answer").toString().toUpperCase();
                        Assert.assertEquals(true, waitUntilElementDisplayed(getQuizAnswerElement(answerID), 5));
                        Assert.assertEquals(true, waitUntilElementDisplayed(getQuizAnswerTextElement(answerText), 5));
                    }
                    break;
                }
            }
        }
    }
    public static void answerOneQuizAccordingToFile(String fileName){
        boolean flag = false;
        int numberOfQuiz = getSizeofObject(fileName,"data","total_quizzes");
        String answerID = "";
        JSONArray arrayForData = getJsonArray(fileName,"data","records");
        if(numberOfQuiz > 0) {
            for (int i = 0; i < arrayForData.size(); i++) {
                JSONObject tempObj = (JSONObject) arrayForData.get(i);
                if (tempObj.get("question_type").toString().toUpperCase().equals("QUIZ")) {
                    JSONArray tempArray = (JSONArray) tempObj.get("answers");
                    JSONObject contentObj = (JSONObject) tempArray.get(0);
                    answerID = contentObj.get("id").toString();
                    waitUntilElementDisplayed(getQuizAnswerElement(answerID), 5);
                    click(getQuizAnswerElement(answerID));
                    if(numberOfQuiz > 1){
                        contentObj = (JSONObject) tempArray.get(1);
                        answerID = contentObj.get("id").toString();
                        Assert.assertTrue("Multiple Quiz is not showing ",waitUntilElementDisplayed(getQuizAnswerElement(answerID),5));
                        break;
                    }
                    else {
                        Assert.assertTrue("Quiz Summary Element is not present", waitUntilElementDisplayed(quiz_Summary_Text, 5));
                        break;
                    }
                }
            }
        }
        else {
            Assert.assertTrue("Quiz Summary Element is not present", waitUntilElementDisplayed(quiz_Summary_Text, 5));
        }
    }
    public static void answerMultipleQuestionsAccordingToFile(String fileName,String task){
        boolean flag = false;
        String questionType ="";
        String questionTypeJsonElement ="";
        if(task.toUpperCase().equals("POLL")){
            questionType = "POLL";
            questionTypeJsonElement = "total_polls";
        }else if(task.toUpperCase().equals("QUIZ")){
            questionType = "QUIZ";
            questionTypeJsonElement = "total_quizzes";
        }
        else {
            Assert.assertTrue("Required task is not right",false);
        }
        int numberOfQuestions = getSizeofObject(fileName,"data",questionTypeJsonElement);
        String answerID = "";
        int count =0;
        JSONArray arrayForData = getJsonArray(fileName,"data","records");
        if(numberOfQuestions > 0) {
            for (int i = 0; i < arrayForData.size(); i++) {
                JSONObject tempObj = (JSONObject) arrayForData.get(i);
                if (tempObj.get("question_type").toString().toUpperCase().equals(questionType)) {
                    JSONArray tempArray = (JSONArray) tempObj.get("answers");
                    JSONObject contentObj = (JSONObject) tempArray.get(0);
                    answerID = contentObj.get("id").toString();
                    if(questionType.equals("QUIZ")){
                        waitUntilElementDisplayed(getQuizAnswerElement(answerID), 10);
                        click(getQuizAnswerElement(answerID));
                    }else if(questionType.equals("POLL")){
                        waitUntilElementDisplayed(getPollAnswerElement(answerID), 10);
                        click(getPollAnswerElement(answerID));
                    }
                    else {
                        Assert.assertTrue("Required task is not right",false);
                    }
                    try {
                        Thread.sleep(5000);
                    }
                    catch (Exception ex){

                    }
/*                    if(count == numberOfQuestions-1){
                        if(questionType.equals("QUIZ")){
                            Assert.assertTrue("Quiz Summary Element is not present", waitUntilElementDisplayed(quiz_Summary_Text, 5));
                        }else if(questionType.equals("POLL")){
                            Assert.assertTrue("Poll Summary Element is not present", waitUntilElementDisplayed(poll_Summary_Text, 5));
                        }
                        else {
                            Assert.assertTrue("Required task is not right",false);
                        }
                    }
                    count++;*/
                }
            }
        }
        else {
            if(questionType.equals("QUIZ")){
                Assert.assertTrue("Quiz is not present", true);
            }else if(questionType.equals("POLL")){
                Assert.assertTrue("Poll is not present", true);
            }
            else {
                Assert.assertTrue("Required task is not right",false);
            }
        }
    }
    public static void answerRightMultipleQuestionsAccordingToFile(String fileName,String task,String answerMode){
        boolean flag = false;
        String questionType ="";
        String questionTypeJsonElement ="";
        String answerType = "";
        if(task.toUpperCase().equals("POLL")){
            questionType = "POLL";
            questionTypeJsonElement = "total_polls";
        }else if(task.toUpperCase().equals("QUIZ")){
            questionType = "QUIZ";
            questionTypeJsonElement = "total_quizzes";
        }
        else {
            Assert.assertTrue("Required task is not right",false);
        }
        if(answerMode.toUpperCase().equals("RIGHT")){
            answerType = "right_answer";
        }
        else if(answerMode.toUpperCase().equals("WRONG")){
            answerType = "wrong_answer_";
        }
        else if(answerMode.toUpperCase().equals("RANDOM")){
            answerType = "_answer_";
        }
        else{
            answerType = "_answer_";
        }
        int numberOfQuestions = getSizeofObject(fileName,"data",questionTypeJsonElement);
        String answerID = "";
        int count =0;
        JSONArray arrayForData = getJsonArray(fileName,"data","records");
        if(numberOfQuestions > 0) {
            for (int i = 0; i < arrayForData.size(); i++) {
                JSONObject tempObj = (JSONObject) arrayForData.get(i);
                if (tempObj.get("question_type").toString().toUpperCase().equals(questionType)) {
                    JSONArray tempArray = (JSONArray) tempObj.get("answers");
                    for(int k = 0; k < tempArray.size(); k++){
                        JSONObject contentObj = (JSONObject) tempArray.get(k);
                        if(contentObj.get("answer_type").toString().contains(answerType)){
                            answerID = contentObj.get("id").toString();
                            break;
                        }
                    }

                    if(questionType.equals("QUIZ")){
                        waitUntilElementDisplayed(getQuizAnswerElement(answerID), 10);
                        click(getQuizAnswerElement(answerID));
                    }else if(questionType.equals("POLL")){
                        waitUntilElementDisplayed(getPollAnswerElement(answerID), 10);
                        click(getPollAnswerElement(answerID));
                    }
                    else {
                        Assert.assertTrue("Required task is not right",false);
                    }
                    try {
                        Thread.sleep(5000);
                    }
                    catch (Exception ex){

                    }
                   /* if(count == numberOfQuestions-1){
                        if(questionType.equals("QUIZ")){
                            Assert.assertTrue("Quiz Summary Element is not present", waitUntilElementDisplayed(quiz_Summary_Text, 5));
                        }else if(questionType.equals("POLL")){
                            Assert.assertTrue("Poll Summary Element is not present", waitUntilElementDisplayed(poll_Summary_Text, 5));
                        }
                        else {
                            Assert.assertTrue("Required task is not right",false);
                        }
                    }
                    count++;*/
                }
            }
        }
        else {
            if(questionType.equals("QUIZ")){
                Assert.assertTrue("Quiz Element is not present", true);
            }else if(questionType.equals("POLL")){
                Assert.assertTrue("Poll Element is not present", true);
            }
            else {
                Assert.assertTrue("Required task is not right",false);
            }
        }
    }
    public static void answerMultipleQuizAccordingToFile(String fileName){
        boolean flag = false;
        int numberOfQuiz = getSizeofObject(fileName,"data","total_quizzes");
        String answerID = "";
        JSONArray arrayForData = getJsonArray(fileName,"data","records");
        if(numberOfQuiz > 0) {
            for (int i = 0; i < arrayForData.size(); i++) {
                JSONObject tempObj = (JSONObject) arrayForData.get(i);
                if (tempObj.get("question_type").toString().toUpperCase().equals("QUIZ")) {
                    JSONArray tempArray = (JSONArray) tempObj.get("answers");
                    JSONObject contentObj = (JSONObject) tempArray.get(0);
                    answerID = contentObj.get("id").toString();
                    if(numberOfQuiz > 1) {
                        click(quiz_Summary_Arrow_Text);
                    }
                    Assert.assertTrue("Quiz Answer is not moving forward",waitUntilElementDisplayed(getQuizAnswerElement(answerID), 5));
                }
            }
        }
        else {
            Assert.assertTrue("Quiz Element is not present", true);
        }
    }
    public static void checkMultipleQuizAccordingToFile(String fileName,String answerMode){
        boolean flag = false;
        int numberOfQuiz = getSizeofObject(fileName,"data","total_quizzes");
        String answerID = "";
        JSONArray arrayForData = getJsonArray(fileName,"data","records");
        if(numberOfQuiz > 0) {
            for (int i = 0; i < arrayForData.size(); i++) {
                JSONObject tempObj = (JSONObject) arrayForData.get(i);
                if (tempObj.get("question_type").toString().toUpperCase().equals("QUIZ")) {
                    JSONArray tempArray = (JSONArray) tempObj.get("answers");
                    JSONObject contentObj = (JSONObject) tempArray.get(0);
                    answerID = contentObj.get("id").toString();
                    click(quiz_Summary_Arrow_Text);
                    Assert.assertTrue("Quiz Answer is not moving forward",waitUntilElementDisplayed(getQuizAnswerElement(answerID), 5));
                }
            }
        }
        else {
            Assert.assertTrue("Quiz Summary Element is not present", waitUntilElementDisplayed(quiz_Summary_Text, 5));
        }
    }
    public static void answerMultiplePollsAccordingToFile(String fileName){
        boolean flag = false;
        int numberOfPolls = getSizeofObject(fileName,"data","total_polls");
        String answerID = "";
        JSONArray arrayForData = getJsonArray(fileName,"data","records");
        if(numberOfPolls > 0) {
            for (int i = 0; i < arrayForData.size(); i++) {
                JSONObject tempObj = (JSONObject) arrayForData.get(i);
                if (tempObj.get("question_type").toString().toUpperCase().equals("POLL")) {
                    JSONArray tempArray = (JSONArray) tempObj.get("answers");
                    JSONObject contentObj = (JSONObject) tempArray.get(0);
                    answerID = contentObj.get("id").toString();
                    if(numberOfPolls > 1) {
                        click(poll_Summary_Arrow_Text);
                    }

                    Assert.assertTrue("Poll Answer is not moving forward",waitUntilElementDisplayed(getPollAnswerElement(answerID), 5));
                }
            }
        }
        else {
            Assert.assertTrue("Poll Element is not present", true);
        }
    }
    public static void reviewingQuizCount(String fileName){
        boolean flag = false;
        int numberOfQuiz = getSizeofObject(fileName,"data","total_quizzes");
        String answerID = "";
        int count = 1;
        JSONArray arrayForData = getJsonArray(fileName,"data","records");
        if(numberOfQuiz > 0) {
            for (int i = 0; i < arrayForData.size(); i++) {
                JSONObject tempObj = (JSONObject) arrayForData.get(i);
                if (tempObj.get("question_type").toString().toUpperCase().equals("QUIZ")) {
                    JSONArray tempArray = (JSONArray) tempObj.get("answers");
                    JSONObject contentObj = (JSONObject) tempArray.get(0);
                    answerID = contentObj.get("id").toString();
                    if(numberOfQuiz > 1) {
                        click(quiz_Summary_Arrow_Text);
                        waitUntilElementDisplayed(getQuizAnswerElement(answerID), 5);
                        Assert.assertTrue("Quiz Answer Count is not correct",waitUntilElementDisplayed(getQuizCountElement(count+" / "+numberOfQuiz), 5));
                        count++;
                    }
                }
            }
        }
        else {
            Assert.assertTrue("Quiz Element is not present", true);
        }
    }
    public static void shareQuestion(String screen, String user){
        boolean flag = false;
        String fileName = "questionsData";
        String jsonElementCount = "";
        String nameOfAction = "";
        if(screen.toUpperCase().equals("QUIZ")){
            jsonElementCount = "total_quizzes";
            nameOfAction = "Check out the Quizzes on the 433 App";
        }
        else if(screen.toUpperCase().equals("POLL")){
            jsonElementCount = "total_polls";
            nameOfAction = "Check out the Polls on the 433 App";
        }
        else{
            Assert.assertTrue("Required action is not present : "+screen,false);
        }
        int numberOfQuestion = getSizeofObject(fileName,"data",jsonElementCount);
        if(numberOfQuestion > 1) {
            if(screen.toUpperCase().equals("QUIZ")){
                click(quiz_Summary_Arrow_Text);
                waitUntilElementDisplayed(quiz_Summary_Footer_Text,5);
                click(quiz_Summary_Footer_Text);
                waitUntilElementDisplayed(sharing_Main_Heading,5);
            }
            else if(screen.toUpperCase().equals("POLL")){
                click(poll_Summary_Arrow_Text);
                waitUntilElementDisplayed(poll_Summary_Sharing_Button,5);
                click(poll_Summary_Sharing_Button);
                waitUntilElementDisplayed(sharing_Main_Heading,5);
            }
            if(getText(sharing_Main_Heading).contains(nameOfAction)){
                Assert.assertTrue("Condition matched",true);
            }
            else {
                Assert.assertTrue("Main heading do not contains : "+getText(sharing_Main_Heading),false);
            }
          Assert.assertTrue("Share Main Heading is not present",waitUntilElementDisplayed(sharing_Main_Heading,5));
          Assert.assertTrue("Copy Button is not present",waitUntilElementDisplayed(sharing_Copy_Button,5));
          Assert.assertTrue("Nearby button is not present",waitUntilElementDisplayed(sharing_Nearby_Button,5));
          Assert.assertTrue("Sharing Icons are not present",waitUntilElementDisplayed(sharing_Icon_Button,5));
        }
        else {
            Assert.assertTrue("Questions Element is not present", true);
        }
    }
    public static void reviewingPollCount(String fileName){
        boolean flag = false;
        int numberOfPolls = getSizeofObject(fileName,"data","total_polls");
        String answerID = "";
        int count = 1;
        JSONArray arrayForData = getJsonArray(fileName,"data","records");
        if(numberOfPolls > 0) {
            for (int i = 0; i < arrayForData.size(); i++) {
                JSONObject tempObj = (JSONObject) arrayForData.get(i);
                if (tempObj.get("question_type").toString().toUpperCase().equals("POLL")) {
                    JSONArray tempArray = (JSONArray) tempObj.get("answers");
                    JSONObject contentObj = (JSONObject) tempArray.get(0);
                    answerID = contentObj.get("id").toString();
                    if(numberOfPolls > 1) {
                        click(poll_Summary_Arrow_Text);
                        waitUntilElementDisplayed(getPollAnswerElement(answerID), 5);
                        Assert.assertTrue("Poll Answer Count is not correct",waitUntilElementDisplayed(getQuizCountElement(count+" / "+numberOfPolls), 5));
                        count++;
                    }
                }
            }
        }
        else {
            Assert.assertTrue("Poll Element is not present", true);
        }
    }
    public static void verifyLeaguesHeader(String fileName){
        int count = 1;
        JSONArray arrayForData = getJsonArray(fileName,"data","leagues");
            for (int i = 0; i < arrayForData.size(); i++) {
                JSONObject tempObj = (JSONObject) arrayForData.get(i);
                JSONArray tempArray = (JSONArray) tempObj.get("name");
                JSONObject contentObj = (JSONObject) tempArray.get(0);
                   /* answerID = contentObj.get("id").toString();
                   // if(numberOfPolls > 1) {
                        click(poll_Summary_Arrow_Text);
                        waitUntilElementDisplayed(getPollAnswerElement(answerID), 5);
                        Assert.assertTrue("Poll Answer Count is not correct",waitUntilElementDisplayed(getQuizCountElement(count+" / "+numberOfPolls), 5));
                        count++;
                    }*/
            }
    }
    public static void verifyPollAccordingToFile(String fileName){
        boolean flag = false;
        String idOfPoll = "";
        String questionOfPoll = "";
        String answerID = "";
        String answerText = "";
        int numberOfPolls = getSizeofObject("questionsData","data","total_polls");
        if(numberOfPolls > 0) {
            JSONArray arrayForData = getJsonArray(fileName, "data", "records");
            for (int i = 0; i < arrayForData.size(); i++) {
                JSONObject tempObj = (JSONObject) arrayForData.get(i);
                if (tempObj.get("question_type").toString().toUpperCase().equals("POLL")) {
                    idOfPoll = tempObj.get("id").toString();
                    questionOfPoll = tempObj.get("question").toString();
                    Assert.assertEquals(true, waitUntilElementDisplayed(getPollTileElement(idOfPoll), 5));
                    Assert.assertEquals(true, waitUntilElementDisplayed(getPollImageElement(idOfPoll), 5));
                    Assert.assertEquals(true, waitUntilElementDisplayed(getPollQuestionElement(idOfPoll), 5));
                    Assert.assertEquals(true, waitUntilElementDisplayed(getPollQuestionTextElement(questionOfPoll), 5));
                    JSONArray tempArray = (JSONArray) tempObj.get("answers");
                    for (int j = 0; j < tempArray.size(); j++) {
                        JSONObject contentObj = (JSONObject) tempArray.get(j);
                        answerID = contentObj.get("id").toString();
                        answerText = contentObj.get("answer").toString().toUpperCase();
                        Assert.assertEquals(true, waitUntilElementDisplayed(getPollAnswerElement(answerID), 5));
                        Assert.assertEquals(true, waitUntilElementDisplayed(getPollAnswerTextElement(answerText), 5));
                    }
                    break;
                }
            }
        }
        else {
            Assert.assertTrue("No Polls are present :",true);
        }
    }
    public static void verifyQuizSummaryScreen(){
        int numberOfQuiz = getSizeofObject("questionsData","data","total_quizzes");
        if(numberOfQuiz > 1) {
            Assert.assertEquals(true, waitUntilElementDisplayed(quiz_SummaryShort_Text, 5));
            Assert.assertEquals(true, waitUntilElementDisplayed(quiz_Summary_Right_Text, 5));
            Assert.assertEquals(true, waitUntilElementDisplayed(quiz_Summary_Wrong_Text, 5));
            Assert.assertEquals(true, waitUntilElementDisplayed(quiz_Summary_Footer_Text, 5));
        }
    }
    public static void verifyQuestionSummaryScreenAccordingToFile(String fileName,String answerMode){
        int numberOfQuestions = 0;
        String mainObject = "";
        String summaryTextObject = "";
        String summaryText = "";
        String rightAnswerText = "0";
        String wrongAnswerText = "0";
        if(answerMode.toUpperCase().equals("RIGHT")){
            numberOfQuestions = getSizeofObject(fileName,"data","total_quizzes");
            mainObject = "result_summery_quiz";
            summaryTextObject = "positive_results_title";
            rightAnswerText = String.valueOf(numberOfQuestions);
        }
        else if(answerMode.toUpperCase().equals("WRONG")){
            numberOfQuestions = getSizeofObject(fileName,"data","total_quizzes");
            mainObject = "result_summery_quiz";
            summaryTextObject = "negative_results_title";
            wrongAnswerText = String.valueOf(numberOfQuestions);
        }
        else if(answerMode.toUpperCase().equals("POLL")){
            numberOfQuestions = getSizeofObject(fileName,"data","total_polls");
            mainObject = "result_summery_poll";
            summaryTextObject = "results_title";
        }
        else{
            Assert.assertTrue("Summary verification failed due to answer mode is not correct :"+answerMode,false);
        }
        if(numberOfQuestions > 1) {
            JSONObject jsonObjectForData = getJsonObject(fileName, "data", mainObject);
            summaryText = jsonObjectForData.get(summaryTextObject).toString();
            if (answerMode.toUpperCase().equals("POLL")) {
                Assert.assertEquals(getText(poll_Summary_Text), summaryText);
            } else {
                Assert.assertEquals(getText(quiz_Summary_Text), summaryText);
                Assert.assertEquals(getText(quiz_Summary_Right_Count), rightAnswerText);
                Assert.assertEquals(getText(quiz_Summary_Wrong_Count), wrongAnswerText);
            }
        }
        else{
            Assert.assertTrue("No of questions is : "+numberOfQuestions,true);
        }
    }
    public static void verifyQuestionAnsweredScreenAccordingToFile(String fileName,String task){
        boolean flag = false;
        String questionType ="";
        String questionTypeJsonElement ="";
        if(task.toUpperCase().equals("POLL")){
            questionType = "POLL";
            questionTypeJsonElement = "total_polls";
        }else if(task.toUpperCase().equals("QUIZ")){
            questionType = "QUIZ";
            questionTypeJsonElement = "total_quizzes";
        }
        else {
            Assert.assertTrue("Required task is not right",false);
        }
        int numberOfQuestions = getSizeofObject(fileName,"data",questionTypeJsonElement);
        String answerID = "";
        int count =0;
        JSONArray arrayForData = getJsonArray(fileName,"data","records");
        if(numberOfQuestions > 0) {
            for (int i = 0; i < arrayForData.size(); i++) {
                JSONObject tempObj = (JSONObject) arrayForData.get(i);
                if (tempObj.get("question_type").toString().toUpperCase().equals(questionType)) {
                    if(numberOfQuestions > 1){
                        click(quiz_Summary_Arrow_Text);
                    }

                    JSONArray tempArray = (JSONArray) tempObj.get("answers");
                    for(int k = 0; k < tempArray.size(); k++){
                        JSONObject contentObj = (JSONObject) tempArray.get(k);
                        if(questionType.equals("QUIZ")){
                            if(contentObj.get("answer_type").toString().contains("right_answer")){
                                answerID = contentObj.get("id").toString();
                                Assert.assertTrue("Quiz Right Icon is not present",waitUntilElementDisplayed(getQuizRightAnswerIconElement(answerID),5));
                            }
                            else {
                                answerID = contentObj.get("id").toString();
                                Assert.assertTrue("Quiz Wrong Icon is not present",waitUntilElementDisplayed(getQuizWrongAnswerIconElement(answerID),5));
                            }
                        }else if(questionType.equals("POLL")){
                            answerID = contentObj.get("id").toString();
                            Assert.assertTrue("Poll Percentage is not present",waitUntilElementDisplayed(getPollPercentageIconElement(answerID),5));
                        }
                        else {
                            Assert.assertTrue("Required task is not right",false);
                        }

                    }
                    /*if(count == numberOfQuestions-1){
                        if(questionType.equals("QUIZ")){
                            Assert.assertTrue("Quiz Summary Element is not present", waitUntilElementDisplayed(quiz_Summary_Text, 5));
                        }else if(questionType.equals("POLL")){
                            Assert.assertTrue("Poll Summary Element is not present", waitUntilElementDisplayed(poll_Summary_Text, 5));
                        }
                        else {
                            Assert.assertTrue("Required task is not right",false);
                        }
                    }
                    count++;*/
                }
            }
        }
        else {
            if(questionType.equals("QUIZ")){
                Assert.assertTrue("Quiz is not present", true);
            }else if(questionType.equals("POLL")){
                Assert.assertTrue("Poll is not present", true);
            }
            else {
                Assert.assertTrue("Required task is not right",false);
            }
        }
    }
    public static void verifyPollSummaryScreen(){
        int numberOfPolls = getSizeofObject("questionsData","data","total_polls");
        if(numberOfPolls > 1) {
            Assert.assertEquals(true, waitUntilElementDisplayed(poll_Summary_Text, 5));
            Assert.assertEquals(true, waitUntilElementDisplayed(poll_SummaryShort_Button, 5));
        }
    }
    public static void verifyMatchesLeagueScreen(){
        Assert.assertEquals(true, waitUntilElementDisplayed(matches_Star_Button, 5));
    }
    public static void verifyQuizSummaryArrow(){
        int numberOfQuiz = getSizeofObject("questionsData","data","total_quizzes");
        if(numberOfQuiz > 1) {
            Assert.assertEquals(true, waitUntilElementDisplayed(quiz_Summary_Arrow_Text, 5));
        }
    }
    public static void verifyTopBannerSwipeAccordingToCountOfCarousal(String direction){
        boolean flag = false;
        int numberOfCarousal = Integer.parseInt(getCount(topBanner_Count));
        if(numberOfCarousal <= 1){
            flag = swipeElementAndroidHorizontalCounted(topBanner_Image_1,direction.toUpperCase(),numberOfCarousal);
            Assert.assertEquals(flag,false);
        }
        else{
            flag = swipeElementAndroidHorizontalCounted(topBanner_Image_1,direction.toUpperCase(),numberOfCarousal);
            Assert.assertEquals(flag,true);
        }
    }
}

package com.fasset.automation.Hooks;

import ConfigFiles.Factory.ConfigFactory;
import io.cucumber.java.*;
import org.junit.AssumptionViolatedException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

import static ConfigFiles.Factory.ConfigFactory.getConfig;
import static Driver.Driver.quitDriver;
import static Driver.DriverManager.getDriver;

public class Hooks {


    public static boolean firstScenarioFailed = false;
    @BeforeAll
    public static void before_all(){
        firstScenarioFailed = false;
    }
    @Before
    public static void before(){
        if(firstScenarioFailed == true){
            throw new AssumptionViolatedException("The Essential scenario failed. Skipping further execution of this Feature.");
        }
    }
    @After("@Essential")
    public static void afterEssentialScenario(Scenario scenario){
        if(scenario.isFailed()){
            firstScenarioFailed = true;
        }
    }
    @After
    public static void afterScenario(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        else{

        }
        if(getConfig().PlatformType().toString() != "api"){
        quitDriver();
        }
    }
}

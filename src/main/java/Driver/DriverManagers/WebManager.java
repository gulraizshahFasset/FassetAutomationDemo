package Driver.DriverManagers;

import ConfigFiles.Factory.ConfigFactory;
import Driver.DriverFactories.DriverFactory;
import Driver.DriverManager;
import Driver.entity.WebDriverData;
import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static DataReader.EnvConfig.*;

import java.util.Objects;

import static ConfigFiles.Factory.ConfigFactory.getConfig;

public final class WebManager {
    private WebManager(){}

    public static void getDriver(){
        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().RemoteModeType());
            if(ConfigFactory.getConfig().PlatformType().toString().toUpperCase().equals("admin".toUpperCase()))
            {
                WebDriver driver =  DriverFactory.getDriverForAdmin(getConfig().RunMode()).getDriver(driverData);
                driver.manage().window().maximize();
                driver.get(adminUrl.get("url"));
                DriverManager.setDriver(driver);
            }
            else {
                WebDriver driver =  DriverFactory.getDriverForWeb(getConfig().RunMode()).getDriver(driverData);
                driver.manage().window().maximize();
                driver.get(webUrl.get("url"));
                DriverManager.setDriver(driver);
            }

        }
    }
}

package Driver.DriverManagers.mobile.local;

import ConfigFiles.Factory.ConfigFactory;
import ConfigFiles.enums.DeviceName;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public final class AndroidManager {
    private AndroidManager(){}
    public static AndroidDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP,"/Users/gulraizshah/Documents/appium-cashapp-development/Fasset-E2E-Test/apps/Android/Fasset.apk");
        capabilities.setCapability(MobileCapabilityType.VERSION,"14");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigFactory.getConfig().DeviceName());
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,90000);
        capabilities.setCapability("appPackage", "com.fasset.cashapp.dev");
        capabilities.setCapability("appActivity","com.fasset.cashapp.MainActivity");
        capabilities.setCapability("no-reset", false);
        capabilities.setCapability("full-reset", false);
        capabilities.setCapability("autoGrantPermissions", true);

        return new AndroidDriver(ConfigFactory.getConfig().localAppiumURL(),capabilities);
    }
}

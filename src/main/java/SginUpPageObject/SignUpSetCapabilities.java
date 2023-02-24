package SginUpPageObject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SignUpSetCapabilities {
    public static AndroidDriver<MobileElement> driver;
    @BeforeTest
    public void jumia_SetUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("deviceName","Android Emulator");
        dc.setCapability("appPackage","com.jumia.android");
        dc.setCapability("appActivity","com.mobile.splash.SplashScreenActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),dc);
    }
}

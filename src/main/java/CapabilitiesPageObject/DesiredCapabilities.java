package CapabilitiesPageObject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class DesiredCapabilities {
    public AndroidDriver<MobileElement> driver;
    @BeforeTest
    public void Android_SetUp() throws MalformedURLException {
        org.openqa.selenium.remote.DesiredCapabilities dc = new org.openqa.selenium.remote.DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("deviceName","Android Emulator");
        dc.setCapability("appPackage","com.jumia.android");
        dc.setCapability("appActivity","com.mobile.splash.SplashScreenActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),dc);
    }
}

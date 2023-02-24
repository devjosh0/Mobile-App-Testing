package SginUpPageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPageBase {
    public static final long WAIT=150;
    public AndroidTouchAction action;
    AppiumDriver driver;
    public SignUpPageBase(AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
        driver = appiumDriver;
    }
    //Creating wait for page visibility object
    public void WaitForVisibility(MobileElement element){
        WebDriverWait wait = new WebDriverWait(driver,WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    //Creating clear input field object
    public void ClearInputField(MobileElement element){
        WaitForVisibility(element);
        element.clear();
    }
    //Creating send Text into input field object
    public void SendTextObject(MobileElement element, String textInput){
        WaitForVisibility(element);
        element.setValue(textInput);
    }
    // Creating click button object
    public void ClickButtonObject(MobileElement element){
        WaitForVisibility(element);
        element.click();
    }
    //Creating scrollUp object
    public void ScrollUpObject(MobileElement element){
        AndroidTouchAction action = new AndroidTouchAction(driver);
        action.press(ElementOption.element(element))
                .waitAction()
                .moveTo(PointOption.point(0,-600))
                .release()
                .perform();
    }

}

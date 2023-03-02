package PageBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBaseObject {
    AppiumDriver driver;
    public final long WAIT = 500;
    public PageBaseObject(AppiumDriver appiumDriver){
        PageFactory.initElements( new AppiumFieldDecorator(appiumDriver),this);
        driver=appiumDriver;
    }
    public void waitforvisibility(MobileElement element){
        WebDriverWait wait = new WebDriverWait(driver,WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    //Creating clear input field object
    public void cleartextobject(MobileElement element){
        waitforvisibility(element);
        element.clear();
    }
    //Creating send Text into input field object
    public void sendtextobject(MobileElement element, String textInput){
        waitforvisibility(element);
        element.setValue(textInput);
    }
    // Creating click button object
    public void clickbuttonobject(MobileElement element){
       waitforvisibility(element);
        element.click();
    }
    //Creating scrollUp object
    public void scrollupobject(MobileElement element){
        AndroidTouchAction action = new AndroidTouchAction(driver);
        action.press(ElementOption.element(element))
                .waitAction()
                .moveTo(PointOption.point(0,-600))
                .release()
                .perform();
    }
    public void scrollsideObject(MobileElement element){
        AndroidTouchAction action = new AndroidTouchAction(driver);
        action.press(ElementOption.element(element))
                .waitAction()
                .moveTo(PointOption.point(-600,0))
                .release()
                .perform();
    }

}

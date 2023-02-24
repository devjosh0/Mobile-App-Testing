package AddItemsToCart;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCartPageBase {
    public final long WAIT = 500;
 AppiumDriver driver;


    public  AddCartPageBase(AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
        driver=appiumDriver;
    }
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
    public void ScrollSide(MobileElement element){
        AndroidTouchAction action = new AndroidTouchAction(driver);
        action.press(ElementOption.element(element))
                .waitAction()
                .moveTo(PointOption.point(-600,0))
                .release()
                .perform();
    }
    public void ScrollUpObject1(MobileElement element){
        AndroidTouchAction action = new AndroidTouchAction(driver);
        action.press(ElementOption.element(element))
                .waitAction()
                .moveTo(PointOption.point(0,-2300))
                .release()
                .perform();
    }
}

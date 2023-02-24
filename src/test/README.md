
# Exploratory Test on Jumia Mobile App

In this project we're going to perform exploratory testing on the Jumia app.


## Author

- Hussein Amadu



## Project Features

- Signup as a new user
- Login 
- Add Items to cart
- View Items in cart


## SignUp Page Base Object
- This phase contains objects actions that will be inherited in the test run.

```java
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

```


- WaitForVisibility; this object perform wait action on the current displayed elelment.

 
```java
    public void WaitForVisibility(MobileElement element){
        WebDriverWait wait = new WebDriverWait(driver,WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

```

- ClearInputField; this object perform clear text actions inside input text feild.

```java
   public void ClearInputField(MobileElement element){
        WaitForVisibility(element);
        element.clear();
    }
```


- SendTextObject; this object perform send text action inside the input text feild.
```java
    public void SendTextObject(MobileElement element, String textInput){
        WaitForVisibility(element);
        element.setValue(textInput);
    }
```

- ScrollUpObject;this object performs vertical scroll actions.
```java
    public void ScrollUpObject(MobileElement element){
        AndroidTouchAction action = new AndroidTouchAction(driver);
        action.press(ElementOption.element(element))
                .waitAction()
                .moveTo(PointOption.point(0,-600))
                .release()
                .perform();
    }
```

- ClickButtonObject; this object performs click actions on an element.
```java
   public void ClickButtonObject(MobileElement element){
        WaitForVisibility(element);
        element.click();
    }
```


## SignUp Element Locators Page Object
- This class contains all the Locators of the elelments to perform our automation with.
```java
package SginUpPageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
```


- We extends to SignUpPageBase to inherit it properties
```java
public class SignUpElementsLocators extends SignUpPageBase{
    public SignUpElementsLocators(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
```

- Xpath locator for choose country
```java
    //Locator for choose country
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")
    MobileElement chooseCountry;
```


- Id locator for account icon

```java
    //Locator for account icon
    @AndroidFindBy(id = "com.jumia.android:id/navigation_account")
    MobileElement accountBtn;
```

- Get inbox locator to perform scroll action
```java
    //Get inbox locator for scroll
    @AndroidFindBy(id = "com.jumia.android:id/inbox_container")
    MobileElement inboxBtn;
```

- Id locator for login button
```java
    //Locator for login button
    @AndroidFindBy(id ="com.jumia.android:id/button_bottom_login_logout")
    MobileElement loginBtn;
```

- Locator for email input field
```java
    //Locator for email input field
    @AndroidFindBy(className = "android.widget.EditText")
    MobileElement emailInputField;
```

- locator for continue button
```java
    //locator for continue button
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.widget.Button")
    MobileElement continueLoginBtn;
```


- locator for password input field
```java
    //locator for password input field
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.EditText")
    MobileElement passwordInputField;
```

- locator for confirm password input field
```java

    // locator for confirm password input field
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.widget.EditText")
    MobileElement confirmPasswordInputField;
```

- locator click password button
```java

    //locator click password button
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.widget.Button")
    MobileElement passwordBtn;
```


## Utilizing the properties of the extended SignUpPageBase objects on our define elelment Locators
- Creating click object for choose country
```java
    public void ClickChooseCountry(){
        ClickButtonObject(chooseCountry);
    }
```

- Creating click account button object
```java
    public void ClickAccountButton(){
        ClickButtonObject(accountBtn);
    }
```

- Creating scroll down object
```java
    public void PressInboxAndScroll(){
       ScrollUpObject(inboxBtn);
    }
```

- Creating click login object
```java
    public void ClickLoginBtn(){
        ClickButtonObject(loginBtn);
    }
 ```

- Creating send user email object
```java
 public void SendEmailText(String emailText){
      SendTextObject(emailInputField,emailText);
    }
```

- Creating click on continue longin button
```java
    public void ClickContinueLoginBtn(){
        ClickButtonObject(continueLoginBtn);
    }
```


- Creating user enter password object
```java
    public void SendEnterPassword(String password){
        SendTextObject(passwordInputField,password);
    }
```

- Creating user confirm password
```java
    public void SendConfirmPassword(String confirmpassword){
        SendTextObject(confirmPasswordInputField,confirmpassword);
    }
```

- Creating click continue button after entering password 

```java
    public void ClickContinuePasswordBtn(){
        ClickButtonObject(passwordBtn);
    }
}

```


## SignUp DesiredCapabilities
- This class contains the description of the device to be automated.

```java
package SginUpPageObject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
```
- contains the description of the device, the particular mobile app and the IP address of our server.

```java
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
```



## SignUp Test Page
- This class contains test that will be run on the server.

```java
package SignUpTestPage;

import SginUpPageObject.SignUpElementsLocators;
import SginUpPageObject.SignUpPersonalDetailsLocators;
import SginUpPageObject.SignUpSetCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
```
- We import SignUpElementsLocators to inherit its properties.
```java
public class SignUpTestPage extends SignUpSetCapabilities {
    SignUpElementsLocators signUpElementsLocators;
    SignUpPersonalDetailsLocators signUpPersonalDetailsLocators;
```
- Test Run
```java
    @Test
    public void checkSignUp() throws MalformedURLException {
        jumia_SetUp();
        signUpElementsLocators = new SignUpElementsLocators(driver);
        signUpPersonalDetailsLocators = new SignUpPersonalDetailsLocators(driver);
        signUpElementsLocators.ClickChooseCountry();
        signUpElementsLocators.ClickAccountButton();
        signUpElementsLocators.PressInboxAndScroll();
        signUpElementsLocators.ClickLoginBtn();
        signUpElementsLocators.SendEmailText("husseinamadu634@gmail.com");
        signUpElementsLocators.ClickContinueLoginBtn();
        signUpElementsLocators.SendEnterPassword("password123@");
        signUpElementsLocators.SendConfirmPassword("password123@");
        signUpElementsLocators.ClickContinuePasswordBtn();
```



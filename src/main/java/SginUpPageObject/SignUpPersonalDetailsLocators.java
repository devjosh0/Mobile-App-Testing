package SginUpPageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignUpPersonalDetailsLocators extends SignUpPageBase{
    public SignUpPersonalDetailsLocators(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    //locator for first name input field
  @AndroidFindBy(id = "first_input")
    MobileElement firstNameText;

    //locator for middle name input field
    @AndroidFindBy(id = "input_middle_name")
    MobileElement middleNameText;

    //locator for last name input field
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View")
    MobileElement lastNameText;

    //locator for phone input field
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View")
    MobileElement phoneinput;

    //locator for continue personal detail
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.widget.Button")
    MobileElement personalDetailBtn;

    public  void EnterFirstName(String textfirstname){
        SendTextObject(firstNameText,textfirstname);
    }
    public void EnterMiddelName(String textMiddelname){
        SendTextObject(middleNameText,textMiddelname);
    }
    public  void EnterLastname(String textlastname){
        SendTextObject(lastNameText,textlastname);
    }
    public void EnterPhoneName(String textphone){
        SendTextObject(phoneinput,textphone);
    }
    public  void ClickPersonalDetailBtn(){
        ClickButtonObject(personalDetailBtn);
    }
}

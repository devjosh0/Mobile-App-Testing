package SginUpPageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignUpElementsLocators extends SignUpPageBase{
    public SignUpElementsLocators(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    //Locator for choose country
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")
    MobileElement chooseCountry;

    //Locator for account icon
    @AndroidFindBy(id = "com.jumia.android:id/navigation_account")
    MobileElement accountBtn;

    //Get inbox locator for scroll
    @AndroidFindBy(id = "com.jumia.android:id/inbox_container")
    MobileElement inboxBtn;

    //Locator for login button
    @AndroidFindBy(id ="com.jumia.android:id/button_bottom_login_logout")
    MobileElement loginBtn;

    //Locator for email input field
    @AndroidFindBy(className = "android.widget.EditText")
    MobileElement emailInputField;

    //locator for continue button
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.widget.Button")
    MobileElement continueLoginBtn;

    //locator for password input field
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.EditText")
    MobileElement passwordInputField;

    // locator for confirm password input field
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.widget.EditText")
    MobileElement confirmPasswordInputField;


    //locator click password button
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.widget.Button")
    MobileElement passwordBtn;

    //Personal Details

    //First Name Input locator
    @AndroidFindBy(xpath = "[@id=screenshotContainer]/div[2]/div/div/div/div/div[31]")
    MobileElement firstNameInput;

//Creating click object for choose country
    public void ClickChooseCountry(){
        ClickButtonObject(chooseCountry);

    }
    //Creating click account button object
    public void ClickAccountButton(){
        ClickButtonObject(accountBtn);
    }
    //Creating scroll down
    public void PressInboxAndScroll(){
       ScrollUpObject(inboxBtn);
    }
    //Creating click login object
    public void ClickLoginBtn(){
        WaitForVisibility(loginBtn);
        ClickButtonObject(loginBtn);
    }
   //Creating send user email object
    public void SendEmailText(String emailText){
        WaitForVisibility(emailInputField);
      SendTextObject(emailInputField,emailText);
    }

    //Creating click on continue longin button
    public void ClickContinueLoginBtn(){
        ClickButtonObject(continueLoginBtn);
    }
    //Creating user enter password object
    public void SendEnterPassword(String password){
        SendTextObject(passwordInputField,password);
    }

    //Creating user confirm password
    public void SendConfirmPassword(String confirmpassword){
        SendTextObject(confirmPasswordInputField,confirmpassword);
    }
   //Creating click password button
    public void ClickContinuePasswordBtn(){
        WaitForVisibility(passwordBtn);
        ClickButtonObject(passwordBtn);
    }
    public void EnterFirstName(String firstname){
//        WaitForVisibility(firstNameInput);
        SendTextObject(firstNameInput,firstname);
    }

}

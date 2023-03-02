package Locators;

import PageBase.PageBaseObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ElementLocatorsPageObject extends PageBaseObject {

    public ElementLocatorsPageObject(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    //Locator for choose country
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")
    public
    MobileElement chooseCountry;

    //Locator for account icon
    @AndroidFindBy(id = "com.jumia.android:id/navigation_account")
    public
    MobileElement accountBtn;

    //Get inbox locator for scroll
    @AndroidFindBy(id = "com.jumia.android:id/inbox_container")
    public
    MobileElement inboxBtn;

    //Locator for login button
    @AndroidFindBy(id ="com.jumia.android:id/button_bottom_login_logout")
    public
    MobileElement loginBtn;

    //Locator for email input field
    @AndroidFindBy(className = "android.widget.EditText")
    public
    MobileElement emailInputField;

    //locator for continue button
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.widget.Button")
    public
    MobileElement continueLoginBtn;

    //locator for password input field
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.EditText")
    public
    MobileElement passwordInputField;

    // locator for confirm password input field
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.widget.EditText")
    public
    MobileElement confirmPasswordInputField;


    //locator click password button
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.widget.Button")
    public
    MobileElement passwordBtn;
                                           ///ADD TO CART ELEMENTS

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView")
    public
    MobileElement firstproductlocator;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.ImageView")
    public
    MobileElement scrollright;
    @AndroidFindBy(id = "com.jumia.android:id/add_to_cart_button")
    public
    MobileElement addcartbtn;

    @AndroidFindBy(id = "com.jumia.android:id/btn_add_to_cart")
    public
    MobileElement addproducttocart;

    @AndroidFindBy(id = "com.jumia.android:id/shoppingcart_checkout_continue_shopping")
    public
    MobileElement clickcontinueshoppingbtn;

    @AndroidFindBy(accessibility = "Navigate up")
    public
    MobileElement gobackbtn;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.ImageView")
    public
    MobileElement scondproductlocator;


    @AndroidFindBy(id = "com.jumia.android:id/menu_basket_pktheme")
    public
    MobileElement viewcartbtn;


}

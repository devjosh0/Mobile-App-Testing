package Implementation;

import Locators.ElementLocatorsPageObject;
import io.appium.java_client.AppiumDriver;

public class ImplementationPageObject extends ElementLocatorsPageObject{

    public ImplementationPageObject(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    //Creating click object for choose country
    public void clickchoosecountry(){
       clickbuttonobject(chooseCountry);

    }
    //Creating click account button object
    public void clickaccountbutton(){
    clickbuttonobject(accountBtn);

    }
    //Creating scroll down
    public void performscrollupaction(){
    scrollupobject(inboxBtn);
    }
    //Creating click login object
    public void clickloginbtn(){
    waitforvisibility(loginBtn);
    clickbuttonobject(loginBtn);
    }
    //Creating send user email object
    public void sendemailtext(String emailText){
    waitforvisibility(emailInputField);
    sendtextobject(emailInputField,emailText);
    }

    //Creating click on continue longin button
    public void clickcontinueloginbtn(){
    clickbuttonobject(continueLoginBtn);

    }
    //Creating user enter password object
    public void sendenterpassword(String password){
    sendtextobject(passwordInputField,password);
    }

    //Creating user confirm password
    public void sendconfirmpassword(String confirmpassword){
    sendtextobject(confirmPasswordInputField,confirmpassword);

    }
    //Creating click password button
    public void clickcontinuepasswordbtn(){
    waitforvisibility(passwordBtn);
    clickbuttonobject(passwordBtn);
    }

                   ///ADD ITEMS TO CART IMPLEMENTATION
public void clickproduct(){
        waitforvisibility(firstproductlocator);
        clickbuttonobject(firstproductlocator);
}
    public void clickaddtocartbtn(){
        waitforvisibility(addcartbtn);
        clickbuttonobject(addcartbtn);
    }
    public void clicktogoback(){
        waitforvisibility(gobackbtn);
        clickbuttonobject(gobackbtn);
    }
    public void clickplussigntoaddproducttocart(){
        waitforvisibility(addproducttocart);
        clickbuttonobject(addproducttocart);
    }
    public void clickcontinueshopping(){
        waitforvisibility(clickcontinueshoppingbtn);
        clickbuttonobject(clickcontinueshoppingbtn);
    }

    public void performscrollsideaction(){
        scrollsideObject(scrollright);
    }
    public void clicksecondproduct(){
        waitforvisibility(scondproductlocator);
        clickbuttonobject(scondproductlocator);
    }
   public void clicktoviewcart(){
        waitforvisibility(viewcartbtn);
        clickbuttonobject(viewcartbtn);
   }

}

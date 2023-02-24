package AddItemsToCart;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCartLocators extends AddCartPageBase{
    public AddCartLocators(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")
    MobileElement chooseCountry;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView")
    MobileElement pressEletoscroll;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.ImageView")
    MobileElement pressTarget;

   @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.ImageView")
    MobileElement product1;
   @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.ImageView")
   MobileElement product2;

  @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.TextView")
  MobileElement addCartBtn1;

  @AndroidFindBy(accessibility = "Navigate up")
  MobileElement goback;
  @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.view.ViewGroup[1]/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup")
  MobileElement targetproducttoscrolldown;
  @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView")
  MobileElement product3;


  @AndroidFindBy(id ="com.jumia.android:id/add_to_cart_button")
  MobileElement getAddCartBtn2;
@AndroidFindBy(id = "com.jumia.android:id/menu_basket_pktheme")
MobileElement viewCartBtn;

  public void ClickChooseCountry(){
        ClickButtonObject(chooseCountry);
    }
    public  void ClickElementToScrollDown(){
      WaitForVisibility(pressEletoscroll);
      ScrollUpObject(pressEletoscroll);
    }
    public void ClickPressTarget(){
        WaitForVisibility(pressTarget);
        ScrollSide(pressTarget);
    }
   public void ClickProduct(){
       ClickButtonObject(product1);
   }
   public void ClickAddToCartBtn(){
       WebDriverWait wait = new WebDriverWait(driver,20);
      WaitForVisibility(addCartBtn1);
      ClickButtonObject(addCartBtn1);
   }
   public void ClickGoBackArrow(){
      WaitForVisibility(goback);
      ClickButtonObject(goback);
   }
   public void ClickTargetAndScroll(){
      WaitForVisibility(product1);
      ScrollSide(product1);
   }
   public void ClickProduct2(){
      WaitForVisibility(product2);
      ClickButtonObject(product2);
   }
   public void ClickViewCartBtn(){
   WaitForVisibility(viewCartBtn);
   ClickButtonObject(viewCartBtn);
   }
   public void ClickAndScrollDown(){
      WaitForVisibility(targetproducttoscrolldown);
      ScrollUpObject1(targetproducttoscrolldown);
   }
public void ClickProduct3(){
      WaitForVisibility(product3);
      ClickButtonObject(product3);
}
    public void ClickAddToCartBtn1(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        WaitForVisibility(getAddCartBtn2);
        ClickButtonObject(getAddCartBtn2);
    }

}

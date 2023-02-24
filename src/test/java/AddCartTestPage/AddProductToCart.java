package AddCartTestPage;

import AddItemsToCart.AddCartDesiredCapabilities;
import AddItemsToCart.AddCartLocators;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AddProductToCart extends AddCartDesiredCapabilities {
    AddCartLocators addCartLocators;

    @Test
    public void AddCart() throws MalformedURLException {
        Android_SetUp();
        addCartLocators = new AddCartLocators(driver);
        addCartLocators.ClickChooseCountry();
        addCartLocators.ClickPressTarget();
        addCartLocators.ClickProduct();
        addCartLocators.ClickAddToCartBtn();
        addCartLocators.ClickGoBackArrow();
        addCartLocators.ClickTargetAndScroll();
        addCartLocators.ClickProduct2();
        addCartLocators.ClickAddToCartBtn();
        addCartLocators.ClickGoBackArrow();
        addCartLocators.ClickAndScrollDown();
        addCartLocators.ClickProduct3();
        addCartLocators.ClickAddToCartBtn1();
        addCartLocators.ClickGoBackArrow();
       // addCartLocators.ClickViewCartBtn();


    }
}

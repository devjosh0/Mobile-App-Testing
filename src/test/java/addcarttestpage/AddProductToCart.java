package addcarttestpage;


import CapabilitiesPageObject.DesiredCapabilities;
import Implementation.ImplementationPageObject;
import org.testng.annotations.Test;

public class AddProductToCart extends DesiredCapabilities {
    ImplementationPageObject implementationPageObject;

    @Test
    public void additemstocart()  {

        implementationPageObject = new ImplementationPageObject(driver);
        implementationPageObject.clickchoosecountry();
        implementationPageObject.clickproduct();
        implementationPageObject.clickaddtocartbtn();
        implementationPageObject.clickplussigntoaddproducttocart();
        implementationPageObject.clickcontinueshopping();
        implementationPageObject.clicktogoback();
        implementationPageObject.performscrollsideaction();
        implementationPageObject.clicksecondproduct();
        implementationPageObject.clickaddtocartbtn();
        implementationPageObject.clickplussigntoaddproducttocart();
        implementationPageObject.clickcontinueshopping();
        implementationPageObject.clicktogoback();
        implementationPageObject.clicktoviewcart();



    }
}

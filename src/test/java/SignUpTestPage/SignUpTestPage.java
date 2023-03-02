package SignUpTestPage;

import CapabilitiesPageObject.DesiredCapabilities;
import Implementation.ImplementationPageObject;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SignUpTestPage extends DesiredCapabilities {
  ImplementationPageObject implementationPageObject;

    @Test
    public void checkSignUp() throws MalformedURLException {
        implementationPageObject = new ImplementationPageObject(driver);
        implementationPageObject.clickchoosecountry();
        implementationPageObject.clickaccountbutton();
        implementationPageObject.performscrollupaction();
        implementationPageObject.clickloginbtn();
        implementationPageObject.sendemailtext("husseinamadu634@gmail.com");
        implementationPageObject.clickcontinueloginbtn();
        implementationPageObject.sendenterpassword("password123@");
        implementationPageObject.sendconfirmpassword("password123@");
        implementationPageObject.clickcontinuepasswordbtn();

    }
}

package SignUpTestPage;

import SginUpPageObject.SignUpElementsLocators;
import SginUpPageObject.SignUpPersonalDetailsLocators;
import SginUpPageObject.SignUpSetCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SignUpTestPage extends SignUpSetCapabilities {
    SignUpElementsLocators signUpElementsLocators;
    SignUpPersonalDetailsLocators signUpPersonalDetailsLocators;
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

    }
}

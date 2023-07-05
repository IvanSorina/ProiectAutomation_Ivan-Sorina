package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import static pages.BasePage.sleep;

public class SignInTest extends BaseTest { //Mosteneste din Clasa Best Test
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {
        String email = "elena.sorina50@yahoo.com";
        String password = "iasi45";



        LOG.info("Check if 'Contul Meu' button is displayed");
        Assert.assertTrue(signInPage.isContulMeuButtonDisplayed(), "Button is not diplayed");

        LOG.info("Click 'Contul Meu' button");
        signInPage.clickContulMeuButton();

        LOG.info("Click 'LoginContNou' button");
        signInPage.clickLoginContNou();
        sleep(4000);

        LOG.info("Complete the field");
        signInPage.setInputEmailAdress(email);

        LOG.info("Complete the field");
        signInPage.setInputPassword(password);
        sleep(3000);

        LOG.info("Click 'Autentificare' button");
        signInPage.clickAutentificareButton();

//        sleep(3000);
//        LOG.info("Check if 'Error message' is displayed");
//        Assert.assertTrue(signInPage.getErrorMsg(), " Error message is displayed");
//        LOG.info("Typing email address in 'Recuperare parola' field");
//        signInPage.recuperareCuEmailAdress(email);


//        LOG.info("Complete the field");
//        signInPage.mesajEroareDisplayed(email);
//        sleep(3000);
//    }
}}


package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class SignInTest extends BaseTest {
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


        LOG.info("Complete the field");
        signInPage.setInputEmailAdress(email);

        LOG.info("Complete the field");
        signInPage.setInputPassword(password);


        LOG.info("Click 'Autentificare' button");
        signInPage.clickAutentificareButton();


}}


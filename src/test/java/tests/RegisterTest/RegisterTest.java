package tests.RegisterTest;

import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;


public class RegisterTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);


    private String newUrl = returnBaseUrl();
    String email = RandomStringUtils.randomAlphabetic(5) + "." + RandomStringUtils.randomAlphabetic(5) + "@gmail.com";
    String nume = "Pop";
    String prenume = "Maria";
    String parola="Mai1999";



    @Test
    public void register() {

        driver.get(newUrl);

        LOG.info("Typing email address in 'Email adress' field");
        registerPage.setInputEmailAdress(email);

        LOG.info("Typing in 'Name' field");
        registerPage.setInputName(nume);

        LOG.info("Typing in 'First Name' field");
        registerPage.setInputPrenume(prenume);

        LOG.info("Typing in 'Parola' field");
        registerPage.setInputParola(parola);

        LOG.info("Typing in 'Confirma parola' field");
        registerPage.confirmaParola(parola);

        LOG.info("Click 'Inregistrare' button");
        registerPage.inregistrareButton();

        LOG.info("Click 'Contul Meu' button");
        registerPage.clickContulMeuButton();

        LOG.info("Click 'Delogheaza-ma' button");
        registerPage.clickDelogheazaButton();

    }

}

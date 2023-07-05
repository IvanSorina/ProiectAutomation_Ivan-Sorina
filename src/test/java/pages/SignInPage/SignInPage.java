package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {

    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();

        }
        return instance;
    }

    private By contulMeuButton = By.xpath("//span[normalize-space()='Contul meu']");
    private By loginContNou = By.xpath("//a[normalize-space()='LOGIN / CONT NOU']");
    private By inputEmailAdress = By.xpath("//input[@type='email']");
    private By inputPassword = By.xpath("//form[@name='form_autentificare']//input[@type='password']");
    private By autentificareButton = By.xpath("//label[@class='show-lg']");
//    private By errorMsg = By.xpath("//p[text()=\"Parola introdusa este incorecta !\"]");
//    private By recuperareParola = By.xpath("//input[@name='email_recuperare']");

    public boolean isContulMeuButtonDisplayed() {
        LOG.info("Check if 'Contul Meu' button is displayed");
        return driver.findElement(contulMeuButton).isDisplayed();
    }

    public void clickContulMeuButton() {
        LOG.info("Click 'Contul Meu' button");
        driver.findElement(contulMeuButton).click();
    }

    public void clickLoginContNou() {
        LOG.info("Click 'LoginContNou' button");
        driver.findElement(loginContNou).click();
    }

    public void setInputEmailAdress(String email) {
        LOG.info("Typing email address in 'Adresa de email' field");
        driver.findElement(inputEmailAdress).sendKeys(email);
    }

    public void setInputPassword(String password) {
        LOG.info("Typing password in 'Parola' field");
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void clickAutentificareButton() {
        LOG.info("Click 'Autentificare' button");
        driver.findElement(autentificareButton).click();
    }
}


//    public boolean getErrorMsg() {
//        LOG.info("Check if 'Error message' is displayed");
//        return driver.findElement(errorMsg).isDisplayed();
//    }
//    public void recuperareCuEmailAdress(String email){
//        if(driver.findElement(errorMsg).isDisplayed()) {
//            LOG.info("Typing email address in 'Recuperare parola' field");
//            driver.findElement(recuperareParola).sendKeys(email);
//
//        }
//    }
//public void mesajEroareDisplayed() {
//    LOG.info("Check if 'Parola introdusa este incorecta !' message is displayed");
//    if (driver.findElement(errorMsg).isDisplayed()) {
//        public void insertEmail(String email){
//            LOG.info("Complete the field");
//            driver.findElement(recuperareParola).sendKeys(email);
//        }
//    }
//}
//}


//
//        LOG.info("Verifying if error message is displayed");
//        return driver.findElement(errorMsg).isDisplayed();
//
//    }
//
//       if( isErrorMessageDisplayed())
//       {
//        LOG.info("Verifying if error message is displayed");
//        return driver.findElement(errorMsg).isDisplayed();
//        {
//        String email='elena.sorina50@yahoo.com';
//        public void emailRecuperareParola(String email) {
//        LOG.info("Typing email address in 'Recuperare parola' field");
//        driver.findElement(recuperareParolaButton).sendKeys(email);
//    }

//    public class emailRecuperare{
//        if (msg==errorMsg)
//        {
//
//        }










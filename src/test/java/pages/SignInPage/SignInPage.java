package pages.SignInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(autentificareButton));
        driver.findElement(autentificareButton).click();
    }
}












package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {

    }

    public static RegisterPage getInstance() {
        if (instance == null) {

            instance = new RegisterPage();
        }
        return instance;
    }


    private By inputEmailAdress = By.xpath("//input[@name='email']");
    private By inputName = By.xpath("//input[@name='nume']");
    private By inputPrenume = By.xpath("//input[@name='prenume']");
    private By inputParola=By.xpath("//input[@name='parola']");
    private By confirmaParola=By.xpath("//input[@name='confirmare_parola']");
    private By clickInregistrareButton=By.xpath("//span[text()='Inregistrare']");

    public void setInputEmailAdress(String email) {
        LOG.info("Typing email address in 'Email adress' field");
        driver.findElement(inputEmailAdress).sendKeys(email);
    }

    public void setInputName(String nume) {
        LOG.info("Typing in 'Name' field");
        driver.findElement(inputName).sendKeys(nume);
    }

    public void setInputPrenume(String prenume) {
        LOG.info("Typing in 'First Name' field");
        driver.findElement(inputPrenume).sendKeys(prenume);
    }
    public void setInputParola(String parola) {
        LOG.info("Typing in 'Parola' field");
        driver.findElement(inputParola).sendKeys(parola);
    }
    public void confirmaParola(String parola) {
        LOG.info("Typing in 'Confirma parola' field");
        driver.findElement(confirmaParola).sendKeys(parola);
    }
    public void inregistrareButton() {
        LOG.info("Click 'Inregistrare' button");
        driver.findElement(clickInregistrareButton).click();
    }
}
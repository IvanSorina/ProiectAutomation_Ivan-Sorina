package pages.ShoppingCart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ShoppingCart extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(ShoppingCart.class);
    public static ShoppingCart instance;

    private ShoppingCart() {

    }

    public static ShoppingCart getInstance() {
        if (instance == null) {
            instance = new ShoppingCart();

        }
        return instance;
    }

    private By produseClickButton = By.xpath("//div[@class='dropdown-toggle']//a[@href='#']");
    private By selectProdusGradina = By.xpath("//a[text()='GRADINA']");
    private By selectMobilierGradina = By.xpath("//li[@class='cr-dropdown active']//a[.='Balansoare gradina']");
    private By selectProduct = By.xpath("//img[@src='https://www.mesterino.ro/poze_produse/101891_1.png']");
    private By addInCart = By.xpath("//span[normalize-space()='Adauga in cos']");
    private By produseClickButton1 = By.xpath("//div[@class='dropdown-toggle']//a[@href='#']");
    private By selectProductCasaSiBucatarie = By.xpath("//a[text()='CASA SI BUCATARIE']");
    private By chooseAProduct = By.xpath("//div[@class='single-category-menu-inner']//a[@title='Albume foto'][normalize-space()='Albume foto']");
    private By addProductInCart = By.xpath("//form[@id='adauga_piesa_cos_90962']//span[contains(text(),'Adauga in cos')]");
    private By clickMyCart = By.xpath("//span[normalize-space()='Cosul meu']");
    private By addAnotherAlbum = By.xpath("//span[@class='plus']");
    private By clickPasulUrmator = By.xpath("//span[text()='Pasul urmator']");
    private By completeNameForOrder = By.xpath("//input[@id='nume_form_rapida']");
    private By completeTelefonForOrder = By.xpath("//input[@id='telefon_form_rapida']");
    private By inputEmailAdress = By.xpath("//input[@id='email_form_rapida']");
    private By inputAresa = By.xpath("//input[@name='adresa']");
    private By clickAlegeJudet=By.xpath("//select[@name='judet']");
    private By clickAlegeLocalitate=By.id("aaa3");
    private By clickRambursLaCurier=By.xpath("//span[text()='Ramburs la curier']");
    private By clickAcord=By.xpath("//span[text()='Prin trimiterea comenzii accept termenii si conditiile epiesa.ro']");


    public void clickButton() {
        LOG.info("Click 'Produse' drop down button");
        driver.findElement(produseClickButton).click();
    }

    public void setSelectProdusGradina() {
        LOG.info("Click 'GRADINA' drop-down button");
        driver.findElement(selectProdusGradina).click();
    }

    public void setSelectMobilierGradina() {
        LOG.info("Click 'Balansoare gradina' button");
        driver.findElement(selectMobilierGradina).click();
    }

    //
    public void setSelectProduct() {
        LOG.info("Click 'Balansoar HEINNER STBL001'");
        driver.findElement(selectProduct).click();

    }

    public void setAddInCart() {
        LOG.info("Click 'Adauga in cos' button");
        driver.findElement(addInCart).click();
    }

    public void navigateBack() {
        LOG.info("Navigate Back");
        driver.navigate().back();
    }

    public void setProduseClickButton1() {
        LOG.info("Click 'PRODUSE' drop down button");
        driver.findElement(produseClickButton1).click();
    }

    public void setSelectProductCasaSiBucatarie() {
        LOG.info("Click 'CASA SI BUCATARIE' button");
        driver.findElement(selectProductCasaSiBucatarie).click();
    }


    public void setChooseAProduct() {
        LOG.info("Click 'Farfurii' product");
        driver.findElement(chooseAProduct).click();
    }

    public void setAddProductInCart() {
        LOG.info("Click 'Album foto HAMA Minimax 106262'");
        driver.findElement(addProductInCart).click();
    }

    public void setClickMyCart() {
        LOG.info("Click 'My Cart");
        driver.findElement(clickMyCart).click();
    }

    public void setAddAnotherAlbum() {
        LOG.info("Click add another 'Album foto HAMA Minimax 106262'");
        driver.findElement(addAnotherAlbum).click();
    }

    public void setClickPasulUrmator() {
        LOG.info("Click'Pasul Urmator' button");
        driver.findElement(clickPasulUrmator).click();
    }

    public void setCompleteNameForOrder(String nume) {
        LOG.info("Typing in 'Nume' field");
        driver.findElement(completeNameForOrder).sendKeys(nume);
    }

    public void setCompleteTelefonForOrder(String telefon) {
        LOG.info("Typing in 'Telefon' field");
        driver.findElement(completeTelefonForOrder).sendKeys(telefon);
    }

    public void setInputEmailAdress(String email) {
        LOG.info("Typing in 'Email' field");
        driver.findElement(inputEmailAdress).sendKeys(email);
    }

    public void setInputAresa(String adresa){
        LOG.info("Typing in 'Adresa' field");
        driver.findElement(inputAresa).sendKeys(adresa);
    }
    public void setClickAlegeJudet(String judet) {
        LOG.info("Click 'Judet' field");
        driver.findElement(clickAlegeJudet).click();
        driver.findElement(clickAlegeJudet).sendKeys(judet);
        driver.findElement(clickAlegeJudet).sendKeys(Keys.ENTER);
    }
    public void setClickAlegeLocalitate(String localitatea) {
        LOG.info("Click 'Localitate' field");
        driver.findElement(clickAlegeLocalitate).click();
        driver.findElement(clickAlegeLocalitate).sendKeys(localitatea);
        driver.findElement(clickAlegeLocalitate).sendKeys(Keys.ENTER);
    }
    public void setClickRambursLaCurier() {
        LOG.info("Click 'Ramburs la curier' radio button");
        driver.findElement(clickRambursLaCurier).click();
    }
//    public void setClickAcord() {
//        LOG.info("Click 'Prin trimiterea comenzii accept termenii si conditiile epiesa.ro' radio button");
//        driver.findElement(clickAcord).click();
//    }


}



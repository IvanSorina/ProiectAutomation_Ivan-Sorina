package tests.ShoppingCartTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class ShoppingCartTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(ShoppingCartTest.class);

    @Test
    public void shopping() {
        String nume = "Ivan";
        String telefon = "0765432567";
        String email = "elena.sorina50@yahoo.com";
        String adresa = "Strada Teiului, bl46B, sc A, ap 7";
        String judet = "Brasov";
        String localitate = "Fagaras";


        LOG.info("Click 'Produse' drop down button");
        shoppingCart.clickButton();

        LOG.info("Click 'GRADINA' drop down button");
        shoppingCart.setSelectProdusGradina();

        LOG.info("Click 'Balansoare gradina' button");
        shoppingCart.setSelectMobilierGradina();

        LOG.info("Click 'Balansoar HEINNER STBL001'");
        shoppingCart.setSelectProduct();

        LOG.info("Click 'Adauga in cos' button");
        shoppingCart.setAddInCart();

        shoppingCart.navigateBack();
        shoppingCart.navigateBack();
        shoppingCart.navigateBack();

        LOG.info("Click 'Produse' drop down button");
        shoppingCart.setProduseClickButton1();

        LOG.info("Click 'CASA SI BUCATARIE' button");
        sleep(3000);
        shoppingCart.setSelectProductCasaSiBucatarie();

        LOG.info("Click  product");
        sleep(3000);

        shoppingCart.setChooseAProduct();

        LOG.info("Click 'Album foto HAMA Minimax 106262'");
        shoppingCart.setAddProductInCart();

        LOG.info("Click 'My Cart");
        shoppingCart.setClickMyCart();

        LOG.info("Click add another product");
        shoppingCart.setAddAnotherProduct();

        LOG.info("Click'Pasul Urmator' button");
        shoppingCart.setClickPasulUrmator();

        LOG.info("Typing in 'Nume' field");
        shoppingCart.setCompleteNameForOrder(nume);
        LOG.info("Typing in 'Telefon' field");
        shoppingCart.setCompleteTelefonForOrder(telefon);
        LOG.info("Typing in 'Email' field");
        shoppingCart.setInputEmailAdress(email);
        LOG.info("Typing in 'Adresa' field");
        shoppingCart.setInputAresa(adresa);
        LOG.info("Click 'Judet' drop-down button");
        shoppingCart.setClickAlegeJudet(judet);
        LOG.info("Click 'localitate' drop-down button");
        shoppingCart.setClickAlegeLocalitate(localitate);
        LOG.info("Click 'Ramburs la curier' radio button");
        shoppingCart.setClickRambursLaCurier();


    }
    }

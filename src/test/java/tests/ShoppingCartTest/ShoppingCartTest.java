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


        LOG.info("Click 'Produse' drop down button");
        shoppingCart.clickButton();
        sleep(2000);
        LOG.info("Click 'GRADINA' drop down button");
        shoppingCart.setSelectProdusGradina();
        sleep(2000);
        LOG.info("Click 'Balansoare gradina' button");
        shoppingCart.setSelectMobilierGradina();
        sleep(3000);
        LOG.info("Click 'Balansoar HEINNER STBL001'");
        shoppingCart.setSelectProduct();
        sleep(3000);
        LOG.info("Click 'Adauga in cos' button");
        shoppingCart.setAddInCart();
        sleep(3000);
        shoppingCart.navigateBack();
        shoppingCart.navigateBack();
        shoppingCart.navigateBack();
        sleep(3000);
        LOG.info("Click 'Produse' drop down button");
        shoppingCart.setProduseClickButton1();
        sleep(3000);
        LOG.info("Click 'CASA SI BUCATARIE' button");
        shoppingCart.setSelectProductCasaSiBucatarie();
        sleep(3000);
        LOG.info("Click 'Farfurii' product");
        shoppingCart.setChooseAProduct();
        sleep(3000);
        LOG.info("Click 'Album foto HAMA Minimax 106262'");
        shoppingCart.setAddProductInCart();
        sleep(3000);
        LOG.info("Click 'My Cart");
        shoppingCart.setClickMyCart();
        sleep(3000);
        LOG.info("Click add another 'Album foto HAMA Minimax 106262'");
        shoppingCart.setAddAnotherAlbum();
        sleep(3000);

    }
}
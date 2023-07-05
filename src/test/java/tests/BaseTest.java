package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.RegisterPage.RegisterPage;
import pages.ShoppingCart.ShoppingCart;
import pages.SignInPage.SignInPage;

public class BaseTest {

    public SignInPage signInPage = SignInPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public ShoppingCart shoppingCart = ShoppingCart.getInstance();

    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }
}

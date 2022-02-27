package test;

import org.junit.jupiter.api.Test;

public class TestMain extends TestBase {

    @Test
    public void firstCase () { //checking operations with integers
        mainPage.goToUrl();
        mainPage.inputLogin();
        mainPage.pressLoginButton();
        mainPage.inputPassword();
        mainPage.pressLoginButton();
        mailPage.sendMailCase();

    }

}

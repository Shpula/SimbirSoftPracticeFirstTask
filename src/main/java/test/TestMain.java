package test;

import org.junit.jupiter.api.Test;

public class TestMain extends TestBase {

    @Test
    public void firstCase () { //checking operations with integers
        mainPage
                .goToUrl()
                .inputLogin()
                .pressLoginButton()
                .inputPassword()
                .pressLoginButton();
        mailPage
                .sendMailCase()
                .checkCountMails();


    }

}

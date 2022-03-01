package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name = 'login']")
    private WebElement login;

    @FindBy(xpath = "//span[text() = 'Войти']")
    private WebElement test;

    @FindBy(xpath = "//input[@name = 'passwd']")
    private WebElement password;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement loginButton;


    final String SITE_URL = "https://passport.yandex.ru/auth?from=mail&origin=hostroot_homer_auth_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F&backpath=https%3A%2F%2Fmail.yandex.ru%3Fnoretpath%3D1";

    public MainPage goToUrl() {
        driver.get(SITE_URL);
        return this;
    }

    public MainPage pressLoginButton() {
        loginButton.click();
        return this;
    }

    public MainPage inputLogin() {
        login.sendKeys("butin.nik.test@yandex.ru");
        return this;
    }

    public MainPage inputPassword() {
        password.sendKeys("nikita737");
        return this;
    }

}

package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.MailPage;
import page.MainPage;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
    public MailPage mailPage;
    public MainPage mainPage;

    @BeforeEach
    public void start() {
        System.setProperty("webdriver.chrome.driver","C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10000,
                TimeUnit.MILLISECONDS);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        mailPage = PageFactory.initElements(driver, MailPage.class);
    }

    @AfterEach
    public void finish() {
        driver.quit();
    }
}

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailPage extends BasePage{
    public MailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text() = 'Написать']")
    WebElement createMailButton;

    @FindBy(xpath = "//div[@class = 'composeYabbles']")
    WebElement mail;

    @FindBy(xpath = "//input[@name = 'subject']")
    WebElement theme;

    @FindBy(xpath = "//div[@role = 'textbox']")
    WebElement mainMail;

    @FindBy(xpath = "//button[@class='Button2 Button2_pin_circle-circle Button2_view_default Button2_size_l']")
    WebElement sendButton;

    public int findsMailsCase() {
        int mails = driver.findElements(By.xpath("//span[@title='Simbirsoft theme']")).size();
        return mails;
    }

    public void sendMailCase() {
        createMailButton.click();
        mail.sendKeys("butin.nik.test@yandex.ru", Keys.ENTER);
        theme.sendKeys("Simbirsoft theme");
        mainMail.sendKeys("Найдено писем: " + findsMailsCase());
        sendButton.click();

    }
}

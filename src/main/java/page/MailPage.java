package page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MailPage extends BasePage{
    public MailPage(WebDriver driver) {
        super(driver);
    }

    ArrayList<Integer> count = new ArrayList<>();

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

    public List<Integer> findsСurrentMailsCase() {
        int mails = driver.findElements(By.xpath("//span[@title='Simbirsoft theme']")).size();
        count.add(mails);
        System.out.println(count);
        return count;
    }

    public MailPage sendMailCase() {
        createMailButton.click();
        mail.sendKeys("butin.nik.test@yandex.ru", Keys.ENTER);
        theme.sendKeys("Simbirsoft theme");
        mainMail.sendKeys("Найдено писем: " + findsСurrentMailsCase().get(0));
        sendButton.click();
        findsСurrentMailsCase().add(1, findsСurrentMailsCase().get(0) + 1);

        return this;
    }

    public MailPage checkCountMails() {
        Assertions.assertTrue(findsСurrentMailsCase().get(0) < findsСurrentMailsCase().get(1));
        return this;
    }
}

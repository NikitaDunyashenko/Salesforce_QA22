package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class TextAreaAccounts extends BaseElement{

    private final static String TEXTAREA_ACCOUNTS_LOCATOR = "//label/span[text()='%s']//parent::label/parent::div/textarea";

    private String labelName;

    public TextAreaAccounts(WebDriver driver, String labelName) {
        super(driver);
        this.labelName = labelName;
    }

    public void setTextareaAccountsValue(String textAreaValues) {
        log.debug(String.format("finding TextArea Web Element by dynamic locator: %s", TEXTAREA_ACCOUNTS_LOCATOR, this.labelName));
        WebElement textArea = driver.findElement(By.xpath(String.format(TEXTAREA_ACCOUNTS_LOCATOR, this.labelName)));
        scrollToElement(textArea);
        log.info(String.format("sending value: %s to input with label: %s", textAreaValues, this.labelName));
        textArea.sendKeys(textAreaValues);
    }
}

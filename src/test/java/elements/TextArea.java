package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class TextArea extends BaseElement{

    private final static String TEXTAREA_LOCATOR = "//label[text()='%s']//parent::lightning-textarea//div//textarea";
    private String name;


    public TextArea(WebDriver driver, String name) {
        super(driver);
        this.name = name;
    }

    public void setTextAreaValues(String textAreaValues) {
        log.debug(String.format("finding TextArea Web Element by dynamic locator: %s", TEXTAREA_LOCATOR, this.name));
        WebElement textArea = driver.findElement(By.xpath(String.format(TEXTAREA_LOCATOR, this.name)));
        scrollToElement(textArea);
        log.info(String.format("sending value: %s to input with label: %s", textAreaValues, this.name));
        textArea.sendKeys(textAreaValues);
    }
}

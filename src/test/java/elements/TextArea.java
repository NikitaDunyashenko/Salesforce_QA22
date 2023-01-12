package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextArea extends BaseElement{

    private final static String TEXTAREA_LOCATOR = "//label[text()='%s']//parent::lightning-textarea//div//textarea";
    private String name;


    public TextArea(WebDriver driver, String name) {
        super(driver);
        this.name = name;
    }

    public void setTextAreaValues(String textAreaValues) {
        WebElement textArea = driver.findElement(By.xpath(String.format(TEXTAREA_LOCATOR, this.name)));
        scrollToElement(textArea);
        textArea.sendKeys(textAreaValues);
    }
}

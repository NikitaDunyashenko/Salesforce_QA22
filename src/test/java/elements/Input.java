package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class Input extends BaseElement{

    private String labelName;
    private final static String INPUT_LOCATOR = "//label[text()='%s']//parent::lightning-input//div/input";


    public Input(WebDriver driver, String labelName) {
        super(driver);
        this.labelName = labelName;
    }

    public void setValue(String value) {
        log.debug(String.format("finding Input Web Element by dynamic locator: %s", INPUT_LOCATOR, this.labelName));
        WebElement input = driver.findElement(By.xpath(String.format(INPUT_LOCATOR, this.labelName)));
        scrollToElement(input);
        log.info(String.format("sending value: %s to input with label: %s", value, this.labelName));
        input.sendKeys(value);
    }
}

package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Input extends BaseElement{

    private String name;
    private final static String INPUT_LOCATOR = "//input[@name='%s']";

    public Input(WebDriver driver, String name) {
        super(driver);
        this.name = name;
    }

    public void setValue(String value) {
        WebElement input = driver.findElement(By.xpath(String.format(INPUT_LOCATOR, this.name)));
        scrollToElement(input);
        input.sendKeys(value);
    }
}

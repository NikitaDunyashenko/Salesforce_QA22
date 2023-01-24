package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class ComboboxContacts extends BaseElement{

    private final static String COMBOBOX_INPUT_LOCATOR = "//label[text()='%s']//following-sibling::div//input";
    private final static String COMBOBOX_VALUE_LOCATOR = "//label[text()='%s']//parent::lightning-grouped-combobox//*[@title='%s']";
    private String labelName;


    public ComboboxContacts(WebDriver driver, String labelName) {
        super(driver);
        this.labelName = labelName;
    }

    public void chooseComboboxValue(String value) {
        log.debug(String.format("finding Web Element by label: %s and dynamic locator:%s", this.labelName, COMBOBOX_INPUT_LOCATOR, this.labelName));
        WebElement comboboxInput = driver.findElement(By.xpath(String.format(COMBOBOX_INPUT_LOCATOR, this.labelName)));
        scrollToElement(comboboxInput);
        log.info(String.format("sending input value: %s to field: %s", value, this.labelName));
        comboboxInput.sendKeys(value);
        WebElement comboboxValue = driver.findElement(By.xpath(String.format(COMBOBOX_VALUE_LOCATOR, this.labelName, value)));
        log.info(String.format("choosing the %s value from the dropdown of %s", value, this.labelName));
        comboboxValue.click();
    }

}

package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class Dropdown extends BaseElement{

    private final static String DROPDOWN_BUTTON_BY_LABEL = "//label[text()='%s']//following-sibling::div//button";
    private final static String DROPDOWN_OPTION = "//label[text()='%s']//following-sibling::div//lightning-base-combobox-item//span[@title='%s']";


    private String labelName;

    public Dropdown(WebDriver driver, String labelName) {
        super(driver);
        this.labelName = labelName;
    }

    public void chooseDropdownOption(String dropdownOption) {
        log.debug(String.format("finding Web Element by label: %s and dynamic locator: %s", this.labelName, DROPDOWN_BUTTON_BY_LABEL, this.labelName));
        WebElement dropdownButton = driver.findElement(By.xpath(String.format(DROPDOWN_BUTTON_BY_LABEL, this.labelName)));
        scrollToElement(dropdownButton);
        log.debug(String.format("clicking to button with dynamic locator: %s", DROPDOWN_BUTTON_BY_LABEL, this.labelName));
        jsClick(dropdownButton);
        log.debug(String.format("finding option from dropdown by dynamic locator: %s", DROPDOWN_OPTION, this.labelName, dropdownOption));
        WebElement dropDownOption = driver.findElement(By.xpath(String.format(DROPDOWN_OPTION, this.labelName, dropdownOption)));
        scrollToElement(dropDownOption);
        log.info(String.format("clicking on the dropdown option: %s", dropdownOption));
        jsClick(dropDownOption);
    }

}

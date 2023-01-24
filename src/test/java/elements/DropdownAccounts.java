package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class DropdownAccounts extends BaseElement{

    private final static String DROPDOWN_ACCOUNTS_BUTTON = "//span[text()='%s']//parent::span//following-sibling::div//a";
    private final static String DROPDOWN_ACCOUNTS_OPTION = "//a[@title='%s']";

    private String labelName;

    public DropdownAccounts(WebDriver driver, String labelName) {
        super(driver);
        this.labelName = labelName;
    }

    public void chooseAccountDropdownOption(String dropdownOption) {
        log.debug(String.format("finding Web Element by label: %s and dynamic locator: %s", this.labelName, DROPDOWN_ACCOUNTS_BUTTON, this.labelName));
        WebElement dropdownButton = driver.findElement(By.xpath(String.format(DROPDOWN_ACCOUNTS_BUTTON, this.labelName)));
        scrollToElement(dropdownButton);
        log.debug(String.format("clicking to button with dynamic locator: %s", DROPDOWN_ACCOUNTS_BUTTON, this.labelName));
        jsClick(dropdownButton);
        log.debug(String.format("finding option from dropdown by dynamic locator: %s", DROPDOWN_ACCOUNTS_OPTION, dropdownOption));
        WebElement dropDownOption = driver.findElement(By.xpath(String.format(DROPDOWN_ACCOUNTS_OPTION, dropdownOption)));
        scrollToElement(dropDownOption);
        log.info(String.format("clicking on the dropdown option: %s", dropdownOption));
        jsClick(dropDownOption);
    }
}

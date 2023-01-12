package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown extends BaseElement{

    private final static String DROPDOWN_BUTTON_BY_LABEL = "//label[text()='%s']//following-sibling::div//button";
    private final static String DROPDOWN_OPTION = "//label[text()='%s']//following-sibling::div//lightning-base-combobox-item//span[@title='%s']";


    private String labelName;

    public Dropdown(WebDriver driver, String labelName) {
        super(driver);
        this.labelName = labelName;
    }

    public void chooseDropdownOption(String dropdownOption) {
        WebElement dropdownButton = driver.findElement(By.xpath(String.format(DROPDOWN_BUTTON_BY_LABEL, this.labelName)));
        scrollToElement(dropdownButton);
        jsClick(dropdownButton);
        WebElement dropDownOption = driver.findElement(By.xpath(String.format(DROPDOWN_OPTION, this.labelName, dropdownOption)));
        scrollToElement(dropDownOption);
        jsClick(dropDownOption);
    }

}

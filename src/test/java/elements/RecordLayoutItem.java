package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class RecordLayoutItem extends BaseElement{

    private final static String VALUE_LOCATOR = "//span[@class='test-id__field-label' and text()='%s']//parent::div//following-sibling::div//*[@slot='outputField']";
    private String labelName;

    public RecordLayoutItem(WebDriver driver, String labelName) {
        super(driver);
        this.labelName = labelName;
    }

    public String getDetailsValue() {
        log.debug(String.format("getting text value from dynamic locator: %s", VALUE_LOCATOR, this.labelName));
        return driver.findElement(By.xpath(String.format(VALUE_LOCATOR, this.labelName))).getText();
    }

}

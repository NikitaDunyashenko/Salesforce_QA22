package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class EntityBasePage extends HomePage{

    private final static By NEW_BUTTON = By.cssSelector("div.active a[title=New]");
    public EntityBasePage(WebDriver driver) {
        super(driver);
    }

    public void clickNewButton() {
        log.info("Clicking New Button");
        driver.findElement(NEW_BUTTON).click();
    }
}

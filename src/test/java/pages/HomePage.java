package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class HomePage extends BasePage{

    private final static By USER_ICON = By.cssSelector(".slds-avatar_profile-image-small");
    private final static By LEADS_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//*[@title='Leads']");
    private final static By ACCOUNTS_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//*[@title='Accounts']");
    private final static By CONTACTS_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//*[@title='Contacts']");
    private final static By OPPORTUNITIES_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//*[@title='Opportunities']");

    public HomePage(WebDriver driver){
        super (driver);
    }

    public void openLeadsTab() {
        log.info("opening Leads Tab via js click");
        jsClick(driver.findElement(LEADS_MENU_TAB_LOCATOR));
    }

    public void openAccountsTab() {
        log.info("opening Accounts Tab via js click");
        jsClick(driver.findElement(ACCOUNTS_MENU_TAB_LOCATOR));
    }

    public void openContactsTab() {
        log.info("opening Contacts Tab via js click");
        jsClick(driver.findElement(CONTACTS_MENU_TAB_LOCATOR));
    }

    public void openOpportunitiesTab() {
        jsClick(driver.findElement(OPPORTUNITIES_MENU_TAB_LOCATOR));
    }
    public void waitForUserIconDisplayed() {
        log.info("waiting for user icon is displayed");
        waitForElementDisplayed(USER_ICON);
    }

    public boolean isUserIconDisplayed() {
        log.info("checking if user icon displayed");
        return driver.findElement(USER_ICON).isDisplayed();
    }
}

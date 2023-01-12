package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        jsClick(driver.findElement(LEADS_MENU_TAB_LOCATOR));
    }

    public void openAccountsTab() {
        jsClick(driver.findElement(ACCOUNTS_MENU_TAB_LOCATOR));
    }

    public void openContactsTab() {
        jsClick(driver.findElement(CONTACTS_MENU_TAB_LOCATOR));
    }

    public void openOpportunitiesTab() {
        jsClick(driver.findElement(OPPORTUNITIES_MENU_TAB_LOCATOR));
    }
    public void waitForUserIconDisplayed() {
        waitForElementDisplayed(USER_ICON);
    }

    public boolean isUserIconDisplayed() {
        return driver.findElement(USER_ICON).isDisplayed();
    }
}

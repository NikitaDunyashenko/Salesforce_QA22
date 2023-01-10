package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeadsDetailsPage extends HomePage{

    private final static By TOAST_MESSAGE = By.xpath("//div[contains(@class,'slds-theme--success')]");

    private final static By FULL_NAME_LOCATOR = By.xpath("//*[text()='Name']//parent::div//following-sibling::div//descendant::lightning-formatted-name");
    private final static By COMPANY_NAME_LOCATOR = By.xpath("//*[text()='Company']//parent::div//following-sibling::div//descendant::lightning-formatted-text");
    private final static By JOB_TITLE_LOCATOR = By.xpath("//*[text()='Title']//parent::div//following-sibling::div//descendant::lightning-formatted-text");
    private final static By PHONE_NUMBER_LOCATOR = By.xpath("//*[text()='Phone']//parent::div//following-sibling::div//descendant::lightning-formatted-phone");
    private final static By EMAIL_LOCATOR = By.xpath("//*[text()='Email']//parent::div//following-sibling::div//descendant::emailui-formatted-email-lead");
    private final static By ADDRESS_LOCATOR = By.xpath("//*[text()='Address']//parent::div//following-sibling::div//descendant::lightning-formatted-address");
    private final static By WEBSITE_LOCATOR = By.xpath("//*[text()='Website']//parent::div//following-sibling::div//descendant::lightning-formatted-url");
    private final static By NUMBER_OF_EMPLOYEES_LOCATOR = By.xpath("//*[text()='No. of Employees']//parent::div//following-sibling::div//descendant::lightning-formatted-number");
    private final static By ANNUAL_REVENUE_LOCATOR = By.xpath("//*[text()='Annual Revenue']//parent::div//following-sibling::div//descendant::lightning-formatted-text");

    public LeadsDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isToastMessageAppears() {
        waitForElementDisplayed(TOAST_MESSAGE);
        return driver.findElement(TOAST_MESSAGE).isDisplayed();
    }

    public String getFullName() {
        WebElement fullName = driver.findElement(FULL_NAME_LOCATOR);
        scrollToElement(fullName);
        return driver.findElement(FULL_NAME_LOCATOR).getText();
    }

    public String getCompanyName() {
        WebElement CompanyName = driver.findElement(COMPANY_NAME_LOCATOR);
        scrollToElement(CompanyName);
        return driver.findElement(COMPANY_NAME_LOCATOR).getText();
    }

    public String getJobTitle() {
        WebElement jobTitle = driver.findElement(JOB_TITLE_LOCATOR);
        scrollToElement(jobTitle);
        return driver.findElement(JOB_TITLE_LOCATOR).getText();
    }

    public String getPhoneNumber() {
        WebElement phoneNumber = driver.findElement(PHONE_NUMBER_LOCATOR);
        scrollToElement(phoneNumber);
        return driver.findElement(PHONE_NUMBER_LOCATOR).getText();
    }

    public String getEmailAddress() {
        WebElement emailAddress = driver.findElement(EMAIL_LOCATOR);
        scrollToElement(emailAddress);
        return driver.findElement(EMAIL_LOCATOR).getText();
    }

    public String getAddress() {
        WebElement address = driver.findElement(ADDRESS_LOCATOR);
        scrollToElement(address);
        return driver.findElement(ADDRESS_LOCATOR).getText();
    }

    public String getWebsiteURL() {
        WebElement websiteURL = driver.findElement(WEBSITE_LOCATOR);
        scrollToElement(websiteURL);
        return driver.findElement(WEBSITE_LOCATOR).getText();
    }

    public String getNumberOfEmployees() {
        WebElement numberOfEmployees = driver.findElement(NUMBER_OF_EMPLOYEES_LOCATOR);
        scrollToElement(numberOfEmployees);
        return driver.findElement(NUMBER_OF_EMPLOYEES_LOCATOR).getText();
    }

    public String getAnnualRevenue() {
        WebElement annualRevenue = driver.findElement(ANNUAL_REVENUE_LOCATOR);
        scrollToElement(annualRevenue);
        return driver.findElement(ANNUAL_REVENUE_LOCATOR).getText();
    }

}

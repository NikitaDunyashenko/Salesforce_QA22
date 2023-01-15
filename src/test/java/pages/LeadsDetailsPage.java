package pages;

import models.Lead;
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
    private final static By DESCRIPTION_LOCATOR = By.xpath("//span[text()='Description']//parent::div//following-sibling::div//lightning-formatted-text");
    private final static String DROPDOWNS_LOCATOR = "//span[text()='%s']//parent::div//following-sibling::div//lightning-formatted-text";


    public LeadsDetailsPage(WebDriver driver) {
        super(driver);
    }

    public Lead getLeadDetails() {
        Lead lead = new Lead(getSalutation(), getFirstName(), getLastName(), getCompanyName(), getJobTitle(), getLeadStatus(), getPhoneNumber(), getEmailAddress(), getRating(), getStreet(), getCity(), getCountry(), getWebsiteURL(), getNumberOfEmployees(), getAnnualRevenue(), getLeadSource(), getIndustry(), getDescription());
        return lead;
    }

    public boolean isToastMessageAppears() {
        waitForElementDisplayed(TOAST_MESSAGE);
        return driver.findElement(TOAST_MESSAGE).isDisplayed();
    }

    private By getDropdownsLocator(String labelName) {
        return By.xpath(String.format(DROPDOWNS_LOCATOR, labelName));
    }

    public String getDescription() {
        return driver.findElement(DESCRIPTION_LOCATOR).getText();
    }

    public String getLeadStatus() {
        return driver.findElement(getDropdownsLocator("Lead Status")).getText();
    }

    public String getRating() {
        return driver.findElement(getDropdownsLocator("Rating")).getText();
    }

    public String getLeadSource() {
        return driver.findElement(getDropdownsLocator("Lead Source")).getText();
    }

    public String getIndustry() {
        return driver.findElement(getDropdownsLocator("Industry")).getText();
    }

    public String getSalutation() {
        WebElement fullNameLocator = driver.findElement(FULL_NAME_LOCATOR);
        scrollToElement(fullNameLocator);
        String fullName = driver.findElement(FULL_NAME_LOCATOR).getText();
        int firstSpaceIndex = driver.findElement(FULL_NAME_LOCATOR).getText().indexOf(" ");
        String salutation = fullName.substring(0, firstSpaceIndex - 1);
        return salutation;
    }

    public String getFirstName() {
        WebElement fullNameLocator = driver.findElement(FULL_NAME_LOCATOR);
        scrollToElement(fullNameLocator);
        String fullName = driver.findElement(FULL_NAME_LOCATOR).getText();
        int firstSpaceIndex = driver.findElement(FULL_NAME_LOCATOR).getText().indexOf(" ");
        int lastSpaceIndex = driver.findElement(FULL_NAME_LOCATOR).getText().lastIndexOf(" ");
        String firstName = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex - 1);
        return firstName;
    }

    public String getLastName() {
        WebElement fullNameLocator = driver.findElement(FULL_NAME_LOCATOR);
        scrollToElement(fullNameLocator);
        String fullName = driver.findElement(FULL_NAME_LOCATOR).getText();
        int lastSpaceIndex = driver.findElement(FULL_NAME_LOCATOR).getText().lastIndexOf(" ");
        String lastName = fullName.substring(lastSpaceIndex + 1);
        return lastName;
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

    public String getStreet() {
        WebElement addressLocator = driver.findElement(ADDRESS_LOCATOR);
        scrollToElement(addressLocator);
        String address = driver.findElement(ADDRESS_LOCATOR).getText();
        int firstNewLineIndex = address.indexOf("\n");
        String street = address.substring(0, firstNewLineIndex - 1);
        return street;
    }

    public String getCity() {
        WebElement addressLocator = driver.findElement(ADDRESS_LOCATOR);
        scrollToElement(addressLocator);
        String address = driver.findElement(ADDRESS_LOCATOR).getText();
        int firstNewLineIndex = address.indexOf("\n");
        int lastNewLineIndex = address.lastIndexOf("\n");
        String city = address.substring(firstNewLineIndex + 1, lastNewLineIndex - 1);
        return city;
    }

    public String getCountry() {
        WebElement addressLocator = driver.findElement(ADDRESS_LOCATOR);
        scrollToElement(addressLocator);
        String address = driver.findElement(ADDRESS_LOCATOR).getText();
        int lastNewLineIndex = address.lastIndexOf("\n");
        String country = address.substring(lastNewLineIndex + 1);
        return country;
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

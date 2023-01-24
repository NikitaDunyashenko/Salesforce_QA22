package pages;

import elements.RecordLayoutItem;
import enums.Industry;
import enums.LeadSource;
import enums.LeadStatus;
import enums.Rating;
import lombok.extern.log4j.Log4j2;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class LeadsDetailsPage extends HomePage{

    private final static By TOAST_MESSAGE = By.xpath("//div[contains(@class,'slds-theme--success')]");
    private final static By FULL_NAME_LOCATOR = By.xpath("//*[text()='Name']//parent::div//following-sibling::div//descendant::lightning-formatted-name");
    private final static By ADDRESS_LOCATOR = By.xpath("//*[text()='Address']//parent::div//following-sibling::div//descendant::lightning-formatted-address");
    private final static String DROPDOWNS_LOCATOR = "//span[text()='%s']//parent::div//following-sibling::div//lightning-formatted-text";


    public LeadsDetailsPage(WebDriver driver) {
        super(driver);
    }

    public Lead getLeadDetails() {

        Lead.LeadBuilder lead = new Lead.LeadBuilder();
        log.info("setting another Lead object's field: Salutation");
        lead.setSalutation(new LeadsDetailsPage(driver).getSalutation());
        log.info("setting another Lead object's field: First Name");
        lead.setFirstName(new LeadsDetailsPage(driver).getFirstName());
        log.info("setting another Lead object's field: Last Name");
        lead.setLastName(new LeadsDetailsPage(driver).getLastName());
        log.info("setting another Lead object's field: Company");
        lead.setCompanyName(new RecordLayoutItem(driver, "Company").getDetailsValue());
        log.info("setting another Lead object's field: Lead Status");
        lead.setLeadStatus(LeadStatus.fromString("New"));
        log.info("setting another Lead object's field: Title");
        lead.setJobTitle(new RecordLayoutItem(driver, "Title").getDetailsValue());
        log.info("setting another Lead object's field: Phone");
        lead.setPhone(new RecordLayoutItem(driver, "Phone").getDetailsValue());
        log.info("setting another Lead object's field: Email");
        lead.setEmail(new RecordLayoutItem(driver, "Email").getDetailsValue());
        log.info("setting another Lead object's field: Rating");
        lead.setRating(Rating.fromString("Hot"));
        log.info("setting another Lead object's field: Street");
        lead.setStreet(new LeadsDetailsPage(driver).getStreet());
        log.info("setting another Lead object's field: City");
        lead.setCity(new LeadsDetailsPage(driver).getCity());
        log.info("setting another Lead object's field: Country");
        lead.setCountry(new LeadsDetailsPage(driver).getCountry());
        log.info("setting another Lead object's field: Website");
        lead.setWebsite(new RecordLayoutItem(driver, "Website").getDetailsValue());
        log.info("setting another Lead object's field: No. of Employees");
        lead.setNumberOfEmployees(new RecordLayoutItem(driver, "No. of Employees").getDetailsValue());
        log.info("setting another Lead object's field: Annual Revenue");
        lead.setAnnualRevenue(new RecordLayoutItem(driver, "Annual Revenue").getDetailsValue());
        log.info("setting another Lead object's field: Lead Source");
        lead.setLeadSource(LeadSource.fromString("Web"));
        log.info("setting another Lead object's field: Industry");
        lead.setIndustry(Industry.fromString("Apparel"));
        log.info("setting another Lead object's field: Description");
        lead.setDescription(new RecordLayoutItem(driver, "Description").getDetailsValue());

        return lead.build();
    }

    public boolean isToastMessageAppears() {
        waitForElementDisplayed(TOAST_MESSAGE);
        return driver.findElement(TOAST_MESSAGE).isDisplayed();
    }

    private By getDropdownsLocator(String labelName) {
        return By.xpath(String.format(DROPDOWNS_LOCATOR, labelName));
    }

    public String getSalutation() {
        log.info("finding Full Name");
        WebElement fullNameLocator = driver.findElement(FULL_NAME_LOCATOR);
        scrollToElement(fullNameLocator);
        log.info("getting text from Full Name");
        String fullName = driver.findElement(FULL_NAME_LOCATOR).getText();
        int firstSpaceIndex = driver.findElement(FULL_NAME_LOCATOR).getText().indexOf(" ");
        String salutation = fullName.substring(0, firstSpaceIndex);
        log.info(String.format("getting Salutation: %s from Full Name", salutation));
        return salutation;
    }

    public String getFirstName() {
        log.info("finding Full Name");
        WebElement fullNameLocator = driver.findElement(FULL_NAME_LOCATOR);
        scrollToElement(fullNameLocator);
        log.info("getting text from Full Name");
        String fullName = driver.findElement(FULL_NAME_LOCATOR).getText();
        int firstSpaceIndex = driver.findElement(FULL_NAME_LOCATOR).getText().indexOf(" ");
        int lastSpaceIndex = driver.findElement(FULL_NAME_LOCATOR).getText().lastIndexOf(" ");
        String firstName = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);
        log.info(String.format("getting First Name: %s from Full Name", firstName));
        return firstName;
    }

    public String getLastName() {
        log.info("finding Full Name");
        WebElement fullNameLocator = driver.findElement(FULL_NAME_LOCATOR);
        scrollToElement(fullNameLocator);
        log.info("getting text from Full Name");
        String fullName = driver.findElement(FULL_NAME_LOCATOR).getText();
        int lastSpaceIndex = driver.findElement(FULL_NAME_LOCATOR).getText().lastIndexOf(" ");
        String lastName = fullName.substring(lastSpaceIndex + 1);
        log.info(String.format("getting Last Name: %s from Full Name", lastName));
        return lastName;
    }

    public String getStreet() {
        log.info("finding Full Address");
        WebElement addressLocator = driver.findElement(ADDRESS_LOCATOR);
        scrollToElement(addressLocator);
        log.info("getting text from Full Address");
        String address = driver.findElement(ADDRESS_LOCATOR).getText();
        int firstNewLineIndex = address.indexOf("\n");
        String street = address.substring(0, firstNewLineIndex);
        log.info(String.format("getting Street: %s from Full Address", street));
        return street;
    }

    public String getCity() {
        log.info("finding Full Address");
        WebElement addressLocator = driver.findElement(ADDRESS_LOCATOR);
        scrollToElement(addressLocator);
        log.info("getting text from Full Address");
        String address = driver.findElement(ADDRESS_LOCATOR).getText();
        int firstNewLineIndex = address.indexOf("\n");
        int lastNewLineIndex = address.lastIndexOf("\n");
        String city = address.substring(firstNewLineIndex + 1, lastNewLineIndex);
        log.info(String.format("getting City: %s from Full Address", city));
        return city;
    }

    public String getCountry() {
        log.info("finding Full Address");
        WebElement addressLocator = driver.findElement(ADDRESS_LOCATOR);
        scrollToElement(addressLocator);
        log.info("getting text from Full Address");
        String address = driver.findElement(ADDRESS_LOCATOR).getText();
        int lastNewLineIndex = address.lastIndexOf("\n");
        String country = address.substring(lastNewLineIndex + 1);
        log.info(String.format("getting Country: %s from Full Address", country));
        return country;
    }

}

package pages;

import elements.ComboboxContacts;
import elements.RecordLayoutItem;
import enums.LeadSource;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class ContactsDetailsPage extends HomePage{

    private final static By FULL_NAME_LOCATOR = By.xpath("//lightning-formatted-name");
    private final static By MAILING_ADDRESS_LOCATOR = By.xpath("//span[text()='Mailing Address']//parent::div//following-sibling::div//a");
    private final static By OTHER_ADDRESS_LOCATOR = By.xpath("//span[text()='Other Address']//parent::div//following-sibling::div//a");
    private final static By DROPDOWN_LOCATOR = By.xpath("//span[text()='Lead Source']//parent::div//following-sibling::div//lightning-formatted-text");
    private final static By ACCOUNT_NAME_LOCATOR = By.xpath("//span[@class='test-id__field-label' and text()='Account Name']//parent::div//following-sibling::div//*[@slot='outputField']//slot/span");

    public ContactsDetailsPage(WebDriver driver) {
        super(driver);
    }

    public Contact getContactDetails() {
        Contact.ContactBuilder contact = new Contact.ContactBuilder();
        log.info("setting another Contact object's field: Salutation");
        contact.setSalutation(new ContactsDetailsPage(driver).getSalutation());
        log.info("setting another Contact object's field: First Name");
        contact.setFirstName(new ContactsDetailsPage(driver).getFirstName());
        log.info("setting another Contact object's field: Last Name");
        contact.setLastName(new ContactsDetailsPage(driver).getLastName());
        log.info("setting another Contact object's field: Account Name");
        contact.setAccountName(new ContactsDetailsPage(driver).getAccountName());
        log.info("setting another Contact object's field: Title");
        contact.setTitle(new RecordLayoutItem(driver, "Title").getDetailsValue());
        log.info("setting another Contact object's field: Phone");
        contact.setPhone(new RecordLayoutItem(driver, "Phone").getDetailsValue());
        log.info("setting another Contact object's field: Mobile");
        contact.setMobile(new RecordLayoutItem(driver, "Mobile").getDetailsValue());
        log.info("setting another Contact object's field: Email");
        contact.setEmail(new RecordLayoutItem(driver, "Email").getDetailsValue());
        log.info("setting another Contact object's field: Mailing Street");
        contact.setMailingStreet(new ContactsDetailsPage(driver).getMailingStreet());
        log.info("setting another Contact object's field: Mailing City");
        contact.setMailingCity(new ContactsDetailsPage(driver).getMailingCity());
        log.info("setting another Contact object's field: Mailing Zip");
        contact.setMailingZip(new ContactsDetailsPage(driver).getMailingZip());
        log.info("setting another Contact object's field: Mailing Country");
        contact.setMailingCountry(new ContactsDetailsPage(driver).getMailingCountry());
        log.info("setting another Contact object's field: Other Street");
        contact.setOtherStreet(new ContactsDetailsPage(driver).getOtherStreet());
        log.info("setting another Contact object's field: Other City");
        contact.setOtherCity(new ContactsDetailsPage(driver).getOtherCity());
        log.info("setting another Contact object's field: Other Zip");
        contact.setOtherZip(new ContactsDetailsPage(driver).getOtherZip());
        log.info("setting another Contact object's field: Other Country");
        contact.setOtherCountry(new ContactsDetailsPage(driver).getOtherCountry());
        log.info("setting another Contact object's field: Fax");
        contact.setFax(new RecordLayoutItem(driver, "Fax").getDetailsValue());
        log.info("setting another Contact object's field: Home Phone");
        contact.setHomePhone(new RecordLayoutItem(driver, "Home Phone").getDetailsValue());
        log.info("setting another Contact object's field: Other Phone");
        contact.setOtherPhone(new RecordLayoutItem(driver, "Other Phone").getDetailsValue());
        log.info("setting another Contact object's field: Asst. Phone");
        contact.setAssistantPhone(new RecordLayoutItem(driver, "Asst. Phone").getDetailsValue());
        log.info("setting another Contact object's field: Assistant");
        contact.setAssistant(new RecordLayoutItem(driver, "Assistant").getDetailsValue());
        log.info("setting another Contact object's field: Department");
        contact.setDepartment(new RecordLayoutItem(driver, "Department").getDetailsValue());
        log.info("setting another Contact object's field: Lead Source");
        contact.setLeadSource(LeadSource.fromString(getLeadSourceValue()));
        log.info("setting another Contact object's field: Description");
        contact.setDescription(new RecordLayoutItem(driver, "Description").getDetailsValue());

        return contact.build();
    }

    public String getLeadSourceValue() {
        log.info("getting Lead Source Text");
        return driver.findElement(DROPDOWN_LOCATOR).getText();
    }

    public String getAccountName() {
        log.info("getting Account Name Text");
        return driver.findElement(ACCOUNT_NAME_LOCATOR).getText();
    }

    public String getSalutation() {
        log.info("getting text from Full Name");
        String fullName = driver.findElement(FULL_NAME_LOCATOR).getText();
        int firstSpaceIndex = fullName.indexOf(" ");
        String salutation = fullName.substring(0, firstSpaceIndex);
        log.info(String.format("getting Salutation: %s from Full Name", salutation));
        return salutation;
    }

    public String getFirstName() {
        log.info("getting text from Full Name");
        String fullName = driver.findElement(FULL_NAME_LOCATOR).getText();
        int firstSpaceIndex = fullName.indexOf(" ");
        int lastSpaceIndex = fullName.lastIndexOf(" ");
        String firstName = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);
        log.info(String.format("getting First Name: %s from Full Name", firstName));
        return firstName;
    }

    public String getLastName() {
        log.info("getting text from Full Name");
        String fullName = driver.findElement(FULL_NAME_LOCATOR).getText();
        int lastSpaceIndex = fullName.lastIndexOf(" ");
        String lastName = fullName.substring(lastSpaceIndex + 1);
        log.info(String.format("getting Last Name: %s from Full Name", lastName));
        return lastName;
    }

    public String getMailingStreet() {
        log.info("getting text from Full Mailing Address");
        String fullMailingAddress = driver.findElement(MAILING_ADDRESS_LOCATOR).getText();
        int firstNewLineIndex = fullMailingAddress.indexOf("\n");
        String mailingStreet = fullMailingAddress.substring(0, firstNewLineIndex);
        log.info(String.format("getting Mailing Street: %s from full Mailing Address", mailingStreet));
        return mailingStreet;
    }

    public String getOtherStreet() {
        log.info("getting text from Full Other Address");
        String fullOtherAddress = driver.findElement(OTHER_ADDRESS_LOCATOR).getText();
        int firstNewLineIndex = fullOtherAddress.indexOf("\n");
        String otherStreet = fullOtherAddress.substring(0, firstNewLineIndex);
        log.info(String.format("getting Other Street: %s from full Other Address", otherStreet));
        return otherStreet;
    }

    public String getMailingCity() {
        log.info("getting text from Full Mailing Address");
        String fullMailingAddress = driver.findElement(MAILING_ADDRESS_LOCATOR).getText();
        int firstNewLineIndex = fullMailingAddress.indexOf("\n");
        int lastNewLineIndex = fullMailingAddress.lastIndexOf("\n");
        String cityAndZip = fullMailingAddress.substring(firstNewLineIndex + 1, lastNewLineIndex);
        int commaIndex = cityAndZip.indexOf(",");
        String city = cityAndZip.substring(0, commaIndex);
        log.info(String.format("getting Mailing City: %s from full city and zip", city));
        return city;
    }

    public String getOtherCity() {
        log.info("getting text from Full Other Address");
        String fullOtherAddress = driver.findElement(OTHER_ADDRESS_LOCATOR).getText();
        int firstNewLineIndex = fullOtherAddress.indexOf("\n");
        int lastNewLineIndex = fullOtherAddress.lastIndexOf("\n");
        String cityAndZip = fullOtherAddress.substring(firstNewLineIndex + 1, lastNewLineIndex);
        int commaIndex = cityAndZip.indexOf(",");
        String city = cityAndZip.substring(0, commaIndex);
        log.info(String.format("getting Other City: %s from city and zip", city));
        return city;
    }

    public String getMailingZip() {
        log.info("getting text from Full Mailing Address");
        String fullMailingAddress = driver.findElement(MAILING_ADDRESS_LOCATOR).getText();
        int firstNewLineIndex = fullMailingAddress.indexOf("\n");
        int lastNewLineIndex = fullMailingAddress.lastIndexOf("\n");
        String cityAndZip = fullMailingAddress.substring(firstNewLineIndex + 1, lastNewLineIndex);
        int commaIndex = cityAndZip.indexOf(",");
        String zip = cityAndZip.substring(commaIndex + 2);
        log.info(String.format("getting Mailing Zip: %s from full city and zip", zip));
        return zip;
    }

    public String getOtherZip() {
        log.info("getting text from Full Other Address");
        String fullOtherAddress = driver.findElement(OTHER_ADDRESS_LOCATOR).getText();
        int firstNewLineIndex = fullOtherAddress.indexOf("\n");
        int lastNewLineIndex = fullOtherAddress.lastIndexOf("\n");
        String cityAndZip = fullOtherAddress.substring(firstNewLineIndex + 1, lastNewLineIndex);
        int commaIndex = cityAndZip.indexOf(",");
        String zip = cityAndZip.substring(commaIndex + 2);
        log.info(String.format("getting Other Zip: %s from city and zip", zip));
        return zip;
    }

    public String getMailingCountry() {
        log.info("getting text from Full Mailing Address");
        String fullMailingAddress = driver.findElement(MAILING_ADDRESS_LOCATOR).getText();
        int lastNewLineIndex = fullMailingAddress.lastIndexOf("\n");
        String mailingCountry = fullMailingAddress.substring(lastNewLineIndex + 1);
        log.info(String.format("getting Mailing Country: %s from full Mailing Address", mailingCountry));
        return mailingCountry;
    }

    public String getOtherCountry() {
        log.info("getting text from Full Other Address");
        String fullOtherAddress = driver.findElement(OTHER_ADDRESS_LOCATOR).getText();
        int lastNewLineIndex = fullOtherAddress.lastIndexOf("\n");
        String otherCountry = fullOtherAddress.substring(lastNewLineIndex + 1);
        log.info(String.format("getting Other Country: %s from Full Other Address", otherCountry));
        return otherCountry;
    }

}

package modals;

import elements.ComboboxContacts;
import elements.Dropdown;
import elements.Input;
import elements.TextArea;
import enums.LeadSource;
import lombok.extern.log4j.Log4j2;
import models.Contact;
import org.openqa.selenium.WebDriver;

@Log4j2
public class NewContactModal extends BaseModal{

    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    public void fillContactForm(Contact contact) {
        log.info(String.format("filling the First Name field with the following value: %s", contact.getFirstName()));
        new Input(driver, "First Name").setValue(contact.getFirstName());
        log.info(String.format("filling the Last Name field with the following value: %s", contact.getLastName()));
        new Input(driver, "Last Name").setValue(contact.getLastName());
        log.info(String.format("filling the Title field with the following value: %s", contact.getTitle()));
        new Input(driver, "Title").setValue(contact.getTitle());
        log.info(String.format("filling the Phone field with the following value: %s", contact.getPhone()));
        new Input(driver,"Phone").setValue(contact.getPhone());
        log.info(String.format("filling the Mobile field with the following value: %s", contact.getMobile()));
        new Input(driver, "Mobile").setValue(contact.getMobile());
        log.info(String.format("filling the Email field with the following value: %s", contact.getEmail()));
        new Input(driver, "Email").setValue(contact.getEmail());
        log.info(String.format("filling the Mailing City field with the following value: %s", contact.getMailingCity()));
        new Input(driver, "Mailing City").setValue(contact.getMailingCity());
        log.info(String.format("filling the Mailing Zip/Postal Code field with the following value: %s", contact.getMailingZip()));
        new Input(driver, "Mailing Zip/Postal Code").setValue(contact.getMailingZip());
        log.info(String.format("filling the Mailing Country field with the following value: %s", contact.getMailingCountry()));
        new Input(driver, "Mailing Country").setValue(contact.getMailingCountry());
        log.info(String.format("filling the Other City field with the following value: %s", contact.getOtherCity()));
        new Input(driver, "Other City").setValue(contact.getOtherCity());
        log.info(String.format("filling the Other Zip/Postal Code field with the following value: %s", contact.getOtherZip()));
        new Input(driver, "Other Zip/Postal Code").setValue(contact.getOtherZip());
        log.info(String.format("filling the Other Country field with the following value: %s", contact.getOtherCountry()));
        new Input(driver, "Other Country").setValue(contact.getOtherCountry());
        log.info(String.format("filling the Fax field with the following value: %s", contact.getFax()));
        new Input(driver, "Fax").setValue(contact.getFax());
        log.info(String.format("filling the Home Phone field with the following value: %s", contact.getHomePhone()));
        new Input(driver, "Home Phone").setValue(contact.getHomePhone());
        log.info(String.format("filling the Other Phone field with the following value: %s", contact.getOtherPhone()));
        new Input(driver, "Other Phone").setValue(contact.getOtherPhone());
        log.info(String.format("filling the Asst. Phone field with the following value: %s", contact.getAssistantPhone()));
        new Input(driver, "Asst. Phone").setValue(contact.getAssistantPhone());
        log.info(String.format("filling the Assistant field with the following value: %s", contact.getAssistant()));
        new Input(driver, "Assistant").setValue(contact.getAssistant());
        log.info(String.format("filling the Department field with the following value: %s", contact.getDepartment()));
        new Input(driver, "Department").setValue(contact.getDepartment());
        log.info(String.format("filling the Account Name field with the following value: %s", contact.getAccountName()));
        new ComboboxContacts(driver, "Account Name").chooseComboboxValue(contact.getAccountName());
        log.info(String.format("filling the Salutation field with the following value: %s", contact.getSalutation()));
        new Dropdown(driver, "Salutation").chooseDropdownOption(contact.getSalutation());
        log.info(String.format("filling the Lead Source field with the following value: %s", contact.getLeadSource().getName()));
        new Dropdown(driver, "Lead Source").chooseDropdownOption(LeadSource.WEB.getName());
        log.info(String.format("filling the Mailing Street field with the following value: %s", contact.getMailingStreet()));
        new TextArea(driver, "Mailing Street").setTextAreaValues(contact.getMailingStreet());
        log.info(String.format("filling the Other Street field with the following value: %s", contact.getOtherStreet()));
        new TextArea(driver, "Other Street").setTextAreaValues(contact.getOtherStreet());
        log.info(String.format("filling the Description field with the following value: %s", contact.getDescription()));
        new TextArea(driver, "Description").setTextAreaValues(contact.getDescription());


    }
}

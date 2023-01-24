package modals;

import elements.Dropdown;
import elements.Input;
import elements.TextArea;
import enums.LeadStatus;
import lombok.extern.log4j.Log4j2;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class NewLeadModal extends BaseModal{

    public NewLeadModal(WebDriver driver) {
        super(driver);
    }

    public void fillForm(Lead lead) {
        log.info(String.format("filling the First Name field with the following value: %s", lead.getFirstName()));
        new Input(driver, "First Name").setValue(lead.getFirstName());
        log.info(String.format("filling the Last Name field with the following value: %s", lead.getLastName()));
        new Input(driver, "Last Name").setValue(lead.getLastName());
        log.info(String.format("filling the Phone field with the following value: %s", lead.getPhone()));
        new Input(driver, "Phone").setValue(lead.getPhone());
        log.info(String.format("filling the Company field with the following value: %s", lead.getCompanyName()));
        new Input(driver, "Company").setValue(lead.getCompanyName());
        log.info(String.format("filling the Email field with the following value: %s", lead.getEmail()));
        new Input(driver, "Email").setValue(lead.getEmail());
        log.info(String.format("filling the Title field with the following value: %s", lead.getJobTitle()));
        new Input(driver, "Title").setValue(lead.getJobTitle());
        log.info(String.format("filling the Website field with the following value: %s", lead.getWebsite()));
        new Input(driver, "Website").setValue(lead.getWebsite());
        log.info(String.format("filling the City field with the following value: %s", lead.getCity()));
        new Input(driver, "City").setValue(lead.getCity());
        log.info(String.format("filling the Country field with the following value: %s", lead.getCountry()));
        new Input(driver, "Country").setValue(lead.getCountry());
        log.info(String.format("filling the No. of Employees field with the following value: %s", lead.getNumberOfEmployees()));
        new Input(driver, "No. of Employees").setValue(lead.getNumberOfEmployees());
        log.info(String.format("filling the Annual Revenue field with the following value: %s", lead.getAnnualRevenue()));
        new Input(driver, "Annual Revenue").setValue(lead.getAnnualRevenue());
        log.info(String.format("filling the Lead Status field with the following value: %s", lead.getLeadStatus().getName()));
        new Dropdown(driver, "Lead Status").chooseDropdownOption(lead.getLeadStatus().getName());
        log.info(String.format("filling the Salutation field with the following value: %s", lead.getSalutation()));
        new Dropdown(driver, "Salutation").chooseDropdownOption(lead.getSalutation());
        log.info(String.format("filling the Rating field with the following value: %s", lead.getRating().getName()));
        new Dropdown(driver, "Rating").chooseDropdownOption(lead.getRating().getName());
        log.info(String.format("filling the Lead Source field with the following value: %s", lead.getLeadSource().getName()));
        new Dropdown(driver, "Lead Source").chooseDropdownOption(lead.getLeadSource().getName());
        log.info(String.format("filling the Industry field with the following value: %s", lead.getIndustry().getName()));
        new Dropdown(driver, "Industry").chooseDropdownOption(lead.getIndustry().getName());
        log.info(String.format("filling the Street field with the following value: %s", lead.getStreet()));
        new TextArea(driver, "Street").setTextAreaValues(lead.getStreet());
        log.info(String.format("filling the Description field with the following value: %s", lead.getDescription()));
        new TextArea(driver, "Description").setTextAreaValues(lead.getDescription());
    }
}

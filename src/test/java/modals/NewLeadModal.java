package modals;

import elements.Dropdown;
import elements.Input;
import elements.TextArea;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewLeadModal extends BaseModal{



    public NewLeadModal(WebDriver driver) {
        super(driver);
    }

    public void fillForm(Lead lead) {
        new Input(driver, "firstName").setValue(lead.getFirstName());
        new Input(driver, "lastName").setValue(lead.getLastName());
        new Input(driver, "Phone").setValue(lead.getPhone());
        new Input(driver, "Company").setValue(lead.getCompanyName());
        new Input(driver, "Email").setValue(lead.getEmail());
        new Input(driver, "Title").setValue(lead.getJobTitle());
        new Input(driver, "Website").setValue(lead.getWebsite());
        new Input(driver, "city").setValue(lead.getCity());
        new Input(driver, "country").setValue(lead.getCountry());
        new Input(driver, "NumberOfEmployees").setValue(lead.getNumberOfEmployees());
        new Input(driver, "AnnualRevenue").setValue(lead.getAnnualRevenue());
        new Dropdown(driver, "Lead Status").chooseDropdownOption(lead.getLeadStatus());
        new Dropdown(driver, "Salutation").chooseDropdownOption(lead.getSalutation());
        new Dropdown(driver, "Rating").chooseDropdownOption(lead.getRating());
        new Dropdown(driver, "Lead Source").chooseDropdownOption(lead.getLeadSource());
        new Dropdown(driver, "Industry").chooseDropdownOption(lead.getIndustry());
        new TextArea(driver, "Street").setTextAreaValues(lead.getStreet());
        new TextArea(driver, "Description").setTextAreaValues(lead.getDescription());
    }
}

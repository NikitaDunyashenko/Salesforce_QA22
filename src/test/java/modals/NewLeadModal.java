package modals;

import elements.Dropdown;
import elements.Input;
import elements.TextArea;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewLeadModal extends BaseModal{



    public NewLeadModal(WebDriver driver) {
        super(driver);
    }

    public void fillForm(String firstName, String lastName, String phone, String companyName, String email, String title, String website, String city, String country, String numberOfEmployees, String annualRevenue, String leadStatus, String salutation, String rating, String leadSource, String industry, String street, String description) {
        new Input(driver, "firstName").setValue(firstName);
        new Input(driver, "lastName").setValue(lastName);
        new Input(driver, "Phone").setValue(phone);
        new Input(driver, "Company").setValue(companyName);
        new Input(driver, "Email").setValue(email);
        new Input(driver, "Title").setValue(title);
        new Input(driver, "Website").setValue(website);
        new Input(driver, "city").setValue(city);
        new Input(driver, "country").setValue(country);
        new Input(driver, "NumberOfEmployees").setValue(numberOfEmployees);
        new Input(driver, "AnnualRevenue").setValue(annualRevenue);
        new Dropdown(driver, "Lead Status").chooseDropdownOption(leadStatus);
        new Dropdown(driver, "Salutation").chooseDropdownOption(salutation);
        new Dropdown(driver, "Rating").chooseDropdownOption(rating);
        new Dropdown(driver, "Lead Source").chooseDropdownOption(leadSource);
        new Dropdown(driver, "Industry").chooseDropdownOption(industry);
        new TextArea(driver, "Street").setTextAreaValues(street);
        new TextArea(driver, "Description").setTextAreaValues(description);
    }
}

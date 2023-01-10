package modals;

import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewLeadModal extends BaseModal{



    public NewLeadModal(WebDriver driver) {
        super(driver);
    }

    public void fillForm(String firstName, String lastName, String phone, String companyName, String email, String title, String website, String city, String country, String numberOfEmployees, String annualRevenue) {
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
    }
}

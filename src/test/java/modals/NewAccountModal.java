package modals;

import elements.DropdownAccounts;
import elements.InputAccounts;
import elements.TextAreaAccounts;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
@Log4j2
public class NewAccountModal extends BaseModal{

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public void fillAccountForm(Account account){
        log.info(String.format("filling the Account Name field with the following value: %s", account.getAccountName()));
        new InputAccounts(driver, "Account Name").setInputValue(account.getAccountName());
        log.info(String.format("filling the Phone field with the following value: %s", account.getPhone()));
        new InputAccounts(driver, "Phone").setInputValue(account.getPhone());
        log.info(String.format("filling the Fax field with the following value: %s", account.getFax()));
        new InputAccounts(driver, "Fax").setInputValue(account.getFax());
        log.info(String.format("filling the Website field with the following value: %s", account.getWebsite()));
        new InputAccounts(driver, "Website").setInputValue(account.getWebsite());
        log.info(String.format("filling the Employees field with the following value: %s", account.getEmployees()));
        new InputAccounts(driver, "Employees").setInputValue(account.getEmployees());
        log.info(String.format("filling the Annual Revenue field with the following value: %s", account.getAnnualRevenue()));
        new InputAccounts(driver, "Annual Revenue").setInputValue(account.getAnnualRevenue());
        log.info(String.format("filling the Billing City field with the following value: %s", account.getBillingCity()));
        new InputAccounts(driver, "Billing City").setInputValue(account.getBillingCity());
        log.info(String.format("filling the Shipping City field with the following value: %s", account.getShippingCity()));
        new InputAccounts(driver, "Shipping City").setInputValue(account.getShippingCity());
        log.info(String.format("filling the Billing Zip/Postal Code field with the following value: %s", account.getBillingZip()));
        new InputAccounts(driver, "Billing Zip/Postal Code").setInputValue(account.getBillingZip());
        log.info(String.format("filling the Shipping Zip/Postal Code field with the following value: %s", account.getShippingZip()));
        new InputAccounts(driver, "Shipping Zip/Postal Code").setInputValue(account.getShippingZip());
        log.info(String.format("filling the Billing Country field with the following value: %s", account.getBillingCountry()));
        new InputAccounts(driver, "Billing Country").setInputValue(account.getBillingCountry());
        log.info(String.format("filling the Shipping Country field with the following value: %s", account.getShippingCountry()));
        new InputAccounts(driver, "Shipping Country").setInputValue(account.getShippingCountry());
        log.info(String.format("filling the Type field with the following value: %s", account.getType().getName()));
        new DropdownAccounts(driver, "Type").chooseAccountDropdownOption(account.getType().getName());
        log.info(String.format("filling the Industry field with the following value: %s", account.getIndustry().getName()));
        new DropdownAccounts(driver, "Industry").chooseAccountDropdownOption(account.getIndustry().getName());
        log.info(String.format("filling the Description field with the following value: %s", account.getDescription()));
        new TextAreaAccounts(driver, "Description").setTextareaAccountsValue(account.getDescription());
        log.info(String.format("filling the Billing Street field with the following value: %s", account.getBillingStreet()));
        new TextAreaAccounts(driver, "Billing Street").setTextareaAccountsValue(account.getBillingStreet());
        log.info(String.format("filling the Shipping Street field with the following value: %s", account.getShippingStreet()));
        new TextAreaAccounts(driver, "Shipping Street").setTextareaAccountsValue(account.getShippingStreet());
    }

}

package pages;

import elements.RecordLayoutItem;
import enums.Industry;
import enums.Type;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class AccountsDetailsPage extends HomePage{
    private final static String DROPDOWN_LOCATOR = "//span[@class='test-id__field-label' and text()='%s']//parent::div//following-sibling::div//*[@slot='outputField']";
    private final static By ANNUAL_REVENUE = By.xpath("//span[@class='test-id__field-label' and text()='Annual Revenue']//parent::div//following-sibling::div//*[@slot='outputField']");
    private final static By BILLING_ADDRESS = By.xpath("//span[@class='test-id__field-label' and text()='Billing Address']//parent::div//following-sibling::div//*[@slot='outputField']");
    private final static By SHIPPING_ADDRESS = By.xpath("//span[@class='test-id__field-label' and text()='Shipping Address']//parent::div//following-sibling::div//*[@slot='outputField']");

    public AccountsDetailsPage(WebDriver driver) {
        super(driver);
    }

    public Account getAccountDetails() {
        Account.AccountBuilder account = new Account.AccountBuilder();
        log.info("setting another Account object's field: Account Name");
        account.setAccountName(new RecordLayoutItem(driver, "Account Name").getDetailsValue());
        log.info("setting another Account object's field: Phone");
        account.setPhone(new RecordLayoutItem(driver, "Phone").getDetailsValue());
        log.info("setting another Account object's field: Fax");
        account.setFax(new RecordLayoutItem(driver, "Fax").getDetailsValue());
        log.info("setting another Account object's field: Website");
        account.setWebsite(new RecordLayoutItem(driver, "Website").getDetailsValue());
        log.info("setting another Account object's field: Type");
        account.setType(Type.fromString(getTypeDropdownValue("Type")));
        log.info("setting another Account object's field: Industry");
        account.setIndustry(Industry.fromString(getIndustryDropdownValue("Industry")));
        log.info("setting another Account object's field: Employees");
        account.setEmployees(new RecordLayoutItem(driver, "Employees").getDetailsValue());
        log.info("setting another Account object's field: Annual Revenue");
        account.setAnnualRevenue(new AccountsDetailsPage(driver).getAnnualRevenueValue());
        log.info("setting another Account object's field: Description");
        account.setDescription(new RecordLayoutItem(driver, "Description").getDetailsValue());
        log.info("setting another Account object's field: Billing Street");
        account.setBillingStreet(new AccountsDetailsPage(driver).getBillingStreet());
        log.info("setting another Account object's field: Billing City");
        account.setBillingCity(new AccountsDetailsPage(driver).getBillingCity());
        log.info("setting another Account object's field: Billing Zip Code");
        account.setBillingZip(new AccountsDetailsPage(driver).getBillingZipCode());
        log.info("setting another Account object's field: Billing Country");
        account.setBillingCountry(new AccountsDetailsPage(driver).getBillingCountry());
        log.info("setting another Account object's field: Shipping Street");
        account.setShippingStreet(new AccountsDetailsPage(driver).getShippingStreet());
        log.info("setting another Account object's field: Shipping City");
        account.setShippingCity(new AccountsDetailsPage(driver).getShippingCity());
        log.info("setting another Account object's field: Shipping Zip Code");
        account.setShippingZip(new AccountsDetailsPage(driver).getShippingZipCode());
        log.info("setting another Account object's field: Shipping Country");
        account.setShippingCountry(new AccountsDetailsPage(driver).getShippingCountry());

        return account.build();
    }

    public String getTypeDropdownValue(String labelName) {
        log.debug(String.format("getting value from Type using dynamic locator: %s", DROPDOWN_LOCATOR, labelName));
        return driver.findElement(By.xpath(String.format(DROPDOWN_LOCATOR, labelName))).getText();
    }

    public String getIndustryDropdownValue(String labelName) {
        log.debug(String.format("getting value from Industry using dynamic locator: %s", DROPDOWN_LOCATOR, labelName));
        return driver.findElement(By.xpath(String.format(DROPDOWN_LOCATOR, labelName))).getText();
    }

    public String getAnnualRevenueValue() {
        log.info("finding Annual Revenue Web Element");
        WebElement annualRevenue = driver.findElement(ANNUAL_REVENUE);
        String revenueWithoutCurrency = annualRevenue.getText().substring(1);
        log.info(String.format("getting annual revenue without currency: %s", revenueWithoutCurrency));
        return revenueWithoutCurrency;
    }

    public String getBillingStreet() {
        log.info("getting text from Billing Address");
        String billingAddress = driver.findElement(BILLING_ADDRESS).getText();
        int firstNewLineIndex = billingAddress.indexOf("\n");
        String billingStreet = billingAddress.substring(0, firstNewLineIndex);
        log.info(String.format("getting billing street: %s from full address", billingStreet));
        return billingStreet;
    }

    public String getShippingStreet() {
        log.info("getting text from Shipping Address");
        String shippingAddress = driver.findElement(SHIPPING_ADDRESS).getText();
        int firstNewLineIndex = shippingAddress.indexOf("\n");
        String shippingStreet = shippingAddress.substring(0, firstNewLineIndex);
        log.info(String.format("getting Shipping Street: %s from full address", shippingStreet));
        return shippingStreet;
    }

    public String getBillingCity() {
        log.info("getting text from Billing Address");
        String billingAddress = driver.findElement(BILLING_ADDRESS).getText();
        int firstNewLineIndex = billingAddress.indexOf("\n");
        int lastNewLineIndex = billingAddress.lastIndexOf("\n");
        String cityAndZip = billingAddress.substring(firstNewLineIndex + 1, lastNewLineIndex);
        int commaIndex = cityAndZip.indexOf(",");
        String billingCity = cityAndZip.substring(0, commaIndex);
        log.info(String.format("getting billing city: %s from city and zip", billingCity));
        return billingCity;
    }

    public String getShippingCity() {
        log.info("getting text from Shipping Address");
        String shippingAddress = driver.findElement(SHIPPING_ADDRESS).getText();
        int firstNewLineIndex = shippingAddress.indexOf("\n");
        int lastNewLineIndex = shippingAddress.lastIndexOf("\n");
        String cityAndZip = shippingAddress.substring(firstNewLineIndex + 1, lastNewLineIndex);
        int commaIndex = cityAndZip.indexOf(",");
        String shippingCity = cityAndZip.substring(0, commaIndex);
        log.info(String.format("getting Shipping City: %s from city and zip", shippingCity));
        return shippingCity;
    }

    public String getBillingZipCode() {
        log.info("getting text from Billing Address");
        String billingAddress = driver.findElement(BILLING_ADDRESS).getText();
        int firstNewLineIndex = billingAddress.indexOf("\n");
        int lastNewLineIndex = billingAddress.lastIndexOf("\n");
        String cityAndZip = billingAddress.substring(firstNewLineIndex + 1, lastNewLineIndex);
        int commaIndex = cityAndZip.indexOf(",");
        String billingZipCode = cityAndZip.substring(commaIndex + 2);
        log.info(String.format("getting Billing Zip Code: %s from city and zip", billingZipCode));
        return billingZipCode;
    }

    public String getShippingZipCode() {
        log.info("getting text from Shipping Address");
        String shippingAddress = driver.findElement(SHIPPING_ADDRESS).getText();
        int firstNewLineIndex = shippingAddress.indexOf("\n");
        int lastNewLineIndex = shippingAddress.lastIndexOf("\n");
        String cityAndZip = shippingAddress.substring(firstNewLineIndex + 1, lastNewLineIndex);
        int commaIndex = cityAndZip.indexOf(",");
        String shippingZipCode = cityAndZip.substring(commaIndex + 2);
        log.info(String.format("getting Shipping Zip Code: %s from city and zip", shippingZipCode));
        return shippingZipCode;
    }

    public String getBillingCountry() {
        log.info("getting text from Billing Address");
        String billingAddress = driver.findElement(BILLING_ADDRESS).getText();
        int lastNewLineIndex = billingAddress.lastIndexOf("\n");
        String billingCountry = billingAddress.substring(lastNewLineIndex + 1);
        log.info(String.format("getting Billing Country: %s from full address", billingCountry));
        return billingCountry;
    }

    public String getShippingCountry() {
        log.info("getting text from Shipping Address");
        String shippingAddress = driver.findElement(SHIPPING_ADDRESS).getText();
        int lastNewLineIndex = shippingAddress.lastIndexOf("\n");
        String shippingCountry = shippingAddress.substring(lastNewLineIndex + 1);
        log.info(String.format("getting Shipping Country: %s from full address", shippingCountry));
        return shippingCountry;
    }

}

package tests;

import enums.Industry;
import enums.Type;
import models.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountsTests extends BaseTest{

    @Test
    public void createNewAccount() {
        loginPage.setUserName(USER_NAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserIconDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());

        homePage.openAccountsTab();
        entityBasePage.clickNewButton();

        Account testAccount = new Account.AccountBuilder()
                .setAccountName("TeachMeSkills")
                .setPhone("+375 (29) 376-64-78")
                .setFax("12345678")
                .setWebsite("tms.com")
                .setEmployees("50")
                .setAnnualRevenue("100,000")
                .setType(Type.CUSTOMER)
                .setIndustry(Industry.APPAREL)
                .setDescription("Wants to have a demo")
                .setBillingStreet("Pobediteley, 7A")
                .setBillingCity("Minsk")
                .setBillingZip("220019")
                .setBillingCountry("Belarus")
                .setShippingStreet("Pobediteley, 7A")
                .setShippingCity("Minsk")
                .setShippingZip("220019")
                .setShippingCountry("Belarus")
                .build();

        newAccountModal.fillAccountForm(testAccount);
        newAccountModal.clickSaveButtonAccount();

        Assert.assertEquals(accountsDetailsPage.getAccountDetails(), testAccount);
    }
}

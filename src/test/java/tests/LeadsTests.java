package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntityBasePage;

public class LeadsTests extends BaseTest{

    @Test
    public void createNewLead() {
        loginPage.setUserName(USER_NAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserIconDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());

        homePage.openLeadsTab();
        entityBasePage.clickNewButton();

        String firstName = "Nikita";
        String lastName = "Dunyashenko";
        String phone = "+375 (44) 708-50-57";
        String companyName = "TeachMeSkills";
        String email = "nik123@tms.com";
        String title = "Automation QA Engineer";
        String website = "tms.com";
        String city = "Minsk";
        String country = "Belarus";
        String numberOfEmployees = "25";
        String annualRevenue = "$100,000";

        newLeadModal.fillForm(firstName, lastName, phone, companyName, email, title, website, city, country, numberOfEmployees, annualRevenue);
        newLeadModal.clickSaveButton();

        Assert.assertEquals(leadsDetailsPage.getFullName(), firstName + " " + lastName);
        Assert.assertEquals(leadsDetailsPage.getCompanyName(), companyName);
        Assert.assertEquals(leadsDetailsPage.getJobTitle(), title);
        Assert.assertEquals(leadsDetailsPage.getPhoneNumber(), phone);
        Assert.assertEquals(leadsDetailsPage.getEmailAddress(), email);
        Assert.assertEquals(leadsDetailsPage.getAddress(), city + "\n" + country);
        Assert.assertEquals(leadsDetailsPage.getWebsiteURL(), website);
        Assert.assertEquals(leadsDetailsPage.getNumberOfEmployees(), numberOfEmployees);
        Assert.assertEquals(leadsDetailsPage.getAnnualRevenue(), annualRevenue);
    }
}

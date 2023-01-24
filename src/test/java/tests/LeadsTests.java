package tests;

import enums.Industry;
import enums.LeadSource;
import enums.LeadStatus;
import enums.Rating;
import models.Lead;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntityBasePage;
import pages.LeadsDetailsPage;

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

        Lead testLead = new Lead.LeadBuilder()
                .setSalutation("Mr.")
                .setFirstName("Nikita")
                .setLastName("Dunyashenko")
                .setCompanyName("TeachMeSkills")
                .setLeadStatus(LeadStatus.NEW)
                .setJobTitle("Automation QA Engineer")
                .setPhone("+375 (44) 708-50-57")
                .setEmail("nik123@tms.com")
                .setRating(Rating.HOT)
                .setStreet("Pobediteley, 7A")
                .setCity("Minsk")
                .setCountry("Belarus")
                .setWebsite("tms.com")
                .setNumberOfEmployees("25")
                .setAnnualRevenue("$100,000")
                .setLeadSource(LeadSource.WEB)
                .setIndustry(Industry.APPAREL)
                .setDescription("lead from the company we met at conference")
                .build();

        newLeadModal.fillForm(testLead);
        newLeadModal.clickSaveButtonLead();

        Assert.assertEquals(leadsDetailsPage.getLeadDetails(), testLead);

    }
}

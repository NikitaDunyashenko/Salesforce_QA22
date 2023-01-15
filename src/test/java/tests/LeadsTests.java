package tests;

import models.Lead;
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

        Lead testLead = new Lead("Mr.", "Nikita", "Dunyashenko", "TeachMeSkills", "Automation QA Engineer", "New", "+375 (44) 708-50-57", "nik123@tms.com", "Hot", "Pobediteley avenue, 7A", "Minsk", "Belarus", "tms.com", "25", "$100,000", "Web", "Apparel", "lead from the company we met at conference");

        newLeadModal.fillForm(testLead);
        newLeadModal.clickSaveButton();

        Assert.assertEquals(leadsDetailsPage.getLeadDetails(), testLead);

    }
}

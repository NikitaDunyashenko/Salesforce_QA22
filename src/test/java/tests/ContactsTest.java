package tests;

import enums.LeadSource;
import models.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsTest extends BaseTest{

    @Test
    public void createNewContact() {
        loginPage.setUserName(USER_NAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserIconDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());

        homePage.openContactsTab();
        entityBasePage.clickNewButton();

        Contact testContact = new Contact.ContactBuilder()
                .setSalutation("Ms.")
                .setFirstName("Darya")
                .setLastName("Bokhan")
                .setAccountName("TeachMeSkills")
                .setTitle("QA Engineer")
                .setPhone("+375 (44) 589-90-54")
                .setMobile("+375 (25) 589-90-64")
                .setEmail("darya123@tms.com")
                .setMailingStreet("Pobediteley")
                .setMailingCity("Minsk")
                .setMailingZip("220019")
                .setMailingCountry("Belarus")
                .setOtherStreet("Nezavisimosti")
                .setOtherCity("Belostok")
                .setOtherZip("221900")
                .setOtherCountry("Poland")
                .setFax("123451234")
                .setHomePhone("254-15-05")
                .setOtherPhone("+375 (44) 349-96-14")
                .setAssistantPhone("+375 (44) 944-56-39")
                .setAssistant("Alina Gurskaya")
                .setDepartment("Sales")
                .setLeadSource(LeadSource.WEB)
                .setDescription("Wants to know the price")
                .build();

        newContactModal.fillContactForm(testContact);
        newContactModal.clickSaveButtonContact();

        Assert.assertEquals(contactsDetailsPage.getContactDetails(), testContact);
    }
}

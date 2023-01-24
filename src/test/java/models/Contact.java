package models;

import enums.LeadSource;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Builder(setterPrefix = "set")
public class Contact {

    private String salutation;
    private String firstName;
    private String lastName;
    private String accountName;
    private String title;
    private String phone;
    private String mobile;
    private String email;
    private String mailingStreet;
    private String mailingCity;
    private String mailingZip;
    private String mailingCountry;
    private String otherStreet;
    private String otherCity;
    private String otherZip;
    private String otherCountry;
    private String fax;
    private String homePhone;
    private String otherPhone;
    private String assistantPhone;
    private String assistant;
    private String department;
    private String description;
    private LeadSource leadSource;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(salutation, contact.salutation)
                && Objects.equals(firstName, contact.firstName)
                && Objects.equals(lastName, contact.lastName)
                && Objects.equals(accountName, contact.accountName)
                && Objects.equals(title, contact.title)
                && Objects.equals(phone, contact.phone)
                && Objects.equals(mobile, contact.mobile)
                && Objects.equals(email, contact.email)
                && Objects.equals(mailingStreet, contact.mailingStreet)
                && Objects.equals(mailingCity, contact.mailingCity)
                && Objects.equals(mailingZip, contact.mailingZip)
                && Objects.equals(mailingCountry, contact.mailingCountry)
                && Objects.equals(otherStreet, contact.otherStreet)
                && Objects.equals(otherCity, contact.otherCity)
                && Objects.equals(otherZip, contact.otherZip)
                && Objects.equals(otherCountry, contact.otherCountry)
                && Objects.equals(fax, contact.fax)
                && Objects.equals(homePhone, contact.homePhone)
                && Objects.equals(otherPhone, contact.otherPhone)
                && Objects.equals(assistantPhone, contact.assistantPhone)
                && Objects.equals(assistant, contact.assistant)
                && Objects.equals(department, contact.department)
                && Objects.equals(description, contact.description)
                && leadSource == contact.leadSource;
    }

    public static class ContactBuilder {
        public ContactBuilder() {

        }
    }
}
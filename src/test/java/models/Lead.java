package models;

import java.util.Objects;

public class Lead {
    private String salutation;
    private String firstName;
    private String lastName;
    private String companyName;
    private String jobTitle;
    private String leadStatus;
    private String phone;
    private String email;
    private String rating;
    private String street;
    private String city;
    private String country;
    private String website;
    private String numberOfEmployees;
    private String annualRevenue;
    private String leadSource;
    private String industry;
    private String description;

    public Lead(String salutation, String firstName, String lastName, String companyName, String jobTitle, String leadStatus, String phone, String email, String rating, String street, String city, String country, String website, String numberOfEmployees, String annualRevenue, String leadSource, String industry, String description) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.leadStatus = leadStatus;
        this.phone = phone;
        this.email = email;
        this.rating = rating;
        this.street = street;
        this.city = city;
        this.country = country;
        this.website = website;
        this.numberOfEmployees = numberOfEmployees;
        this.annualRevenue = annualRevenue;
        this.leadSource = leadSource;
        this.industry = industry;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return Objects.equals(salutation, lead.salutation)
                && Objects.equals(firstName, lead.firstName)
                && Objects.equals(lastName, lead.lastName)
                && Objects.equals(companyName, lead.companyName)
                && Objects.equals(jobTitle, lead.jobTitle)
                && Objects.equals(leadStatus, lead.leadStatus)
                && Objects.equals(phone, lead.phone)
                && Objects.equals(email, lead.email)
                && Objects.equals(rating, lead.rating)
                && Objects.equals(street, lead.street)
                && Objects.equals(city, lead.city)
                && Objects.equals(country, lead.country)
                && Objects.equals(website, lead.website)
                && Objects.equals(numberOfEmployees, lead.numberOfEmployees)
                && Objects.equals(annualRevenue, lead.annualRevenue)
                && Objects.equals(leadSource, lead.leadSource)
                && Objects.equals(industry, lead.industry)
                && Objects.equals(description, lead.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salutation, firstName, lastName, companyName, jobTitle, leadStatus, phone, email, rating, street, city, country, website, numberOfEmployees, annualRevenue, leadSource, industry, description);
    }

    public String getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getLeadStatus() {
        return leadStatus;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getRating() {
        return rating;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getWebsite() {
        return website;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public String getIndustry() {
        return industry;
    }

    public String getDescription() {
        return description;
    }

}

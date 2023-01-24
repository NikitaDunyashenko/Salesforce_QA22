package models;

import enums.Industry;
import enums.LeadSource;
import enums.LeadStatus;
import enums.Rating;

import java.util.Objects;

public class Lead {
    private final String salutation;
    private final String firstName;
    private final String lastName;
    private final String companyName;
    private final String jobTitle;
    private final String phone;
    private final String email;
    private final Rating rating;
    private final String street;
    private final String city;
    private final String country;
    private final String website;
    private final String numberOfEmployees;
    private final String annualRevenue;
    private final LeadSource leadSource;
    private final Industry industry;
    private final String description;
    private final LeadStatus leadStatus;

    private Lead(LeadBuilder leadBuilder) {
        this.salutation = leadBuilder.salutation;
        this.firstName = leadBuilder.firstName;
        this.lastName = leadBuilder.lastName;
        this.companyName = leadBuilder.companyName;
        this.jobTitle = leadBuilder.jobTitle;
        this.leadStatus = leadBuilder.leadStatus;
        this.phone = leadBuilder.phone;
        this.email = leadBuilder.email;
        this.rating = leadBuilder.rating;
        this.street = leadBuilder.street;
        this.city = leadBuilder.city;
        this.country = leadBuilder.country;
        this.website = leadBuilder.website;
        this.numberOfEmployees = leadBuilder.numberOfEmployees;
        this.annualRevenue = leadBuilder.annualRevenue;
        this.leadSource = leadBuilder.leadSource;
        this.industry = leadBuilder.industry;
        this.description = leadBuilder.description;
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

    public LeadStatus getLeadStatus() {
        return this.leadStatus;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Rating getRating() {
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

    public LeadSource getLeadSource() {
        return leadSource;
    }

    public Industry getIndustry() {
        return industry;
    }

    public String getDescription() {
        return description;
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
        return Objects.hash(salutation, firstName, lastName, companyName, jobTitle, leadStatus, phone, email,
                rating, street, city, country, website, numberOfEmployees, annualRevenue, leadSource, industry,
                description);
    }
    public static class LeadBuilder {
        private String salutation;
        private String firstName;
        private String lastName;
        private String companyName;
        private String jobTitle;
        private String phone;
        private String email;
        private Rating rating;
        private String street;
        private String city;
        private String country;
        private String website;
        private String numberOfEmployees;
        private String annualRevenue;
        private LeadSource leadSource;
        private Industry industry;
        private String description;
        private LeadStatus leadStatus;

        public LeadBuilder setSalutation(String salutation) {
            this.salutation = salutation;
            return this;
        }

        public LeadBuilder setLeadStatus(LeadStatus leadStatus) {
            this.leadStatus = leadStatus;
            return this;
        }

        public LeadBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public LeadBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public LeadBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public LeadBuilder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public LeadBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public LeadBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public LeadBuilder setRating(Rating rating) {
            this.rating = rating;
            return this;
        }

        public LeadBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public LeadBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public LeadBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public LeadBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public LeadBuilder setNumberOfEmployees(String numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
            return this;
        }

        public LeadBuilder setAnnualRevenue(String annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }

        public LeadBuilder setLeadSource(LeadSource leadSource) {
            this.leadSource = leadSource;
            return this;
        }

        public LeadBuilder setIndustry(Industry industry) {
            this.industry = industry;
            return this;
        }

        public LeadBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Lead build() {
            return new Lead(this);
        }

    }

}

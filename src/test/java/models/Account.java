package models;

import enums.Industry;
import enums.Type;

import java.util.Objects;

public class Account {

    private final String accountName;
    private final String phone;
    private final String fax;
    private final String website;
    private final String employees;
    private final String annualRevenue;
    private final Type type;
    private final Industry industry;
    private final String description;
    private final String billingStreet;
    private final String shippingStreet;
    private final String billingCity;
    private final String shippingCity;
    private final String billingZip;
    private final String shippingZip;
    private final String billingCountry;
    private final String shippingCountry;

    private Account(AccountBuilder accountBuilder) {
        this.accountName = accountBuilder.accountName;
        this.phone = accountBuilder.phone;
        this.fax = accountBuilder.fax;
        this.website = accountBuilder.website;
        this.employees = accountBuilder.employees;
        this.annualRevenue = accountBuilder.annualRevenue;
        this.type = accountBuilder.type;
        this.industry = accountBuilder.industry;
        this.description = accountBuilder.description;
        this.billingStreet = accountBuilder.billingStreet;
        this.shippingStreet = accountBuilder.shippingStreet;
        this.billingCity = accountBuilder.billingCity;
        this.shippingCity = accountBuilder.shippingCity;
        this.billingZip = accountBuilder.billingZip;
        this.shippingZip = accountBuilder.shippingZip;
        this.billingCountry = accountBuilder.billingCountry;
        this.shippingCountry = accountBuilder.shippingCountry;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getWebsite() {
        return website;
    }

    public String getEmployees() {
        return employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public Type getType() {
        return type;
    }

    public Industry getIndustry() {
        return industry;
    }

    public String getDescription() {
        return description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountName, account.accountName)
                && Objects.equals(phone, account.phone)
                && Objects.equals(fax, account.fax)
                && Objects.equals(website, account.website)
                && Objects.equals(employees, account.employees)
                && Objects.equals(annualRevenue, account.annualRevenue)
                && type == account.type
                && industry == account.industry
                && Objects.equals(description, account.description)
                && Objects.equals(billingStreet, account.billingStreet)
                && Objects.equals(shippingStreet, account.shippingStreet)
                && Objects.equals(billingCity, account.billingCity)
                && Objects.equals(shippingCity, account.shippingCity)
                && Objects.equals(billingZip, account.billingZip)
                && Objects.equals(shippingZip, account.shippingZip)
                && Objects.equals(billingCountry, account.billingCountry)
                && Objects.equals(shippingCountry, account.shippingCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, phone, fax, website, employees, annualRevenue, type, industry, description,
                billingStreet, shippingStreet, billingCity, shippingCity, billingZip, shippingZip, billingCountry,
                shippingCountry);
    }

    public static class AccountBuilder {

        private String accountName;
        private String phone;
        private String fax;
        private String website;
        private String employees;
        private String annualRevenue;
        private Type type;
        private Industry industry;
        private String description;
        private String billingStreet;
        private String shippingStreet;
        private String billingCity;
        private String shippingCity;
        private String billingZip;
        private String shippingZip;
        private String billingCountry;
        private String shippingCountry;

        public AccountBuilder setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public AccountBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public AccountBuilder setFax(String fax) {
            this.fax = fax;
            return this;
        }

        public AccountBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public AccountBuilder setEmployees(String employees) {
            this.employees = employees;
            return this;
        }

        public AccountBuilder setAnnualRevenue(String annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }

        public AccountBuilder setType(Type type) {
            this.type = type;
            return this;
        }

        public AccountBuilder setIndustry(Industry industry) {
            this.industry = industry;
            return this;
        }

        public AccountBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public AccountBuilder setBillingStreet(String billingStreet) {
            this.billingStreet = billingStreet;
            return this;
        }

        public AccountBuilder setShippingStreet(String shippingStreet) {
            this.shippingStreet = shippingStreet;
            return this;
        }

        public AccountBuilder setBillingCity(String billingCity) {
            this.billingCity = billingCity;
            return this;
        }

        public AccountBuilder setShippingCity(String shippingCity) {
            this.shippingCity = shippingCity;
            return this;
        }

        public AccountBuilder setBillingZip(String billingZip) {
            this.billingZip = billingZip;
            return this;
        }

        public AccountBuilder setShippingZip(String shippingZip) {
            this.shippingZip = shippingZip;
            return this;
        }

        public AccountBuilder setBillingCountry(String billingCountry) {
            this.billingCountry = billingCountry;
            return this;
        }

        public AccountBuilder setShippingCountry(String shippingCountry) {
            this.shippingCountry = shippingCountry;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }

}

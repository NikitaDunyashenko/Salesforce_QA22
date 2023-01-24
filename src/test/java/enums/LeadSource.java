package enums;

public enum LeadSource {

    ADVERTISEMENT("Advertisement"), EMPLOYEE_REFERRAL("Employee Referral"),
    EXTERNAL_REFERRAL("External Referral"), IN_STORE("In-Store"), ON_SITE("On Site"),
    OTHER("Other"), SOCIAL("Social"), TRADE_SHOW("Trade Show"), WEB("Web"),
    WORD_OF_MOUTH("Word of mouth");

    private final String name;

    LeadSource(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static LeadSource fromString(String value) {
        for (LeadSource leadSource : LeadSource.values()) {
            if(leadSource.getName().equals(value)) {
                return leadSource;
            }
        }
        return null;
    }
}

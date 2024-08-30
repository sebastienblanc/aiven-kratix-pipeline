package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"accountId","authSecretRef","billingAddress","billingCurrency","billingEmails","billingExtraText","billingGroupId","cardId","cloud","connInfoSecretTarget","copyFromProject","countryCode","tags","technicalEmails"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ProjectSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Account ID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accountId")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Account ID")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String accountId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Authentication reference to Aiven token in a secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication reference to Aiven token in a secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.projectspec.AuthSecretRef authSecretRef;

    public io.aiven.v1alpha1.projectspec.AuthSecretRef getAuthSecretRef() {
        return authSecretRef;
    }

    public void setAuthSecretRef(io.aiven.v1alpha1.projectspec.AuthSecretRef authSecretRef) {
        this.authSecretRef = authSecretRef;
    }

    /**
     * Billing name and address of the project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("billingAddress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Billing name and address of the project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String billingAddress;

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public enum BillingCurrency {

        @com.fasterxml.jackson.annotation.JsonProperty("AUD")
        AUD("AUD"),
        @com.fasterxml.jackson.annotation.JsonProperty("CAD")
        CAD("CAD"),
        @com.fasterxml.jackson.annotation.JsonProperty("CHF")
        CHF("CHF"),
        @com.fasterxml.jackson.annotation.JsonProperty("DKK")
        DKK("DKK"),
        @com.fasterxml.jackson.annotation.JsonProperty("EUR")
        EUR("EUR"),
        @com.fasterxml.jackson.annotation.JsonProperty("GBP")
        GBP("GBP"),
        @com.fasterxml.jackson.annotation.JsonProperty("NOK")
        NOK("NOK"),
        @com.fasterxml.jackson.annotation.JsonProperty("SEK")
        SEK("SEK"),
        @com.fasterxml.jackson.annotation.JsonProperty("USD")
        USD("USD");

        java.lang.String value;

        BillingCurrency(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Billing currency
     */
    @com.fasterxml.jackson.annotation.JsonProperty("billingCurrency")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Billing currency")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private BillingCurrency billingCurrency;

    public BillingCurrency getBillingCurrency() {
        return billingCurrency;
    }

    public void setBillingCurrency(BillingCurrency billingCurrency) {
        this.billingCurrency = billingCurrency;
    }

    /**
     * Billing contact emails of the project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("billingEmails")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Billing contact emails of the project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> billingEmails;

    public java.util.List<String> getBillingEmails() {
        return billingEmails;
    }

    public void setBillingEmails(java.util.List<String> billingEmails) {
        this.billingEmails = billingEmails;
    }

    /**
     * Extra text to be included in all project invoices, e.g. purchase order or cost center number
     */
    @com.fasterxml.jackson.annotation.JsonProperty("billingExtraText")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Extra text to be included in all project invoices, e.g. purchase order or cost center number")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String billingExtraText;

    public String getBillingExtraText() {
        return billingExtraText;
    }

    public void setBillingExtraText(String billingExtraText) {
        this.billingExtraText = billingExtraText;
    }

    /**
     * BillingGroup ID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("billingGroupId")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("BillingGroup ID")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String billingGroupId;

    public String getBillingGroupId() {
        return billingGroupId;
    }

    public void setBillingGroupId(String billingGroupId) {
        this.billingGroupId = billingGroupId;
    }

    /**
     * Credit card ID; The ID may be either last 4 digits of the card or the actual ID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cardId")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Credit card ID; The ID may be either last 4 digits of the card or the actual ID")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cardId;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * Target cloud, example: aws-eu-central-1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloud")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Target cloud, example: aws-eu-central-1")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cloud;

    public String getCloud() {
        return cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    /**
     * Information regarding secret creation. Exposed keys: `PROJECT_CA_CERT`
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connInfoSecretTarget")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Information regarding secret creation. Exposed keys: `PROJECT_CA_CERT`")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.projectspec.ConnInfoSecretTarget connInfoSecretTarget;

    public io.aiven.v1alpha1.projectspec.ConnInfoSecretTarget getConnInfoSecretTarget() {
        return connInfoSecretTarget;
    }

    public void setConnInfoSecretTarget(io.aiven.v1alpha1.projectspec.ConnInfoSecretTarget connInfoSecretTarget) {
        this.connInfoSecretTarget = connInfoSecretTarget;
    }

    /**
     * Project name from which to copy settings to the new project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("copyFromProject")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Project name from which to copy settings to the new project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String copyFromProject;

    public String getCopyFromProject() {
        return copyFromProject;
    }

    public void setCopyFromProject(String copyFromProject) {
        this.copyFromProject = copyFromProject;
    }

    /**
     * Billing country code of the project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Billing country code of the project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String countryCode;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Tags are key-value pairs that allow you to categorize projects
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Tags are key-value pairs that allow you to categorize projects")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> tags;

    public java.util.Map<java.lang.String, String> getTags() {
        return tags;
    }

    public void setTags(java.util.Map<java.lang.String, String> tags) {
        this.tags = tags;
    }

    /**
     * Technical contact emails of the project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("technicalEmails")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Technical contact emails of the project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> technicalEmails;

    public java.util.List<String> getTechnicalEmails() {
        return technicalEmails;
    }

    public void setTechnicalEmails(java.util.List<String> technicalEmails) {
        this.technicalEmails = technicalEmails;
    }
}


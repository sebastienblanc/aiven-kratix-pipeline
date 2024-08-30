package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"availableCredits","conditions","country","estimatedBalance","paymentMethod","vatId"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ProjectStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Available credirs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCredits")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Available credirs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String availableCredits;

    public String getAvailableCredits() {
        return availableCredits;
    }

    public void setAvailableCredits(String availableCredits) {
        this.availableCredits = availableCredits;
    }

    /**
     * Conditions represent the latest available observations of an Project state
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Conditions represent the latest available observations of an Project state")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.projectstatus.Conditions> conditions;

    public java.util.List<io.aiven.v1alpha1.projectstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.aiven.v1alpha1.projectstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * Country name
     */
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Country name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Estimated balance
     */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedBalance")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Estimated balance")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String estimatedBalance;

    public String getEstimatedBalance() {
        return estimatedBalance;
    }

    public void setEstimatedBalance(String estimatedBalance) {
        this.estimatedBalance = estimatedBalance;
    }

    /**
     * Payment method name
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paymentMethod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Payment method name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String paymentMethod;

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * EU VAT Identification Number
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vatId")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EU VAT Identification Number")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String vatId;

    public String getVatId() {
        return vatId;
    }

    public void setVatId(String vatId) {
        this.vatId = vatId;
    }
}


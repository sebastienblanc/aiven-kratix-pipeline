package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"conditions"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DatabaseStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Conditions represent the latest available observations of an Database state
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Conditions represent the latest available observations of an Database state")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.databasestatus.Conditions> conditions;

    public java.util.List<io.aiven.v1alpha1.databasestatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.aiven.v1alpha1.databasestatus.Conditions> conditions) {
        this.conditions = conditions;
    }
}


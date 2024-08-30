package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"conditions","id","state"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ProjectVPCStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Conditions represent the latest available observations of an ProjectVPC state
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Conditions represent the latest available observations of an ProjectVPC state")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.projectvpcstatus.Conditions> conditions;

    public java.util.List<io.aiven.v1alpha1.projectvpcstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.aiven.v1alpha1.projectvpcstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * Project VPC id
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Project VPC id")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * State of VPC
     */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("State of VPC")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}


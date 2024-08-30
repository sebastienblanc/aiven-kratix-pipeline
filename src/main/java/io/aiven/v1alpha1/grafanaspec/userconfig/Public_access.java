package io.aiven.v1alpha1.grafanaspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"grafana"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Public_access implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Allow clients to connect to grafana from the public internet for service nodes that are in a project VPC or another type of private network
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grafana")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow clients to connect to grafana from the public internet for service nodes that are in a project VPC or another type of private network")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean grafana;

    public Boolean getGrafana() {
        return grafana;
    }

    public void setGrafana(Boolean grafana) {
        this.grafana = grafana;
    }
}


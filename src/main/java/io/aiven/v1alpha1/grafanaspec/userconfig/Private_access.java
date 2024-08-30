package io.aiven.v1alpha1.grafanaspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"grafana"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Private_access implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Allow clients to connect to grafana with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grafana")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow clients to connect to grafana with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean grafana;

    public Boolean getGrafana() {
        return grafana;
    }

    public void setGrafana(Boolean grafana) {
        this.grafana = grafana;
    }
}


package io.aiven.v1alpha1.opensearchspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"opensearch","opensearch_dashboards","prometheus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Privatelink_access implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enable opensearch
     */
    @com.fasterxml.jackson.annotation.JsonProperty("opensearch")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable opensearch")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean opensearch;

    public Boolean getOpensearch() {
        return opensearch;
    }

    public void setOpensearch(Boolean opensearch) {
        this.opensearch = opensearch;
    }

    /**
     * Enable opensearch_dashboards
     */
    @com.fasterxml.jackson.annotation.JsonProperty("opensearch_dashboards")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable opensearch_dashboards")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean opensearch_dashboards;

    public Boolean getOpensearch_dashboards() {
        return opensearch_dashboards;
    }

    public void setOpensearch_dashboards(Boolean opensearch_dashboards) {
        this.opensearch_dashboards = opensearch_dashboards;
    }

    /**
     * Enable prometheus
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prometheus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable prometheus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean prometheus;

    public Boolean getPrometheus() {
        return prometheus;
    }

    public void setPrometheus(Boolean prometheus) {
        this.prometheus = prometheus;
    }
}


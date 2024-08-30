package io.aiven.v1alpha1.opensearchspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"enabled","max_old_space_size","opensearch_request_timeout"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Opensearch_dashboards implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enable or disable OpenSearch Dashboards
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable OpenSearch Dashboards")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Limits the maximum amount of memory (in MiB) the OpenSearch Dashboards process can use. This sets the max_old_space_size option of the nodejs running the OpenSearch Dashboards. Note: the memory reserved by OpenSearch Dashboards is not available for OpenSearch.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_old_space_size")
    @io.fabric8.generator.annotation.Max(2048.0)
    @io.fabric8.generator.annotation.Min(64.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Limits the maximum amount of memory (in MiB) the OpenSearch Dashboards process can use. This sets the max_old_space_size option of the nodejs running the OpenSearch Dashboards. Note: the memory reserved by OpenSearch Dashboards is not available for OpenSearch.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_old_space_size;

    public Long getMax_old_space_size() {
        return max_old_space_size;
    }

    public void setMax_old_space_size(Long max_old_space_size) {
        this.max_old_space_size = max_old_space_size;
    }

    /**
     * Timeout in milliseconds for requests made by OpenSearch Dashboards towards OpenSearch
     */
    @com.fasterxml.jackson.annotation.JsonProperty("opensearch_request_timeout")
    @io.fabric8.generator.annotation.Max(120000.0)
    @io.fabric8.generator.annotation.Min(5000.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Timeout in milliseconds for requests made by OpenSearch Dashboards towards OpenSearch")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long opensearch_request_timeout;

    public Long getOpensearch_request_timeout() {
        return opensearch_request_timeout;
    }

    public void setOpensearch_request_timeout(Long opensearch_request_timeout) {
        this.opensearch_request_timeout = opensearch_request_timeout;
    }
}


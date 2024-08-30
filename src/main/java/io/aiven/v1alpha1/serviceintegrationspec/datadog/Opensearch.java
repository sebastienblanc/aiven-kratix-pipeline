package io.aiven.v1alpha1.serviceintegrationspec.datadog;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"index_stats_enabled","pending_task_stats_enabled","pshard_stats_enabled"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Opensearch implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enable Datadog Opensearch Index Monitoring
     */
    @com.fasterxml.jackson.annotation.JsonProperty("index_stats_enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable Datadog Opensearch Index Monitoring")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean index_stats_enabled;

    public Boolean getIndex_stats_enabled() {
        return index_stats_enabled;
    }

    public void setIndex_stats_enabled(Boolean index_stats_enabled) {
        this.index_stats_enabled = index_stats_enabled;
    }

    /**
     * Enable Datadog Opensearch Pending Task Monitoring
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pending_task_stats_enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable Datadog Opensearch Pending Task Monitoring")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean pending_task_stats_enabled;

    public Boolean getPending_task_stats_enabled() {
        return pending_task_stats_enabled;
    }

    public void setPending_task_stats_enabled(Boolean pending_task_stats_enabled) {
        this.pending_task_stats_enabled = pending_task_stats_enabled;
    }

    /**
     * Enable Datadog Opensearch Primary Shard Monitoring
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pshard_stats_enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable Datadog Opensearch Primary Shard Monitoring")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean pshard_stats_enabled;

    public Boolean getPshard_stats_enabled() {
        return pshard_stats_enabled;
    }

    public void setPshard_stats_enabled(Boolean pshard_stats_enabled) {
        this.pshard_stats_enabled = pshard_stats_enabled;
    }
}


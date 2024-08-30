package io.aiven.v1alpha1.serviceintegrationspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"datadog_dbm_enabled","datadog_tags","exclude_consumer_groups","exclude_topics","include_consumer_groups","include_topics","kafka_custom_metrics","max_jmx_metrics","opensearch","redis"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Datadog implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enable Datadog Database Monitoring
     */
    @com.fasterxml.jackson.annotation.JsonProperty("datadog_dbm_enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable Datadog Database Monitoring")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean datadog_dbm_enabled;

    public Boolean getDatadog_dbm_enabled() {
        return datadog_dbm_enabled;
    }

    public void setDatadog_dbm_enabled(Boolean datadog_dbm_enabled) {
        this.datadog_dbm_enabled = datadog_dbm_enabled;
    }

    /**
     * Custom tags provided by user
     */
    @com.fasterxml.jackson.annotation.JsonProperty("datadog_tags")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Custom tags provided by user")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.serviceintegrationspec.datadog.Datadog_tags> datadog_tags;

    public java.util.List<io.aiven.v1alpha1.serviceintegrationspec.datadog.Datadog_tags> getDatadog_tags() {
        return datadog_tags;
    }

    public void setDatadog_tags(java.util.List<io.aiven.v1alpha1.serviceintegrationspec.datadog.Datadog_tags> datadog_tags) {
        this.datadog_tags = datadog_tags;
    }

    /**
     * List of custom metrics
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exclude_consumer_groups")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of custom metrics")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> exclude_consumer_groups;

    public java.util.List<String> getExclude_consumer_groups() {
        return exclude_consumer_groups;
    }

    public void setExclude_consumer_groups(java.util.List<String> exclude_consumer_groups) {
        this.exclude_consumer_groups = exclude_consumer_groups;
    }

    /**
     * List of topics to exclude
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exclude_topics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of topics to exclude")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> exclude_topics;

    public java.util.List<String> getExclude_topics() {
        return exclude_topics;
    }

    public void setExclude_topics(java.util.List<String> exclude_topics) {
        this.exclude_topics = exclude_topics;
    }

    /**
     * List of custom metrics
     */
    @com.fasterxml.jackson.annotation.JsonProperty("include_consumer_groups")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of custom metrics")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> include_consumer_groups;

    public java.util.List<String> getInclude_consumer_groups() {
        return include_consumer_groups;
    }

    public void setInclude_consumer_groups(java.util.List<String> include_consumer_groups) {
        this.include_consumer_groups = include_consumer_groups;
    }

    /**
     * List of topics to include
     */
    @com.fasterxml.jackson.annotation.JsonProperty("include_topics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of topics to include")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> include_topics;

    public java.util.List<String> getInclude_topics() {
        return include_topics;
    }

    public void setInclude_topics(java.util.List<String> include_topics) {
        this.include_topics = include_topics;
    }

    /**
     * List of custom metrics
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_custom_metrics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of custom metrics")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> kafka_custom_metrics;

    public java.util.List<String> getKafka_custom_metrics() {
        return kafka_custom_metrics;
    }

    public void setKafka_custom_metrics(java.util.List<String> kafka_custom_metrics) {
        this.kafka_custom_metrics = kafka_custom_metrics;
    }

    /**
     * Maximum number of JMX metrics to send
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_jmx_metrics")
    @io.fabric8.generator.annotation.Max(100000.0)
    @io.fabric8.generator.annotation.Min(10.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum number of JMX metrics to send")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_jmx_metrics;

    public Long getMax_jmx_metrics() {
        return max_jmx_metrics;
    }

    public void setMax_jmx_metrics(Long max_jmx_metrics) {
        this.max_jmx_metrics = max_jmx_metrics;
    }

    /**
     * Datadog Opensearch Options
     */
    @com.fasterxml.jackson.annotation.JsonProperty("opensearch")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Datadog Opensearch Options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.datadog.Opensearch opensearch;

    public io.aiven.v1alpha1.serviceintegrationspec.datadog.Opensearch getOpensearch() {
        return opensearch;
    }

    public void setOpensearch(io.aiven.v1alpha1.serviceintegrationspec.datadog.Opensearch opensearch) {
        this.opensearch = opensearch;
    }

    /**
     * Datadog Redis Options
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Datadog Redis Options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.datadog.Redis redis;

    public io.aiven.v1alpha1.serviceintegrationspec.datadog.Redis getRedis() {
        return redis;
    }

    public void setRedis(io.aiven.v1alpha1.serviceintegrationspec.datadog.Redis redis) {
        this.redis = redis;
    }
}


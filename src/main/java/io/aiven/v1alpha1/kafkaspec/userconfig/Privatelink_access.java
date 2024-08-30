package io.aiven.v1alpha1.kafkaspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"jolokia","kafka","kafka_connect","kafka_rest","prometheus","schema_registry"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Privatelink_access implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enable jolokia
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jolokia")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable jolokia")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean jolokia;

    public Boolean getJolokia() {
        return jolokia;
    }

    public void setJolokia(Boolean jolokia) {
        this.jolokia = jolokia;
    }

    /**
     * Enable kafka
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable kafka")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean kafka;

    public Boolean getKafka() {
        return kafka;
    }

    public void setKafka(Boolean kafka) {
        this.kafka = kafka;
    }

    /**
     * Enable kafka_connect
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_connect")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable kafka_connect")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean kafka_connect;

    public Boolean getKafka_connect() {
        return kafka_connect;
    }

    public void setKafka_connect(Boolean kafka_connect) {
        this.kafka_connect = kafka_connect;
    }

    /**
     * Enable kafka_rest
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_rest")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable kafka_rest")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean kafka_rest;

    public Boolean getKafka_rest() {
        return kafka_rest;
    }

    public void setKafka_rest(Boolean kafka_rest) {
        this.kafka_rest = kafka_rest;
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

    /**
     * Enable schema_registry
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schema_registry")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable schema_registry")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean schema_registry;

    public Boolean getSchema_registry() {
        return schema_registry;
    }

    public void setSchema_registry(Boolean schema_registry) {
        this.schema_registry = schema_registry;
    }
}


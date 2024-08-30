package io.aiven.v1alpha1.kafkaspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"kafka","kafka_connect","kafka_rest","prometheus","schema_registry"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Private_access implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Allow clients to connect to kafka with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow clients to connect to kafka with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean kafka;

    public Boolean getKafka() {
        return kafka;
    }

    public void setKafka(Boolean kafka) {
        this.kafka = kafka;
    }

    /**
     * Allow clients to connect to kafka_connect with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_connect")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow clients to connect to kafka_connect with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean kafka_connect;

    public Boolean getKafka_connect() {
        return kafka_connect;
    }

    public void setKafka_connect(Boolean kafka_connect) {
        this.kafka_connect = kafka_connect;
    }

    /**
     * Allow clients to connect to kafka_rest with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_rest")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow clients to connect to kafka_rest with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean kafka_rest;

    public Boolean getKafka_rest() {
        return kafka_rest;
    }

    public void setKafka_rest(Boolean kafka_rest) {
        this.kafka_rest = kafka_rest;
    }

    /**
     * Allow clients to connect to prometheus with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prometheus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow clients to connect to prometheus with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean prometheus;

    public Boolean getPrometheus() {
        return prometheus;
    }

    public void setPrometheus(Boolean prometheus) {
        this.prometheus = prometheus;
    }

    /**
     * Allow clients to connect to schema_registry with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schema_registry")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow clients to connect to schema_registry with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean schema_registry;

    public Boolean getSchema_registry() {
        return schema_registry;
    }

    public void setSchema_registry(Boolean schema_registry) {
        this.schema_registry = schema_registry;
    }
}


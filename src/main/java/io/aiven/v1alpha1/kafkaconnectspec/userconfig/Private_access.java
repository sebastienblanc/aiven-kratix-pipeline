package io.aiven.v1alpha1.kafkaconnectspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"kafka_connect","prometheus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Private_access implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
}


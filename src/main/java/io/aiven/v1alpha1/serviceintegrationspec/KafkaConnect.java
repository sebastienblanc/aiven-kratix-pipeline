package io.aiven.v1alpha1.serviceintegrationspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"kafka_connect"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaConnect implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Kafka Connect service configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_connect")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka Connect service configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.kafkaconnect.Kafka_connect kafka_connect;

    public io.aiven.v1alpha1.serviceintegrationspec.kafkaconnect.Kafka_connect getKafka_connect() {
        return kafka_connect;
    }

    public void setKafka_connect(io.aiven.v1alpha1.serviceintegrationspec.kafkaconnect.Kafka_connect kafka_connect) {
        this.kafka_connect = kafka_connect;
    }
}


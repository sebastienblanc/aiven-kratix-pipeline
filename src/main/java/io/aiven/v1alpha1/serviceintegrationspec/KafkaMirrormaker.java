package io.aiven.v1alpha1.serviceintegrationspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cluster_alias","kafka_mirrormaker"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaMirrormaker implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The alias under which the Kafka cluster is known to MirrorMaker. Can contain the following symbols: ASCII alphanumerics, '.', '_', and '-'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cluster_alias")
    @io.fabric8.generator.annotation.Pattern("^[a-zA-Z0-9_.-]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The alias under which the Kafka cluster is known to MirrorMaker. Can contain the following symbols: ASCII alphanumerics, '.', '_', and '-'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cluster_alias;

    public String getCluster_alias() {
        return cluster_alias;
    }

    public void setCluster_alias(String cluster_alias) {
        this.cluster_alias = cluster_alias;
    }

    /**
     * Kafka MirrorMaker configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_mirrormaker")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka MirrorMaker configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.kafkamirrormaker.Kafka_mirrormaker kafka_mirrormaker;

    public io.aiven.v1alpha1.serviceintegrationspec.kafkamirrormaker.Kafka_mirrormaker getKafka_mirrormaker() {
        return kafka_mirrormaker;
    }

    public void setKafka_mirrormaker(io.aiven.v1alpha1.serviceintegrationspec.kafkamirrormaker.Kafka_mirrormaker kafka_mirrormaker) {
        this.kafka_mirrormaker = kafka_mirrormaker;
    }
}


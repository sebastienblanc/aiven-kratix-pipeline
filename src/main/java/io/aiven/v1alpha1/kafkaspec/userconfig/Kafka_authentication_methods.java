package io.aiven.v1alpha1.kafkaspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"certificate","sasl"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Kafka_authentication_methods implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enable certificate/SSL authentication
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable certificate/SSL authentication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean certificate;

    public Boolean getCertificate() {
        return certificate;
    }

    public void setCertificate(Boolean certificate) {
        this.certificate = certificate;
    }

    /**
     * Enable SASL authentication
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sasl")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable SASL authentication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean sasl;

    public Boolean getSasl() {
        return sasl;
    }

    public void setSasl(Boolean sasl) {
        this.sasl = sasl;
    }
}


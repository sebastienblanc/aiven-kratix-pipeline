package io.aiven.v1alpha1.serviceintegrationspec.metrics;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"telegraf"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Source_mysql implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configuration options for Telegraf MySQL input plugin
     */
    @com.fasterxml.jackson.annotation.JsonProperty("telegraf")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration options for Telegraf MySQL input plugin")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.metrics.source_mysql.Telegraf telegraf;

    public io.aiven.v1alpha1.serviceintegrationspec.metrics.source_mysql.Telegraf getTelegraf() {
        return telegraf;
    }

    public void setTelegraf(io.aiven.v1alpha1.serviceintegrationspec.metrics.source_mysql.Telegraf telegraf) {
        this.telegraf = telegraf;
    }
}


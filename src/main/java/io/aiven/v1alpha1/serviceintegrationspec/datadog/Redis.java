package io.aiven.v1alpha1.serviceintegrationspec.datadog;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"command_stats_enabled"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Redis implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enable command_stats option in the agent's configuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("command_stats_enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable command_stats option in the agent's configuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean command_stats_enabled;

    public Boolean getCommand_stats_enabled() {
        return command_stats_enabled;
    }

    public void setCommand_stats_enabled(Boolean command_stats_enabled) {
        this.command_stats_enabled = command_stats_enabled;
    }
}


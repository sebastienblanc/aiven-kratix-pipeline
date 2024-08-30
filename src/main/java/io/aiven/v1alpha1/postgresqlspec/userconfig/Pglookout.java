package io.aiven.v1alpha1.postgresqlspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"max_failover_replication_time_lag"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Pglookout implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Number of seconds of master unavailability before triggering database failover to standby
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_failover_replication_time_lag")
    @io.fabric8.generator.annotation.Min(10.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of seconds of master unavailability before triggering database failover to standby")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_failover_replication_time_lag;

    public Long getMax_failover_replication_time_lag() {
        return max_failover_replication_time_lag;
    }

    public void setMax_failover_replication_time_lag(Long max_failover_replication_time_lag) {
        this.max_failover_replication_time_lag = max_failover_replication_time_lag;
    }
}


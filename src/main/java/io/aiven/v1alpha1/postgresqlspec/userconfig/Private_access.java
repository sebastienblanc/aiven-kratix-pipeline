package io.aiven.v1alpha1.postgresqlspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"pg","pgbouncer","prometheus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Private_access implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Allow clients to connect to pg with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pg")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow clients to connect to pg with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean pg;

    public Boolean getPg() {
        return pg;
    }

    public void setPg(Boolean pg) {
        this.pg = pg;
    }

    /**
     * Allow clients to connect to pgbouncer with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pgbouncer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow clients to connect to pgbouncer with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean pgbouncer;

    public Boolean getPgbouncer() {
        return pgbouncer;
    }

    public void setPgbouncer(Boolean pgbouncer) {
        this.pgbouncer = pgbouncer;
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


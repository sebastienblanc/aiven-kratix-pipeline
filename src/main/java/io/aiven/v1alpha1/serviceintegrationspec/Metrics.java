package io.aiven.v1alpha1.serviceintegrationspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"database","retention_days","ro_username","source_mysql","username"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Metrics implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Name of the database where to store metric datapoints. Only affects PostgreSQL destinations. Defaults to 'metrics'. Note that this must be the same for all metrics integrations that write data to the same PostgreSQL service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("database")
    @io.fabric8.generator.annotation.Pattern("^[_A-Za-z0-9][-_A-Za-z0-9]{0,39}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the database where to store metric datapoints. Only affects PostgreSQL destinations. Defaults to 'metrics'. Note that this must be the same for all metrics integrations that write data to the same PostgreSQL service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String database;

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * Number of days to keep old metrics. Only affects PostgreSQL destinations. Set to 0 for no automatic cleanup. Defaults to 30 days.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retention_days")
    @io.fabric8.generator.annotation.Max(10000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of days to keep old metrics. Only affects PostgreSQL destinations. Set to 0 for no automatic cleanup. Defaults to 30 days.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long retention_days;

    public Long getRetention_days() {
        return retention_days;
    }

    public void setRetention_days(Long retention_days) {
        this.retention_days = retention_days;
    }

    /**
     * Name of a user that can be used to read metrics. This will be used for Grafana integration (if enabled) to prevent Grafana users from making undesired changes. Only affects PostgreSQL destinations. Defaults to 'metrics_reader'. Note that this must be the same for all metrics integrations that write data to the same PostgreSQL service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ro_username")
    @io.fabric8.generator.annotation.Pattern("^[_A-Za-z0-9][-._A-Za-z0-9]{0,39}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of a user that can be used to read metrics. This will be used for Grafana integration (if enabled) to prevent Grafana users from making undesired changes. Only affects PostgreSQL destinations. Defaults to 'metrics_reader'. Note that this must be the same for all metrics integrations that write data to the same PostgreSQL service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ro_username;

    public String getRo_username() {
        return ro_username;
    }

    public void setRo_username(String ro_username) {
        this.ro_username = ro_username;
    }

    /**
     * Configuration options for metrics where source service is MySQL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source_mysql")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration options for metrics where source service is MySQL")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.metrics.Source_mysql source_mysql;

    public io.aiven.v1alpha1.serviceintegrationspec.metrics.Source_mysql getSource_mysql() {
        return source_mysql;
    }

    public void setSource_mysql(io.aiven.v1alpha1.serviceintegrationspec.metrics.Source_mysql source_mysql) {
        this.source_mysql = source_mysql;
    }

    /**
     * Name of the user used to write metrics. Only affects PostgreSQL destinations. Defaults to 'metrics_writer'. Note that this must be the same for all metrics integrations that write data to the same PostgreSQL service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    @io.fabric8.generator.annotation.Pattern("^[_A-Za-z0-9][-._A-Za-z0-9]{0,39}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the user used to write metrics. Only affects PostgreSQL destinations. Defaults to 'metrics_writer'. Note that this must be the same for all metrics integrations that write data to the same PostgreSQL service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


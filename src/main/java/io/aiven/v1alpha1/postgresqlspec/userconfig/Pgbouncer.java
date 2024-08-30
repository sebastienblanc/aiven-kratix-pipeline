package io.aiven.v1alpha1.postgresqlspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"autodb_idle_timeout","autodb_max_db_connections","autodb_pool_mode","autodb_pool_size","ignore_startup_parameters","min_pool_size","server_idle_timeout","server_lifetime","server_reset_query_always"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Pgbouncer implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * If the automatically created database pools have been unused this many seconds, they are freed. If 0 then timeout is disabled. [seconds]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autodb_idle_timeout")
    @io.fabric8.generator.annotation.Max(86400.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If the automatically created database pools have been unused this many seconds, they are freed. If 0 then timeout is disabled. [seconds]")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long autodb_idle_timeout;

    public Long getAutodb_idle_timeout() {
        return autodb_idle_timeout;
    }

    public void setAutodb_idle_timeout(Long autodb_idle_timeout) {
        this.autodb_idle_timeout = autodb_idle_timeout;
    }

    /**
     * Do not allow more than this many server connections per database (regardless of user). Setting it to 0 means unlimited.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autodb_max_db_connections")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Do not allow more than this many server connections per database (regardless of user). Setting it to 0 means unlimited.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long autodb_max_db_connections;

    public Long getAutodb_max_db_connections() {
        return autodb_max_db_connections;
    }

    public void setAutodb_max_db_connections(Long autodb_max_db_connections) {
        this.autodb_max_db_connections = autodb_max_db_connections;
    }

    public enum Autodb_pool_mode {

        @com.fasterxml.jackson.annotation.JsonProperty("session")
        SESSION("session"), @com.fasterxml.jackson.annotation.JsonProperty("transaction")
        TRANSACTION("transaction"), @com.fasterxml.jackson.annotation.JsonProperty("statement")
        STATEMENT("statement");

        java.lang.String value;

        Autodb_pool_mode(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * PGBouncer pool mode
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autodb_pool_mode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PGBouncer pool mode")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Autodb_pool_mode autodb_pool_mode;

    public Autodb_pool_mode getAutodb_pool_mode() {
        return autodb_pool_mode;
    }

    public void setAutodb_pool_mode(Autodb_pool_mode autodb_pool_mode) {
        this.autodb_pool_mode = autodb_pool_mode;
    }

    /**
     * If non-zero then create automatically a pool of that size per user when a pool doesn't exist.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autodb_pool_size")
    @io.fabric8.generator.annotation.Max(10000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If non-zero then create automatically a pool of that size per user when a pool doesn't exist.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long autodb_pool_size;

    public Long getAutodb_pool_size() {
        return autodb_pool_size;
    }

    public void setAutodb_pool_size(Long autodb_pool_size) {
        this.autodb_pool_size = autodb_pool_size;
    }

    /**
     * List of parameters to ignore when given in startup packet
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ignore_startup_parameters")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of parameters to ignore when given in startup packet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> ignore_startup_parameters;

    public java.util.List<String> getIgnore_startup_parameters() {
        return ignore_startup_parameters;
    }

    public void setIgnore_startup_parameters(java.util.List<String> ignore_startup_parameters) {
        this.ignore_startup_parameters = ignore_startup_parameters;
    }

    /**
     * Add more server connections to pool if below this number. Improves behavior when usual load comes suddenly back after period of total inactivity. The value is effectively capped at the pool size.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("min_pool_size")
    @io.fabric8.generator.annotation.Max(10000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Add more server connections to pool if below this number. Improves behavior when usual load comes suddenly back after period of total inactivity. The value is effectively capped at the pool size.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long min_pool_size;

    public Long getMin_pool_size() {
        return min_pool_size;
    }

    public void setMin_pool_size(Long min_pool_size) {
        this.min_pool_size = min_pool_size;
    }

    /**
     * If a server connection has been idle more than this many seconds it will be dropped. If 0 then timeout is disabled. [seconds]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("server_idle_timeout")
    @io.fabric8.generator.annotation.Max(86400.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If a server connection has been idle more than this many seconds it will be dropped. If 0 then timeout is disabled. [seconds]")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long server_idle_timeout;

    public Long getServer_idle_timeout() {
        return server_idle_timeout;
    }

    public void setServer_idle_timeout(Long server_idle_timeout) {
        this.server_idle_timeout = server_idle_timeout;
    }

    /**
     * The pooler will close an unused server connection that has been connected longer than this. [seconds]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("server_lifetime")
    @io.fabric8.generator.annotation.Max(86400.0)
    @io.fabric8.generator.annotation.Min(60.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The pooler will close an unused server connection that has been connected longer than this. [seconds]")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long server_lifetime;

    public Long getServer_lifetime() {
        return server_lifetime;
    }

    public void setServer_lifetime(Long server_lifetime) {
        this.server_lifetime = server_lifetime;
    }

    /**
     * Run server_reset_query (DISCARD ALL) in all pooling modes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("server_reset_query_always")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Run server_reset_query (DISCARD ALL) in all pooling modes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean server_reset_query_always;

    public Boolean getServer_reset_query_always() {
        return server_reset_query_always;
    }

    public void setServer_reset_query_always(Boolean server_reset_query_always) {
        this.server_reset_query_always = server_reset_query_always;
    }
}


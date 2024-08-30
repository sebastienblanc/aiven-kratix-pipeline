package io.aiven.v1alpha1.redisspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"dbname","host","ignore_dbs","method","password","port","ssl","username"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Migration implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Database name for bootstrapping the initial connection
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbname")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Database name for bootstrapping the initial connection")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String dbname;

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    /**
     * Hostname or IP address of the server where to migrate data from
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hostname or IP address of the server where to migrate data from")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Comma-separated list of databases, which should be ignored during migration (supported by MySQL and PostgreSQL only at the moment)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ignore_dbs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Comma-separated list of databases, which should be ignored during migration (supported by MySQL and PostgreSQL only at the moment)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ignore_dbs;

    public String getIgnore_dbs() {
        return ignore_dbs;
    }

    public void setIgnore_dbs(String ignore_dbs) {
        this.ignore_dbs = ignore_dbs;
    }

    public enum Method {

        @com.fasterxml.jackson.annotation.JsonProperty("dump")
        DUMP("dump"), @com.fasterxml.jackson.annotation.JsonProperty("replication")
        REPLICATION("replication");

        java.lang.String value;

        Method(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The migration method to be used (currently supported only by Redis, MySQL and PostgreSQL service types)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The migration method to be used (currently supported only by Redis, MySQL and PostgreSQL service types)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Method method;

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    /**
     * Password for authentication with the server where to migrate data from
     */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Password for authentication with the server where to migrate data from")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Port number of the server where to migrate data from
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Max(65535.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Port number of the server where to migrate data from")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long port;

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    /**
     * The server where to migrate data from is secured with SSL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ssl")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The server where to migrate data from is secured with SSL")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ssl;

    public Boolean getSsl() {
        return ssl;
    }

    public void setSsl(Boolean ssl) {
        this.ssl = ssl;
    }

    /**
     * User name for authentication with the server where to migrate data from
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("User name for authentication with the server where to migrate data from")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


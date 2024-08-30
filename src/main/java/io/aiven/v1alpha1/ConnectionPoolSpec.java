package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authSecretRef","connInfoSecretTarget","databaseName","poolMode","poolSize","project","serviceName","username"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ConnectionPoolSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication reference to Aiven token in a secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication reference to Aiven token in a secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.connectionpoolspec.AuthSecretRef authSecretRef;

    public io.aiven.v1alpha1.connectionpoolspec.AuthSecretRef getAuthSecretRef() {
        return authSecretRef;
    }

    public void setAuthSecretRef(io.aiven.v1alpha1.connectionpoolspec.AuthSecretRef authSecretRef) {
        this.authSecretRef = authSecretRef;
    }

    /**
     * Information regarding secret creation. Exposed keys: `CONNECTIONPOOL_HOST`, `CONNECTIONPOOL_PORT`, `CONNECTIONPOOL_DATABASE`, `CONNECTIONPOOL_USER`, `CONNECTIONPOOL_PASSWORD`, `CONNECTIONPOOL_SSLMODE`, `CONNECTIONPOOL_DATABASE_URI`
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connInfoSecretTarget")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Information regarding secret creation. Exposed keys: `CONNECTIONPOOL_HOST`, `CONNECTIONPOOL_PORT`, `CONNECTIONPOOL_DATABASE`, `CONNECTIONPOOL_USER`, `CONNECTIONPOOL_PASSWORD`, `CONNECTIONPOOL_SSLMODE`, `CONNECTIONPOOL_DATABASE_URI`")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.connectionpoolspec.ConnInfoSecretTarget connInfoSecretTarget;

    public io.aiven.v1alpha1.connectionpoolspec.ConnInfoSecretTarget getConnInfoSecretTarget() {
        return connInfoSecretTarget;
    }

    public void setConnInfoSecretTarget(io.aiven.v1alpha1.connectionpoolspec.ConnInfoSecretTarget connInfoSecretTarget) {
        this.connInfoSecretTarget = connInfoSecretTarget;
    }

    /**
     * Name of the database the pool connects to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the database the pool connects to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String databaseName;

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public enum PoolMode {

        @com.fasterxml.jackson.annotation.JsonProperty("session")
        SESSION("session"), @com.fasterxml.jackson.annotation.JsonProperty("transaction")
        TRANSACTION("transaction"), @com.fasterxml.jackson.annotation.JsonProperty("statement")
        STATEMENT("statement");

        java.lang.String value;

        PoolMode(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Mode the pool operates in (session, transaction, statement)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("poolMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Mode the pool operates in (session, transaction, statement)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private PoolMode poolMode;

    public PoolMode getPoolMode() {
        return poolMode;
    }

    public void setPoolMode(PoolMode poolMode) {
        this.poolMode = poolMode;
    }

    /**
     * Number of connections the pool may create towards the backend server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("poolSize")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of connections the pool may create towards the backend server")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long poolSize;

    public Long getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(Long poolSize) {
        this.poolSize = poolSize;
    }

    /**
     * Target project.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Target project.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * Service name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Service name.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceName;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Name of the service user used to connect to the database
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the service user used to connect to the database")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


package io.aiven.v1alpha1.cassandraspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"additional_backup_regions","cassandra","cassandra_version","ip_filter","migrate_sstableloader","private_access","project_to_fork_from","public_access","service_to_fork_from","service_to_join_with","static_ips"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class UserConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Additional Cloud Regions for Backup Replication
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additional_backup_regions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Additional Cloud Regions for Backup Replication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> additional_backup_regions;

    public java.util.List<String> getAdditional_backup_regions() {
        return additional_backup_regions;
    }

    public void setAdditional_backup_regions(java.util.List<String> additional_backup_regions) {
        this.additional_backup_regions = additional_backup_regions;
    }

    /**
     * cassandra configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cassandra")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("cassandra configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.cassandraspec.userconfig.Cassandra cassandra;

    public io.aiven.v1alpha1.cassandraspec.userconfig.Cassandra getCassandra() {
        return cassandra;
    }

    public void setCassandra(io.aiven.v1alpha1.cassandraspec.userconfig.Cassandra cassandra) {
        this.cassandra = cassandra;
    }

    public enum Cassandra_version {

        @com.fasterxml.jackson.annotation.JsonProperty("4")
        V__4("4"), @com.fasterxml.jackson.annotation.JsonProperty("3")
        V__3("3");

        java.lang.String value;

        Cassandra_version(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Cassandra major version
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cassandra_version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Cassandra major version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Cassandra_version cassandra_version;

    public Cassandra_version getCassandra_version() {
        return cassandra_version;
    }

    public void setCassandra_version(Cassandra_version cassandra_version) {
        this.cassandra_version = cassandra_version;
    }

    /**
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ip_filter")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.cassandraspec.userconfig.Ip_filter> ip_filter;

    public java.util.List<io.aiven.v1alpha1.cassandraspec.userconfig.Ip_filter> getIp_filter() {
        return ip_filter;
    }

    public void setIp_filter(java.util.List<io.aiven.v1alpha1.cassandraspec.userconfig.Ip_filter> ip_filter) {
        this.ip_filter = ip_filter;
    }

    /**
     * Sets the service into migration mode enabling the sstableloader utility to be used to upload Cassandra data files. Available only on service create.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("migrate_sstableloader")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sets the service into migration mode enabling the sstableloader utility to be used to upload Cassandra data files. Available only on service create.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean migrate_sstableloader;

    public Boolean getMigrate_sstableloader() {
        return migrate_sstableloader;
    }

    public void setMigrate_sstableloader(Boolean migrate_sstableloader) {
        this.migrate_sstableloader = migrate_sstableloader;
    }

    /**
     * Allow access to selected service ports from private networks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("private_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service ports from private networks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.cassandraspec.userconfig.Private_access private_access;

    public io.aiven.v1alpha1.cassandraspec.userconfig.Private_access getPrivate_access() {
        return private_access;
    }

    public void setPrivate_access(io.aiven.v1alpha1.cassandraspec.userconfig.Private_access private_access) {
        this.private_access = private_access;
    }

    /**
     * Name of another project to fork a service from. This has effect only when a new service is being created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("project_to_fork_from")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of another project to fork a service from. This has effect only when a new service is being created.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String project_to_fork_from;

    public String getProject_to_fork_from() {
        return project_to_fork_from;
    }

    public void setProject_to_fork_from(String project_to_fork_from) {
        this.project_to_fork_from = project_to_fork_from;
    }

    /**
     * Allow access to selected service ports from the public Internet
     */
    @com.fasterxml.jackson.annotation.JsonProperty("public_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service ports from the public Internet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.cassandraspec.userconfig.Public_access public_access;

    public io.aiven.v1alpha1.cassandraspec.userconfig.Public_access getPublic_access() {
        return public_access;
    }

    public void setPublic_access(io.aiven.v1alpha1.cassandraspec.userconfig.Public_access public_access) {
        this.public_access = public_access;
    }

    /**
     * Name of another service to fork from. This has effect only when a new service is being created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("service_to_fork_from")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of another service to fork from. This has effect only when a new service is being created.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String service_to_fork_from;

    public String getService_to_fork_from() {
        return service_to_fork_from;
    }

    public void setService_to_fork_from(String service_to_fork_from) {
        this.service_to_fork_from = service_to_fork_from;
    }

    /**
     * When bootstrapping, instead of creating a new Cassandra cluster try to join an existing one from another service. Can only be set on service creation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("service_to_join_with")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("When bootstrapping, instead of creating a new Cassandra cluster try to join an existing one from another service. Can only be set on service creation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String service_to_join_with;

    public String getService_to_join_with() {
        return service_to_join_with;
    }

    public void setService_to_join_with(String service_to_join_with) {
        this.service_to_join_with = service_to_join_with;
    }

    /**
     * Use static public IP addresses
     */
    @com.fasterxml.jackson.annotation.JsonProperty("static_ips")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use static public IP addresses")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean static_ips;

    public Boolean getStatic_ips() {
        return static_ips;
    }

    public void setStatic_ips(Boolean static_ips) {
        this.static_ips = static_ips;
    }
}


package io.aiven.v1alpha1.postgresqlspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"additional_backup_regions","admin_password","admin_username","backup_hour","backup_minute","enable_ipv6","ip_filter","migration","pg","pg_read_replica","pg_service_to_fork_from","pg_stat_monitor_enable","pg_version","pgbouncer","pglookout","private_access","privatelink_access","project_to_fork_from","public_access","recovery_target_time","service_to_fork_from","shared_buffers_percentage","static_ips","synchronous_replication","timescaledb","variant","work_mem"})
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
     * Custom password for admin user. Defaults to random string. This must be set only when a new service is being created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("admin_password")
    @io.fabric8.generator.annotation.Pattern("^[a-zA-Z0-9-_]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Custom password for admin user. Defaults to random string. This must be set only when a new service is being created.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String admin_password;

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    /**
     * Custom username for admin user. This must be set only when a new service is being created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("admin_username")
    @io.fabric8.generator.annotation.Pattern("^[_A-Za-z0-9][-._A-Za-z0-9]{0,63}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Custom username for admin user. This must be set only when a new service is being created.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String admin_username;

    public String getAdmin_username() {
        return admin_username;
    }

    public void setAdmin_username(String admin_username) {
        this.admin_username = admin_username;
    }

    /**
     * The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backup_hour")
    @io.fabric8.generator.annotation.Max(23.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long backup_hour;

    public Long getBackup_hour() {
        return backup_hour;
    }

    public void setBackup_hour(Long backup_hour) {
        this.backup_hour = backup_hour;
    }

    /**
     * The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backup_minute")
    @io.fabric8.generator.annotation.Max(59.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long backup_minute;

    public Long getBackup_minute() {
        return backup_minute;
    }

    public void setBackup_minute(Long backup_minute) {
        this.backup_minute = backup_minute;
    }

    /**
     * Register AAAA DNS records for the service, and allow IPv6 packets to service ports
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enable_ipv6")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Register AAAA DNS records for the service, and allow IPv6 packets to service ports")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enable_ipv6;

    public Boolean getEnable_ipv6() {
        return enable_ipv6;
    }

    public void setEnable_ipv6(Boolean enable_ipv6) {
        this.enable_ipv6 = enable_ipv6;
    }

    /**
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ip_filter")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.postgresqlspec.userconfig.Ip_filter> ip_filter;

    public java.util.List<io.aiven.v1alpha1.postgresqlspec.userconfig.Ip_filter> getIp_filter() {
        return ip_filter;
    }

    public void setIp_filter(java.util.List<io.aiven.v1alpha1.postgresqlspec.userconfig.Ip_filter> ip_filter) {
        this.ip_filter = ip_filter;
    }

    /**
     * Migrate data from existing server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("migration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Migrate data from existing server")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.postgresqlspec.userconfig.Migration migration;

    public io.aiven.v1alpha1.postgresqlspec.userconfig.Migration getMigration() {
        return migration;
    }

    public void setMigration(io.aiven.v1alpha1.postgresqlspec.userconfig.Migration migration) {
        this.migration = migration;
    }

    /**
     * postgresql.conf configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pg")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("postgresql.conf configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.postgresqlspec.userconfig.Pg pg;

    public io.aiven.v1alpha1.postgresqlspec.userconfig.Pg getPg() {
        return pg;
    }

    public void setPg(io.aiven.v1alpha1.postgresqlspec.userconfig.Pg pg) {
        this.pg = pg;
    }

    /**
     * Should the service which is being forked be a read replica (deprecated, use read_replica service integration instead).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pg_read_replica")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Should the service which is being forked be a read replica (deprecated, use read_replica service integration instead).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean pg_read_replica;

    public Boolean getPg_read_replica() {
        return pg_read_replica;
    }

    public void setPg_read_replica(Boolean pg_read_replica) {
        this.pg_read_replica = pg_read_replica;
    }

    /**
     * Name of the PG Service from which to fork (deprecated, use service_to_fork_from). This has effect only when a new service is being created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pg_service_to_fork_from")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the PG Service from which to fork (deprecated, use service_to_fork_from). This has effect only when a new service is being created.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String pg_service_to_fork_from;

    public String getPg_service_to_fork_from() {
        return pg_service_to_fork_from;
    }

    public void setPg_service_to_fork_from(String pg_service_to_fork_from) {
        this.pg_service_to_fork_from = pg_service_to_fork_from;
    }

    /**
     * Enable the pg_stat_monitor extension. Enabling this extension will cause the cluster to be restarted.When this extension is enabled, pg_stat_statements results for utility commands are unreliable
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pg_stat_monitor_enable")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable the pg_stat_monitor extension. Enabling this extension will cause the cluster to be restarted.When this extension is enabled, pg_stat_statements results for utility commands are unreliable")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean pg_stat_monitor_enable;

    public Boolean getPg_stat_monitor_enable() {
        return pg_stat_monitor_enable;
    }

    public void setPg_stat_monitor_enable(Boolean pg_stat_monitor_enable) {
        this.pg_stat_monitor_enable = pg_stat_monitor_enable;
    }

    public enum Pg_version {

        @com.fasterxml.jackson.annotation.JsonProperty("11")
        V__11("11"), @com.fasterxml.jackson.annotation.JsonProperty("12")
        V__12("12"), @com.fasterxml.jackson.annotation.JsonProperty("13")
        V__13("13"), @com.fasterxml.jackson.annotation.JsonProperty("14")
        V__14("14"), @com.fasterxml.jackson.annotation.JsonProperty("15")
        V__15("15");

        java.lang.String value;

        Pg_version(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * PostgreSQL major version
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pg_version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL major version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Pg_version pg_version;

    public Pg_version getPg_version() {
        return pg_version;
    }

    public void setPg_version(Pg_version pg_version) {
        this.pg_version = pg_version;
    }

    /**
     * PGBouncer connection pooling settings
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pgbouncer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PGBouncer connection pooling settings")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.postgresqlspec.userconfig.Pgbouncer pgbouncer;

    public io.aiven.v1alpha1.postgresqlspec.userconfig.Pgbouncer getPgbouncer() {
        return pgbouncer;
    }

    public void setPgbouncer(io.aiven.v1alpha1.postgresqlspec.userconfig.Pgbouncer pgbouncer) {
        this.pgbouncer = pgbouncer;
    }

    /**
     * PGLookout settings
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pglookout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PGLookout settings")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.postgresqlspec.userconfig.Pglookout pglookout;

    public io.aiven.v1alpha1.postgresqlspec.userconfig.Pglookout getPglookout() {
        return pglookout;
    }

    public void setPglookout(io.aiven.v1alpha1.postgresqlspec.userconfig.Pglookout pglookout) {
        this.pglookout = pglookout;
    }

    /**
     * Allow access to selected service ports from private networks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("private_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service ports from private networks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.postgresqlspec.userconfig.Private_access private_access;

    public io.aiven.v1alpha1.postgresqlspec.userconfig.Private_access getPrivate_access() {
        return private_access;
    }

    public void setPrivate_access(io.aiven.v1alpha1.postgresqlspec.userconfig.Private_access private_access) {
        this.private_access = private_access;
    }

    /**
     * Allow access to selected service components through Privatelink
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privatelink_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service components through Privatelink")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.postgresqlspec.userconfig.Privatelink_access privatelink_access;

    public io.aiven.v1alpha1.postgresqlspec.userconfig.Privatelink_access getPrivatelink_access() {
        return privatelink_access;
    }

    public void setPrivatelink_access(io.aiven.v1alpha1.postgresqlspec.userconfig.Privatelink_access privatelink_access) {
        this.privatelink_access = privatelink_access;
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
    private io.aiven.v1alpha1.postgresqlspec.userconfig.Public_access public_access;

    public io.aiven.v1alpha1.postgresqlspec.userconfig.Public_access getPublic_access() {
        return public_access;
    }

    public void setPublic_access(io.aiven.v1alpha1.postgresqlspec.userconfig.Public_access public_access) {
        this.public_access = public_access;
    }

    /**
     * Recovery target time when forking a service. This has effect only when a new service is being created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recovery_target_time")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Recovery target time when forking a service. This has effect only when a new service is being created.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String recovery_target_time;

    public String getRecovery_target_time() {
        return recovery_target_time;
    }

    public void setRecovery_target_time(String recovery_target_time) {
        this.recovery_target_time = recovery_target_time;
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
     * Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shared_buffers_percentage")
    @io.fabric8.generator.annotation.Max(60.0)
    @io.fabric8.generator.annotation.Min(20.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Double shared_buffers_percentage;

    public Double getShared_buffers_percentage() {
        return shared_buffers_percentage;
    }

    public void setShared_buffers_percentage(Double shared_buffers_percentage) {
        this.shared_buffers_percentage = shared_buffers_percentage;
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

    public enum Synchronous_replication {

        @com.fasterxml.jackson.annotation.JsonProperty("quorum")
        QUORUM("quorum"), @com.fasterxml.jackson.annotation.JsonProperty("off")
        OFF("off");

        java.lang.String value;

        Synchronous_replication(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Synchronous replication type. Note that the service plan also needs to support synchronous replication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("synchronous_replication")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Synchronous replication type. Note that the service plan also needs to support synchronous replication.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Synchronous_replication synchronous_replication;

    public Synchronous_replication getSynchronous_replication() {
        return synchronous_replication;
    }

    public void setSynchronous_replication(Synchronous_replication synchronous_replication) {
        this.synchronous_replication = synchronous_replication;
    }

    /**
     * TimescaleDB extension configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timescaledb")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TimescaleDB extension configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.postgresqlspec.userconfig.Timescaledb timescaledb;

    public io.aiven.v1alpha1.postgresqlspec.userconfig.Timescaledb getTimescaledb() {
        return timescaledb;
    }

    public void setTimescaledb(io.aiven.v1alpha1.postgresqlspec.userconfig.Timescaledb timescaledb) {
        this.timescaledb = timescaledb;
    }

    public enum Variant {

        @com.fasterxml.jackson.annotation.JsonProperty("aiven")
        AIVEN("aiven"), @com.fasterxml.jackson.annotation.JsonProperty("timescale")
        TIMESCALE("timescale");

        java.lang.String value;

        Variant(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Variant of the PostgreSQL service, may affect the features that are exposed by default
     */
    @com.fasterxml.jackson.annotation.JsonProperty("variant")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Variant of the PostgreSQL service, may affect the features that are exposed by default")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Variant variant;

    public Variant getVariant() {
        return variant;
    }

    public void setVariant(Variant variant) {
        this.variant = variant;
    }

    /**
     * Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("work_mem")
    @io.fabric8.generator.annotation.Max(1024.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long work_mem;

    public Long getWork_mem() {
        return work_mem;
    }

    public void setWork_mem(Long work_mem) {
        this.work_mem = work_mem;
    }
}


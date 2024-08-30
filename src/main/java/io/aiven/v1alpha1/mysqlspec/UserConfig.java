package io.aiven.v1alpha1.mysqlspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"additional_backup_regions","admin_password","admin_username","backup_hour","backup_minute","binlog_retention_period","ip_filter","migration","mysql","mysql_version","private_access","privatelink_access","project_to_fork_from","public_access","recovery_target_time","service_to_fork_from","static_ips"})
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
     * The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("binlog_retention_period")
    @io.fabric8.generator.annotation.Max(86400.0)
    @io.fabric8.generator.annotation.Min(600.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long binlog_retention_period;

    public Long getBinlog_retention_period() {
        return binlog_retention_period;
    }

    public void setBinlog_retention_period(Long binlog_retention_period) {
        this.binlog_retention_period = binlog_retention_period;
    }

    /**
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ip_filter")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.mysqlspec.userconfig.Ip_filter> ip_filter;

    public java.util.List<io.aiven.v1alpha1.mysqlspec.userconfig.Ip_filter> getIp_filter() {
        return ip_filter;
    }

    public void setIp_filter(java.util.List<io.aiven.v1alpha1.mysqlspec.userconfig.Ip_filter> ip_filter) {
        this.ip_filter = ip_filter;
    }

    /**
     * Migrate data from existing server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("migration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Migrate data from existing server")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.mysqlspec.userconfig.Migration migration;

    public io.aiven.v1alpha1.mysqlspec.userconfig.Migration getMigration() {
        return migration;
    }

    public void setMigration(io.aiven.v1alpha1.mysqlspec.userconfig.Migration migration) {
        this.migration = migration;
    }

    /**
     * mysql.conf configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysql")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("mysql.conf configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.mysqlspec.userconfig.Mysql mysql;

    public io.aiven.v1alpha1.mysqlspec.userconfig.Mysql getMysql() {
        return mysql;
    }

    public void setMysql(io.aiven.v1alpha1.mysqlspec.userconfig.Mysql mysql) {
        this.mysql = mysql;
    }

    public enum Mysql_version {

        @com.fasterxml.jackson.annotation.JsonProperty("8")
        V__8("8");

        java.lang.String value;

        Mysql_version(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * MySQL major version
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysql_version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MySQL major version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Mysql_version mysql_version;

    public Mysql_version getMysql_version() {
        return mysql_version;
    }

    public void setMysql_version(Mysql_version mysql_version) {
        this.mysql_version = mysql_version;
    }

    /**
     * Allow access to selected service ports from private networks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("private_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service ports from private networks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.mysqlspec.userconfig.Private_access private_access;

    public io.aiven.v1alpha1.mysqlspec.userconfig.Private_access getPrivate_access() {
        return private_access;
    }

    public void setPrivate_access(io.aiven.v1alpha1.mysqlspec.userconfig.Private_access private_access) {
        this.private_access = private_access;
    }

    /**
     * Allow access to selected service components through Privatelink
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privatelink_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service components through Privatelink")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.mysqlspec.userconfig.Privatelink_access privatelink_access;

    public io.aiven.v1alpha1.mysqlspec.userconfig.Privatelink_access getPrivatelink_access() {
        return privatelink_access;
    }

    public void setPrivatelink_access(io.aiven.v1alpha1.mysqlspec.userconfig.Privatelink_access privatelink_access) {
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
    private io.aiven.v1alpha1.mysqlspec.userconfig.Public_access public_access;

    public io.aiven.v1alpha1.mysqlspec.userconfig.Public_access getPublic_access() {
        return public_access;
    }

    public void setPublic_access(io.aiven.v1alpha1.mysqlspec.userconfig.Public_access public_access) {
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


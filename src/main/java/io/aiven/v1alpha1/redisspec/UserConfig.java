package io.aiven.v1alpha1.redisspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"additional_backup_regions","ip_filter","migration","private_access","privatelink_access","project_to_fork_from","public_access","recovery_basebackup_name","redis_acl_channels_default","redis_io_threads","redis_lfu_decay_time","redis_lfu_log_factor","redis_maxmemory_policy","redis_notify_keyspace_events","redis_number_of_databases","redis_persistence","redis_pubsub_client_output_buffer_limit","redis_ssl","redis_timeout","service_to_fork_from","static_ips"})
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
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ip_filter")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.redisspec.userconfig.Ip_filter> ip_filter;

    public java.util.List<io.aiven.v1alpha1.redisspec.userconfig.Ip_filter> getIp_filter() {
        return ip_filter;
    }

    public void setIp_filter(java.util.List<io.aiven.v1alpha1.redisspec.userconfig.Ip_filter> ip_filter) {
        this.ip_filter = ip_filter;
    }

    /**
     * Migrate data from existing server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("migration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Migrate data from existing server")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.redisspec.userconfig.Migration migration;

    public io.aiven.v1alpha1.redisspec.userconfig.Migration getMigration() {
        return migration;
    }

    public void setMigration(io.aiven.v1alpha1.redisspec.userconfig.Migration migration) {
        this.migration = migration;
    }

    /**
     * Allow access to selected service ports from private networks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("private_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service ports from private networks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.redisspec.userconfig.Private_access private_access;

    public io.aiven.v1alpha1.redisspec.userconfig.Private_access getPrivate_access() {
        return private_access;
    }

    public void setPrivate_access(io.aiven.v1alpha1.redisspec.userconfig.Private_access private_access) {
        this.private_access = private_access;
    }

    /**
     * Allow access to selected service components through Privatelink
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privatelink_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service components through Privatelink")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.redisspec.userconfig.Privatelink_access privatelink_access;

    public io.aiven.v1alpha1.redisspec.userconfig.Privatelink_access getPrivatelink_access() {
        return privatelink_access;
    }

    public void setPrivatelink_access(io.aiven.v1alpha1.redisspec.userconfig.Privatelink_access privatelink_access) {
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
    private io.aiven.v1alpha1.redisspec.userconfig.Public_access public_access;

    public io.aiven.v1alpha1.redisspec.userconfig.Public_access getPublic_access() {
        return public_access;
    }

    public void setPublic_access(io.aiven.v1alpha1.redisspec.userconfig.Public_access public_access) {
        this.public_access = public_access;
    }

    /**
     * Name of the basebackup to restore in forked service
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recovery_basebackup_name")
    @io.fabric8.generator.annotation.Pattern("^[a-zA-Z0-9-_:.]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the basebackup to restore in forked service")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String recovery_basebackup_name;

    public String getRecovery_basebackup_name() {
        return recovery_basebackup_name;
    }

    public void setRecovery_basebackup_name(String recovery_basebackup_name) {
        this.recovery_basebackup_name = recovery_basebackup_name;
    }

    public enum Redis_acl_channels_default {

        @com.fasterxml.jackson.annotation.JsonProperty("allchannels")
        ALLCHANNELS("allchannels"), @com.fasterxml.jackson.annotation.JsonProperty("resetchannels")
        RESETCHANNELS("resetchannels");

        java.lang.String value;

        Redis_acl_channels_default(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Determines default pub/sub channels' ACL for new users if ACL is not supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option doesn't affect Redis configuration acl-pubsub-default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis_acl_channels_default")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Determines default pub/sub channels' ACL for new users if ACL is not supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option doesn't affect Redis configuration acl-pubsub-default.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Redis_acl_channels_default redis_acl_channels_default;

    public Redis_acl_channels_default getRedis_acl_channels_default() {
        return redis_acl_channels_default;
    }

    public void setRedis_acl_channels_default(Redis_acl_channels_default redis_acl_channels_default) {
        this.redis_acl_channels_default = redis_acl_channels_default;
    }

    /**
     * Redis IO thread count
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis_io_threads")
    @io.fabric8.generator.annotation.Max(32.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Redis IO thread count")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long redis_io_threads;

    public Long getRedis_io_threads() {
        return redis_io_threads;
    }

    public void setRedis_io_threads(Long redis_io_threads) {
        this.redis_io_threads = redis_io_threads;
    }

    /**
     * LFU maxmemory-policy counter decay time in minutes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis_lfu_decay_time")
    @io.fabric8.generator.annotation.Max(120.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LFU maxmemory-policy counter decay time in minutes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long redis_lfu_decay_time;

    public Long getRedis_lfu_decay_time() {
        return redis_lfu_decay_time;
    }

    public void setRedis_lfu_decay_time(Long redis_lfu_decay_time) {
        this.redis_lfu_decay_time = redis_lfu_decay_time;
    }

    /**
     * Counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory-policies
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis_lfu_log_factor")
    @io.fabric8.generator.annotation.Max(100.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory-policies")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long redis_lfu_log_factor;

    public Long getRedis_lfu_log_factor() {
        return redis_lfu_log_factor;
    }

    public void setRedis_lfu_log_factor(Long redis_lfu_log_factor) {
        this.redis_lfu_log_factor = redis_lfu_log_factor;
    }

    public enum Redis_maxmemory_policy {

        @com.fasterxml.jackson.annotation.JsonProperty("noeviction")
        NOEVICTION("noeviction"),
        @com.fasterxml.jackson.annotation.JsonProperty("allkeys-lru")
        ALLKEYSLRU("allkeys-lru"),
        @com.fasterxml.jackson.annotation.JsonProperty("volatile-lru")
        VOLATILELRU("volatile-lru"),
        @com.fasterxml.jackson.annotation.JsonProperty("allkeys-random")
        ALLKEYSRANDOM("allkeys-random"),
        @com.fasterxml.jackson.annotation.JsonProperty("volatile-random")
        VOLATILERANDOM("volatile-random"),
        @com.fasterxml.jackson.annotation.JsonProperty("volatile-ttl")
        VOLATILETTL("volatile-ttl"),
        @com.fasterxml.jackson.annotation.JsonProperty("volatile-lfu")
        VOLATILELFU("volatile-lfu"),
        @com.fasterxml.jackson.annotation.JsonProperty("allkeys-lfu")
        ALLKEYSLFU("allkeys-lfu");

        java.lang.String value;

        Redis_maxmemory_policy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Redis maxmemory-policy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis_maxmemory_policy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Redis maxmemory-policy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Redis_maxmemory_policy redis_maxmemory_policy;

    public Redis_maxmemory_policy getRedis_maxmemory_policy() {
        return redis_maxmemory_policy;
    }

    public void setRedis_maxmemory_policy(Redis_maxmemory_policy redis_maxmemory_policy) {
        this.redis_maxmemory_policy = redis_maxmemory_policy;
    }

    /**
     * Set notify-keyspace-events option
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis_notify_keyspace_events")
    @io.fabric8.generator.annotation.Pattern("^[KEg\\$lshzxeA]*$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Set notify-keyspace-events option")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String redis_notify_keyspace_events;

    public String getRedis_notify_keyspace_events() {
        return redis_notify_keyspace_events;
    }

    public void setRedis_notify_keyspace_events(String redis_notify_keyspace_events) {
        this.redis_notify_keyspace_events = redis_notify_keyspace_events;
    }

    /**
     * Set number of redis databases. Changing this will cause a restart of redis service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis_number_of_databases")
    @io.fabric8.generator.annotation.Max(128.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Set number of redis databases. Changing this will cause a restart of redis service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long redis_number_of_databases;

    public Long getRedis_number_of_databases() {
        return redis_number_of_databases;
    }

    public void setRedis_number_of_databases(Long redis_number_of_databases) {
        this.redis_number_of_databases = redis_number_of_databases;
    }

    public enum Redis_persistence {

        @com.fasterxml.jackson.annotation.JsonProperty("off")
        OFF("off"), @com.fasterxml.jackson.annotation.JsonProperty("rdb")
        RDB("rdb");

        java.lang.String value;

        Redis_persistence(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is 'off', no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis_persistence")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is 'off', no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Redis_persistence redis_persistence;

    public Redis_persistence getRedis_persistence() {
        return redis_persistence;
    }

    public void setRedis_persistence(Redis_persistence redis_persistence) {
        this.redis_persistence = redis_persistence;
    }

    /**
     * Set output buffer limit for pub / sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis_pubsub_client_output_buffer_limit")
    @io.fabric8.generator.annotation.Max(512.0)
    @io.fabric8.generator.annotation.Min(32.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Set output buffer limit for pub / sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long redis_pubsub_client_output_buffer_limit;

    public Long getRedis_pubsub_client_output_buffer_limit() {
        return redis_pubsub_client_output_buffer_limit;
    }

    public void setRedis_pubsub_client_output_buffer_limit(Long redis_pubsub_client_output_buffer_limit) {
        this.redis_pubsub_client_output_buffer_limit = redis_pubsub_client_output_buffer_limit;
    }

    /**
     * Require SSL to access Redis
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis_ssl")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Require SSL to access Redis")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean redis_ssl;

    public Boolean getRedis_ssl() {
        return redis_ssl;
    }

    public void setRedis_ssl(Boolean redis_ssl) {
        this.redis_ssl = redis_ssl;
    }

    /**
     * Redis idle connection timeout in seconds
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis_timeout")
    @io.fabric8.generator.annotation.Max(3.1536E7)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Redis idle connection timeout in seconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long redis_timeout;

    public Long getRedis_timeout() {
        return redis_timeout;
    }

    public void setRedis_timeout(Long redis_timeout) {
        this.redis_timeout = redis_timeout;
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


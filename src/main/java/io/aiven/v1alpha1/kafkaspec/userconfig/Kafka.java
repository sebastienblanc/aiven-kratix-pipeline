package io.aiven.v1alpha1.kafkaspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"auto_create_topics_enable","compression_type","connections_max_idle_ms","default_replication_factor","group_initial_rebalance_delay_ms","group_max_session_timeout_ms","group_min_session_timeout_ms","log_cleaner_delete_retention_ms","log_cleaner_max_compaction_lag_ms","log_cleaner_min_cleanable_ratio","log_cleaner_min_compaction_lag_ms","log_cleanup_policy","log_flush_interval_messages","log_flush_interval_ms","log_index_interval_bytes","log_index_size_max_bytes","log_message_downconversion_enable","log_message_timestamp_difference_max_ms","log_message_timestamp_type","log_preallocate","log_retention_bytes","log_retention_hours","log_retention_ms","log_roll_jitter_ms","log_roll_ms","log_segment_bytes","log_segment_delete_delay_ms","max_connections_per_ip","max_incremental_fetch_session_cache_slots","message_max_bytes","min_insync_replicas","num_partitions","offsets_retention_minutes","producer_purgatory_purge_interval_requests","replica_fetch_max_bytes","replica_fetch_response_max_bytes","socket_request_max_bytes","transaction_remove_expired_transaction_cleanup_interval_ms","transaction_state_log_segment_bytes"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Kafka implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enable auto creation of topics
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auto_create_topics_enable")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable auto creation of topics")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean auto_create_topics_enable;

    public Boolean getAuto_create_topics_enable() {
        return auto_create_topics_enable;
    }

    public void setAuto_create_topics_enable(Boolean auto_create_topics_enable) {
        this.auto_create_topics_enable = auto_create_topics_enable;
    }

    public enum Compression_type {

        @com.fasterxml.jackson.annotation.JsonProperty("gzip")
        GZIP("gzip"),
        @com.fasterxml.jackson.annotation.JsonProperty("snappy")
        SNAPPY("snappy"),
        @com.fasterxml.jackson.annotation.JsonProperty("lz4")
        LZ4("lz4"),
        @com.fasterxml.jackson.annotation.JsonProperty("zstd")
        ZSTD("zstd"),
        @com.fasterxml.jackson.annotation.JsonProperty("uncompressed")
        UNCOMPRESSED("uncompressed"),
        @com.fasterxml.jackson.annotation.JsonProperty("producer")
        PRODUCER("producer");

        java.lang.String value;

        Compression_type(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Specify the final compression type for a given topic. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'uncompressed' which is equivalent to no compression; and 'producer' which means retain the original compression codec set by the producer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compression_type")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specify the final compression type for a given topic. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'uncompressed' which is equivalent to no compression; and 'producer' which means retain the original compression codec set by the producer.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Compression_type compression_type;

    public Compression_type getCompression_type() {
        return compression_type;
    }

    public void setCompression_type(Compression_type compression_type) {
        this.compression_type = compression_type;
    }

    /**
     * Idle connections timeout: the server socket processor threads close the connections that idle for longer than this.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connections_max_idle_ms")
    @io.fabric8.generator.annotation.Max(3600000.0)
    @io.fabric8.generator.annotation.Min(1000.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Idle connections timeout: the server socket processor threads close the connections that idle for longer than this.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long connections_max_idle_ms;

    public Long getConnections_max_idle_ms() {
        return connections_max_idle_ms;
    }

    public void setConnections_max_idle_ms(Long connections_max_idle_ms) {
        this.connections_max_idle_ms = connections_max_idle_ms;
    }

    /**
     * Replication factor for autocreated topics
     */
    @com.fasterxml.jackson.annotation.JsonProperty("default_replication_factor")
    @io.fabric8.generator.annotation.Max(10.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Replication factor for autocreated topics")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long default_replication_factor;

    public Long getDefault_replication_factor() {
        return default_replication_factor;
    }

    public void setDefault_replication_factor(Long default_replication_factor) {
        this.default_replication_factor = default_replication_factor;
    }

    /**
     * The amount of time, in milliseconds, the group coordinator will wait for more consumers to join a new group before performing the first rebalance. A longer delay means potentially fewer rebalances, but increases the time until processing begins. The default value for this is 3 seconds. During development and testing it might be desirable to set this to 0 in order to not delay test execution time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("group_initial_rebalance_delay_ms")
    @io.fabric8.generator.annotation.Max(300000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The amount of time, in milliseconds, the group coordinator will wait for more consumers to join a new group before performing the first rebalance. A longer delay means potentially fewer rebalances, but increases the time until processing begins. The default value for this is 3 seconds. During development and testing it might be desirable to set this to 0 in order to not delay test execution time.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long group_initial_rebalance_delay_ms;

    public Long getGroup_initial_rebalance_delay_ms() {
        return group_initial_rebalance_delay_ms;
    }

    public void setGroup_initial_rebalance_delay_ms(Long group_initial_rebalance_delay_ms) {
        this.group_initial_rebalance_delay_ms = group_initial_rebalance_delay_ms;
    }

    /**
     * The maximum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("group_max_session_timeout_ms")
    @io.fabric8.generator.annotation.Max(1800000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long group_max_session_timeout_ms;

    public Long getGroup_max_session_timeout_ms() {
        return group_max_session_timeout_ms;
    }

    public void setGroup_max_session_timeout_ms(Long group_max_session_timeout_ms) {
        this.group_max_session_timeout_ms = group_max_session_timeout_ms;
    }

    /**
     * The minimum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("group_min_session_timeout_ms")
    @io.fabric8.generator.annotation.Max(60000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The minimum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long group_min_session_timeout_ms;

    public Long getGroup_min_session_timeout_ms() {
        return group_min_session_timeout_ms;
    }

    public void setGroup_min_session_timeout_ms(Long group_min_session_timeout_ms) {
        this.group_min_session_timeout_ms = group_min_session_timeout_ms;
    }

    /**
     * How long are delete records retained?
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_cleaner_delete_retention_ms")
    @io.fabric8.generator.annotation.Max(3.1556926E11)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("How long are delete records retained?")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_cleaner_delete_retention_ms;

    public Long getLog_cleaner_delete_retention_ms() {
        return log_cleaner_delete_retention_ms;
    }

    public void setLog_cleaner_delete_retention_ms(Long log_cleaner_delete_retention_ms) {
        this.log_cleaner_delete_retention_ms = log_cleaner_delete_retention_ms;
    }

    /**
     * The maximum amount of time message will remain uncompacted. Only applicable for logs that are being compacted
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_cleaner_max_compaction_lag_ms")
    @io.fabric8.generator.annotation.Min(30000.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum amount of time message will remain uncompacted. Only applicable for logs that are being compacted")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_cleaner_max_compaction_lag_ms;

    public Long getLog_cleaner_max_compaction_lag_ms() {
        return log_cleaner_max_compaction_lag_ms;
    }

    public void setLog_cleaner_max_compaction_lag_ms(Long log_cleaner_max_compaction_lag_ms) {
        this.log_cleaner_max_compaction_lag_ms = log_cleaner_max_compaction_lag_ms;
    }

    /**
     * Controls log compactor frequency. Larger value means more frequent compactions but also more space wasted for logs. Consider setting log.cleaner.max.compaction.lag.ms to enforce compactions sooner, instead of setting a very high value for this option.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_cleaner_min_cleanable_ratio")
    @io.fabric8.generator.annotation.Max(0.9)
    @io.fabric8.generator.annotation.Min(0.2)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Controls log compactor frequency. Larger value means more frequent compactions but also more space wasted for logs. Consider setting log.cleaner.max.compaction.lag.ms to enforce compactions sooner, instead of setting a very high value for this option.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Double log_cleaner_min_cleanable_ratio;

    public Double getLog_cleaner_min_cleanable_ratio() {
        return log_cleaner_min_cleanable_ratio;
    }

    public void setLog_cleaner_min_cleanable_ratio(Double log_cleaner_min_cleanable_ratio) {
        this.log_cleaner_min_cleanable_ratio = log_cleaner_min_cleanable_ratio;
    }

    /**
     * The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_cleaner_min_compaction_lag_ms")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_cleaner_min_compaction_lag_ms;

    public Long getLog_cleaner_min_compaction_lag_ms() {
        return log_cleaner_min_compaction_lag_ms;
    }

    public void setLog_cleaner_min_compaction_lag_ms(Long log_cleaner_min_compaction_lag_ms) {
        this.log_cleaner_min_compaction_lag_ms = log_cleaner_min_compaction_lag_ms;
    }

    public enum Log_cleanup_policy {

        @com.fasterxml.jackson.annotation.JsonProperty("delete")
        DELETE("delete"), @com.fasterxml.jackson.annotation.JsonProperty("compact")
        COMPACT("compact"), @com.fasterxml.jackson.annotation.JsonProperty("compact,delete")
        COMPACT_DELETE("compact,delete");

        java.lang.String value;

        Log_cleanup_policy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The default cleanup policy for segments beyond the retention window
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_cleanup_policy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The default cleanup policy for segments beyond the retention window")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Log_cleanup_policy log_cleanup_policy;

    public Log_cleanup_policy getLog_cleanup_policy() {
        return log_cleanup_policy;
    }

    public void setLog_cleanup_policy(Log_cleanup_policy log_cleanup_policy) {
        this.log_cleanup_policy = log_cleanup_policy;
    }

    /**
     * The number of messages accumulated on a log partition before messages are flushed to disk
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_flush_interval_messages")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of messages accumulated on a log partition before messages are flushed to disk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_flush_interval_messages;

    public Long getLog_flush_interval_messages() {
        return log_flush_interval_messages;
    }

    public void setLog_flush_interval_messages(Long log_flush_interval_messages) {
        this.log_flush_interval_messages = log_flush_interval_messages;
    }

    /**
     * The maximum time in ms that a message in any topic is kept in memory before flushed to disk. If not set, the value in log.flush.scheduler.interval.ms is used
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_flush_interval_ms")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum time in ms that a message in any topic is kept in memory before flushed to disk. If not set, the value in log.flush.scheduler.interval.ms is used")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_flush_interval_ms;

    public Long getLog_flush_interval_ms() {
        return log_flush_interval_ms;
    }

    public void setLog_flush_interval_ms(Long log_flush_interval_ms) {
        this.log_flush_interval_ms = log_flush_interval_ms;
    }

    /**
     * The interval with which Kafka adds an entry to the offset index
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_index_interval_bytes")
    @io.fabric8.generator.annotation.Max(1.048576E8)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The interval with which Kafka adds an entry to the offset index")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_index_interval_bytes;

    public Long getLog_index_interval_bytes() {
        return log_index_interval_bytes;
    }

    public void setLog_index_interval_bytes(Long log_index_interval_bytes) {
        this.log_index_interval_bytes = log_index_interval_bytes;
    }

    /**
     * The maximum size in bytes of the offset index
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_index_size_max_bytes")
    @io.fabric8.generator.annotation.Max(1.048576E8)
    @io.fabric8.generator.annotation.Min(1048576.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum size in bytes of the offset index")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_index_size_max_bytes;

    public Long getLog_index_size_max_bytes() {
        return log_index_size_max_bytes;
    }

    public void setLog_index_size_max_bytes(Long log_index_size_max_bytes) {
        this.log_index_size_max_bytes = log_index_size_max_bytes;
    }

    /**
     * This configuration controls whether down-conversion of message formats is enabled to satisfy consume requests.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_message_downconversion_enable")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This configuration controls whether down-conversion of message formats is enabled to satisfy consume requests.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean log_message_downconversion_enable;

    public Boolean getLog_message_downconversion_enable() {
        return log_message_downconversion_enable;
    }

    public void setLog_message_downconversion_enable(Boolean log_message_downconversion_enable) {
        this.log_message_downconversion_enable = log_message_downconversion_enable;
    }

    /**
     * The maximum difference allowed between the timestamp when a broker receives a message and the timestamp specified in the message
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_message_timestamp_difference_max_ms")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum difference allowed between the timestamp when a broker receives a message and the timestamp specified in the message")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_message_timestamp_difference_max_ms;

    public Long getLog_message_timestamp_difference_max_ms() {
        return log_message_timestamp_difference_max_ms;
    }

    public void setLog_message_timestamp_difference_max_ms(Long log_message_timestamp_difference_max_ms) {
        this.log_message_timestamp_difference_max_ms = log_message_timestamp_difference_max_ms;
    }

    public enum Log_message_timestamp_type {

        @com.fasterxml.jackson.annotation.JsonProperty("CreateTime")
        CREATETIME("CreateTime"), @com.fasterxml.jackson.annotation.JsonProperty("LogAppendTime")
        LOGAPPENDTIME("LogAppendTime");

        java.lang.String value;

        Log_message_timestamp_type(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Define whether the timestamp in the message is message create time or log append time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_message_timestamp_type")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Define whether the timestamp in the message is message create time or log append time.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Log_message_timestamp_type log_message_timestamp_type;

    public Log_message_timestamp_type getLog_message_timestamp_type() {
        return log_message_timestamp_type;
    }

    public void setLog_message_timestamp_type(Log_message_timestamp_type log_message_timestamp_type) {
        this.log_message_timestamp_type = log_message_timestamp_type;
    }

    /**
     * Should pre allocate file when create new segment?
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_preallocate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Should pre allocate file when create new segment?")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean log_preallocate;

    public Boolean getLog_preallocate() {
        return log_preallocate;
    }

    public void setLog_preallocate(Boolean log_preallocate) {
        this.log_preallocate = log_preallocate;
    }

    /**
     * The maximum size of the log before deleting messages
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_retention_bytes")
    @io.fabric8.generator.annotation.Min(-1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum size of the log before deleting messages")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_retention_bytes;

    public Long getLog_retention_bytes() {
        return log_retention_bytes;
    }

    public void setLog_retention_bytes(Long log_retention_bytes) {
        this.log_retention_bytes = log_retention_bytes;
    }

    /**
     * The number of hours to keep a log file before deleting it
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_retention_hours")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(-1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of hours to keep a log file before deleting it")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_retention_hours;

    public Long getLog_retention_hours() {
        return log_retention_hours;
    }

    public void setLog_retention_hours(Long log_retention_hours) {
        this.log_retention_hours = log_retention_hours;
    }

    /**
     * The number of milliseconds to keep a log file before deleting it (in milliseconds), If not set, the value in log.retention.minutes is used. If set to -1, no time limit is applied.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_retention_ms")
    @io.fabric8.generator.annotation.Min(-1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of milliseconds to keep a log file before deleting it (in milliseconds), If not set, the value in log.retention.minutes is used. If set to -1, no time limit is applied.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_retention_ms;

    public Long getLog_retention_ms() {
        return log_retention_ms;
    }

    public void setLog_retention_ms(Long log_retention_ms) {
        this.log_retention_ms = log_retention_ms;
    }

    /**
     * The maximum jitter to subtract from logRollTimeMillis (in milliseconds). If not set, the value in log.roll.jitter.hours is used
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_roll_jitter_ms")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum jitter to subtract from logRollTimeMillis (in milliseconds). If not set, the value in log.roll.jitter.hours is used")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_roll_jitter_ms;

    public Long getLog_roll_jitter_ms() {
        return log_roll_jitter_ms;
    }

    public void setLog_roll_jitter_ms(Long log_roll_jitter_ms) {
        this.log_roll_jitter_ms = log_roll_jitter_ms;
    }

    /**
     * The maximum time before a new log segment is rolled out (in milliseconds).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_roll_ms")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum time before a new log segment is rolled out (in milliseconds).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_roll_ms;

    public Long getLog_roll_ms() {
        return log_roll_ms;
    }

    public void setLog_roll_ms(Long log_roll_ms) {
        this.log_roll_ms = log_roll_ms;
    }

    /**
     * The maximum size of a single log file
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_segment_bytes")
    @io.fabric8.generator.annotation.Max(1.073741824E9)
    @io.fabric8.generator.annotation.Min(1.048576E7)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum size of a single log file")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_segment_bytes;

    public Long getLog_segment_bytes() {
        return log_segment_bytes;
    }

    public void setLog_segment_bytes(Long log_segment_bytes) {
        this.log_segment_bytes = log_segment_bytes;
    }

    /**
     * The amount of time to wait before deleting a file from the filesystem
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_segment_delete_delay_ms")
    @io.fabric8.generator.annotation.Max(3600000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The amount of time to wait before deleting a file from the filesystem")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_segment_delete_delay_ms;

    public Long getLog_segment_delete_delay_ms() {
        return log_segment_delete_delay_ms;
    }

    public void setLog_segment_delete_delay_ms(Long log_segment_delete_delay_ms) {
        this.log_segment_delete_delay_ms = log_segment_delete_delay_ms;
    }

    /**
     * The maximum number of connections allowed from each ip address (defaults to 2147483647).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_connections_per_ip")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(256.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum number of connections allowed from each ip address (defaults to 2147483647).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_connections_per_ip;

    public Long getMax_connections_per_ip() {
        return max_connections_per_ip;
    }

    public void setMax_connections_per_ip(Long max_connections_per_ip) {
        this.max_connections_per_ip = max_connections_per_ip;
    }

    /**
     * The maximum number of incremental fetch sessions that the broker will maintain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_incremental_fetch_session_cache_slots")
    @io.fabric8.generator.annotation.Max(10000.0)
    @io.fabric8.generator.annotation.Min(1000.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum number of incremental fetch sessions that the broker will maintain.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_incremental_fetch_session_cache_slots;

    public Long getMax_incremental_fetch_session_cache_slots() {
        return max_incremental_fetch_session_cache_slots;
    }

    public void setMax_incremental_fetch_session_cache_slots(Long max_incremental_fetch_session_cache_slots) {
        this.max_incremental_fetch_session_cache_slots = max_incremental_fetch_session_cache_slots;
    }

    /**
     * The maximum size of message that the server can receive.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message_max_bytes")
    @io.fabric8.generator.annotation.Max(1.000012E8)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum size of message that the server can receive.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long message_max_bytes;

    public Long getMessage_max_bytes() {
        return message_max_bytes;
    }

    public void setMessage_max_bytes(Long message_max_bytes) {
        this.message_max_bytes = message_max_bytes;
    }

    /**
     * When a producer sets acks to 'all' (or '-1'), min.insync.replicas specifies the minimum number of replicas that must acknowledge a write for the write to be considered successful.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("min_insync_replicas")
    @io.fabric8.generator.annotation.Max(7.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("When a producer sets acks to 'all' (or '-1'), min.insync.replicas specifies the minimum number of replicas that must acknowledge a write for the write to be considered successful.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long min_insync_replicas;

    public Long getMin_insync_replicas() {
        return min_insync_replicas;
    }

    public void setMin_insync_replicas(Long min_insync_replicas) {
        this.min_insync_replicas = min_insync_replicas;
    }

    /**
     * Number of partitions for autocreated topics
     */
    @com.fasterxml.jackson.annotation.JsonProperty("num_partitions")
    @io.fabric8.generator.annotation.Max(1000.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of partitions for autocreated topics")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long num_partitions;

    public Long getNum_partitions() {
        return num_partitions;
    }

    public void setNum_partitions(Long num_partitions) {
        this.num_partitions = num_partitions;
    }

    /**
     * Log retention window in minutes for offsets topic
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offsets_retention_minutes")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Log retention window in minutes for offsets topic")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long offsets_retention_minutes;

    public Long getOffsets_retention_minutes() {
        return offsets_retention_minutes;
    }

    public void setOffsets_retention_minutes(Long offsets_retention_minutes) {
        this.offsets_retention_minutes = offsets_retention_minutes;
    }

    /**
     * The purge interval (in number of requests) of the producer request purgatory(defaults to 1000).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer_purgatory_purge_interval_requests")
    @io.fabric8.generator.annotation.Max(10000.0)
    @io.fabric8.generator.annotation.Min(10.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The purge interval (in number of requests) of the producer request purgatory(defaults to 1000).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long producer_purgatory_purge_interval_requests;

    public Long getProducer_purgatory_purge_interval_requests() {
        return producer_purgatory_purge_interval_requests;
    }

    public void setProducer_purgatory_purge_interval_requests(Long producer_purgatory_purge_interval_requests) {
        this.producer_purgatory_purge_interval_requests = producer_purgatory_purge_interval_requests;
    }

    /**
     * The number of bytes of messages to attempt to fetch for each partition (defaults to 1048576). This is not an absolute maximum, if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replica_fetch_max_bytes")
    @io.fabric8.generator.annotation.Max(1.048576E8)
    @io.fabric8.generator.annotation.Min(1048576.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of bytes of messages to attempt to fetch for each partition (defaults to 1048576). This is not an absolute maximum, if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long replica_fetch_max_bytes;

    public Long getReplica_fetch_max_bytes() {
        return replica_fetch_max_bytes;
    }

    public void setReplica_fetch_max_bytes(Long replica_fetch_max_bytes) {
        this.replica_fetch_max_bytes = replica_fetch_max_bytes;
    }

    /**
     * Maximum bytes expected for the entire fetch response (defaults to 10485760). Records are fetched in batches, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made. As such, this is not an absolute maximum.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replica_fetch_response_max_bytes")
    @io.fabric8.generator.annotation.Max(1.048576E9)
    @io.fabric8.generator.annotation.Min(1.048576E7)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum bytes expected for the entire fetch response (defaults to 10485760). Records are fetched in batches, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made. As such, this is not an absolute maximum.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long replica_fetch_response_max_bytes;

    public Long getReplica_fetch_response_max_bytes() {
        return replica_fetch_response_max_bytes;
    }

    public void setReplica_fetch_response_max_bytes(Long replica_fetch_response_max_bytes) {
        this.replica_fetch_response_max_bytes = replica_fetch_response_max_bytes;
    }

    /**
     * The maximum number of bytes in a socket request (defaults to 104857600).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("socket_request_max_bytes")
    @io.fabric8.generator.annotation.Max(2.097152E8)
    @io.fabric8.generator.annotation.Min(1.048576E7)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum number of bytes in a socket request (defaults to 104857600).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long socket_request_max_bytes;

    public Long getSocket_request_max_bytes() {
        return socket_request_max_bytes;
    }

    public void setSocket_request_max_bytes(Long socket_request_max_bytes) {
        this.socket_request_max_bytes = socket_request_max_bytes;
    }

    /**
     * The interval at which to remove transactions that have expired due to transactional.id.expiration.ms passing (defaults to 3600000 (1 hour)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transaction_remove_expired_transaction_cleanup_interval_ms")
    @io.fabric8.generator.annotation.Max(3600000.0)
    @io.fabric8.generator.annotation.Min(600000.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The interval at which to remove transactions that have expired due to transactional.id.expiration.ms passing (defaults to 3600000 (1 hour)).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long transaction_remove_expired_transaction_cleanup_interval_ms;

    public Long getTransaction_remove_expired_transaction_cleanup_interval_ms() {
        return transaction_remove_expired_transaction_cleanup_interval_ms;
    }

    public void setTransaction_remove_expired_transaction_cleanup_interval_ms(Long transaction_remove_expired_transaction_cleanup_interval_ms) {
        this.transaction_remove_expired_transaction_cleanup_interval_ms = transaction_remove_expired_transaction_cleanup_interval_ms;
    }

    /**
     * The transaction topic segment bytes should be kept relatively small in order to facilitate faster log compaction and cache loads (defaults to 104857600 (100 mebibytes)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transaction_state_log_segment_bytes")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(1048576.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The transaction topic segment bytes should be kept relatively small in order to facilitate faster log compaction and cache loads (defaults to 104857600 (100 mebibytes)).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long transaction_state_log_segment_bytes;

    public Long getTransaction_state_log_segment_bytes() {
        return transaction_state_log_segment_bytes;
    }

    public void setTransaction_state_log_segment_bytes(Long transaction_state_log_segment_bytes) {
        this.transaction_state_log_segment_bytes = transaction_state_log_segment_bytes;
    }
}


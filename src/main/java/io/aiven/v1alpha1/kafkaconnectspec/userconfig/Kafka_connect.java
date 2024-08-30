package io.aiven.v1alpha1.kafkaconnectspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"connector_client_config_override_policy","consumer_auto_offset_reset","consumer_fetch_max_bytes","consumer_isolation_level","consumer_max_partition_fetch_bytes","consumer_max_poll_interval_ms","consumer_max_poll_records","offset_flush_interval_ms","offset_flush_timeout_ms","producer_batch_size","producer_buffer_memory","producer_compression_type","producer_linger_ms","producer_max_request_size","session_timeout_ms"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Kafka_connect implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum Connector_client_config_override_policy {

        @com.fasterxml.jackson.annotation.JsonProperty("None")
        NONE("None"), @com.fasterxml.jackson.annotation.JsonProperty("All")
        ALL("All");

        java.lang.String value;

        Connector_client_config_override_policy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Defines what client configurations can be overridden by the connector. Default is None
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connector_client_config_override_policy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Defines what client configurations can be overridden by the connector. Default is None")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Connector_client_config_override_policy connector_client_config_override_policy;

    public Connector_client_config_override_policy getConnector_client_config_override_policy() {
        return connector_client_config_override_policy;
    }

    public void setConnector_client_config_override_policy(Connector_client_config_override_policy connector_client_config_override_policy) {
        this.connector_client_config_override_policy = connector_client_config_override_policy;
    }

    public enum Consumer_auto_offset_reset {

        @com.fasterxml.jackson.annotation.JsonProperty("earliest")
        EARLIEST("earliest"), @com.fasterxml.jackson.annotation.JsonProperty("latest")
        LATEST("latest");

        java.lang.String value;

        Consumer_auto_offset_reset(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * What to do when there is no initial offset in Kafka or if the current offset does not exist any more on the server. Default is earliest
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consumer_auto_offset_reset")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("What to do when there is no initial offset in Kafka or if the current offset does not exist any more on the server. Default is earliest")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Consumer_auto_offset_reset consumer_auto_offset_reset;

    public Consumer_auto_offset_reset getConsumer_auto_offset_reset() {
        return consumer_auto_offset_reset;
    }

    public void setConsumer_auto_offset_reset(Consumer_auto_offset_reset consumer_auto_offset_reset) {
        this.consumer_auto_offset_reset = consumer_auto_offset_reset;
    }

    /**
     * Records are fetched in batches by the consumer, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that the consumer can make progress. As such, this is not a absolute maximum.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consumer_fetch_max_bytes")
    @io.fabric8.generator.annotation.Max(1.048576E8)
    @io.fabric8.generator.annotation.Min(1048576.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Records are fetched in batches by the consumer, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that the consumer can make progress. As such, this is not a absolute maximum.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long consumer_fetch_max_bytes;

    public Long getConsumer_fetch_max_bytes() {
        return consumer_fetch_max_bytes;
    }

    public void setConsumer_fetch_max_bytes(Long consumer_fetch_max_bytes) {
        this.consumer_fetch_max_bytes = consumer_fetch_max_bytes;
    }

    public enum Consumer_isolation_level {

        @com.fasterxml.jackson.annotation.JsonProperty("read_uncommitted")
        READ_UNCOMMITTED("read_uncommitted"), @com.fasterxml.jackson.annotation.JsonProperty("read_committed")
        READ_COMMITTED("read_committed");

        java.lang.String value;

        Consumer_isolation_level(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Transaction read isolation level. read_uncommitted is the default, but read_committed can be used if consume-exactly-once behavior is desired.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consumer_isolation_level")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Transaction read isolation level. read_uncommitted is the default, but read_committed can be used if consume-exactly-once behavior is desired.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Consumer_isolation_level consumer_isolation_level;

    public Consumer_isolation_level getConsumer_isolation_level() {
        return consumer_isolation_level;
    }

    public void setConsumer_isolation_level(Consumer_isolation_level consumer_isolation_level) {
        this.consumer_isolation_level = consumer_isolation_level;
    }

    /**
     * Records are fetched in batches by the consumer.If the first record batch in the first non-empty partition of the fetch is larger than this limit, the batch will still be returned to ensure that the consumer can make progress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consumer_max_partition_fetch_bytes")
    @io.fabric8.generator.annotation.Max(1.048576E8)
    @io.fabric8.generator.annotation.Min(1048576.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Records are fetched in batches by the consumer.If the first record batch in the first non-empty partition of the fetch is larger than this limit, the batch will still be returned to ensure that the consumer can make progress.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long consumer_max_partition_fetch_bytes;

    public Long getConsumer_max_partition_fetch_bytes() {
        return consumer_max_partition_fetch_bytes;
    }

    public void setConsumer_max_partition_fetch_bytes(Long consumer_max_partition_fetch_bytes) {
        this.consumer_max_partition_fetch_bytes = consumer_max_partition_fetch_bytes;
    }

    /**
     * The maximum delay in milliseconds between invocations of poll() when using consumer group management (defaults to 300000).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consumer_max_poll_interval_ms")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum delay in milliseconds between invocations of poll() when using consumer group management (defaults to 300000).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long consumer_max_poll_interval_ms;

    public Long getConsumer_max_poll_interval_ms() {
        return consumer_max_poll_interval_ms;
    }

    public void setConsumer_max_poll_interval_ms(Long consumer_max_poll_interval_ms) {
        this.consumer_max_poll_interval_ms = consumer_max_poll_interval_ms;
    }

    /**
     * The maximum number of records returned in a single call to poll() (defaults to 500).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consumer_max_poll_records")
    @io.fabric8.generator.annotation.Max(10000.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum number of records returned in a single call to poll() (defaults to 500).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long consumer_max_poll_records;

    public Long getConsumer_max_poll_records() {
        return consumer_max_poll_records;
    }

    public void setConsumer_max_poll_records(Long consumer_max_poll_records) {
        this.consumer_max_poll_records = consumer_max_poll_records;
    }

    /**
     * The interval at which to try committing offsets for tasks (defaults to 60000).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offset_flush_interval_ms")
    @io.fabric8.generator.annotation.Max(1.0E8)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The interval at which to try committing offsets for tasks (defaults to 60000).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long offset_flush_interval_ms;

    public Long getOffset_flush_interval_ms() {
        return offset_flush_interval_ms;
    }

    public void setOffset_flush_interval_ms(Long offset_flush_interval_ms) {
        this.offset_flush_interval_ms = offset_flush_interval_ms;
    }

    /**
     * Maximum number of milliseconds to wait for records to flush and partition offset data to be committed to offset storage before cancelling the process and restoring the offset data to be committed in a future attempt (defaults to 5000).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offset_flush_timeout_ms")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum number of milliseconds to wait for records to flush and partition offset data to be committed to offset storage before cancelling the process and restoring the offset data to be committed in a future attempt (defaults to 5000).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long offset_flush_timeout_ms;

    public Long getOffset_flush_timeout_ms() {
        return offset_flush_timeout_ms;
    }

    public void setOffset_flush_timeout_ms(Long offset_flush_timeout_ms) {
        this.offset_flush_timeout_ms = offset_flush_timeout_ms;
    }

    /**
     * This setting gives the upper bound of the batch size to be sent. If there are fewer than this many bytes accumulated for this partition, the producer will 'linger' for the linger.ms time waiting for more records to show up. A batch size of zero will disable batching entirely (defaults to 16384).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer_batch_size")
    @io.fabric8.generator.annotation.Max(5242880.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This setting gives the upper bound of the batch size to be sent. If there are fewer than this many bytes accumulated for this partition, the producer will 'linger' for the linger.ms time waiting for more records to show up. A batch size of zero will disable batching entirely (defaults to 16384).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long producer_batch_size;

    public Long getProducer_batch_size() {
        return producer_batch_size;
    }

    public void setProducer_batch_size(Long producer_batch_size) {
        this.producer_batch_size = producer_batch_size;
    }

    /**
     * The total bytes of memory the producer can use to buffer records waiting to be sent to the broker (defaults to 33554432).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer_buffer_memory")
    @io.fabric8.generator.annotation.Max(1.34217728E8)
    @io.fabric8.generator.annotation.Min(5242880.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The total bytes of memory the producer can use to buffer records waiting to be sent to the broker (defaults to 33554432).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long producer_buffer_memory;

    public Long getProducer_buffer_memory() {
        return producer_buffer_memory;
    }

    public void setProducer_buffer_memory(Long producer_buffer_memory) {
        this.producer_buffer_memory = producer_buffer_memory;
    }

    public enum Producer_compression_type {

        @com.fasterxml.jackson.annotation.JsonProperty("gzip")
        GZIP("gzip"), @com.fasterxml.jackson.annotation.JsonProperty("snappy")
        SNAPPY("snappy"), @com.fasterxml.jackson.annotation.JsonProperty("lz4")
        LZ4("lz4"), @com.fasterxml.jackson.annotation.JsonProperty("zstd")
        ZSTD("zstd"), @com.fasterxml.jackson.annotation.JsonProperty("none")
        NONE("none");

        java.lang.String value;

        Producer_compression_type(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer_compression_type")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Producer_compression_type producer_compression_type;

    public Producer_compression_type getProducer_compression_type() {
        return producer_compression_type;
    }

    public void setProducer_compression_type(Producer_compression_type producer_compression_type) {
        this.producer_compression_type = producer_compression_type;
    }

    /**
     * This setting gives the upper bound on the delay for batching: once there is batch.size worth of records for a partition it will be sent immediately regardless of this setting, however if there are fewer than this many bytes accumulated for this partition the producer will 'linger' for the specified time waiting for more records to show up. Defaults to 0.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer_linger_ms")
    @io.fabric8.generator.annotation.Max(5000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This setting gives the upper bound on the delay for batching: once there is batch.size worth of records for a partition it will be sent immediately regardless of this setting, however if there are fewer than this many bytes accumulated for this partition the producer will 'linger' for the specified time waiting for more records to show up. Defaults to 0.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long producer_linger_ms;

    public Long getProducer_linger_ms() {
        return producer_linger_ms;
    }

    public void setProducer_linger_ms(Long producer_linger_ms) {
        this.producer_linger_ms = producer_linger_ms;
    }

    /**
     * This setting will limit the number of record batches the producer will send in a single request to avoid sending huge requests.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer_max_request_size")
    @io.fabric8.generator.annotation.Max(6.7108864E7)
    @io.fabric8.generator.annotation.Min(131072.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This setting will limit the number of record batches the producer will send in a single request to avoid sending huge requests.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long producer_max_request_size;

    public Long getProducer_max_request_size() {
        return producer_max_request_size;
    }

    public void setProducer_max_request_size(Long producer_max_request_size) {
        this.producer_max_request_size = producer_max_request_size;
    }

    /**
     * The timeout in milliseconds used to detect failures when using Kafka’s group management facilities (defaults to 10000).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("session_timeout_ms")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The timeout in milliseconds used to detect failures when using Kafka’s group management facilities (defaults to 10000).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long session_timeout_ms;

    public Long getSession_timeout_ms() {
        return session_timeout_ms;
    }

    public void setSession_timeout_ms(Long session_timeout_ms) {
        this.session_timeout_ms = session_timeout_ms;
    }
}


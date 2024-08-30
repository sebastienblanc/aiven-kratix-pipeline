package io.aiven.v1alpha1.kafkaspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"consumer_enable_auto_commit","consumer_request_max_bytes","consumer_request_timeout_ms","producer_acks","producer_compression_type","producer_linger_ms","producer_max_request_size","simpleconsumer_pool_size_max"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Kafka_rest_config implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * If true the consumer's offset will be periodically committed to Kafka in the background
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consumer_enable_auto_commit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If true the consumer's offset will be periodically committed to Kafka in the background")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean consumer_enable_auto_commit;

    public Boolean getConsumer_enable_auto_commit() {
        return consumer_enable_auto_commit;
    }

    public void setConsumer_enable_auto_commit(Boolean consumer_enable_auto_commit) {
        this.consumer_enable_auto_commit = consumer_enable_auto_commit;
    }

    /**
     * Maximum number of bytes in unencoded message keys and values by a single request
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consumer_request_max_bytes")
    @io.fabric8.generator.annotation.Max(6.7108864E8)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum number of bytes in unencoded message keys and values by a single request")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long consumer_request_max_bytes;

    public Long getConsumer_request_max_bytes() {
        return consumer_request_max_bytes;
    }

    public void setConsumer_request_max_bytes(Long consumer_request_max_bytes) {
        this.consumer_request_max_bytes = consumer_request_max_bytes;
    }

    public enum Consumer_request_timeout_ms {

        @com.fasterxml.jackson.annotation.JsonProperty("1000")
        V__1000("1000"), @com.fasterxml.jackson.annotation.JsonProperty("15000")
        V__15000("15000"), @com.fasterxml.jackson.annotation.JsonProperty("30000")
        V__30000("30000");

        java.lang.String value;

        Consumer_request_timeout_ms(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The maximum total time to wait for messages for a request if the maximum number of messages has not yet been reached
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consumer_request_timeout_ms")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum total time to wait for messages for a request if the maximum number of messages has not yet been reached")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Consumer_request_timeout_ms consumer_request_timeout_ms;

    public Consumer_request_timeout_ms getConsumer_request_timeout_ms() {
        return consumer_request_timeout_ms;
    }

    public void setConsumer_request_timeout_ms(Consumer_request_timeout_ms consumer_request_timeout_ms) {
        this.consumer_request_timeout_ms = consumer_request_timeout_ms;
    }

    public enum Producer_acks {

        @com.fasterxml.jackson.annotation.JsonProperty("all")
        ALL("all"), @com.fasterxml.jackson.annotation.JsonProperty("-1")
        V__1("-1"), @com.fasterxml.jackson.annotation.JsonProperty("0")
        V__0("0"), @com.fasterxml.jackson.annotation.JsonProperty("1")
        V__3("1");

        java.lang.String value;

        Producer_acks(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to 'all' or '-1', the leader will wait for the full set of in-sync replicas to acknowledge the record.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer_acks")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to 'all' or '-1', the leader will wait for the full set of in-sync replicas to acknowledge the record.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Producer_acks producer_acks;

    public Producer_acks getProducer_acks() {
        return producer_acks;
    }

    public void setProducer_acks(Producer_acks producer_acks) {
        this.producer_acks = producer_acks;
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
     * Wait for up to the given delay to allow batching records together
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer_linger_ms")
    @io.fabric8.generator.annotation.Max(5000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Wait for up to the given delay to allow batching records together")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long producer_linger_ms;

    public Long getProducer_linger_ms() {
        return producer_linger_ms;
    }

    public void setProducer_linger_ms(Long producer_linger_ms) {
        this.producer_linger_ms = producer_linger_ms;
    }

    /**
     * The maximum size of a request in bytes. Note that Kafka broker can also cap the record batch size.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer_max_request_size")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum size of a request in bytes. Note that Kafka broker can also cap the record batch size.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long producer_max_request_size;

    public Long getProducer_max_request_size() {
        return producer_max_request_size;
    }

    public void setProducer_max_request_size(Long producer_max_request_size) {
        this.producer_max_request_size = producer_max_request_size;
    }

    /**
     * Maximum number of SimpleConsumers that can be instantiated per broker
     */
    @com.fasterxml.jackson.annotation.JsonProperty("simpleconsumer_pool_size_max")
    @io.fabric8.generator.annotation.Max(250.0)
    @io.fabric8.generator.annotation.Min(10.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum number of SimpleConsumers that can be instantiated per broker")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long simpleconsumer_pool_size_max;

    public Long getSimpleconsumer_pool_size_max() {
        return simpleconsumer_pool_size_max;
    }

    public void setSimpleconsumer_pool_size_max(Long simpleconsumer_pool_size_max) {
        this.simpleconsumer_pool_size_max = simpleconsumer_pool_size_max;
    }
}


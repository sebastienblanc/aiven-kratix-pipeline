package io.aiven.v1alpha1.serviceintegrationspec.kafkamirrormaker;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"consumer_fetch_min_bytes","producer_batch_size","producer_buffer_memory","producer_compression_type","producer_linger_ms","producer_max_request_size"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Kafka_mirrormaker implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The minimum amount of data the server should return for a fetch request
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consumer_fetch_min_bytes")
    @io.fabric8.generator.annotation.Max(5242880.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The minimum amount of data the server should return for a fetch request")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long consumer_fetch_min_bytes;

    public Long getConsumer_fetch_min_bytes() {
        return consumer_fetch_min_bytes;
    }

    public void setConsumer_fetch_min_bytes(Long consumer_fetch_min_bytes) {
        this.consumer_fetch_min_bytes = consumer_fetch_min_bytes;
    }

    /**
     * The batch size in bytes producer will attempt to collect before publishing to broker.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer_batch_size")
    @io.fabric8.generator.annotation.Max(5242880.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The batch size in bytes producer will attempt to collect before publishing to broker.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long producer_batch_size;

    public Long getProducer_batch_size() {
        return producer_batch_size;
    }

    public void setProducer_batch_size(Long producer_batch_size) {
        this.producer_batch_size = producer_batch_size;
    }

    /**
     * The amount of bytes producer can use for buffering data before publishing to broker.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer_buffer_memory")
    @io.fabric8.generator.annotation.Max(1.34217728E8)
    @io.fabric8.generator.annotation.Min(5242880.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The amount of bytes producer can use for buffering data before publishing to broker.")
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
     * The linger time (ms) for waiting new data to arrive for publishing.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer_linger_ms")
    @io.fabric8.generator.annotation.Max(5000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The linger time (ms) for waiting new data to arrive for publishing.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long producer_linger_ms;

    public Long getProducer_linger_ms() {
        return producer_linger_ms;
    }

    public void setProducer_linger_ms(Long producer_linger_ms) {
        this.producer_linger_ms = producer_linger_ms;
    }

    /**
     * The maximum request size in bytes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer_max_request_size")
    @io.fabric8.generator.annotation.Max(6.7108864E7)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum request size in bytes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long producer_max_request_size;

    public Long getProducer_max_request_size() {
        return producer_max_request_size;
    }

    public void setProducer_max_request_size(Long producer_max_request_size) {
        this.producer_max_request_size = producer_max_request_size;
    }
}


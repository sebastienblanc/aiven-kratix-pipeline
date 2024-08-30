package io.aiven.v1alpha1.kafkatopicspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cleanup_policy","compression_type","delete_retention_ms","file_delete_delay_ms","flush_messages","flush_ms","index_interval_bytes","max_compaction_lag_ms","max_message_bytes","message_downconversion_enable","message_format_version","message_timestamp_difference_max_ms","message_timestamp_type","min_cleanable_dirty_ratio","min_compaction_lag_ms","min_insync_replicas","preallocate","retention_bytes","retention_ms","segment_bytes","segment_index_bytes","segment_jitter_ms","segment_ms"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Config implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * cleanup.policy value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cleanup_policy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("cleanup.policy value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cleanup_policy;

    public String getCleanup_policy() {
        return cleanup_policy;
    }

    public void setCleanup_policy(String cleanup_policy) {
        this.cleanup_policy = cleanup_policy;
    }

    /**
     * compression.type value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compression_type")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("compression.type value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String compression_type;

    public String getCompression_type() {
        return compression_type;
    }

    public void setCompression_type(String compression_type) {
        this.compression_type = compression_type;
    }

    /**
     * delete.retention.ms value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("delete_retention_ms")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("delete.retention.ms value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long delete_retention_ms;

    public Long getDelete_retention_ms() {
        return delete_retention_ms;
    }

    public void setDelete_retention_ms(Long delete_retention_ms) {
        this.delete_retention_ms = delete_retention_ms;
    }

    /**
     * file.delete.delay.ms value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("file_delete_delay_ms")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("file.delete.delay.ms value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long file_delete_delay_ms;

    public Long getFile_delete_delay_ms() {
        return file_delete_delay_ms;
    }

    public void setFile_delete_delay_ms(Long file_delete_delay_ms) {
        this.file_delete_delay_ms = file_delete_delay_ms;
    }

    /**
     * flush.messages value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flush_messages")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("flush.messages value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long flush_messages;

    public Long getFlush_messages() {
        return flush_messages;
    }

    public void setFlush_messages(Long flush_messages) {
        this.flush_messages = flush_messages;
    }

    /**
     * flush.ms value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flush_ms")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("flush.ms value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long flush_ms;

    public Long getFlush_ms() {
        return flush_ms;
    }

    public void setFlush_ms(Long flush_ms) {
        this.flush_ms = flush_ms;
    }

    /**
     * index.interval.bytes value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("index_interval_bytes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("index.interval.bytes value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long index_interval_bytes;

    public Long getIndex_interval_bytes() {
        return index_interval_bytes;
    }

    public void setIndex_interval_bytes(Long index_interval_bytes) {
        this.index_interval_bytes = index_interval_bytes;
    }

    /**
     * max.compaction.lag.ms value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_compaction_lag_ms")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("max.compaction.lag.ms value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_compaction_lag_ms;

    public Long getMax_compaction_lag_ms() {
        return max_compaction_lag_ms;
    }

    public void setMax_compaction_lag_ms(Long max_compaction_lag_ms) {
        this.max_compaction_lag_ms = max_compaction_lag_ms;
    }

    /**
     * max.message.bytes value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_message_bytes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("max.message.bytes value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_message_bytes;

    public Long getMax_message_bytes() {
        return max_message_bytes;
    }

    public void setMax_message_bytes(Long max_message_bytes) {
        this.max_message_bytes = max_message_bytes;
    }

    /**
     * message.downconversion.enable value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message_downconversion_enable")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("message.downconversion.enable value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean message_downconversion_enable;

    public Boolean getMessage_downconversion_enable() {
        return message_downconversion_enable;
    }

    public void setMessage_downconversion_enable(Boolean message_downconversion_enable) {
        this.message_downconversion_enable = message_downconversion_enable;
    }

    /**
     * message.format.version value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message_format_version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("message.format.version value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String message_format_version;

    public String getMessage_format_version() {
        return message_format_version;
    }

    public void setMessage_format_version(String message_format_version) {
        this.message_format_version = message_format_version;
    }

    /**
     * message.timestamp.difference.max.ms value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message_timestamp_difference_max_ms")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("message.timestamp.difference.max.ms value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long message_timestamp_difference_max_ms;

    public Long getMessage_timestamp_difference_max_ms() {
        return message_timestamp_difference_max_ms;
    }

    public void setMessage_timestamp_difference_max_ms(Long message_timestamp_difference_max_ms) {
        this.message_timestamp_difference_max_ms = message_timestamp_difference_max_ms;
    }

    /**
     * message.timestamp.type value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message_timestamp_type")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("message.timestamp.type value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String message_timestamp_type;

    public String getMessage_timestamp_type() {
        return message_timestamp_type;
    }

    public void setMessage_timestamp_type(String message_timestamp_type) {
        this.message_timestamp_type = message_timestamp_type;
    }

    /**
     * min.cleanable.dirty.ratio value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("min_cleanable_dirty_ratio")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("min.cleanable.dirty.ratio value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Double min_cleanable_dirty_ratio;

    public Double getMin_cleanable_dirty_ratio() {
        return min_cleanable_dirty_ratio;
    }

    public void setMin_cleanable_dirty_ratio(Double min_cleanable_dirty_ratio) {
        this.min_cleanable_dirty_ratio = min_cleanable_dirty_ratio;
    }

    /**
     * min.compaction.lag.ms value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("min_compaction_lag_ms")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("min.compaction.lag.ms value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long min_compaction_lag_ms;

    public Long getMin_compaction_lag_ms() {
        return min_compaction_lag_ms;
    }

    public void setMin_compaction_lag_ms(Long min_compaction_lag_ms) {
        this.min_compaction_lag_ms = min_compaction_lag_ms;
    }

    /**
     * min.insync.replicas value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("min_insync_replicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("min.insync.replicas value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long min_insync_replicas;

    public Long getMin_insync_replicas() {
        return min_insync_replicas;
    }

    public void setMin_insync_replicas(Long min_insync_replicas) {
        this.min_insync_replicas = min_insync_replicas;
    }

    /**
     * preallocate value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preallocate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("preallocate value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean preallocate;

    public Boolean getPreallocate() {
        return preallocate;
    }

    public void setPreallocate(Boolean preallocate) {
        this.preallocate = preallocate;
    }

    /**
     * retention.bytes value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retention_bytes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("retention.bytes value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long retention_bytes;

    public Long getRetention_bytes() {
        return retention_bytes;
    }

    public void setRetention_bytes(Long retention_bytes) {
        this.retention_bytes = retention_bytes;
    }

    /**
     * retention.ms value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retention_ms")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("retention.ms value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long retention_ms;

    public Long getRetention_ms() {
        return retention_ms;
    }

    public void setRetention_ms(Long retention_ms) {
        this.retention_ms = retention_ms;
    }

    /**
     * segment.bytes value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("segment_bytes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("segment.bytes value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long segment_bytes;

    public Long getSegment_bytes() {
        return segment_bytes;
    }

    public void setSegment_bytes(Long segment_bytes) {
        this.segment_bytes = segment_bytes;
    }

    /**
     * segment.index.bytes value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("segment_index_bytes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("segment.index.bytes value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long segment_index_bytes;

    public Long getSegment_index_bytes() {
        return segment_index_bytes;
    }

    public void setSegment_index_bytes(Long segment_index_bytes) {
        this.segment_index_bytes = segment_index_bytes;
    }

    /**
     * segment.jitter.ms value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("segment_jitter_ms")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("segment.jitter.ms value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long segment_jitter_ms;

    public Long getSegment_jitter_ms() {
        return segment_jitter_ms;
    }

    public void setSegment_jitter_ms(Long segment_jitter_ms) {
        this.segment_jitter_ms = segment_jitter_ms;
    }

    /**
     * segment.ms value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("segment_ms")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("segment.ms value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long segment_ms;

    public Long getSegment_ms() {
        return segment_ms;
    }

    public void setSegment_ms(Long segment_ms) {
        this.segment_ms = segment_ms;
    }
}


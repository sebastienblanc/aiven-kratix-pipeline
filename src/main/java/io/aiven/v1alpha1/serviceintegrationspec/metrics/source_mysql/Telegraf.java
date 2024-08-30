package io.aiven.v1alpha1.serviceintegrationspec.metrics.source_mysql;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"gather_event_waits","gather_file_events_stats","gather_index_io_waits","gather_info_schema_auto_inc","gather_innodb_metrics","gather_perf_events_statements","gather_process_list","gather_slave_status","gather_table_io_waits","gather_table_lock_waits","gather_table_schema","perf_events_statements_digest_text_limit","perf_events_statements_limit","perf_events_statements_time_limit"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Telegraf implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Gather metrics from PERFORMANCE_SCHEMA.EVENT_WAITS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gather_event_waits")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Gather metrics from PERFORMANCE_SCHEMA.EVENT_WAITS")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gather_event_waits;

    public Boolean getGather_event_waits() {
        return gather_event_waits;
    }

    public void setGather_event_waits(Boolean gather_event_waits) {
        this.gather_event_waits = gather_event_waits;
    }

    /**
     * gather metrics from PERFORMANCE_SCHEMA.FILE_SUMMARY_BY_EVENT_NAME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gather_file_events_stats")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("gather metrics from PERFORMANCE_SCHEMA.FILE_SUMMARY_BY_EVENT_NAME")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gather_file_events_stats;

    public Boolean getGather_file_events_stats() {
        return gather_file_events_stats;
    }

    public void setGather_file_events_stats(Boolean gather_file_events_stats) {
        this.gather_file_events_stats = gather_file_events_stats;
    }

    /**
     * Gather metrics from PERFORMANCE_SCHEMA.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gather_index_io_waits")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Gather metrics from PERFORMANCE_SCHEMA.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gather_index_io_waits;

    public Boolean getGather_index_io_waits() {
        return gather_index_io_waits;
    }

    public void setGather_index_io_waits(Boolean gather_index_io_waits) {
        this.gather_index_io_waits = gather_index_io_waits;
    }

    /**
     * Gather auto_increment columns and max values from information schema
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gather_info_schema_auto_inc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Gather auto_increment columns and max values from information schema")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gather_info_schema_auto_inc;

    public Boolean getGather_info_schema_auto_inc() {
        return gather_info_schema_auto_inc;
    }

    public void setGather_info_schema_auto_inc(Boolean gather_info_schema_auto_inc) {
        this.gather_info_schema_auto_inc = gather_info_schema_auto_inc;
    }

    /**
     * Gather metrics from INFORMATION_SCHEMA.INNODB_METRICS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gather_innodb_metrics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Gather metrics from INFORMATION_SCHEMA.INNODB_METRICS")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gather_innodb_metrics;

    public Boolean getGather_innodb_metrics() {
        return gather_innodb_metrics;
    }

    public void setGather_innodb_metrics(Boolean gather_innodb_metrics) {
        this.gather_innodb_metrics = gather_innodb_metrics;
    }

    /**
     * Gather metrics from PERFORMANCE_SCHEMA.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gather_perf_events_statements")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Gather metrics from PERFORMANCE_SCHEMA.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gather_perf_events_statements;

    public Boolean getGather_perf_events_statements() {
        return gather_perf_events_statements;
    }

    public void setGather_perf_events_statements(Boolean gather_perf_events_statements) {
        this.gather_perf_events_statements = gather_perf_events_statements;
    }

    /**
     * Gather thread state counts from INFORMATION_SCHEMA.PROCESSLIST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gather_process_list")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Gather thread state counts from INFORMATION_SCHEMA.PROCESSLIST")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gather_process_list;

    public Boolean getGather_process_list() {
        return gather_process_list;
    }

    public void setGather_process_list(Boolean gather_process_list) {
        this.gather_process_list = gather_process_list;
    }

    /**
     * Gather metrics from SHOW SLAVE STATUS command output
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gather_slave_status")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Gather metrics from SHOW SLAVE STATUS command output")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gather_slave_status;

    public Boolean getGather_slave_status() {
        return gather_slave_status;
    }

    public void setGather_slave_status(Boolean gather_slave_status) {
        this.gather_slave_status = gather_slave_status;
    }

    /**
     * Gather metrics from PERFORMANCE_SCHEMA.TABLE_IO_WAITS_SUMMARY_BY_TABLE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gather_table_io_waits")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Gather metrics from PERFORMANCE_SCHEMA.TABLE_IO_WAITS_SUMMARY_BY_TABLE")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gather_table_io_waits;

    public Boolean getGather_table_io_waits() {
        return gather_table_io_waits;
    }

    public void setGather_table_io_waits(Boolean gather_table_io_waits) {
        this.gather_table_io_waits = gather_table_io_waits;
    }

    /**
     * Gather metrics from PERFORMANCE_SCHEMA.TABLE_LOCK_WAITS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gather_table_lock_waits")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Gather metrics from PERFORMANCE_SCHEMA.TABLE_LOCK_WAITS")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gather_table_lock_waits;

    public Boolean getGather_table_lock_waits() {
        return gather_table_lock_waits;
    }

    public void setGather_table_lock_waits(Boolean gather_table_lock_waits) {
        this.gather_table_lock_waits = gather_table_lock_waits;
    }

    /**
     * Gather metrics from INFORMATION_SCHEMA.TABLES
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gather_table_schema")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Gather metrics from INFORMATION_SCHEMA.TABLES")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gather_table_schema;

    public Boolean getGather_table_schema() {
        return gather_table_schema;
    }

    public void setGather_table_schema(Boolean gather_table_schema) {
        this.gather_table_schema = gather_table_schema;
    }

    /**
     * Truncates digest text from perf_events_statements into this many characters
     */
    @com.fasterxml.jackson.annotation.JsonProperty("perf_events_statements_digest_text_limit")
    @io.fabric8.generator.annotation.Max(2048.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Truncates digest text from perf_events_statements into this many characters")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long perf_events_statements_digest_text_limit;

    public Long getPerf_events_statements_digest_text_limit() {
        return perf_events_statements_digest_text_limit;
    }

    public void setPerf_events_statements_digest_text_limit(Long perf_events_statements_digest_text_limit) {
        this.perf_events_statements_digest_text_limit = perf_events_statements_digest_text_limit;
    }

    /**
     * Limits metrics from perf_events_statements
     */
    @com.fasterxml.jackson.annotation.JsonProperty("perf_events_statements_limit")
    @io.fabric8.generator.annotation.Max(4000.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Limits metrics from perf_events_statements")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long perf_events_statements_limit;

    public Long getPerf_events_statements_limit() {
        return perf_events_statements_limit;
    }

    public void setPerf_events_statements_limit(Long perf_events_statements_limit) {
        this.perf_events_statements_limit = perf_events_statements_limit;
    }

    /**
     * Only include perf_events_statements whose last seen is less than this many seconds
     */
    @com.fasterxml.jackson.annotation.JsonProperty("perf_events_statements_time_limit")
    @io.fabric8.generator.annotation.Max(2592000.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Only include perf_events_statements whose last seen is less than this many seconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long perf_events_statements_time_limit;

    public Long getPerf_events_statements_time_limit() {
        return perf_events_statements_time_limit;
    }

    public void setPerf_events_statements_time_limit(Long perf_events_statements_time_limit) {
        this.perf_events_statements_time_limit = perf_events_statements_time_limit;
    }
}


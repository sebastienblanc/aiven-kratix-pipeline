package io.aiven.v1alpha1.opensearchspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"action_auto_create_index_enabled","action_destructive_requires_name","cluster_max_shards_per_node","cluster_routing_allocation_node_concurrent_recoveries","email_sender_name","email_sender_password","email_sender_username","http_max_content_length","http_max_header_size","http_max_initial_line_length","indices_fielddata_cache_size","indices_memory_index_buffer_size","indices_queries_cache_size","indices_query_bool_max_clause_count","indices_recovery_max_bytes_per_sec","indices_recovery_max_concurrent_file_chunks","override_main_response_version","reindex_remote_whitelist","script_max_compilations_rate","search_max_buckets","thread_pool_analyze_queue_size","thread_pool_analyze_size","thread_pool_force_merge_size","thread_pool_get_queue_size","thread_pool_get_size","thread_pool_search_queue_size","thread_pool_search_size","thread_pool_search_throttled_queue_size","thread_pool_search_throttled_size","thread_pool_write_queue_size","thread_pool_write_size"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Opensearch implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Explicitly allow or block automatic creation of indices. Defaults to true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action_auto_create_index_enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Explicitly allow or block automatic creation of indices. Defaults to true")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean action_auto_create_index_enabled;

    public Boolean getAction_auto_create_index_enabled() {
        return action_auto_create_index_enabled;
    }

    public void setAction_auto_create_index_enabled(Boolean action_auto_create_index_enabled) {
        this.action_auto_create_index_enabled = action_auto_create_index_enabled;
    }

    /**
     * Require explicit index names when deleting
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action_destructive_requires_name")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Require explicit index names when deleting")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean action_destructive_requires_name;

    public Boolean getAction_destructive_requires_name() {
        return action_destructive_requires_name;
    }

    public void setAction_destructive_requires_name(Boolean action_destructive_requires_name) {
        this.action_destructive_requires_name = action_destructive_requires_name;
    }

    /**
     * Controls the number of shards allowed in the cluster per data node
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cluster_max_shards_per_node")
    @io.fabric8.generator.annotation.Max(10000.0)
    @io.fabric8.generator.annotation.Min(100.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Controls the number of shards allowed in the cluster per data node")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long cluster_max_shards_per_node;

    public Long getCluster_max_shards_per_node() {
        return cluster_max_shards_per_node;
    }

    public void setCluster_max_shards_per_node(Long cluster_max_shards_per_node) {
        this.cluster_max_shards_per_node = cluster_max_shards_per_node;
    }

    /**
     * How many concurrent incoming/outgoing shard recoveries (normally replicas) are allowed to happen on a node. Defaults to 2.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cluster_routing_allocation_node_concurrent_recoveries")
    @io.fabric8.generator.annotation.Max(16.0)
    @io.fabric8.generator.annotation.Min(2.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("How many concurrent incoming/outgoing shard recoveries (normally replicas) are allowed to happen on a node. Defaults to 2.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long cluster_routing_allocation_node_concurrent_recoveries;

    public Long getCluster_routing_allocation_node_concurrent_recoveries() {
        return cluster_routing_allocation_node_concurrent_recoveries;
    }

    public void setCluster_routing_allocation_node_concurrent_recoveries(Long cluster_routing_allocation_node_concurrent_recoveries) {
        this.cluster_routing_allocation_node_concurrent_recoveries = cluster_routing_allocation_node_concurrent_recoveries;
    }

    /**
     * Sender name placeholder to be used in Opensearch Dashboards and Opensearch keystore
     */
    @com.fasterxml.jackson.annotation.JsonProperty("email_sender_name")
    @io.fabric8.generator.annotation.Pattern("^[a-zA-Z0-9-_]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sender name placeholder to be used in Opensearch Dashboards and Opensearch keystore")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String email_sender_name;

    public String getEmail_sender_name() {
        return email_sender_name;
    }

    public void setEmail_sender_name(String email_sender_name) {
        this.email_sender_name = email_sender_name;
    }

    /**
     * Sender password for Opensearch alerts to authenticate with SMTP server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("email_sender_password")
    @io.fabric8.generator.annotation.Pattern("^[^\\x00-\\x1F]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sender password for Opensearch alerts to authenticate with SMTP server")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String email_sender_password;

    public String getEmail_sender_password() {
        return email_sender_password;
    }

    public void setEmail_sender_password(String email_sender_password) {
        this.email_sender_password = email_sender_password;
    }

    /**
     * Sender username for Opensearch alerts
     */
    @com.fasterxml.jackson.annotation.JsonProperty("email_sender_username")
    @io.fabric8.generator.annotation.Pattern("^[^\\x00-\\x1F]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sender username for Opensearch alerts")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String email_sender_username;

    public String getEmail_sender_username() {
        return email_sender_username;
    }

    public void setEmail_sender_username(String email_sender_username) {
        this.email_sender_username = email_sender_username;
    }

    /**
     * Maximum content length for HTTP requests to the OpenSearch HTTP API, in bytes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("http_max_content_length")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum content length for HTTP requests to the OpenSearch HTTP API, in bytes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long http_max_content_length;

    public Long getHttp_max_content_length() {
        return http_max_content_length;
    }

    public void setHttp_max_content_length(Long http_max_content_length) {
        this.http_max_content_length = http_max_content_length;
    }

    /**
     * The max size of allowed headers, in bytes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("http_max_header_size")
    @io.fabric8.generator.annotation.Max(262144.0)
    @io.fabric8.generator.annotation.Min(1024.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The max size of allowed headers, in bytes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long http_max_header_size;

    public Long getHttp_max_header_size() {
        return http_max_header_size;
    }

    public void setHttp_max_header_size(Long http_max_header_size) {
        this.http_max_header_size = http_max_header_size;
    }

    /**
     * The max length of an HTTP URL, in bytes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("http_max_initial_line_length")
    @io.fabric8.generator.annotation.Max(65536.0)
    @io.fabric8.generator.annotation.Min(1024.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The max length of an HTTP URL, in bytes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long http_max_initial_line_length;

    public Long getHttp_max_initial_line_length() {
        return http_max_initial_line_length;
    }

    public void setHttp_max_initial_line_length(Long http_max_initial_line_length) {
        this.http_max_initial_line_length = http_max_initial_line_length;
    }

    /**
     * Relative amount. Maximum amount of heap memory used for field data cache. This is an expert setting; decreasing the value too much will increase overhead of loading field data; too much memory used for field data cache will decrease amount of heap available for other operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("indices_fielddata_cache_size")
    @io.fabric8.generator.annotation.Max(100.0)
    @io.fabric8.generator.annotation.Min(3.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Relative amount. Maximum amount of heap memory used for field data cache. This is an expert setting; decreasing the value too much will increase overhead of loading field data; too much memory used for field data cache will decrease amount of heap available for other operations.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long indices_fielddata_cache_size;

    public Long getIndices_fielddata_cache_size() {
        return indices_fielddata_cache_size;
    }

    public void setIndices_fielddata_cache_size(Long indices_fielddata_cache_size) {
        this.indices_fielddata_cache_size = indices_fielddata_cache_size;
    }

    /**
     * Percentage value. Default is 10%. Total amount of heap used for indexing buffer, before writing segments to disk. This is an expert setting. Too low value will slow down indexing; too high value will increase indexing performance but causes performance issues for query performance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("indices_memory_index_buffer_size")
    @io.fabric8.generator.annotation.Max(40.0)
    @io.fabric8.generator.annotation.Min(3.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Percentage value. Default is 10%. Total amount of heap used for indexing buffer, before writing segments to disk. This is an expert setting. Too low value will slow down indexing; too high value will increase indexing performance but causes performance issues for query performance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long indices_memory_index_buffer_size;

    public Long getIndices_memory_index_buffer_size() {
        return indices_memory_index_buffer_size;
    }

    public void setIndices_memory_index_buffer_size(Long indices_memory_index_buffer_size) {
        this.indices_memory_index_buffer_size = indices_memory_index_buffer_size;
    }

    /**
     * Percentage value. Default is 10%. Maximum amount of heap used for query cache. This is an expert setting. Too low value will decrease query performance and increase performance for other operations; too high value will cause issues with other OpenSearch functionality.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("indices_queries_cache_size")
    @io.fabric8.generator.annotation.Max(40.0)
    @io.fabric8.generator.annotation.Min(3.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Percentage value. Default is 10%. Maximum amount of heap used for query cache. This is an expert setting. Too low value will decrease query performance and increase performance for other operations; too high value will cause issues with other OpenSearch functionality.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long indices_queries_cache_size;

    public Long getIndices_queries_cache_size() {
        return indices_queries_cache_size;
    }

    public void setIndices_queries_cache_size(Long indices_queries_cache_size) {
        this.indices_queries_cache_size = indices_queries_cache_size;
    }

    /**
     * Maximum number of clauses Lucene BooleanQuery can have. The default value (1024) is relatively high, and increasing it may cause performance issues. Investigate other approaches first before increasing this value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("indices_query_bool_max_clause_count")
    @io.fabric8.generator.annotation.Max(4096.0)
    @io.fabric8.generator.annotation.Min(64.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum number of clauses Lucene BooleanQuery can have. The default value (1024) is relatively high, and increasing it may cause performance issues. Investigate other approaches first before increasing this value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long indices_query_bool_max_clause_count;

    public Long getIndices_query_bool_max_clause_count() {
        return indices_query_bool_max_clause_count;
    }

    public void setIndices_query_bool_max_clause_count(Long indices_query_bool_max_clause_count) {
        this.indices_query_bool_max_clause_count = indices_query_bool_max_clause_count;
    }

    /**
     * Limits total inbound and outbound recovery traffic for each node. Applies to both peer recoveries as well as snapshot recoveries (i.e., restores from a snapshot). Defaults to 40mb
     */
    @com.fasterxml.jackson.annotation.JsonProperty("indices_recovery_max_bytes_per_sec")
    @io.fabric8.generator.annotation.Max(400.0)
    @io.fabric8.generator.annotation.Min(40.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Limits total inbound and outbound recovery traffic for each node. Applies to both peer recoveries as well as snapshot recoveries (i.e., restores from a snapshot). Defaults to 40mb")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long indices_recovery_max_bytes_per_sec;

    public Long getIndices_recovery_max_bytes_per_sec() {
        return indices_recovery_max_bytes_per_sec;
    }

    public void setIndices_recovery_max_bytes_per_sec(Long indices_recovery_max_bytes_per_sec) {
        this.indices_recovery_max_bytes_per_sec = indices_recovery_max_bytes_per_sec;
    }

    /**
     * Number of file chunks sent in parallel for each recovery. Defaults to 2.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("indices_recovery_max_concurrent_file_chunks")
    @io.fabric8.generator.annotation.Max(5.0)
    @io.fabric8.generator.annotation.Min(2.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of file chunks sent in parallel for each recovery. Defaults to 2.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long indices_recovery_max_concurrent_file_chunks;

    public Long getIndices_recovery_max_concurrent_file_chunks() {
        return indices_recovery_max_concurrent_file_chunks;
    }

    public void setIndices_recovery_max_concurrent_file_chunks(Long indices_recovery_max_concurrent_file_chunks) {
        this.indices_recovery_max_concurrent_file_chunks = indices_recovery_max_concurrent_file_chunks;
    }

    /**
     * Compatibility mode sets OpenSearch to report its version as 7.10 so clients continue to work. Default is false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("override_main_response_version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Compatibility mode sets OpenSearch to report its version as 7.10 so clients continue to work. Default is false")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean override_main_response_version;

    public Boolean getOverride_main_response_version() {
        return override_main_response_version;
    }

    public void setOverride_main_response_version(Boolean override_main_response_version) {
        this.override_main_response_version = override_main_response_version;
    }

    /**
     * Whitelisted addresses for reindexing. Changing this value will cause all OpenSearch instances to restart.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reindex_remote_whitelist")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whitelisted addresses for reindexing. Changing this value will cause all OpenSearch instances to restart.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> reindex_remote_whitelist;

    public java.util.List<String> getReindex_remote_whitelist() {
        return reindex_remote_whitelist;
    }

    public void setReindex_remote_whitelist(java.util.List<String> reindex_remote_whitelist) {
        this.reindex_remote_whitelist = reindex_remote_whitelist;
    }

    /**
     * Script compilation circuit breaker limits the number of inline script compilations within a period of time. Default is use-context
     */
    @com.fasterxml.jackson.annotation.JsonProperty("script_max_compilations_rate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Script compilation circuit breaker limits the number of inline script compilations within a period of time. Default is use-context")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String script_max_compilations_rate;

    public String getScript_max_compilations_rate() {
        return script_max_compilations_rate;
    }

    public void setScript_max_compilations_rate(String script_max_compilations_rate) {
        this.script_max_compilations_rate = script_max_compilations_rate;
    }

    /**
     * Maximum number of aggregation buckets allowed in a single response. OpenSearch default value is used when this is not defined.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("search_max_buckets")
    @io.fabric8.generator.annotation.Max(65536.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum number of aggregation buckets allowed in a single response. OpenSearch default value is used when this is not defined.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long search_max_buckets;

    public Long getSearch_max_buckets() {
        return search_max_buckets;
    }

    public void setSearch_max_buckets(Long search_max_buckets) {
        this.search_max_buckets = search_max_buckets;
    }

    /**
     * Size for the thread pool queue. See documentation for exact details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("thread_pool_analyze_queue_size")
    @io.fabric8.generator.annotation.Max(2000.0)
    @io.fabric8.generator.annotation.Min(10.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size for the thread pool queue. See documentation for exact details.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long thread_pool_analyze_queue_size;

    public Long getThread_pool_analyze_queue_size() {
        return thread_pool_analyze_queue_size;
    }

    public void setThread_pool_analyze_queue_size(Long thread_pool_analyze_queue_size) {
        this.thread_pool_analyze_queue_size = thread_pool_analyze_queue_size;
    }

    /**
     * Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("thread_pool_analyze_size")
    @io.fabric8.generator.annotation.Max(128.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long thread_pool_analyze_size;

    public Long getThread_pool_analyze_size() {
        return thread_pool_analyze_size;
    }

    public void setThread_pool_analyze_size(Long thread_pool_analyze_size) {
        this.thread_pool_analyze_size = thread_pool_analyze_size;
    }

    /**
     * Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("thread_pool_force_merge_size")
    @io.fabric8.generator.annotation.Max(128.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long thread_pool_force_merge_size;

    public Long getThread_pool_force_merge_size() {
        return thread_pool_force_merge_size;
    }

    public void setThread_pool_force_merge_size(Long thread_pool_force_merge_size) {
        this.thread_pool_force_merge_size = thread_pool_force_merge_size;
    }

    /**
     * Size for the thread pool queue. See documentation for exact details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("thread_pool_get_queue_size")
    @io.fabric8.generator.annotation.Max(2000.0)
    @io.fabric8.generator.annotation.Min(10.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size for the thread pool queue. See documentation for exact details.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long thread_pool_get_queue_size;

    public Long getThread_pool_get_queue_size() {
        return thread_pool_get_queue_size;
    }

    public void setThread_pool_get_queue_size(Long thread_pool_get_queue_size) {
        this.thread_pool_get_queue_size = thread_pool_get_queue_size;
    }

    /**
     * Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("thread_pool_get_size")
    @io.fabric8.generator.annotation.Max(128.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long thread_pool_get_size;

    public Long getThread_pool_get_size() {
        return thread_pool_get_size;
    }

    public void setThread_pool_get_size(Long thread_pool_get_size) {
        this.thread_pool_get_size = thread_pool_get_size;
    }

    /**
     * Size for the thread pool queue. See documentation for exact details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("thread_pool_search_queue_size")
    @io.fabric8.generator.annotation.Max(2000.0)
    @io.fabric8.generator.annotation.Min(10.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size for the thread pool queue. See documentation for exact details.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long thread_pool_search_queue_size;

    public Long getThread_pool_search_queue_size() {
        return thread_pool_search_queue_size;
    }

    public void setThread_pool_search_queue_size(Long thread_pool_search_queue_size) {
        this.thread_pool_search_queue_size = thread_pool_search_queue_size;
    }

    /**
     * Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("thread_pool_search_size")
    @io.fabric8.generator.annotation.Max(128.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long thread_pool_search_size;

    public Long getThread_pool_search_size() {
        return thread_pool_search_size;
    }

    public void setThread_pool_search_size(Long thread_pool_search_size) {
        this.thread_pool_search_size = thread_pool_search_size;
    }

    /**
     * Size for the thread pool queue. See documentation for exact details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("thread_pool_search_throttled_queue_size")
    @io.fabric8.generator.annotation.Max(2000.0)
    @io.fabric8.generator.annotation.Min(10.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size for the thread pool queue. See documentation for exact details.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long thread_pool_search_throttled_queue_size;

    public Long getThread_pool_search_throttled_queue_size() {
        return thread_pool_search_throttled_queue_size;
    }

    public void setThread_pool_search_throttled_queue_size(Long thread_pool_search_throttled_queue_size) {
        this.thread_pool_search_throttled_queue_size = thread_pool_search_throttled_queue_size;
    }

    /**
     * Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("thread_pool_search_throttled_size")
    @io.fabric8.generator.annotation.Max(128.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long thread_pool_search_throttled_size;

    public Long getThread_pool_search_throttled_size() {
        return thread_pool_search_throttled_size;
    }

    public void setThread_pool_search_throttled_size(Long thread_pool_search_throttled_size) {
        this.thread_pool_search_throttled_size = thread_pool_search_throttled_size;
    }

    /**
     * Size for the thread pool queue. See documentation for exact details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("thread_pool_write_queue_size")
    @io.fabric8.generator.annotation.Max(2000.0)
    @io.fabric8.generator.annotation.Min(10.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size for the thread pool queue. See documentation for exact details.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long thread_pool_write_queue_size;

    public Long getThread_pool_write_queue_size() {
        return thread_pool_write_queue_size;
    }

    public void setThread_pool_write_queue_size(Long thread_pool_write_queue_size) {
        this.thread_pool_write_queue_size = thread_pool_write_queue_size;
    }

    /**
     * Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("thread_pool_write_size")
    @io.fabric8.generator.annotation.Max(128.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long thread_pool_write_size;

    public Long getThread_pool_write_size() {
        return thread_pool_write_size;
    }

    public void setThread_pool_write_size(Long thread_pool_write_size) {
        this.thread_pool_write_size = thread_pool_write_size;
    }
}


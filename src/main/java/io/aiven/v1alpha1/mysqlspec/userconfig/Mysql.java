package io.aiven.v1alpha1.mysqlspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"connect_timeout","default_time_zone","group_concat_max_len","information_schema_stats_expiry","innodb_change_buffer_max_size","innodb_flush_neighbors","innodb_ft_min_token_size","innodb_ft_server_stopword_table","innodb_lock_wait_timeout","innodb_log_buffer_size","innodb_online_alter_log_max_size","innodb_print_all_deadlocks","innodb_read_io_threads","innodb_rollback_on_timeout","innodb_thread_concurrency","innodb_write_io_threads","interactive_timeout","internal_tmp_mem_storage_engine","long_query_time","max_allowed_packet","max_heap_table_size","net_buffer_length","net_read_timeout","net_write_timeout","slow_query_log","sort_buffer_size","sql_mode","sql_require_primary_key","tmp_table_size","wait_timeout"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Mysql implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The number of seconds that the mysqld server waits for a connect packet before responding with Bad handshake
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connect_timeout")
    @io.fabric8.generator.annotation.Max(3600.0)
    @io.fabric8.generator.annotation.Min(2.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of seconds that the mysqld server waits for a connect packet before responding with Bad handshake")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long connect_timeout;

    public Long getConnect_timeout() {
        return connect_timeout;
    }

    public void setConnect_timeout(Long connect_timeout) {
        this.connect_timeout = connect_timeout;
    }

    /**
     * Default server time zone as an offset from UTC (from -12:00 to +12:00), a time zone name, or 'SYSTEM' to use the MySQL server default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("default_time_zone")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Default server time zone as an offset from UTC (from -12:00 to +12:00), a time zone name, or 'SYSTEM' to use the MySQL server default.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String default_time_zone;

    public String getDefault_time_zone() {
        return default_time_zone;
    }

    public void setDefault_time_zone(String default_time_zone) {
        this.default_time_zone = default_time_zone;
    }

    /**
     * The maximum permitted result length in bytes for the GROUP_CONCAT() function.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("group_concat_max_len")
    @io.fabric8.generator.annotation.Min(4.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum permitted result length in bytes for the GROUP_CONCAT() function.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long group_concat_max_len;

    public Long getGroup_concat_max_len() {
        return group_concat_max_len;
    }

    public void setGroup_concat_max_len(Long group_concat_max_len) {
        this.group_concat_max_len = group_concat_max_len;
    }

    /**
     * The time, in seconds, before cached statistics expire
     */
    @com.fasterxml.jackson.annotation.JsonProperty("information_schema_stats_expiry")
    @io.fabric8.generator.annotation.Max(3.1536E7)
    @io.fabric8.generator.annotation.Min(900.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The time, in seconds, before cached statistics expire")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long information_schema_stats_expiry;

    public Long getInformation_schema_stats_expiry() {
        return information_schema_stats_expiry;
    }

    public void setInformation_schema_stats_expiry(Long information_schema_stats_expiry) {
        this.information_schema_stats_expiry = information_schema_stats_expiry;
    }

    /**
     * Maximum size for the InnoDB change buffer, as a percentage of the total size of the buffer pool. Default is 25
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodb_change_buffer_max_size")
    @io.fabric8.generator.annotation.Max(50.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum size for the InnoDB change buffer, as a percentage of the total size of the buffer pool. Default is 25")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long innodb_change_buffer_max_size;

    public Long getInnodb_change_buffer_max_size() {
        return innodb_change_buffer_max_size;
    }

    public void setInnodb_change_buffer_max_size(Long innodb_change_buffer_max_size) {
        this.innodb_change_buffer_max_size = innodb_change_buffer_max_size;
    }

    /**
     * Specifies whether flushing a page from the InnoDB buffer pool also flushes other dirty pages in the same extent (default is 1): 0 - dirty pages in the same extent are not flushed,  1 - flush contiguous dirty pages in the same extent,  2 - flush dirty pages in the same extent
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodb_flush_neighbors")
    @io.fabric8.generator.annotation.Max(2.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies whether flushing a page from the InnoDB buffer pool also flushes other dirty pages in the same extent (default is 1): 0 - dirty pages in the same extent are not flushed,  1 - flush contiguous dirty pages in the same extent,  2 - flush dirty pages in the same extent")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long innodb_flush_neighbors;

    public Long getInnodb_flush_neighbors() {
        return innodb_flush_neighbors;
    }

    public void setInnodb_flush_neighbors(Long innodb_flush_neighbors) {
        this.innodb_flush_neighbors = innodb_flush_neighbors;
    }

    /**
     * Minimum length of words that are stored in an InnoDB FULLTEXT index. Changing this parameter will lead to a restart of the MySQL service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodb_ft_min_token_size")
    @io.fabric8.generator.annotation.Max(16.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Minimum length of words that are stored in an InnoDB FULLTEXT index. Changing this parameter will lead to a restart of the MySQL service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long innodb_ft_min_token_size;

    public Long getInnodb_ft_min_token_size() {
        return innodb_ft_min_token_size;
    }

    public void setInnodb_ft_min_token_size(Long innodb_ft_min_token_size) {
        this.innodb_ft_min_token_size = innodb_ft_min_token_size;
    }

    /**
     * This option is used to specify your own InnoDB FULLTEXT index stopword list for all InnoDB tables.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodb_ft_server_stopword_table")
    @io.fabric8.generator.annotation.Pattern("^.+/.+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This option is used to specify your own InnoDB FULLTEXT index stopword list for all InnoDB tables.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String innodb_ft_server_stopword_table;

    public String getInnodb_ft_server_stopword_table() {
        return innodb_ft_server_stopword_table;
    }

    public void setInnodb_ft_server_stopword_table(String innodb_ft_server_stopword_table) {
        this.innodb_ft_server_stopword_table = innodb_ft_server_stopword_table;
    }

    /**
     * The length of time in seconds an InnoDB transaction waits for a row lock before giving up. Default is 120.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodb_lock_wait_timeout")
    @io.fabric8.generator.annotation.Max(3600.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The length of time in seconds an InnoDB transaction waits for a row lock before giving up. Default is 120.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long innodb_lock_wait_timeout;

    public Long getInnodb_lock_wait_timeout() {
        return innodb_lock_wait_timeout;
    }

    public void setInnodb_lock_wait_timeout(Long innodb_lock_wait_timeout) {
        this.innodb_lock_wait_timeout = innodb_lock_wait_timeout;
    }

    /**
     * The size in bytes of the buffer that InnoDB uses to write to the log files on disk.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodb_log_buffer_size")
    @io.fabric8.generator.annotation.Max(4.294967295E9)
    @io.fabric8.generator.annotation.Min(1048576.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The size in bytes of the buffer that InnoDB uses to write to the log files on disk.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long innodb_log_buffer_size;

    public Long getInnodb_log_buffer_size() {
        return innodb_log_buffer_size;
    }

    public void setInnodb_log_buffer_size(Long innodb_log_buffer_size) {
        this.innodb_log_buffer_size = innodb_log_buffer_size;
    }

    /**
     * The upper limit in bytes on the size of the temporary log files used during online DDL operations for InnoDB tables.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodb_online_alter_log_max_size")
    @io.fabric8.generator.annotation.Max(1.099511627776E12)
    @io.fabric8.generator.annotation.Min(65536.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The upper limit in bytes on the size of the temporary log files used during online DDL operations for InnoDB tables.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long innodb_online_alter_log_max_size;

    public Long getInnodb_online_alter_log_max_size() {
        return innodb_online_alter_log_max_size;
    }

    public void setInnodb_online_alter_log_max_size(Long innodb_online_alter_log_max_size) {
        this.innodb_online_alter_log_max_size = innodb_online_alter_log_max_size;
    }

    /**
     * When enabled, information about all deadlocks in InnoDB user transactions is recorded in the error log. Disabled by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodb_print_all_deadlocks")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("When enabled, information about all deadlocks in InnoDB user transactions is recorded in the error log. Disabled by default.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean innodb_print_all_deadlocks;

    public Boolean getInnodb_print_all_deadlocks() {
        return innodb_print_all_deadlocks;
    }

    public void setInnodb_print_all_deadlocks(Boolean innodb_print_all_deadlocks) {
        this.innodb_print_all_deadlocks = innodb_print_all_deadlocks;
    }

    /**
     * The number of I/O threads for read operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodb_read_io_threads")
    @io.fabric8.generator.annotation.Max(64.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of I/O threads for read operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long innodb_read_io_threads;

    public Long getInnodb_read_io_threads() {
        return innodb_read_io_threads;
    }

    public void setInnodb_read_io_threads(Long innodb_read_io_threads) {
        this.innodb_read_io_threads = innodb_read_io_threads;
    }

    /**
     * When enabled a transaction timeout causes InnoDB to abort and roll back the entire transaction. Changing this parameter will lead to a restart of the MySQL service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodb_rollback_on_timeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("When enabled a transaction timeout causes InnoDB to abort and roll back the entire transaction. Changing this parameter will lead to a restart of the MySQL service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean innodb_rollback_on_timeout;

    public Boolean getInnodb_rollback_on_timeout() {
        return innodb_rollback_on_timeout;
    }

    public void setInnodb_rollback_on_timeout(Boolean innodb_rollback_on_timeout) {
        this.innodb_rollback_on_timeout = innodb_rollback_on_timeout;
    }

    /**
     * Defines the maximum number of threads permitted inside of InnoDB. Default is 0 (infinite concurrency - no limit)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodb_thread_concurrency")
    @io.fabric8.generator.annotation.Max(1000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Defines the maximum number of threads permitted inside of InnoDB. Default is 0 (infinite concurrency - no limit)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long innodb_thread_concurrency;

    public Long getInnodb_thread_concurrency() {
        return innodb_thread_concurrency;
    }

    public void setInnodb_thread_concurrency(Long innodb_thread_concurrency) {
        this.innodb_thread_concurrency = innodb_thread_concurrency;
    }

    /**
     * The number of I/O threads for write operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("innodb_write_io_threads")
    @io.fabric8.generator.annotation.Max(64.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of I/O threads for write operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long innodb_write_io_threads;

    public Long getInnodb_write_io_threads() {
        return innodb_write_io_threads;
    }

    public void setInnodb_write_io_threads(Long innodb_write_io_threads) {
        this.innodb_write_io_threads = innodb_write_io_threads;
    }

    /**
     * The number of seconds the server waits for activity on an interactive connection before closing it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interactive_timeout")
    @io.fabric8.generator.annotation.Max(604800.0)
    @io.fabric8.generator.annotation.Min(30.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of seconds the server waits for activity on an interactive connection before closing it.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long interactive_timeout;

    public Long getInteractive_timeout() {
        return interactive_timeout;
    }

    public void setInteractive_timeout(Long interactive_timeout) {
        this.interactive_timeout = interactive_timeout;
    }

    public enum Internal_tmp_mem_storage_engine {

        @com.fasterxml.jackson.annotation.JsonProperty("TempTable")
        TEMPTABLE("TempTable"), @com.fasterxml.jackson.annotation.JsonProperty("MEMORY")
        MEMORY("MEMORY");

        java.lang.String value;

        Internal_tmp_mem_storage_engine(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The storage engine for in-memory internal temporary tables.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("internal_tmp_mem_storage_engine")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The storage engine for in-memory internal temporary tables.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Internal_tmp_mem_storage_engine internal_tmp_mem_storage_engine;

    public Internal_tmp_mem_storage_engine getInternal_tmp_mem_storage_engine() {
        return internal_tmp_mem_storage_engine;
    }

    public void setInternal_tmp_mem_storage_engine(Internal_tmp_mem_storage_engine internal_tmp_mem_storage_engine) {
        this.internal_tmp_mem_storage_engine = internal_tmp_mem_storage_engine;
    }

    /**
     * The slow_query_logs work as SQL statements that take more than long_query_time seconds to execute. Default is 10s
     */
    @com.fasterxml.jackson.annotation.JsonProperty("long_query_time")
    @io.fabric8.generator.annotation.Max(3600.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The slow_query_logs work as SQL statements that take more than long_query_time seconds to execute. Default is 10s")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Double long_query_time;

    public Double getLong_query_time() {
        return long_query_time;
    }

    public void setLong_query_time(Double long_query_time) {
        this.long_query_time = long_query_time;
    }

    /**
     * Size of the largest message in bytes that can be received by the server. Default is 67108864 (64M)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_allowed_packet")
    @io.fabric8.generator.annotation.Max(1.073741824E9)
    @io.fabric8.generator.annotation.Min(102400.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size of the largest message in bytes that can be received by the server. Default is 67108864 (64M)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_allowed_packet;

    public Long getMax_allowed_packet() {
        return max_allowed_packet;
    }

    public void setMax_allowed_packet(Long max_allowed_packet) {
        this.max_allowed_packet = max_allowed_packet;
    }

    /**
     * Limits the size of internal in-memory tables. Also set tmp_table_size. Default is 16777216 (16M)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_heap_table_size")
    @io.fabric8.generator.annotation.Max(1.073741824E9)
    @io.fabric8.generator.annotation.Min(1048576.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Limits the size of internal in-memory tables. Also set tmp_table_size. Default is 16777216 (16M)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_heap_table_size;

    public Long getMax_heap_table_size() {
        return max_heap_table_size;
    }

    public void setMax_heap_table_size(Long max_heap_table_size) {
        this.max_heap_table_size = max_heap_table_size;
    }

    /**
     * Start sizes of connection buffer and result buffer. Default is 16384 (16K). Changing this parameter will lead to a restart of the MySQL service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("net_buffer_length")
    @io.fabric8.generator.annotation.Max(1048576.0)
    @io.fabric8.generator.annotation.Min(1024.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Start sizes of connection buffer and result buffer. Default is 16384 (16K). Changing this parameter will lead to a restart of the MySQL service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long net_buffer_length;

    public Long getNet_buffer_length() {
        return net_buffer_length;
    }

    public void setNet_buffer_length(Long net_buffer_length) {
        this.net_buffer_length = net_buffer_length;
    }

    /**
     * The number of seconds to wait for more data from a connection before aborting the read.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("net_read_timeout")
    @io.fabric8.generator.annotation.Max(3600.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of seconds to wait for more data from a connection before aborting the read.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long net_read_timeout;

    public Long getNet_read_timeout() {
        return net_read_timeout;
    }

    public void setNet_read_timeout(Long net_read_timeout) {
        this.net_read_timeout = net_read_timeout;
    }

    /**
     * The number of seconds to wait for a block to be written to a connection before aborting the write.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("net_write_timeout")
    @io.fabric8.generator.annotation.Max(3600.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of seconds to wait for a block to be written to a connection before aborting the write.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long net_write_timeout;

    public Long getNet_write_timeout() {
        return net_write_timeout;
    }

    public void setNet_write_timeout(Long net_write_timeout) {
        this.net_write_timeout = net_write_timeout;
    }

    /**
     * Slow query log enables capturing of slow queries. Setting slow_query_log to false also truncates the mysql.slow_log table. Default is off
     */
    @com.fasterxml.jackson.annotation.JsonProperty("slow_query_log")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Slow query log enables capturing of slow queries. Setting slow_query_log to false also truncates the mysql.slow_log table. Default is off")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean slow_query_log;

    public Boolean getSlow_query_log() {
        return slow_query_log;
    }

    public void setSlow_query_log(Boolean slow_query_log) {
        this.slow_query_log = slow_query_log;
    }

    /**
     * Sort buffer size in bytes for ORDER BY optimization. Default is 262144 (256K)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sort_buffer_size")
    @io.fabric8.generator.annotation.Max(1.073741824E9)
    @io.fabric8.generator.annotation.Min(32768.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sort buffer size in bytes for ORDER BY optimization. Default is 262144 (256K)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long sort_buffer_size;

    public Long getSort_buffer_size() {
        return sort_buffer_size;
    }

    public void setSort_buffer_size(Long sort_buffer_size) {
        this.sort_buffer_size = sort_buffer_size;
    }

    /**
     * Global SQL mode. Set to empty to use MySQL server defaults. When creating a new service and not setting this field Aiven default SQL mode (strict, SQL standard compliant) will be assigned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sql_mode")
    @io.fabric8.generator.annotation.Pattern("^[A-Z_]*(,[A-Z_]+)*$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Global SQL mode. Set to empty to use MySQL server defaults. When creating a new service and not setting this field Aiven default SQL mode (strict, SQL standard compliant) will be assigned.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sql_mode;

    public String getSql_mode() {
        return sql_mode;
    }

    public void setSql_mode(String sql_mode) {
        this.sql_mode = sql_mode;
    }

    /**
     * Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sql_require_primary_key")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean sql_require_primary_key;

    public Boolean getSql_require_primary_key() {
        return sql_require_primary_key;
    }

    public void setSql_require_primary_key(Boolean sql_require_primary_key) {
        this.sql_require_primary_key = sql_require_primary_key;
    }

    /**
     * Limits the size of internal in-memory tables. Also set max_heap_table_size. Default is 16777216 (16M)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tmp_table_size")
    @io.fabric8.generator.annotation.Max(1.073741824E9)
    @io.fabric8.generator.annotation.Min(1048576.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Limits the size of internal in-memory tables. Also set max_heap_table_size. Default is 16777216 (16M)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long tmp_table_size;

    public Long getTmp_table_size() {
        return tmp_table_size;
    }

    public void setTmp_table_size(Long tmp_table_size) {
        this.tmp_table_size = tmp_table_size;
    }

    /**
     * The number of seconds the server waits for activity on a noninteractive connection before closing it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("wait_timeout")
    @io.fabric8.generator.annotation.Max(2147483.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of seconds the server waits for activity on a noninteractive connection before closing it.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long wait_timeout;

    public Long getWait_timeout() {
        return wait_timeout;
    }

    public void setWait_timeout(Long wait_timeout) {
        this.wait_timeout = wait_timeout;
    }
}


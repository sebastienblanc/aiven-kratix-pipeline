package io.aiven.v1alpha1.postgresqlspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"autovacuum_analyze_scale_factor","autovacuum_analyze_threshold","autovacuum_freeze_max_age","autovacuum_max_workers","autovacuum_naptime","autovacuum_vacuum_cost_delay","autovacuum_vacuum_cost_limit","autovacuum_vacuum_scale_factor","autovacuum_vacuum_threshold","bgwriter_delay","bgwriter_flush_after","bgwriter_lru_maxpages","bgwriter_lru_multiplier","deadlock_timeout","default_toast_compression","idle_in_transaction_session_timeout","jit","log_autovacuum_min_duration","log_error_verbosity","log_line_prefix","log_min_duration_statement","log_temp_files","max_files_per_process","max_locks_per_transaction","max_logical_replication_workers","max_parallel_workers","max_parallel_workers_per_gather","max_pred_locks_per_transaction","max_prepared_transactions","max_replication_slots","max_slot_wal_keep_size","max_stack_depth","max_standby_archive_delay","max_standby_streaming_delay","max_wal_senders","max_worker_processes","pg_partman_bgw.interval","pg_partman_bgw.role","pg_stat_monitor.pgsm_enable_query_plan","pg_stat_monitor.pgsm_max_buckets","pg_stat_statements.track","temp_file_limit","timezone","track_activity_query_size","track_commit_timestamp","track_functions","track_io_timing","wal_sender_timeout","wal_writer_delay"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Pg implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Specifies a fraction of the table size to add to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE. The default is 0.2 (20% of table size)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autovacuum_analyze_scale_factor")
    @io.fabric8.generator.annotation.Max(1.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies a fraction of the table size to add to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE. The default is 0.2 (20% of table size)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Double autovacuum_analyze_scale_factor;

    public Double getAutovacuum_analyze_scale_factor() {
        return autovacuum_analyze_scale_factor;
    }

    public void setAutovacuum_analyze_scale_factor(Double autovacuum_analyze_scale_factor) {
        this.autovacuum_analyze_scale_factor = autovacuum_analyze_scale_factor;
    }

    /**
     * Specifies the minimum number of inserted, updated or deleted tuples needed to trigger an  ANALYZE in any one table. The default is 50 tuples.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autovacuum_analyze_threshold")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the minimum number of inserted, updated or deleted tuples needed to trigger an  ANALYZE in any one table. The default is 50 tuples.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long autovacuum_analyze_threshold;

    public Long getAutovacuum_analyze_threshold() {
        return autovacuum_analyze_threshold;
    }

    public void setAutovacuum_analyze_threshold(Long autovacuum_analyze_threshold) {
        this.autovacuum_analyze_threshold = autovacuum_analyze_threshold;
    }

    /**
     * Specifies the maximum age (in transactions) that a table's pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound within the table. Note that the system will launch autovacuum processes to prevent wraparound even when autovacuum is otherwise disabled. This parameter will cause the server to be restarted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autovacuum_freeze_max_age")
    @io.fabric8.generator.annotation.Max(1.5E9)
    @io.fabric8.generator.annotation.Min(2.0E8)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the maximum age (in transactions) that a table's pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound within the table. Note that the system will launch autovacuum processes to prevent wraparound even when autovacuum is otherwise disabled. This parameter will cause the server to be restarted.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long autovacuum_freeze_max_age;

    public Long getAutovacuum_freeze_max_age() {
        return autovacuum_freeze_max_age;
    }

    public void setAutovacuum_freeze_max_age(Long autovacuum_freeze_max_age) {
        this.autovacuum_freeze_max_age = autovacuum_freeze_max_age;
    }

    /**
     * Specifies the maximum number of autovacuum processes (other than the autovacuum launcher) that may be running at any one time. The default is three. This parameter can only be set at server start.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autovacuum_max_workers")
    @io.fabric8.generator.annotation.Max(20.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the maximum number of autovacuum processes (other than the autovacuum launcher) that may be running at any one time. The default is three. This parameter can only be set at server start.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long autovacuum_max_workers;

    public Long getAutovacuum_max_workers() {
        return autovacuum_max_workers;
    }

    public void setAutovacuum_max_workers(Long autovacuum_max_workers) {
        this.autovacuum_max_workers = autovacuum_max_workers;
    }

    /**
     * Specifies the minimum delay between autovacuum runs on any given database. The delay is measured in seconds, and the default is one minute
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autovacuum_naptime")
    @io.fabric8.generator.annotation.Max(86400.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the minimum delay between autovacuum runs on any given database. The delay is measured in seconds, and the default is one minute")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long autovacuum_naptime;

    public Long getAutovacuum_naptime() {
        return autovacuum_naptime;
    }

    public void setAutovacuum_naptime(Long autovacuum_naptime) {
        this.autovacuum_naptime = autovacuum_naptime;
    }

    /**
     * Specifies the cost delay value that will be used in automatic VACUUM operations. If -1 is specified, the regular vacuum_cost_delay value will be used. The default value is 20 milliseconds
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autovacuum_vacuum_cost_delay")
    @io.fabric8.generator.annotation.Max(100.0)
    @io.fabric8.generator.annotation.Min(-1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the cost delay value that will be used in automatic VACUUM operations. If -1 is specified, the regular vacuum_cost_delay value will be used. The default value is 20 milliseconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long autovacuum_vacuum_cost_delay;

    public Long getAutovacuum_vacuum_cost_delay() {
        return autovacuum_vacuum_cost_delay;
    }

    public void setAutovacuum_vacuum_cost_delay(Long autovacuum_vacuum_cost_delay) {
        this.autovacuum_vacuum_cost_delay = autovacuum_vacuum_cost_delay;
    }

    /**
     * Specifies the cost limit value that will be used in automatic VACUUM operations. If -1 is specified (which is the default), the regular vacuum_cost_limit value will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autovacuum_vacuum_cost_limit")
    @io.fabric8.generator.annotation.Max(10000.0)
    @io.fabric8.generator.annotation.Min(-1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the cost limit value that will be used in automatic VACUUM operations. If -1 is specified (which is the default), the regular vacuum_cost_limit value will be used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long autovacuum_vacuum_cost_limit;

    public Long getAutovacuum_vacuum_cost_limit() {
        return autovacuum_vacuum_cost_limit;
    }

    public void setAutovacuum_vacuum_cost_limit(Long autovacuum_vacuum_cost_limit) {
        this.autovacuum_vacuum_cost_limit = autovacuum_vacuum_cost_limit;
    }

    /**
     * Specifies a fraction of the table size to add to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM. The default is 0.2 (20% of table size)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autovacuum_vacuum_scale_factor")
    @io.fabric8.generator.annotation.Max(1.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies a fraction of the table size to add to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM. The default is 0.2 (20% of table size)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Double autovacuum_vacuum_scale_factor;

    public Double getAutovacuum_vacuum_scale_factor() {
        return autovacuum_vacuum_scale_factor;
    }

    public void setAutovacuum_vacuum_scale_factor(Double autovacuum_vacuum_scale_factor) {
        this.autovacuum_vacuum_scale_factor = autovacuum_vacuum_scale_factor;
    }

    /**
     * Specifies the minimum number of updated or deleted tuples needed to trigger a VACUUM in any one table. The default is 50 tuples
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autovacuum_vacuum_threshold")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the minimum number of updated or deleted tuples needed to trigger a VACUUM in any one table. The default is 50 tuples")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long autovacuum_vacuum_threshold;

    public Long getAutovacuum_vacuum_threshold() {
        return autovacuum_vacuum_threshold;
    }

    public void setAutovacuum_vacuum_threshold(Long autovacuum_vacuum_threshold) {
        this.autovacuum_vacuum_threshold = autovacuum_vacuum_threshold;
    }

    /**
     * Specifies the delay between activity rounds for the background writer in milliseconds. Default is 200.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bgwriter_delay")
    @io.fabric8.generator.annotation.Max(10000.0)
    @io.fabric8.generator.annotation.Min(10.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the delay between activity rounds for the background writer in milliseconds. Default is 200.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long bgwriter_delay;

    public Long getBgwriter_delay() {
        return bgwriter_delay;
    }

    public void setBgwriter_delay(Long bgwriter_delay) {
        this.bgwriter_delay = bgwriter_delay;
    }

    /**
     * Whenever more than bgwriter_flush_after bytes have been written by the background writer, attempt to force the OS to issue these writes to the underlying storage. Specified in kilobytes, default is 512. Setting of 0 disables forced writeback.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bgwriter_flush_after")
    @io.fabric8.generator.annotation.Max(2048.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whenever more than bgwriter_flush_after bytes have been written by the background writer, attempt to force the OS to issue these writes to the underlying storage. Specified in kilobytes, default is 512. Setting of 0 disables forced writeback.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long bgwriter_flush_after;

    public Long getBgwriter_flush_after() {
        return bgwriter_flush_after;
    }

    public void setBgwriter_flush_after(Long bgwriter_flush_after) {
        this.bgwriter_flush_after = bgwriter_flush_after;
    }

    /**
     * In each round, no more than this many buffers will be written by the background writer. Setting this to zero disables background writing. Default is 100.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bgwriter_lru_maxpages")
    @io.fabric8.generator.annotation.Max(1.073741823E9)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("In each round, no more than this many buffers will be written by the background writer. Setting this to zero disables background writing. Default is 100.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long bgwriter_lru_maxpages;

    public Long getBgwriter_lru_maxpages() {
        return bgwriter_lru_maxpages;
    }

    public void setBgwriter_lru_maxpages(Long bgwriter_lru_maxpages) {
        this.bgwriter_lru_maxpages = bgwriter_lru_maxpages;
    }

    /**
     * The average recent need for new buffers is multiplied by bgwriter_lru_multiplier to arrive at an estimate of the number that will be needed during the next round, (up to bgwriter_lru_maxpages). 1.0 represents a “just in time” policy of writing exactly the number of buffers predicted to be needed. Larger values provide some cushion against spikes in demand, while smaller values intentionally leave writes to be done by server processes. The default is 2.0.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bgwriter_lru_multiplier")
    @io.fabric8.generator.annotation.Max(10.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The average recent need for new buffers is multiplied by bgwriter_lru_multiplier to arrive at an estimate of the number that will be needed during the next round, (up to bgwriter_lru_maxpages). 1.0 represents a “just in time” policy of writing exactly the number of buffers predicted to be needed. Larger values provide some cushion against spikes in demand, while smaller values intentionally leave writes to be done by server processes. The default is 2.0.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Double bgwriter_lru_multiplier;

    public Double getBgwriter_lru_multiplier() {
        return bgwriter_lru_multiplier;
    }

    public void setBgwriter_lru_multiplier(Double bgwriter_lru_multiplier) {
        this.bgwriter_lru_multiplier = bgwriter_lru_multiplier;
    }

    /**
     * This is the amount of time, in milliseconds, to wait on a lock before checking to see if there is a deadlock condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deadlock_timeout")
    @io.fabric8.generator.annotation.Max(1800000.0)
    @io.fabric8.generator.annotation.Min(500.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This is the amount of time, in milliseconds, to wait on a lock before checking to see if there is a deadlock condition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long deadlock_timeout;

    public Long getDeadlock_timeout() {
        return deadlock_timeout;
    }

    public void setDeadlock_timeout(Long deadlock_timeout) {
        this.deadlock_timeout = deadlock_timeout;
    }

    public enum Default_toast_compression {

        @com.fasterxml.jackson.annotation.JsonProperty("lz4")
        LZ4("lz4"), @com.fasterxml.jackson.annotation.JsonProperty("pglz")
        PGLZ("pglz");

        java.lang.String value;

        Default_toast_compression(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Specifies the default TOAST compression method for values of compressible columns (the default is lz4).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("default_toast_compression")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the default TOAST compression method for values of compressible columns (the default is lz4).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Default_toast_compression default_toast_compression;

    public Default_toast_compression getDefault_toast_compression() {
        return default_toast_compression;
    }

    public void setDefault_toast_compression(Default_toast_compression default_toast_compression) {
        this.default_toast_compression = default_toast_compression;
    }

    /**
     * Time out sessions with open transactions after this number of milliseconds
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idle_in_transaction_session_timeout")
    @io.fabric8.generator.annotation.Max(6.048E8)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Time out sessions with open transactions after this number of milliseconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long idle_in_transaction_session_timeout;

    public Long getIdle_in_transaction_session_timeout() {
        return idle_in_transaction_session_timeout;
    }

    public void setIdle_in_transaction_session_timeout(Long idle_in_transaction_session_timeout) {
        this.idle_in_transaction_session_timeout = idle_in_transaction_session_timeout;
    }

    /**
     * Controls system-wide use of Just-in-Time Compilation (JIT).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Controls system-wide use of Just-in-Time Compilation (JIT).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean jit;

    public Boolean getJit() {
        return jit;
    }

    public void setJit(Boolean jit) {
        this.jit = jit;
    }

    /**
     * Causes each action executed by autovacuum to be logged if it ran for at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the default) disables logging autovacuum actions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_autovacuum_min_duration")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(-1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Causes each action executed by autovacuum to be logged if it ran for at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the default) disables logging autovacuum actions.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_autovacuum_min_duration;

    public Long getLog_autovacuum_min_duration() {
        return log_autovacuum_min_duration;
    }

    public void setLog_autovacuum_min_duration(Long log_autovacuum_min_duration) {
        this.log_autovacuum_min_duration = log_autovacuum_min_duration;
    }

    public enum Log_error_verbosity {

        @com.fasterxml.jackson.annotation.JsonProperty("TERSE")
        TERSE("TERSE"), @com.fasterxml.jackson.annotation.JsonProperty("DEFAULT")
        DEFAULT("DEFAULT"), @com.fasterxml.jackson.annotation.JsonProperty("VERBOSE")
        VERBOSE("VERBOSE");

        java.lang.String value;

        Log_error_verbosity(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Controls the amount of detail written in the server log for each message that is logged.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_error_verbosity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Controls the amount of detail written in the server log for each message that is logged.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Log_error_verbosity log_error_verbosity;

    public Log_error_verbosity getLog_error_verbosity() {
        return log_error_verbosity;
    }

    public void setLog_error_verbosity(Log_error_verbosity log_error_verbosity) {
        this.log_error_verbosity = log_error_verbosity;
    }

    public enum Log_line_prefix {

        @com.fasterxml.jackson.annotation.JsonProperty("\'pid=%p,user=%u,db=%d,app=%a,client=%h \'")
        __PID__P_USER__U_DB__D_APP__A_CLIENT__H__("\'pid=%p,user=%u,db=%d,app=%a,client=%h \'"), @com.fasterxml.jackson.annotation.JsonProperty("\'%t [%p]: [%l-1] user=%u,db=%d,app=%a,client=%h \'")
        ___T___P_____L1__USER__U_DB__D_APP__A_CLIENT__H__("\'%t [%p]: [%l-1] user=%u,db=%d,app=%a,client=%h \'"), @com.fasterxml.jackson.annotation.JsonProperty("\'%m [%p] %q[user=%u,db=%d,app=%a] \'")
        ___M___P___Q_USER__U_DB__D_APP__A___("\'%m [%p] %q[user=%u,db=%d,app=%a] \'");

        java.lang.String value;

        Log_line_prefix(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Choose from one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze etc.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_line_prefix")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Choose from one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze etc.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Log_line_prefix log_line_prefix;

    public Log_line_prefix getLog_line_prefix() {
        return log_line_prefix;
    }

    public void setLog_line_prefix(Log_line_prefix log_line_prefix) {
        this.log_line_prefix = log_line_prefix;
    }

    /**
     * Log statements that take more than this number of milliseconds to run, -1 disables
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_min_duration_statement")
    @io.fabric8.generator.annotation.Max(8.64E7)
    @io.fabric8.generator.annotation.Min(-1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Log statements that take more than this number of milliseconds to run, -1 disables")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_min_duration_statement;

    public Long getLog_min_duration_statement() {
        return log_min_duration_statement;
    }

    public void setLog_min_duration_statement(Long log_min_duration_statement) {
        this.log_min_duration_statement = log_min_duration_statement;
    }

    /**
     * Log statements for each temporary file created larger than this number of kilobytes, -1 disables
     */
    @com.fasterxml.jackson.annotation.JsonProperty("log_temp_files")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(-1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Log statements for each temporary file created larger than this number of kilobytes, -1 disables")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long log_temp_files;

    public Long getLog_temp_files() {
        return log_temp_files;
    }

    public void setLog_temp_files(Long log_temp_files) {
        this.log_temp_files = log_temp_files;
    }

    /**
     * PostgreSQL maximum number of files that can be open per process
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_files_per_process")
    @io.fabric8.generator.annotation.Max(4096.0)
    @io.fabric8.generator.annotation.Min(1000.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL maximum number of files that can be open per process")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_files_per_process;

    public Long getMax_files_per_process() {
        return max_files_per_process;
    }

    public void setMax_files_per_process(Long max_files_per_process) {
        this.max_files_per_process = max_files_per_process;
    }

    /**
     * PostgreSQL maximum locks per transaction
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_locks_per_transaction")
    @io.fabric8.generator.annotation.Max(6400.0)
    @io.fabric8.generator.annotation.Min(64.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL maximum locks per transaction")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_locks_per_transaction;

    public Long getMax_locks_per_transaction() {
        return max_locks_per_transaction;
    }

    public void setMax_locks_per_transaction(Long max_locks_per_transaction) {
        this.max_locks_per_transaction = max_locks_per_transaction;
    }

    /**
     * PostgreSQL maximum logical replication workers (taken from the pool of max_parallel_workers)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_logical_replication_workers")
    @io.fabric8.generator.annotation.Max(64.0)
    @io.fabric8.generator.annotation.Min(4.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL maximum logical replication workers (taken from the pool of max_parallel_workers)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_logical_replication_workers;

    public Long getMax_logical_replication_workers() {
        return max_logical_replication_workers;
    }

    public void setMax_logical_replication_workers(Long max_logical_replication_workers) {
        this.max_logical_replication_workers = max_logical_replication_workers;
    }

    /**
     * Sets the maximum number of workers that the system can support for parallel queries
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_parallel_workers")
    @io.fabric8.generator.annotation.Max(96.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sets the maximum number of workers that the system can support for parallel queries")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_parallel_workers;

    public Long getMax_parallel_workers() {
        return max_parallel_workers;
    }

    public void setMax_parallel_workers(Long max_parallel_workers) {
        this.max_parallel_workers = max_parallel_workers;
    }

    /**
     * Sets the maximum number of workers that can be started by a single Gather or Gather Merge node
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_parallel_workers_per_gather")
    @io.fabric8.generator.annotation.Max(96.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sets the maximum number of workers that can be started by a single Gather or Gather Merge node")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_parallel_workers_per_gather;

    public Long getMax_parallel_workers_per_gather() {
        return max_parallel_workers_per_gather;
    }

    public void setMax_parallel_workers_per_gather(Long max_parallel_workers_per_gather) {
        this.max_parallel_workers_per_gather = max_parallel_workers_per_gather;
    }

    /**
     * PostgreSQL maximum predicate locks per transaction
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_pred_locks_per_transaction")
    @io.fabric8.generator.annotation.Max(5120.0)
    @io.fabric8.generator.annotation.Min(64.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL maximum predicate locks per transaction")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_pred_locks_per_transaction;

    public Long getMax_pred_locks_per_transaction() {
        return max_pred_locks_per_transaction;
    }

    public void setMax_pred_locks_per_transaction(Long max_pred_locks_per_transaction) {
        this.max_pred_locks_per_transaction = max_pred_locks_per_transaction;
    }

    /**
     * PostgreSQL maximum prepared transactions
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_prepared_transactions")
    @io.fabric8.generator.annotation.Max(10000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL maximum prepared transactions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_prepared_transactions;

    public Long getMax_prepared_transactions() {
        return max_prepared_transactions;
    }

    public void setMax_prepared_transactions(Long max_prepared_transactions) {
        this.max_prepared_transactions = max_prepared_transactions;
    }

    /**
     * PostgreSQL maximum replication slots
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_replication_slots")
    @io.fabric8.generator.annotation.Max(64.0)
    @io.fabric8.generator.annotation.Min(8.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL maximum replication slots")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_replication_slots;

    public Long getMax_replication_slots() {
        return max_replication_slots;
    }

    public void setMax_replication_slots(Long max_replication_slots) {
        this.max_replication_slots = max_replication_slots;
    }

    /**
     * PostgreSQL maximum WAL size (MB) reserved for replication slots. Default is -1 (unlimited). wal_keep_size minimum WAL size setting takes precedence over this.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_slot_wal_keep_size")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(-1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL maximum WAL size (MB) reserved for replication slots. Default is -1 (unlimited). wal_keep_size minimum WAL size setting takes precedence over this.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_slot_wal_keep_size;

    public Long getMax_slot_wal_keep_size() {
        return max_slot_wal_keep_size;
    }

    public void setMax_slot_wal_keep_size(Long max_slot_wal_keep_size) {
        this.max_slot_wal_keep_size = max_slot_wal_keep_size;
    }

    /**
     * Maximum depth of the stack in bytes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_stack_depth")
    @io.fabric8.generator.annotation.Max(6291456.0)
    @io.fabric8.generator.annotation.Min(2097152.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum depth of the stack in bytes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_stack_depth;

    public Long getMax_stack_depth() {
        return max_stack_depth;
    }

    public void setMax_stack_depth(Long max_stack_depth) {
        this.max_stack_depth = max_stack_depth;
    }

    /**
     * Max standby archive delay in milliseconds
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_standby_archive_delay")
    @io.fabric8.generator.annotation.Max(4.32E7)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Max standby archive delay in milliseconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_standby_archive_delay;

    public Long getMax_standby_archive_delay() {
        return max_standby_archive_delay;
    }

    public void setMax_standby_archive_delay(Long max_standby_archive_delay) {
        this.max_standby_archive_delay = max_standby_archive_delay;
    }

    /**
     * Max standby streaming delay in milliseconds
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_standby_streaming_delay")
    @io.fabric8.generator.annotation.Max(4.32E7)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Max standby streaming delay in milliseconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_standby_streaming_delay;

    public Long getMax_standby_streaming_delay() {
        return max_standby_streaming_delay;
    }

    public void setMax_standby_streaming_delay(Long max_standby_streaming_delay) {
        this.max_standby_streaming_delay = max_standby_streaming_delay;
    }

    /**
     * PostgreSQL maximum WAL senders
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_wal_senders")
    @io.fabric8.generator.annotation.Max(64.0)
    @io.fabric8.generator.annotation.Min(20.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL maximum WAL senders")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_wal_senders;

    public Long getMax_wal_senders() {
        return max_wal_senders;
    }

    public void setMax_wal_senders(Long max_wal_senders) {
        this.max_wal_senders = max_wal_senders;
    }

    /**
     * Sets the maximum number of background processes that the system can support
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_worker_processes")
    @io.fabric8.generator.annotation.Max(96.0)
    @io.fabric8.generator.annotation.Min(8.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sets the maximum number of background processes that the system can support")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_worker_processes;

    public Long getMax_worker_processes() {
        return max_worker_processes;
    }

    public void setMax_worker_processes(Long max_worker_processes) {
        this.max_worker_processes = max_worker_processes;
    }

    /**
     * Sets the time interval to run pg_partman's scheduled tasks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pg_partman_bgw.interval")
    @io.fabric8.generator.annotation.Max(604800.0)
    @io.fabric8.generator.annotation.Min(3600.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sets the time interval to run pg_partman's scheduled tasks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long pg_partman_bgw_interval;

    public Long getPg_partman_bgw_interval() {
        return pg_partman_bgw_interval;
    }

    public void setPg_partman_bgw_interval(Long pg_partman_bgw_interval) {
        this.pg_partman_bgw_interval = pg_partman_bgw_interval;
    }

    /**
     * Controls which role to use for pg_partman's scheduled background tasks.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pg_partman_bgw.role")
    @io.fabric8.generator.annotation.Pattern("^[_A-Za-z0-9][-._A-Za-z0-9]{0,63}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Controls which role to use for pg_partman's scheduled background tasks.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String pg_partman_bgw_role;

    public String getPg_partman_bgw_role() {
        return pg_partman_bgw_role;
    }

    public void setPg_partman_bgw_role(String pg_partman_bgw_role) {
        this.pg_partman_bgw_role = pg_partman_bgw_role;
    }

    /**
     * Enables or disables query plan monitoring
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pg_stat_monitor.pgsm_enable_query_plan")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enables or disables query plan monitoring")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean pg_stat_monitor_pgsm_enable_query_plan;

    public Boolean getPg_stat_monitor_pgsm_enable_query_plan() {
        return pg_stat_monitor_pgsm_enable_query_plan;
    }

    public void setPg_stat_monitor_pgsm_enable_query_plan(Boolean pg_stat_monitor_pgsm_enable_query_plan) {
        this.pg_stat_monitor_pgsm_enable_query_plan = pg_stat_monitor_pgsm_enable_query_plan;
    }

    /**
     * Sets the maximum number of buckets
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pg_stat_monitor.pgsm_max_buckets")
    @io.fabric8.generator.annotation.Max(10.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sets the maximum number of buckets")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long pg_stat_monitor_pgsm_max_buckets;

    public Long getPg_stat_monitor_pgsm_max_buckets() {
        return pg_stat_monitor_pgsm_max_buckets;
    }

    public void setPg_stat_monitor_pgsm_max_buckets(Long pg_stat_monitor_pgsm_max_buckets) {
        this.pg_stat_monitor_pgsm_max_buckets = pg_stat_monitor_pgsm_max_buckets;
    }

    public enum Pg_stat_statements_track {

        @com.fasterxml.jackson.annotation.JsonProperty("all")
        ALL("all"), @com.fasterxml.jackson.annotation.JsonProperty("top")
        TOP("top"), @com.fasterxml.jackson.annotation.JsonProperty("none")
        NONE("none");

        java.lang.String value;

        Pg_stat_statements_track(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Controls which statements are counted. Specify top to track top-level statements (those issued directly by clients), all to also track nested statements (such as statements invoked within functions), or none to disable statement statistics collection. The default value is top.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pg_stat_statements.track")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Controls which statements are counted. Specify top to track top-level statements (those issued directly by clients), all to also track nested statements (such as statements invoked within functions), or none to disable statement statistics collection. The default value is top.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Pg_stat_statements_track pg_stat_statements_track;

    public Pg_stat_statements_track getPg_stat_statements_track() {
        return pg_stat_statements_track;
    }

    public void setPg_stat_statements_track(Pg_stat_statements_track pg_stat_statements_track) {
        this.pg_stat_statements_track = pg_stat_statements_track;
    }

    /**
     * PostgreSQL temporary file limit in KiB, -1 for unlimited
     */
    @com.fasterxml.jackson.annotation.JsonProperty("temp_file_limit")
    @io.fabric8.generator.annotation.Max(2.147483647E9)
    @io.fabric8.generator.annotation.Min(-1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL temporary file limit in KiB, -1 for unlimited")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long temp_file_limit;

    public Long getTemp_file_limit() {
        return temp_file_limit;
    }

    public void setTemp_file_limit(Long temp_file_limit) {
        this.temp_file_limit = temp_file_limit;
    }

    /**
     * PostgreSQL service timezone
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL service timezone")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String timezone;

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * Specifies the number of bytes reserved to track the currently executing command for each active session.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("track_activity_query_size")
    @io.fabric8.generator.annotation.Max(10240.0)
    @io.fabric8.generator.annotation.Min(1024.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the number of bytes reserved to track the currently executing command for each active session.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long track_activity_query_size;

    public Long getTrack_activity_query_size() {
        return track_activity_query_size;
    }

    public void setTrack_activity_query_size(Long track_activity_query_size) {
        this.track_activity_query_size = track_activity_query_size;
    }

    public enum Track_commit_timestamp {

        @com.fasterxml.jackson.annotation.JsonProperty("off")
        OFF("off"), @com.fasterxml.jackson.annotation.JsonProperty("on")
        ON("on");

        java.lang.String value;

        Track_commit_timestamp(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Record commit time of transactions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("track_commit_timestamp")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Record commit time of transactions.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Track_commit_timestamp track_commit_timestamp;

    public Track_commit_timestamp getTrack_commit_timestamp() {
        return track_commit_timestamp;
    }

    public void setTrack_commit_timestamp(Track_commit_timestamp track_commit_timestamp) {
        this.track_commit_timestamp = track_commit_timestamp;
    }

    public enum Track_functions {

        @com.fasterxml.jackson.annotation.JsonProperty("all")
        ALL("all"), @com.fasterxml.jackson.annotation.JsonProperty("pl")
        PL("pl"), @com.fasterxml.jackson.annotation.JsonProperty("none")
        NONE("none");

        java.lang.String value;

        Track_functions(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Enables tracking of function call counts and time used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("track_functions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enables tracking of function call counts and time used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Track_functions track_functions;

    public Track_functions getTrack_functions() {
        return track_functions;
    }

    public void setTrack_functions(Track_functions track_functions) {
        this.track_functions = track_functions;
    }

    public enum Track_io_timing {

        @com.fasterxml.jackson.annotation.JsonProperty("off")
        OFF("off"), @com.fasterxml.jackson.annotation.JsonProperty("on")
        ON("on");

        java.lang.String value;

        Track_io_timing(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the operating system for the current time, which may cause significant overhead on some platforms.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("track_io_timing")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the operating system for the current time, which may cause significant overhead on some platforms.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Track_io_timing track_io_timing;

    public Track_io_timing getTrack_io_timing() {
        return track_io_timing;
    }

    public void setTrack_io_timing(Track_io_timing track_io_timing) {
        this.track_io_timing = track_io_timing;
    }

    /**
     * Terminate replication connections that are inactive for longer than this amount of time, in milliseconds. Setting this value to zero disables the timeout.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("wal_sender_timeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Terminate replication connections that are inactive for longer than this amount of time, in milliseconds. Setting this value to zero disables the timeout.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long wal_sender_timeout;

    public Long getWal_sender_timeout() {
        return wal_sender_timeout;
    }

    public void setWal_sender_timeout(Long wal_sender_timeout) {
        this.wal_sender_timeout = wal_sender_timeout;
    }

    /**
     * WAL flush interval in milliseconds. Note that setting this value to lower than the default 200ms may negatively impact performance
     */
    @com.fasterxml.jackson.annotation.JsonProperty("wal_writer_delay")
    @io.fabric8.generator.annotation.Max(200.0)
    @io.fabric8.generator.annotation.Min(10.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("WAL flush interval in milliseconds. Note that setting this value to lower than the default 200ms may negatively impact performance")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long wal_writer_delay;

    public Long getWal_writer_delay() {
        return wal_writer_delay;
    }

    public void setWal_writer_delay(Long wal_writer_delay) {
        this.wal_writer_delay = wal_writer_delay;
    }
}


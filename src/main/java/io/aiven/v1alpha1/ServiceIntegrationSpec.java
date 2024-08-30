package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authSecretRef","clickhouseKafka","clickhousePostgresql","datadog","destinationEndpointId","destinationProjectName","destinationServiceName","externalAWSCloudwatchMetrics","integrationType","kafkaConnect","kafkaLogs","kafkaMirrormaker","logs","metrics","project","sourceEndpointID","sourceProjectName","sourceServiceName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ServiceIntegrationSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication reference to Aiven token in a secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication reference to Aiven token in a secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.AuthSecretRef authSecretRef;

    public io.aiven.v1alpha1.serviceintegrationspec.AuthSecretRef getAuthSecretRef() {
        return authSecretRef;
    }

    public void setAuthSecretRef(io.aiven.v1alpha1.serviceintegrationspec.AuthSecretRef authSecretRef) {
        this.authSecretRef = authSecretRef;
    }

    /**
     * Clickhouse Kafka configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clickhouseKafka")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Clickhouse Kafka configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.ClickhouseKafka clickhouseKafka;

    public io.aiven.v1alpha1.serviceintegrationspec.ClickhouseKafka getClickhouseKafka() {
        return clickhouseKafka;
    }

    public void setClickhouseKafka(io.aiven.v1alpha1.serviceintegrationspec.ClickhouseKafka clickhouseKafka) {
        this.clickhouseKafka = clickhouseKafka;
    }

    /**
     * Clickhouse PostgreSQL configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clickhousePostgresql")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Clickhouse PostgreSQL configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.ClickhousePostgresql clickhousePostgresql;

    public io.aiven.v1alpha1.serviceintegrationspec.ClickhousePostgresql getClickhousePostgresql() {
        return clickhousePostgresql;
    }

    public void setClickhousePostgresql(io.aiven.v1alpha1.serviceintegrationspec.ClickhousePostgresql clickhousePostgresql) {
        this.clickhousePostgresql = clickhousePostgresql;
    }

    /**
     * Datadog specific user configuration options
     */
    @com.fasterxml.jackson.annotation.JsonProperty("datadog")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Datadog specific user configuration options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.Datadog datadog;

    public io.aiven.v1alpha1.serviceintegrationspec.Datadog getDatadog() {
        return datadog;
    }

    public void setDatadog(io.aiven.v1alpha1.serviceintegrationspec.Datadog datadog) {
        this.datadog = datadog;
    }

    /**
     * Destination endpoint for the integration (if any)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationEndpointId")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Destination endpoint for the integration (if any)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String destinationEndpointId;

    public String getDestinationEndpointId() {
        return destinationEndpointId;
    }

    public void setDestinationEndpointId(String destinationEndpointId) {
        this.destinationEndpointId = destinationEndpointId;
    }

    /**
     * Destination project for the integration (if any)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationProjectName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Destination project for the integration (if any)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String destinationProjectName;

    public String getDestinationProjectName() {
        return destinationProjectName;
    }

    public void setDestinationProjectName(String destinationProjectName) {
        this.destinationProjectName = destinationProjectName;
    }

    /**
     * Destination service for the integration (if any)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationServiceName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Destination service for the integration (if any)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String destinationServiceName;

    public String getDestinationServiceName() {
        return destinationServiceName;
    }

    public void setDestinationServiceName(String destinationServiceName) {
        this.destinationServiceName = destinationServiceName;
    }

    /**
     * External AWS CloudWatch Metrics integration Logs configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalAWSCloudwatchMetrics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("External AWS CloudWatch Metrics integration Logs configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.ExternalAWSCloudwatchMetrics externalAWSCloudwatchMetrics;

    public io.aiven.v1alpha1.serviceintegrationspec.ExternalAWSCloudwatchMetrics getExternalAWSCloudwatchMetrics() {
        return externalAWSCloudwatchMetrics;
    }

    public void setExternalAWSCloudwatchMetrics(io.aiven.v1alpha1.serviceintegrationspec.ExternalAWSCloudwatchMetrics externalAWSCloudwatchMetrics) {
        this.externalAWSCloudwatchMetrics = externalAWSCloudwatchMetrics;
    }

    public enum IntegrationType {

        @com.fasterxml.jackson.annotation.JsonProperty("alertmanager")
        ALERTMANAGER("alertmanager"),
        @com.fasterxml.jackson.annotation.JsonProperty("autoscaler")
        AUTOSCALER("autoscaler"),
        @com.fasterxml.jackson.annotation.JsonProperty("caching")
        CACHING("caching"),
        @com.fasterxml.jackson.annotation.JsonProperty("cassandra_cross_service_cluster")
        CASSANDRA_CROSS_SERVICE_CLUSTER("cassandra_cross_service_cluster"),
        @com.fasterxml.jackson.annotation.JsonProperty("clickhouse_kafka")
        CLICKHOUSE_KAFKA("clickhouse_kafka"),
        @com.fasterxml.jackson.annotation.JsonProperty("clickhouse_postgresql")
        CLICKHOUSE_POSTGRESQL("clickhouse_postgresql"),
        @com.fasterxml.jackson.annotation.JsonProperty("dashboard")
        DASHBOARD("dashboard"),
        @com.fasterxml.jackson.annotation.JsonProperty("datadog")
        DATADOG("datadog"),
        @com.fasterxml.jackson.annotation.JsonProperty("datasource")
        DATASOURCE("datasource"),
        @com.fasterxml.jackson.annotation.JsonProperty("external_aws_cloudwatch_logs")
        EXTERNAL_AWS_CLOUDWATCH_LOGS("external_aws_cloudwatch_logs"),
        @com.fasterxml.jackson.annotation.JsonProperty("external_aws_cloudwatch_metrics")
        EXTERNAL_AWS_CLOUDWATCH_METRICS("external_aws_cloudwatch_metrics"),
        @com.fasterxml.jackson.annotation.JsonProperty("external_elasticsearch_logs")
        EXTERNAL_ELASTICSEARCH_LOGS("external_elasticsearch_logs"),
        @com.fasterxml.jackson.annotation.JsonProperty("external_google_cloud_logging")
        EXTERNAL_GOOGLE_CLOUD_LOGGING("external_google_cloud_logging"),
        @com.fasterxml.jackson.annotation.JsonProperty("external_opensearch_logs")
        EXTERNAL_OPENSEARCH_LOGS("external_opensearch_logs"),
        @com.fasterxml.jackson.annotation.JsonProperty("flink")
        FLINK("flink"),
        @com.fasterxml.jackson.annotation.JsonProperty("flink_external_kafka")
        FLINK_EXTERNAL_KAFKA("flink_external_kafka"),
        @com.fasterxml.jackson.annotation.JsonProperty("internal_connectivity")
        INTERNAL_CONNECTIVITY("internal_connectivity"),
        @com.fasterxml.jackson.annotation.JsonProperty("jolokia")
        JOLOKIA("jolokia"),
        @com.fasterxml.jackson.annotation.JsonProperty("kafka_connect")
        KAFKA_CONNECT("kafka_connect"),
        @com.fasterxml.jackson.annotation.JsonProperty("kafka_logs")
        KAFKA_LOGS("kafka_logs"),
        @com.fasterxml.jackson.annotation.JsonProperty("kafka_mirrormaker")
        KAFKA_MIRRORMAKER("kafka_mirrormaker"),
        @com.fasterxml.jackson.annotation.JsonProperty("logs")
        LOGS("logs"),
        @com.fasterxml.jackson.annotation.JsonProperty("m3aggregator")
        M3AGGREGATOR("m3aggregator"),
        @com.fasterxml.jackson.annotation.JsonProperty("m3coordinator")
        M3COORDINATOR("m3coordinator"),
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        METRICS("metrics"),
        @com.fasterxml.jackson.annotation.JsonProperty("opensearch_cross_cluster_replication")
        OPENSEARCH_CROSS_CLUSTER_REPLICATION("opensearch_cross_cluster_replication"),
        @com.fasterxml.jackson.annotation.JsonProperty("opensearch_cross_cluster_search")
        OPENSEARCH_CROSS_CLUSTER_SEARCH("opensearch_cross_cluster_search"),
        @com.fasterxml.jackson.annotation.JsonProperty("prometheus")
        PROMETHEUS("prometheus"),
        @com.fasterxml.jackson.annotation.JsonProperty("read_replica")
        READ_REPLICA("read_replica"),
        @com.fasterxml.jackson.annotation.JsonProperty("rsyslog")
        RSYSLOG("rsyslog"),
        @com.fasterxml.jackson.annotation.JsonProperty("schema_registry_proxy")
        SCHEMA_REGISTRY_PROXY("schema_registry_proxy"),
        @com.fasterxml.jackson.annotation.JsonProperty("stresstester")
        STRESSTESTER("stresstester"),
        @com.fasterxml.jackson.annotation.JsonProperty("thanosquery")
        THANOSQUERY("thanosquery"),
        @com.fasterxml.jackson.annotation.JsonProperty("thanosstore")
        THANOSSTORE("thanosstore"),
        @com.fasterxml.jackson.annotation.JsonProperty("vmalert")
        VMALERT("vmalert");

        java.lang.String value;

        IntegrationType(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Type of the service integration accepted by Aiven API. Some values may not be supported by the operator
     */
    @com.fasterxml.jackson.annotation.JsonProperty("integrationType")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Type of the service integration accepted by Aiven API. Some values may not be supported by the operator")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private IntegrationType integrationType;

    public IntegrationType getIntegrationType() {
        return integrationType;
    }

    public void setIntegrationType(IntegrationType integrationType) {
        this.integrationType = integrationType;
    }

    /**
     * Kafka Connect service configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafkaConnect")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka Connect service configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.KafkaConnect kafkaConnect;

    public io.aiven.v1alpha1.serviceintegrationspec.KafkaConnect getKafkaConnect() {
        return kafkaConnect;
    }

    public void setKafkaConnect(io.aiven.v1alpha1.serviceintegrationspec.KafkaConnect kafkaConnect) {
        this.kafkaConnect = kafkaConnect;
    }

    /**
     * Kafka logs configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafkaLogs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka logs configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.KafkaLogs kafkaLogs;

    public io.aiven.v1alpha1.serviceintegrationspec.KafkaLogs getKafkaLogs() {
        return kafkaLogs;
    }

    public void setKafkaLogs(io.aiven.v1alpha1.serviceintegrationspec.KafkaLogs kafkaLogs) {
        this.kafkaLogs = kafkaLogs;
    }

    /**
     * Kafka MirrorMaker configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafkaMirrormaker")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka MirrorMaker configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.KafkaMirrormaker kafkaMirrormaker;

    public io.aiven.v1alpha1.serviceintegrationspec.KafkaMirrormaker getKafkaMirrormaker() {
        return kafkaMirrormaker;
    }

    public void setKafkaMirrormaker(io.aiven.v1alpha1.serviceintegrationspec.KafkaMirrormaker kafkaMirrormaker) {
        this.kafkaMirrormaker = kafkaMirrormaker;
    }

    /**
     * Logs configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logs configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.Logs logs;

    public io.aiven.v1alpha1.serviceintegrationspec.Logs getLogs() {
        return logs;
    }

    public void setLogs(io.aiven.v1alpha1.serviceintegrationspec.Logs logs) {
        this.logs = logs;
    }

    /**
     * Metrics configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metrics configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceintegrationspec.Metrics metrics;

    public io.aiven.v1alpha1.serviceintegrationspec.Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(io.aiven.v1alpha1.serviceintegrationspec.Metrics metrics) {
        this.metrics = metrics;
    }

    /**
     * Project the integration belongs to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Project the integration belongs to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * Source endpoint for the integration (if any)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceEndpointID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source endpoint for the integration (if any)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sourceEndpointID;

    public String getSourceEndpointID() {
        return sourceEndpointID;
    }

    public void setSourceEndpointID(String sourceEndpointID) {
        this.sourceEndpointID = sourceEndpointID;
    }

    /**
     * Source project for the integration (if any)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceProjectName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source project for the integration (if any)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sourceProjectName;

    public String getSourceProjectName() {
        return sourceProjectName;
    }

    public void setSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
    }

    /**
     * Source service for the integration (if any)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceServiceName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source service for the integration (if any)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sourceServiceName;

    public String getSourceServiceName() {
        return sourceServiceName;
    }

    public void setSourceServiceName(String sourceServiceName) {
        this.sourceServiceName = sourceServiceName;
    }
}


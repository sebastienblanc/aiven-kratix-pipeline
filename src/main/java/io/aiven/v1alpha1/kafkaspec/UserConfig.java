package io.aiven.v1alpha1.kafkaspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"additional_backup_regions","custom_domain","ip_filter","kafka","kafka_authentication_methods","kafka_connect","kafka_connect_config","kafka_rest","kafka_rest_authorization","kafka_rest_config","kafka_version","private_access","privatelink_access","public_access","schema_registry","schema_registry_config","static_ips"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class UserConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Additional Cloud Regions for Backup Replication
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additional_backup_regions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Additional Cloud Regions for Backup Replication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> additional_backup_regions;

    public java.util.List<String> getAdditional_backup_regions() {
        return additional_backup_regions;
    }

    public void setAdditional_backup_regions(java.util.List<String> additional_backup_regions) {
        this.additional_backup_regions = additional_backup_regions;
    }

    /**
     * Serve the web frontend using a custom CNAME pointing to the Aiven DNS name
     */
    @com.fasterxml.jackson.annotation.JsonProperty("custom_domain")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Serve the web frontend using a custom CNAME pointing to the Aiven DNS name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String custom_domain;

    public String getCustom_domain() {
        return custom_domain;
    }

    public void setCustom_domain(String custom_domain) {
        this.custom_domain = custom_domain;
    }

    /**
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ip_filter")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.kafkaspec.userconfig.Ip_filter> ip_filter;

    public java.util.List<io.aiven.v1alpha1.kafkaspec.userconfig.Ip_filter> getIp_filter() {
        return ip_filter;
    }

    public void setIp_filter(java.util.List<io.aiven.v1alpha1.kafkaspec.userconfig.Ip_filter> ip_filter) {
        this.ip_filter = ip_filter;
    }

    /**
     * Kafka broker configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka broker configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaspec.userconfig.Kafka kafka;

    public io.aiven.v1alpha1.kafkaspec.userconfig.Kafka getKafka() {
        return kafka;
    }

    public void setKafka(io.aiven.v1alpha1.kafkaspec.userconfig.Kafka kafka) {
        this.kafka = kafka;
    }

    /**
     * Kafka authentication methods
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_authentication_methods")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka authentication methods")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaspec.userconfig.Kafka_authentication_methods kafka_authentication_methods;

    public io.aiven.v1alpha1.kafkaspec.userconfig.Kafka_authentication_methods getKafka_authentication_methods() {
        return kafka_authentication_methods;
    }

    public void setKafka_authentication_methods(io.aiven.v1alpha1.kafkaspec.userconfig.Kafka_authentication_methods kafka_authentication_methods) {
        this.kafka_authentication_methods = kafka_authentication_methods;
    }

    /**
     * Enable Kafka Connect service
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_connect")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable Kafka Connect service")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean kafka_connect;

    public Boolean getKafka_connect() {
        return kafka_connect;
    }

    public void setKafka_connect(Boolean kafka_connect) {
        this.kafka_connect = kafka_connect;
    }

    /**
     * Kafka Connect configuration values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_connect_config")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka Connect configuration values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaspec.userconfig.Kafka_connect_config kafka_connect_config;

    public io.aiven.v1alpha1.kafkaspec.userconfig.Kafka_connect_config getKafka_connect_config() {
        return kafka_connect_config;
    }

    public void setKafka_connect_config(io.aiven.v1alpha1.kafkaspec.userconfig.Kafka_connect_config kafka_connect_config) {
        this.kafka_connect_config = kafka_connect_config;
    }

    /**
     * Enable Kafka-REST service
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_rest")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable Kafka-REST service")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean kafka_rest;

    public Boolean getKafka_rest() {
        return kafka_rest;
    }

    public void setKafka_rest(Boolean kafka_rest) {
        this.kafka_rest = kafka_rest;
    }

    /**
     * Enable authorization in Kafka-REST service
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_rest_authorization")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable authorization in Kafka-REST service")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean kafka_rest_authorization;

    public Boolean getKafka_rest_authorization() {
        return kafka_rest_authorization;
    }

    public void setKafka_rest_authorization(Boolean kafka_rest_authorization) {
        this.kafka_rest_authorization = kafka_rest_authorization;
    }

    /**
     * Kafka REST configuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_rest_config")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka REST configuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaspec.userconfig.Kafka_rest_config kafka_rest_config;

    public io.aiven.v1alpha1.kafkaspec.userconfig.Kafka_rest_config getKafka_rest_config() {
        return kafka_rest_config;
    }

    public void setKafka_rest_config(io.aiven.v1alpha1.kafkaspec.userconfig.Kafka_rest_config kafka_rest_config) {
        this.kafka_rest_config = kafka_rest_config;
    }

    public enum Kafka_version {

        @com.fasterxml.jackson.annotation.JsonProperty("3.3")
        _3_3("3.3"), @com.fasterxml.jackson.annotation.JsonProperty("3.1")
        _3_1("3.1"), @com.fasterxml.jackson.annotation.JsonProperty("3.4")
        _3_4("3.4");

        java.lang.String value;

        Kafka_version(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Kafka major version
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafka_version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka major version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Kafka_version kafka_version;

    public Kafka_version getKafka_version() {
        return kafka_version;
    }

    public void setKafka_version(Kafka_version kafka_version) {
        this.kafka_version = kafka_version;
    }

    /**
     * Allow access to selected service ports from private networks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("private_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service ports from private networks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaspec.userconfig.Private_access private_access;

    public io.aiven.v1alpha1.kafkaspec.userconfig.Private_access getPrivate_access() {
        return private_access;
    }

    public void setPrivate_access(io.aiven.v1alpha1.kafkaspec.userconfig.Private_access private_access) {
        this.private_access = private_access;
    }

    /**
     * Allow access to selected service components through Privatelink
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privatelink_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service components through Privatelink")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaspec.userconfig.Privatelink_access privatelink_access;

    public io.aiven.v1alpha1.kafkaspec.userconfig.Privatelink_access getPrivatelink_access() {
        return privatelink_access;
    }

    public void setPrivatelink_access(io.aiven.v1alpha1.kafkaspec.userconfig.Privatelink_access privatelink_access) {
        this.privatelink_access = privatelink_access;
    }

    /**
     * Allow access to selected service ports from the public Internet
     */
    @com.fasterxml.jackson.annotation.JsonProperty("public_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service ports from the public Internet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaspec.userconfig.Public_access public_access;

    public io.aiven.v1alpha1.kafkaspec.userconfig.Public_access getPublic_access() {
        return public_access;
    }

    public void setPublic_access(io.aiven.v1alpha1.kafkaspec.userconfig.Public_access public_access) {
        this.public_access = public_access;
    }

    /**
     * Enable Schema-Registry service
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schema_registry")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable Schema-Registry service")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean schema_registry;

    public Boolean getSchema_registry() {
        return schema_registry;
    }

    public void setSchema_registry(Boolean schema_registry) {
        this.schema_registry = schema_registry;
    }

    /**
     * Schema Registry configuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schema_registry_config")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Schema Registry configuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaspec.userconfig.Schema_registry_config schema_registry_config;

    public io.aiven.v1alpha1.kafkaspec.userconfig.Schema_registry_config getSchema_registry_config() {
        return schema_registry_config;
    }

    public void setSchema_registry_config(io.aiven.v1alpha1.kafkaspec.userconfig.Schema_registry_config schema_registry_config) {
        this.schema_registry_config = schema_registry_config;
    }

    /**
     * Use static public IP addresses
     */
    @com.fasterxml.jackson.annotation.JsonProperty("static_ips")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use static public IP addresses")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean static_ips;

    public Boolean getStatic_ips() {
        return static_ips;
    }

    public void setStatic_ips(Boolean static_ips) {
        this.static_ips = static_ips;
    }
}


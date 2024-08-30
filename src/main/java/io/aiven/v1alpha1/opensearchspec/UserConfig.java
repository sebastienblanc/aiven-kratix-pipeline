package io.aiven.v1alpha1.opensearchspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"additional_backup_regions","custom_domain","disable_replication_factor_adjustment","index_patterns","index_template","ip_filter","keep_index_refresh_interval","max_index_count","opensearch","opensearch_dashboards","opensearch_version","private_access","privatelink_access","project_to_fork_from","public_access","recovery_basebackup_name","saml","service_to_fork_from","static_ips"})
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
     * DEPRECATED: Disable automatic replication factor adjustment for multi-node services. By default, Aiven ensures all indexes are replicated at least to two nodes. Note: Due to potential data loss in case of losing a service node, this setting can no longer be activated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disable_replication_factor_adjustment")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED: Disable automatic replication factor adjustment for multi-node services. By default, Aiven ensures all indexes are replicated at least to two nodes. Note: Due to potential data loss in case of losing a service node, this setting can no longer be activated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean disable_replication_factor_adjustment;

    public Boolean getDisable_replication_factor_adjustment() {
        return disable_replication_factor_adjustment;
    }

    public void setDisable_replication_factor_adjustment(Boolean disable_replication_factor_adjustment) {
        this.disable_replication_factor_adjustment = disable_replication_factor_adjustment;
    }

    /**
     * Index patterns
     */
    @com.fasterxml.jackson.annotation.JsonProperty("index_patterns")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Index patterns")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.opensearchspec.userconfig.Index_patterns> index_patterns;

    public java.util.List<io.aiven.v1alpha1.opensearchspec.userconfig.Index_patterns> getIndex_patterns() {
        return index_patterns;
    }

    public void setIndex_patterns(java.util.List<io.aiven.v1alpha1.opensearchspec.userconfig.Index_patterns> index_patterns) {
        this.index_patterns = index_patterns;
    }

    /**
     * Template settings for all new indexes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("index_template")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template settings for all new indexes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.opensearchspec.userconfig.Index_template index_template;

    public io.aiven.v1alpha1.opensearchspec.userconfig.Index_template getIndex_template() {
        return index_template;
    }

    public void setIndex_template(io.aiven.v1alpha1.opensearchspec.userconfig.Index_template index_template) {
        this.index_template = index_template;
    }

    /**
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ip_filter")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.opensearchspec.userconfig.Ip_filter> ip_filter;

    public java.util.List<io.aiven.v1alpha1.opensearchspec.userconfig.Ip_filter> getIp_filter() {
        return ip_filter;
    }

    public void setIp_filter(java.util.List<io.aiven.v1alpha1.opensearchspec.userconfig.Ip_filter> ip_filter) {
        this.ip_filter = ip_filter;
    }

    /**
     * Aiven automation resets index.refresh_interval to default value for every index to be sure that indices are always visible to search. If it doesn't fit your case, you can disable this by setting up this flag to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keep_index_refresh_interval")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Aiven automation resets index.refresh_interval to default value for every index to be sure that indices are always visible to search. If it doesn't fit your case, you can disable this by setting up this flag to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean keep_index_refresh_interval;

    public Boolean getKeep_index_refresh_interval() {
        return keep_index_refresh_interval;
    }

    public void setKeep_index_refresh_interval(Boolean keep_index_refresh_interval) {
        this.keep_index_refresh_interval = keep_index_refresh_interval;
    }

    /**
     * DEPRECATED: use index_patterns instead
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_index_count")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DEPRECATED: use index_patterns instead")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_index_count;

    public Long getMax_index_count() {
        return max_index_count;
    }

    public void setMax_index_count(Long max_index_count) {
        this.max_index_count = max_index_count;
    }

    /**
     * OpenSearch settings
     */
    @com.fasterxml.jackson.annotation.JsonProperty("opensearch")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OpenSearch settings")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.opensearchspec.userconfig.Opensearch opensearch;

    public io.aiven.v1alpha1.opensearchspec.userconfig.Opensearch getOpensearch() {
        return opensearch;
    }

    public void setOpensearch(io.aiven.v1alpha1.opensearchspec.userconfig.Opensearch opensearch) {
        this.opensearch = opensearch;
    }

    /**
     * OpenSearch Dashboards settings
     */
    @com.fasterxml.jackson.annotation.JsonProperty("opensearch_dashboards")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OpenSearch Dashboards settings")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.opensearchspec.userconfig.Opensearch_dashboards opensearch_dashboards;

    public io.aiven.v1alpha1.opensearchspec.userconfig.Opensearch_dashboards getOpensearch_dashboards() {
        return opensearch_dashboards;
    }

    public void setOpensearch_dashboards(io.aiven.v1alpha1.opensearchspec.userconfig.Opensearch_dashboards opensearch_dashboards) {
        this.opensearch_dashboards = opensearch_dashboards;
    }

    public enum Opensearch_version {

        @com.fasterxml.jackson.annotation.JsonProperty("1")
        V__1("1"), @com.fasterxml.jackson.annotation.JsonProperty("2")
        V__2("2");

        java.lang.String value;

        Opensearch_version(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * OpenSearch major version
     */
    @com.fasterxml.jackson.annotation.JsonProperty("opensearch_version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OpenSearch major version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Opensearch_version opensearch_version;

    public Opensearch_version getOpensearch_version() {
        return opensearch_version;
    }

    public void setOpensearch_version(Opensearch_version opensearch_version) {
        this.opensearch_version = opensearch_version;
    }

    /**
     * Allow access to selected service ports from private networks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("private_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service ports from private networks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.opensearchspec.userconfig.Private_access private_access;

    public io.aiven.v1alpha1.opensearchspec.userconfig.Private_access getPrivate_access() {
        return private_access;
    }

    public void setPrivate_access(io.aiven.v1alpha1.opensearchspec.userconfig.Private_access private_access) {
        this.private_access = private_access;
    }

    /**
     * Allow access to selected service components through Privatelink
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privatelink_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service components through Privatelink")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.opensearchspec.userconfig.Privatelink_access privatelink_access;

    public io.aiven.v1alpha1.opensearchspec.userconfig.Privatelink_access getPrivatelink_access() {
        return privatelink_access;
    }

    public void setPrivatelink_access(io.aiven.v1alpha1.opensearchspec.userconfig.Privatelink_access privatelink_access) {
        this.privatelink_access = privatelink_access;
    }

    /**
     * Name of another project to fork a service from. This has effect only when a new service is being created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("project_to_fork_from")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of another project to fork a service from. This has effect only when a new service is being created.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String project_to_fork_from;

    public String getProject_to_fork_from() {
        return project_to_fork_from;
    }

    public void setProject_to_fork_from(String project_to_fork_from) {
        this.project_to_fork_from = project_to_fork_from;
    }

    /**
     * Allow access to selected service ports from the public Internet
     */
    @com.fasterxml.jackson.annotation.JsonProperty("public_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service ports from the public Internet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.opensearchspec.userconfig.Public_access public_access;

    public io.aiven.v1alpha1.opensearchspec.userconfig.Public_access getPublic_access() {
        return public_access;
    }

    public void setPublic_access(io.aiven.v1alpha1.opensearchspec.userconfig.Public_access public_access) {
        this.public_access = public_access;
    }

    /**
     * Name of the basebackup to restore in forked service
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recovery_basebackup_name")
    @io.fabric8.generator.annotation.Pattern("^[a-zA-Z0-9-_:.]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the basebackup to restore in forked service")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String recovery_basebackup_name;

    public String getRecovery_basebackup_name() {
        return recovery_basebackup_name;
    }

    public void setRecovery_basebackup_name(String recovery_basebackup_name) {
        this.recovery_basebackup_name = recovery_basebackup_name;
    }

    /**
     * OpenSearch SAML configuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("saml")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OpenSearch SAML configuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.opensearchspec.userconfig.Saml saml;

    public io.aiven.v1alpha1.opensearchspec.userconfig.Saml getSaml() {
        return saml;
    }

    public void setSaml(io.aiven.v1alpha1.opensearchspec.userconfig.Saml saml) {
        this.saml = saml;
    }

    /**
     * Name of another service to fork from. This has effect only when a new service is being created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("service_to_fork_from")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of another service to fork from. This has effect only when a new service is being created.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String service_to_fork_from;

    public String getService_to_fork_from() {
        return service_to_fork_from;
    }

    public void setService_to_fork_from(String service_to_fork_from) {
        this.service_to_fork_from = service_to_fork_from;
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


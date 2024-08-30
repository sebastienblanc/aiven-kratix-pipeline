package io.aiven.v1alpha1.grafanaspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"additional_backup_regions","alerting_enabled","alerting_error_or_timeout","alerting_max_annotations_to_keep","alerting_nodata_or_nullvalues","allow_embedding","auth_azuread","auth_basic_enabled","auth_generic_oauth","auth_github","auth_gitlab","auth_google","cookie_samesite","custom_domain","dashboard_previews_enabled","dashboards_min_refresh_interval","dashboards_versions_to_keep","dataproxy_send_user_header","dataproxy_timeout","date_formats","disable_gravatar","editors_can_admin","external_image_storage","google_analytics_ua_id","ip_filter","metrics_enabled","private_access","privatelink_access","project_to_fork_from","public_access","recovery_basebackup_name","service_to_fork_from","smtp_server","static_ips","user_auto_assign_org","user_auto_assign_org_role","viewers_can_edit"})
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
     * Enable or disable Grafana alerting functionality
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alerting_enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable Grafana alerting functionality")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean alerting_enabled;

    public Boolean getAlerting_enabled() {
        return alerting_enabled;
    }

    public void setAlerting_enabled(Boolean alerting_enabled) {
        this.alerting_enabled = alerting_enabled;
    }

    public enum Alerting_error_or_timeout {

        @com.fasterxml.jackson.annotation.JsonProperty("alerting")
        ALERTING("alerting"), @com.fasterxml.jackson.annotation.JsonProperty("keep_state")
        KEEP_STATE("keep_state");

        java.lang.String value;

        Alerting_error_or_timeout(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Default error or timeout setting for new alerting rules
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alerting_error_or_timeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Default error or timeout setting for new alerting rules")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Alerting_error_or_timeout alerting_error_or_timeout;

    public Alerting_error_or_timeout getAlerting_error_or_timeout() {
        return alerting_error_or_timeout;
    }

    public void setAlerting_error_or_timeout(Alerting_error_or_timeout alerting_error_or_timeout) {
        this.alerting_error_or_timeout = alerting_error_or_timeout;
    }

    /**
     * Max number of alert annotations that Grafana stores. 0 (default) keeps all alert annotations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alerting_max_annotations_to_keep")
    @io.fabric8.generator.annotation.Max(1000000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Max number of alert annotations that Grafana stores. 0 (default) keeps all alert annotations.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long alerting_max_annotations_to_keep;

    public Long getAlerting_max_annotations_to_keep() {
        return alerting_max_annotations_to_keep;
    }

    public void setAlerting_max_annotations_to_keep(Long alerting_max_annotations_to_keep) {
        this.alerting_max_annotations_to_keep = alerting_max_annotations_to_keep;
    }

    public enum Alerting_nodata_or_nullvalues {

        @com.fasterxml.jackson.annotation.JsonProperty("alerting")
        ALERTING("alerting"), @com.fasterxml.jackson.annotation.JsonProperty("no_data")
        NO_DATA("no_data"), @com.fasterxml.jackson.annotation.JsonProperty("keep_state")
        KEEP_STATE("keep_state"), @com.fasterxml.jackson.annotation.JsonProperty("ok")
        OK("ok");

        java.lang.String value;

        Alerting_nodata_or_nullvalues(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Default value for 'no data or null values' for new alerting rules
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alerting_nodata_or_nullvalues")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Default value for 'no data or null values' for new alerting rules")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Alerting_nodata_or_nullvalues alerting_nodata_or_nullvalues;

    public Alerting_nodata_or_nullvalues getAlerting_nodata_or_nullvalues() {
        return alerting_nodata_or_nullvalues;
    }

    public void setAlerting_nodata_or_nullvalues(Alerting_nodata_or_nullvalues alerting_nodata_or_nullvalues) {
        this.alerting_nodata_or_nullvalues = alerting_nodata_or_nullvalues;
    }

    /**
     * Allow embedding Grafana dashboards with iframe/frame/object/embed tags. Disabled by default to limit impact of clickjacking
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allow_embedding")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow embedding Grafana dashboards with iframe/frame/object/embed tags. Disabled by default to limit impact of clickjacking")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean allow_embedding;

    public Boolean getAllow_embedding() {
        return allow_embedding;
    }

    public void setAllow_embedding(Boolean allow_embedding) {
        this.allow_embedding = allow_embedding;
    }

    /**
     * Azure AD OAuth integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auth_azuread")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Azure AD OAuth integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.grafanaspec.userconfig.Auth_azuread auth_azuread;

    public io.aiven.v1alpha1.grafanaspec.userconfig.Auth_azuread getAuth_azuread() {
        return auth_azuread;
    }

    public void setAuth_azuread(io.aiven.v1alpha1.grafanaspec.userconfig.Auth_azuread auth_azuread) {
        this.auth_azuread = auth_azuread;
    }

    /**
     * Enable or disable basic authentication form, used by Grafana built-in login
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auth_basic_enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable basic authentication form, used by Grafana built-in login")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean auth_basic_enabled;

    public Boolean getAuth_basic_enabled() {
        return auth_basic_enabled;
    }

    public void setAuth_basic_enabled(Boolean auth_basic_enabled) {
        this.auth_basic_enabled = auth_basic_enabled;
    }

    /**
     * Generic OAuth integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auth_generic_oauth")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Generic OAuth integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.grafanaspec.userconfig.Auth_generic_oauth auth_generic_oauth;

    public io.aiven.v1alpha1.grafanaspec.userconfig.Auth_generic_oauth getAuth_generic_oauth() {
        return auth_generic_oauth;
    }

    public void setAuth_generic_oauth(io.aiven.v1alpha1.grafanaspec.userconfig.Auth_generic_oauth auth_generic_oauth) {
        this.auth_generic_oauth = auth_generic_oauth;
    }

    /**
     * Github Auth integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auth_github")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Github Auth integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.grafanaspec.userconfig.Auth_github auth_github;

    public io.aiven.v1alpha1.grafanaspec.userconfig.Auth_github getAuth_github() {
        return auth_github;
    }

    public void setAuth_github(io.aiven.v1alpha1.grafanaspec.userconfig.Auth_github auth_github) {
        this.auth_github = auth_github;
    }

    /**
     * GitLab Auth integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auth_gitlab")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GitLab Auth integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.grafanaspec.userconfig.Auth_gitlab auth_gitlab;

    public io.aiven.v1alpha1.grafanaspec.userconfig.Auth_gitlab getAuth_gitlab() {
        return auth_gitlab;
    }

    public void setAuth_gitlab(io.aiven.v1alpha1.grafanaspec.userconfig.Auth_gitlab auth_gitlab) {
        this.auth_gitlab = auth_gitlab;
    }

    /**
     * Google Auth integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auth_google")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Google Auth integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.grafanaspec.userconfig.Auth_google auth_google;

    public io.aiven.v1alpha1.grafanaspec.userconfig.Auth_google getAuth_google() {
        return auth_google;
    }

    public void setAuth_google(io.aiven.v1alpha1.grafanaspec.userconfig.Auth_google auth_google) {
        this.auth_google = auth_google;
    }

    public enum Cookie_samesite {

        @com.fasterxml.jackson.annotation.JsonProperty("lax")
        LAX("lax"), @com.fasterxml.jackson.annotation.JsonProperty("strict")
        STRICT("strict"), @com.fasterxml.jackson.annotation.JsonProperty("none")
        NONE("none");

        java.lang.String value;

        Cookie_samesite(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Cookie SameSite attribute: 'strict' prevents sending cookie for cross-site requests, effectively disabling direct linking from other sites to Grafana. 'lax' is the default value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cookie_samesite")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Cookie SameSite attribute: 'strict' prevents sending cookie for cross-site requests, effectively disabling direct linking from other sites to Grafana. 'lax' is the default value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Cookie_samesite cookie_samesite;

    public Cookie_samesite getCookie_samesite() {
        return cookie_samesite;
    }

    public void setCookie_samesite(Cookie_samesite cookie_samesite) {
        this.cookie_samesite = cookie_samesite;
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
     * This feature is new in Grafana 9 and is quite resource intensive. It may cause low-end plans to work more slowly while the dashboard previews are rendering.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dashboard_previews_enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This feature is new in Grafana 9 and is quite resource intensive. It may cause low-end plans to work more slowly while the dashboard previews are rendering.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean dashboard_previews_enabled;

    public Boolean getDashboard_previews_enabled() {
        return dashboard_previews_enabled;
    }

    public void setDashboard_previews_enabled(Boolean dashboard_previews_enabled) {
        this.dashboard_previews_enabled = dashboard_previews_enabled;
    }

    /**
     * Signed sequence of decimal numbers, followed by a unit suffix (ms, s, m, h, d), e.g. 30s, 1h
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dashboards_min_refresh_interval")
    @io.fabric8.generator.annotation.Pattern("^[0-9]+(ms|s|m|h|d)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Signed sequence of decimal numbers, followed by a unit suffix (ms, s, m, h, d), e.g. 30s, 1h")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String dashboards_min_refresh_interval;

    public String getDashboards_min_refresh_interval() {
        return dashboards_min_refresh_interval;
    }

    public void setDashboards_min_refresh_interval(String dashboards_min_refresh_interval) {
        this.dashboards_min_refresh_interval = dashboards_min_refresh_interval;
    }

    /**
     * Dashboard versions to keep per dashboard
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dashboards_versions_to_keep")
    @io.fabric8.generator.annotation.Max(100.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Dashboard versions to keep per dashboard")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long dashboards_versions_to_keep;

    public Long getDashboards_versions_to_keep() {
        return dashboards_versions_to_keep;
    }

    public void setDashboards_versions_to_keep(Long dashboards_versions_to_keep) {
        this.dashboards_versions_to_keep = dashboards_versions_to_keep;
    }

    /**
     * Send 'X-Grafana-User' header to data source
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataproxy_send_user_header")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Send 'X-Grafana-User' header to data source")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean dataproxy_send_user_header;

    public Boolean getDataproxy_send_user_header() {
        return dataproxy_send_user_header;
    }

    public void setDataproxy_send_user_header(Boolean dataproxy_send_user_header) {
        this.dataproxy_send_user_header = dataproxy_send_user_header;
    }

    /**
     * Timeout for data proxy requests in seconds
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataproxy_timeout")
    @io.fabric8.generator.annotation.Max(90.0)
    @io.fabric8.generator.annotation.Min(15.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Timeout for data proxy requests in seconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long dataproxy_timeout;

    public Long getDataproxy_timeout() {
        return dataproxy_timeout;
    }

    public void setDataproxy_timeout(Long dataproxy_timeout) {
        this.dataproxy_timeout = dataproxy_timeout;
    }

    /**
     * Grafana date format specifications
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date_formats")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Grafana date format specifications")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.grafanaspec.userconfig.Date_formats date_formats;

    public io.aiven.v1alpha1.grafanaspec.userconfig.Date_formats getDate_formats() {
        return date_formats;
    }

    public void setDate_formats(io.aiven.v1alpha1.grafanaspec.userconfig.Date_formats date_formats) {
        this.date_formats = date_formats;
    }

    /**
     * Set to true to disable gravatar. Defaults to false (gravatar is enabled)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disable_gravatar")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Set to true to disable gravatar. Defaults to false (gravatar is enabled)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean disable_gravatar;

    public Boolean getDisable_gravatar() {
        return disable_gravatar;
    }

    public void setDisable_gravatar(Boolean disable_gravatar) {
        this.disable_gravatar = disable_gravatar;
    }

    /**
     * Editors can manage folders, teams and dashboards created by them
     */
    @com.fasterxml.jackson.annotation.JsonProperty("editors_can_admin")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Editors can manage folders, teams and dashboards created by them")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean editors_can_admin;

    public Boolean getEditors_can_admin() {
        return editors_can_admin;
    }

    public void setEditors_can_admin(Boolean editors_can_admin) {
        this.editors_can_admin = editors_can_admin;
    }

    /**
     * External image store settings
     */
    @com.fasterxml.jackson.annotation.JsonProperty("external_image_storage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("External image store settings")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.grafanaspec.userconfig.External_image_storage external_image_storage;

    public io.aiven.v1alpha1.grafanaspec.userconfig.External_image_storage getExternal_image_storage() {
        return external_image_storage;
    }

    public void setExternal_image_storage(io.aiven.v1alpha1.grafanaspec.userconfig.External_image_storage external_image_storage) {
        this.external_image_storage = external_image_storage;
    }

    /**
     * Google Analytics ID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("google_analytics_ua_id")
    @io.fabric8.generator.annotation.Pattern("^(G|UA|YT|MO)-[a-zA-Z0-9-]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Google Analytics ID")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String google_analytics_ua_id;

    public String getGoogle_analytics_ua_id() {
        return google_analytics_ua_id;
    }

    public void setGoogle_analytics_ua_id(String google_analytics_ua_id) {
        this.google_analytics_ua_id = google_analytics_ua_id;
    }

    /**
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ip_filter")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.grafanaspec.userconfig.Ip_filter> ip_filter;

    public java.util.List<io.aiven.v1alpha1.grafanaspec.userconfig.Ip_filter> getIp_filter() {
        return ip_filter;
    }

    public void setIp_filter(java.util.List<io.aiven.v1alpha1.grafanaspec.userconfig.Ip_filter> ip_filter) {
        this.ip_filter = ip_filter;
    }

    /**
     * Enable Grafana /metrics endpoint
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics_enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable Grafana /metrics endpoint")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean metrics_enabled;

    public Boolean getMetrics_enabled() {
        return metrics_enabled;
    }

    public void setMetrics_enabled(Boolean metrics_enabled) {
        this.metrics_enabled = metrics_enabled;
    }

    /**
     * Allow access to selected service ports from private networks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("private_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service ports from private networks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.grafanaspec.userconfig.Private_access private_access;

    public io.aiven.v1alpha1.grafanaspec.userconfig.Private_access getPrivate_access() {
        return private_access;
    }

    public void setPrivate_access(io.aiven.v1alpha1.grafanaspec.userconfig.Private_access private_access) {
        this.private_access = private_access;
    }

    /**
     * Allow access to selected service components through Privatelink
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privatelink_access")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow access to selected service components through Privatelink")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.grafanaspec.userconfig.Privatelink_access privatelink_access;

    public io.aiven.v1alpha1.grafanaspec.userconfig.Privatelink_access getPrivatelink_access() {
        return privatelink_access;
    }

    public void setPrivatelink_access(io.aiven.v1alpha1.grafanaspec.userconfig.Privatelink_access privatelink_access) {
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
    private io.aiven.v1alpha1.grafanaspec.userconfig.Public_access public_access;

    public io.aiven.v1alpha1.grafanaspec.userconfig.Public_access getPublic_access() {
        return public_access;
    }

    public void setPublic_access(io.aiven.v1alpha1.grafanaspec.userconfig.Public_access public_access) {
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
     * SMTP server settings
     */
    @com.fasterxml.jackson.annotation.JsonProperty("smtp_server")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SMTP server settings")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.grafanaspec.userconfig.Smtp_server smtp_server;

    public io.aiven.v1alpha1.grafanaspec.userconfig.Smtp_server getSmtp_server() {
        return smtp_server;
    }

    public void setSmtp_server(io.aiven.v1alpha1.grafanaspec.userconfig.Smtp_server smtp_server) {
        this.smtp_server = smtp_server;
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

    /**
     * Auto-assign new users on signup to main organization. Defaults to false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("user_auto_assign_org")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Auto-assign new users on signup to main organization. Defaults to false")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean user_auto_assign_org;

    public Boolean getUser_auto_assign_org() {
        return user_auto_assign_org;
    }

    public void setUser_auto_assign_org(Boolean user_auto_assign_org) {
        this.user_auto_assign_org = user_auto_assign_org;
    }

    public enum User_auto_assign_org_role {

        @com.fasterxml.jackson.annotation.JsonProperty("Viewer")
        VIEWER("Viewer"), @com.fasterxml.jackson.annotation.JsonProperty("Admin")
        ADMIN("Admin"), @com.fasterxml.jackson.annotation.JsonProperty("Editor")
        EDITOR("Editor");

        java.lang.String value;

        User_auto_assign_org_role(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Set role for new signups. Defaults to Viewer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("user_auto_assign_org_role")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Set role for new signups. Defaults to Viewer")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private User_auto_assign_org_role user_auto_assign_org_role;

    public User_auto_assign_org_role getUser_auto_assign_org_role() {
        return user_auto_assign_org_role;
    }

    public void setUser_auto_assign_org_role(User_auto_assign_org_role user_auto_assign_org_role) {
        this.user_auto_assign_org_role = user_auto_assign_org_role;
    }

    /**
     * Users with view-only permission can edit but not save dashboards
     */
    @com.fasterxml.jackson.annotation.JsonProperty("viewers_can_edit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Users with view-only permission can edit but not save dashboards")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean viewers_can_edit;

    public Boolean getViewers_can_edit() {
        return viewers_can_edit;
    }

    public void setViewers_can_edit(Boolean viewers_can_edit) {
        this.viewers_can_edit = viewers_can_edit;
    }
}


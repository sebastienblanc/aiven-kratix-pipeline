package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authSecretRef","cloudName","maintenanceWindowDow","maintenanceWindowTime","plan","project","projectVPCRef","projectVpcId","serviceIntegrations","tags","terminationProtection","userConfig"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaConnectSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication reference to Aiven token in a secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication reference to Aiven token in a secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaconnectspec.AuthSecretRef authSecretRef;

    public io.aiven.v1alpha1.kafkaconnectspec.AuthSecretRef getAuthSecretRef() {
        return authSecretRef;
    }

    public void setAuthSecretRef(io.aiven.v1alpha1.kafkaconnectspec.AuthSecretRef authSecretRef) {
        this.authSecretRef = authSecretRef;
    }

    /**
     * Cloud the service runs in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Cloud the service runs in.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cloudName;

    public String getCloudName() {
        return cloudName;
    }

    public void setCloudName(String cloudName) {
        this.cloudName = cloudName;
    }

    public enum MaintenanceWindowDow {

        @com.fasterxml.jackson.annotation.JsonProperty("monday")
        MONDAY("monday"),
        @com.fasterxml.jackson.annotation.JsonProperty("tuesday")
        TUESDAY("tuesday"),
        @com.fasterxml.jackson.annotation.JsonProperty("wednesday")
        WEDNESDAY("wednesday"),
        @com.fasterxml.jackson.annotation.JsonProperty("thursday")
        THURSDAY("thursday"),
        @com.fasterxml.jackson.annotation.JsonProperty("friday")
        FRIDAY("friday"),
        @com.fasterxml.jackson.annotation.JsonProperty("saturday")
        SATURDAY("saturday"),
        @com.fasterxml.jackson.annotation.JsonProperty("sunday")
        SUNDAY("sunday");

        java.lang.String value;

        MaintenanceWindowDow(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Day of week when maintenance operations should be performed. One monday, tuesday, wednesday, etc.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDow")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Day of week when maintenance operations should be performed. One monday, tuesday, wednesday, etc.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private MaintenanceWindowDow maintenanceWindowDow;

    public MaintenanceWindowDow getMaintenanceWindowDow() {
        return maintenanceWindowDow;
    }

    public void setMaintenanceWindowDow(MaintenanceWindowDow maintenanceWindowDow) {
        this.maintenanceWindowDow = maintenanceWindowDow;
    }

    /**
     * Time of day when maintenance operations should be performed. UTC time in HH:mm:ss format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowTime")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Time of day when maintenance operations should be performed. UTC time in HH:mm:ss format.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String maintenanceWindowTime;

    public String getMaintenanceWindowTime() {
        return maintenanceWindowTime;
    }

    public void setMaintenanceWindowTime(String maintenanceWindowTime) {
        this.maintenanceWindowTime = maintenanceWindowTime;
    }

    /**
     * Subscription plan.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("plan")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Subscription plan.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String plan;

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    /**
     * Target project.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Target project.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * ProjectVPCRef reference to ProjectVPC resource to use its ID as ProjectVPCID automatically
     */
    @com.fasterxml.jackson.annotation.JsonProperty("projectVPCRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ProjectVPCRef reference to ProjectVPC resource to use its ID as ProjectVPCID automatically")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaconnectspec.ProjectVPCRef projectVPCRef;

    public io.aiven.v1alpha1.kafkaconnectspec.ProjectVPCRef getProjectVPCRef() {
        return projectVPCRef;
    }

    public void setProjectVPCRef(io.aiven.v1alpha1.kafkaconnectspec.ProjectVPCRef projectVPCRef) {
        this.projectVPCRef = projectVPCRef;
    }

    /**
     * Identifier of the VPC the service should be in, if any.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("projectVpcId")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Identifier of the VPC the service should be in, if any.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String projectVpcId;

    public String getProjectVpcId() {
        return projectVpcId;
    }

    public void setProjectVpcId(String projectVpcId) {
        this.projectVpcId = projectVpcId;
    }

    /**
     * Service integrations to specify when creating a service. Not applied after initial service creation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceIntegrations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Service integrations to specify when creating a service. Not applied after initial service creation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.kafkaconnectspec.ServiceIntegrations> serviceIntegrations;

    public java.util.List<io.aiven.v1alpha1.kafkaconnectspec.ServiceIntegrations> getServiceIntegrations() {
        return serviceIntegrations;
    }

    public void setServiceIntegrations(java.util.List<io.aiven.v1alpha1.kafkaconnectspec.ServiceIntegrations> serviceIntegrations) {
        this.serviceIntegrations = serviceIntegrations;
    }

    /**
     * Tags are key-value pairs that allow you to categorize services.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Tags are key-value pairs that allow you to categorize services.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> tags;

    public java.util.Map<java.lang.String, String> getTags() {
        return tags;
    }

    public void setTags(java.util.Map<java.lang.String, String> tags) {
        this.tags = tags;
    }

    /**
     * Prevent service from being deleted. It is recommended to have this enabled for all services.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("terminationProtection")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Prevent service from being deleted. It is recommended to have this enabled for all services.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean terminationProtection;

    public Boolean getTerminationProtection() {
        return terminationProtection;
    }

    public void setTerminationProtection(Boolean terminationProtection) {
        this.terminationProtection = terminationProtection;
    }

    /**
     * KafkaConnect specific user configuration options
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("KafkaConnect specific user configuration options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaconnectspec.UserConfig userConfig;

    public io.aiven.v1alpha1.kafkaconnectspec.UserConfig getUserConfig() {
        return userConfig;
    }

    public void setUserConfig(io.aiven.v1alpha1.kafkaconnectspec.UserConfig userConfig) {
        this.userConfig = userConfig;
    }
}


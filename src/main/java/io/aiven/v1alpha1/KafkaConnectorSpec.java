package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authSecretRef","connectorClass","project","serviceName","userConfig"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaConnectorSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication reference to Aiven token in a secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication reference to Aiven token in a secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaconnectorspec.AuthSecretRef authSecretRef;

    public io.aiven.v1alpha1.kafkaconnectorspec.AuthSecretRef getAuthSecretRef() {
        return authSecretRef;
    }

    public void setAuthSecretRef(io.aiven.v1alpha1.kafkaconnectorspec.AuthSecretRef authSecretRef) {
        this.authSecretRef = authSecretRef;
    }

    /**
     * The Java class of the connector.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectorClass")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Java class of the connector.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String connectorClass;

    public String getConnectorClass() {
        return connectorClass;
    }

    public void setConnectorClass(String connectorClass) {
        this.connectorClass = connectorClass;
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
     * Service name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Service name.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceName;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * The connector specific configuration To build config values from secret the template function {{ fromSecret "name" "key" }} is provided when interpreting the keys
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userConfig")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The connector specific configuration To build config values from secret the template function {{ fromSecret \"name\" \"key\" }} is provided when interpreting the keys")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> userConfig;

    public java.util.Map<java.lang.String, String> getUserConfig() {
        return userConfig;
    }

    public void setUserConfig(java.util.Map<java.lang.String, String> userConfig) {
        this.userConfig = userConfig;
    }
}


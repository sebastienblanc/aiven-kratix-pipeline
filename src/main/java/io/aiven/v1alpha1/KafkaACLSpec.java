package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authSecretRef","permission","project","serviceName","topic","username"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaACLSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication reference to Aiven token in a secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication reference to Aiven token in a secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaaclspec.AuthSecretRef authSecretRef;

    public io.aiven.v1alpha1.kafkaaclspec.AuthSecretRef getAuthSecretRef() {
        return authSecretRef;
    }

    public void setAuthSecretRef(io.aiven.v1alpha1.kafkaaclspec.AuthSecretRef authSecretRef) {
        this.authSecretRef = authSecretRef;
    }

    public enum Permission {

        @com.fasterxml.jackson.annotation.JsonProperty("admin")
        ADMIN("admin"), @com.fasterxml.jackson.annotation.JsonProperty("read")
        READ("read"), @com.fasterxml.jackson.annotation.JsonProperty("readwrite")
        READWRITE("readwrite"), @com.fasterxml.jackson.annotation.JsonProperty("write")
        WRITE("write");

        java.lang.String value;

        Permission(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Kafka permission to grant (admin, read, readwrite, write)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("permission")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka permission to grant (admin, read, readwrite, write)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Permission permission;

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    /**
     * Project to link the Kafka ACL to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Project to link the Kafka ACL to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * Service to link the Kafka ACL to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Service to link the Kafka ACL to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceName;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Topic name pattern for the ACL entry
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topic")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Topic name pattern for the ACL entry")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String topic;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * Username pattern for the ACL entry
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Username pattern for the ACL entry")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


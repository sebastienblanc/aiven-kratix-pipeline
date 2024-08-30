package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authSecretRef","compatibilityLevel","project","schema","serviceName","subjectName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaSchemaSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication reference to Aiven token in a secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication reference to Aiven token in a secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaschemaspec.AuthSecretRef authSecretRef;

    public io.aiven.v1alpha1.kafkaschemaspec.AuthSecretRef getAuthSecretRef() {
        return authSecretRef;
    }

    public void setAuthSecretRef(io.aiven.v1alpha1.kafkaschemaspec.AuthSecretRef authSecretRef) {
        this.authSecretRef = authSecretRef;
    }

    public enum CompatibilityLevel {

        @com.fasterxml.jackson.annotation.JsonProperty("BACKWARD")
        BACKWARD("BACKWARD"),
        @com.fasterxml.jackson.annotation.JsonProperty("BACKWARD_TRANSITIVE")
        BACKWARD_TRANSITIVE("BACKWARD_TRANSITIVE"),
        @com.fasterxml.jackson.annotation.JsonProperty("FORWARD")
        FORWARD("FORWARD"),
        @com.fasterxml.jackson.annotation.JsonProperty("FORWARD_TRANSITIVE")
        FORWARD_TRANSITIVE("FORWARD_TRANSITIVE"),
        @com.fasterxml.jackson.annotation.JsonProperty("FULL")
        FULL("FULL"),
        @com.fasterxml.jackson.annotation.JsonProperty("FULL_TRANSITIVE")
        FULL_TRANSITIVE("FULL_TRANSITIVE"),
        @com.fasterxml.jackson.annotation.JsonProperty("NONE")
        NONE("NONE");

        java.lang.String value;

        CompatibilityLevel(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Kafka Schemas compatibility level
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compatibilityLevel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka Schemas compatibility level")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private CompatibilityLevel compatibilityLevel;

    public CompatibilityLevel getCompatibilityLevel() {
        return compatibilityLevel;
    }

    public void setCompatibilityLevel(CompatibilityLevel compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
    }

    /**
     * Project to link the Kafka Schema to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Project to link the Kafka Schema to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * Kafka Schema configuration should be a valid Avro Schema JSON format
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka Schema configuration should be a valid Avro Schema JSON format")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String schema;

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * Service to link the Kafka Schema to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Service to link the Kafka Schema to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceName;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Kafka Schema Subject name
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka Schema Subject name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}


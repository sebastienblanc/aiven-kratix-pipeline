package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authSecretRef","config","partitions","project","replication","serviceName","tags","termination_protection","topicName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaTopicSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication reference to Aiven token in a secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication reference to Aiven token in a secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkatopicspec.AuthSecretRef authSecretRef;

    public io.aiven.v1alpha1.kafkatopicspec.AuthSecretRef getAuthSecretRef() {
        return authSecretRef;
    }

    public void setAuthSecretRef(io.aiven.v1alpha1.kafkatopicspec.AuthSecretRef authSecretRef) {
        this.authSecretRef = authSecretRef;
    }

    /**
     * Kafka topic configuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka topic configuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkatopicspec.Config config;

    public io.aiven.v1alpha1.kafkatopicspec.Config getConfig() {
        return config;
    }

    public void setConfig(io.aiven.v1alpha1.kafkatopicspec.Config config) {
        this.config = config;
    }

    /**
     * Number of partitions to create in the topic
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partitions")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Max(1000000.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of partitions to create in the topic")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long partitions;

    public Long getPartitions() {
        return partitions;
    }

    public void setPartitions(Long partitions) {
        this.partitions = partitions;
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
     * Replication factor for the topic
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replication")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Min(2.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Replication factor for the topic")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long replication;

    public Long getReplication() {
        return replication;
    }

    public void setReplication(Long replication) {
        this.replication = replication;
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
     * Kafka topic tags
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka topic tags")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.kafkatopicspec.Tags> tags;

    public java.util.List<io.aiven.v1alpha1.kafkatopicspec.Tags> getTags() {
        return tags;
    }

    public void setTags(java.util.List<io.aiven.v1alpha1.kafkatopicspec.Tags> tags) {
        this.tags = tags;
    }

    /**
     * It is a Kubernetes side deletion protections, which prevents the kafka topic from being deleted by Kubernetes. It is recommended to enable this for any production databases containing critical data.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("termination_protection")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("It is a Kubernetes side deletion protections, which prevents the kafka topic from being deleted by Kubernetes. It is recommended to enable this for any production databases containing critical data.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean termination_protection;

    public Boolean getTermination_protection() {
        return termination_protection;
    }

    public void setTermination_protection(Boolean termination_protection) {
        this.termination_protection = termination_protection;
    }

    /**
     * Topic name. If provided, is used instead of metadata.name. This field supports additional characters, has a longer length, and will replace metadata.name in future releases
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topicName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Topic name. If provided, is used instead of metadata.name. This field supports additional characters, has a longer length, and will replace metadata.name in future releases")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String topicName;

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
}


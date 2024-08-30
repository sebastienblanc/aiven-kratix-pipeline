package io.aiven.v1alpha1.serviceintegrationspec.kafkaconnect;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"config_storage_topic","group_id","offset_storage_topic","status_storage_topic"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Kafka_connect implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The name of the topic where connector and task configuration data are stored.This must be the same for all workers with the same group_id.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("config_storage_topic")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the topic where connector and task configuration data are stored.This must be the same for all workers with the same group_id.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String config_storage_topic;

    public String getConfig_storage_topic() {
        return config_storage_topic;
    }

    public void setConfig_storage_topic(String config_storage_topic) {
        this.config_storage_topic = config_storage_topic;
    }

    /**
     * A unique string that identifies the Connect cluster group this worker belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("group_id")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A unique string that identifies the Connect cluster group this worker belongs to.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String group_id;

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    /**
     * The name of the topic where connector and task configuration offsets are stored.This must be the same for all workers with the same group_id.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offset_storage_topic")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the topic where connector and task configuration offsets are stored.This must be the same for all workers with the same group_id.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String offset_storage_topic;

    public String getOffset_storage_topic() {
        return offset_storage_topic;
    }

    public void setOffset_storage_topic(String offset_storage_topic) {
        this.offset_storage_topic = offset_storage_topic;
    }

    /**
     * The name of the topic where connector and task configuration status updates are stored.This must be the same for all workers with the same group_id.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status_storage_topic")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the topic where connector and task configuration status updates are stored.This must be the same for all workers with the same group_id.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String status_storage_topic;

    public String getStatus_storage_topic() {
        return status_storage_topic;
    }

    public void setStatus_storage_topic(String status_storage_topic) {
        this.status_storage_topic = status_storage_topic;
    }
}


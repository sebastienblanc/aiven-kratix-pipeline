package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"conditions","pluginStatus","state","tasksStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaConnectorStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Conditions represent the latest available observations of an kafka connector state
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Conditions represent the latest available observations of an kafka connector state")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.kafkaconnectorstatus.Conditions> conditions;

    public java.util.List<io.aiven.v1alpha1.kafkaconnectorstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.aiven.v1alpha1.kafkaconnectorstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * PluginStatus contains metadata about the configured connector plugin
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pluginStatus")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PluginStatus contains metadata about the configured connector plugin")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaconnectorstatus.PluginStatus pluginStatus;

    public io.aiven.v1alpha1.kafkaconnectorstatus.PluginStatus getPluginStatus() {
        return pluginStatus;
    }

    public void setPluginStatus(io.aiven.v1alpha1.kafkaconnectorstatus.PluginStatus pluginStatus) {
        this.pluginStatus = pluginStatus;
    }

    /**
     * Connector state
     */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Connector state")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * TasksStatus contains metadata about the running tasks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tasksStatus")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TasksStatus contains metadata about the running tasks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.kafkaconnectorstatus.TasksStatus tasksStatus;

    public io.aiven.v1alpha1.kafkaconnectorstatus.TasksStatus getTasksStatus() {
        return tasksStatus;
    }

    public void setTasksStatus(io.aiven.v1alpha1.kafkaconnectorstatus.TasksStatus tasksStatus) {
        this.tasksStatus = tasksStatus;
    }
}


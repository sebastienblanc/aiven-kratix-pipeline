package io.aiven.v1alpha1.opensearchspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"mapping_nested_objects_limit","number_of_replicas","number_of_shards"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Index_template implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The maximum number of nested JSON objects that a single document can contain across all nested types. This limit helps to prevent out of memory errors when a document contains too many nested objects. Default is 10000.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mapping_nested_objects_limit")
    @io.fabric8.generator.annotation.Max(100000.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum number of nested JSON objects that a single document can contain across all nested types. This limit helps to prevent out of memory errors when a document contains too many nested objects. Default is 10000.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long mapping_nested_objects_limit;

    public Long getMapping_nested_objects_limit() {
        return mapping_nested_objects_limit;
    }

    public void setMapping_nested_objects_limit(Long mapping_nested_objects_limit) {
        this.mapping_nested_objects_limit = mapping_nested_objects_limit;
    }

    /**
     * The number of replicas each primary shard has.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("number_of_replicas")
    @io.fabric8.generator.annotation.Max(29.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of replicas each primary shard has.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long number_of_replicas;

    public Long getNumber_of_replicas() {
        return number_of_replicas;
    }

    public void setNumber_of_replicas(Long number_of_replicas) {
        this.number_of_replicas = number_of_replicas;
    }

    /**
     * The number of primary shards that an index should have.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("number_of_shards")
    @io.fabric8.generator.annotation.Max(1024.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of primary shards that an index should have.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long number_of_shards;

    public Long getNumber_of_shards() {
        return number_of_shards;
    }

    public void setNumber_of_shards(Long number_of_shards) {
        this.number_of_shards = number_of_shards;
    }
}


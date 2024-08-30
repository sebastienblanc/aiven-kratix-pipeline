package io.aiven.v1alpha1.serviceintegrationspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"elasticsearch_index_days_max","elasticsearch_index_prefix"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Logs implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Elasticsearch index retention limit
     */
    @com.fasterxml.jackson.annotation.JsonProperty("elasticsearch_index_days_max")
    @io.fabric8.generator.annotation.Max(10000.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Elasticsearch index retention limit")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long elasticsearch_index_days_max;

    public Long getElasticsearch_index_days_max() {
        return elasticsearch_index_days_max;
    }

    public void setElasticsearch_index_days_max(Long elasticsearch_index_days_max) {
        this.elasticsearch_index_days_max = elasticsearch_index_days_max;
    }

    /**
     * Elasticsearch index prefix
     */
    @com.fasterxml.jackson.annotation.JsonProperty("elasticsearch_index_prefix")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Elasticsearch index prefix")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String elasticsearch_index_prefix;

    public String getElasticsearch_index_prefix() {
        return elasticsearch_index_prefix;
    }

    public void setElasticsearch_index_prefix(String elasticsearch_index_prefix) {
        this.elasticsearch_index_prefix = elasticsearch_index_prefix;
    }
}


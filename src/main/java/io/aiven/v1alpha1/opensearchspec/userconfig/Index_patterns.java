package io.aiven.v1alpha1.opensearchspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"max_index_count","pattern","sorting_algorithm"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Index_patterns implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Maximum number of indexes to keep
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max_index_count")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum number of indexes to keep")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long max_index_count;

    public Long getMax_index_count() {
        return max_index_count;
    }

    public void setMax_index_count(Long max_index_count) {
        this.max_index_count = max_index_count;
    }

    /**
     * fnmatch pattern
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^[A-Za-z0-9-_.*?]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fnmatch pattern")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public enum Sorting_algorithm {

        @com.fasterxml.jackson.annotation.JsonProperty("alphabetical")
        ALPHABETICAL("alphabetical"), @com.fasterxml.jackson.annotation.JsonProperty("creation_date")
        CREATION_DATE("creation_date");

        java.lang.String value;

        Sorting_algorithm(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Deletion sorting algorithm
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sorting_algorithm")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deletion sorting algorithm")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Sorting_algorithm sorting_algorithm;

    public Sorting_algorithm getSorting_algorithm() {
        return sorting_algorithm;
    }

    public void setSorting_algorithm(Sorting_algorithm sorting_algorithm) {
        this.sorting_algorithm = sorting_algorithm;
    }
}


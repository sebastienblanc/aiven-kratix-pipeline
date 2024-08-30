package io.aiven.v1alpha1.serviceintegrationspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"tables"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ClickhouseKafka implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Tables to create
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tables")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Tables to create")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.serviceintegrationspec.clickhousekafka.Tables> tables;

    public java.util.List<io.aiven.v1alpha1.serviceintegrationspec.clickhousekafka.Tables> getTables() {
        return tables;
    }

    public void setTables(java.util.List<io.aiven.v1alpha1.serviceintegrationspec.clickhousekafka.Tables> tables) {
        this.tables = tables;
    }
}


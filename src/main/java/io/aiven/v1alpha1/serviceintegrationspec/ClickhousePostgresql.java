package io.aiven.v1alpha1.serviceintegrationspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"databases"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ClickhousePostgresql implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Databases to expose
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databases")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Databases to expose")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.serviceintegrationspec.clickhousepostgresql.Databases> databases;

    public java.util.List<io.aiven.v1alpha1.serviceintegrationspec.clickhousepostgresql.Databases> getDatabases() {
        return databases;
    }

    public void setDatabases(java.util.List<io.aiven.v1alpha1.serviceintegrationspec.clickhousepostgresql.Databases> databases) {
        this.databases = databases;
    }
}


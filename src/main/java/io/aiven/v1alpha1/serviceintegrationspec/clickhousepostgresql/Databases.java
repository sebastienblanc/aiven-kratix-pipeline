package io.aiven.v1alpha1.serviceintegrationspec.clickhousepostgresql;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"database","schema"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Databases implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * PostgreSQL database to expose
     */
    @com.fasterxml.jackson.annotation.JsonProperty("database")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL database to expose")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String database;

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * PostgreSQL schema to expose
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL schema to expose")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String schema;

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}


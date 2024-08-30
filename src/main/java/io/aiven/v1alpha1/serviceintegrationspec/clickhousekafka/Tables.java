package io.aiven.v1alpha1.serviceintegrationspec.clickhousekafka;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"columns","data_format","group_name","name","topics"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Tables implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Table columns
     */
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Table columns")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.serviceintegrationspec.clickhousekafka.tables.Columns> columns;

    public java.util.List<io.aiven.v1alpha1.serviceintegrationspec.clickhousekafka.tables.Columns> getColumns() {
        return columns;
    }

    public void setColumns(java.util.List<io.aiven.v1alpha1.serviceintegrationspec.clickhousekafka.tables.Columns> columns) {
        this.columns = columns;
    }

    public enum Data_format {

        @com.fasterxml.jackson.annotation.JsonProperty("Avro")
        AVRO("Avro"),
        @com.fasterxml.jackson.annotation.JsonProperty("CSV")
        CSV("CSV"),
        @com.fasterxml.jackson.annotation.JsonProperty("JSONAsString")
        JSONASSTRING("JSONAsString"),
        @com.fasterxml.jackson.annotation.JsonProperty("JSONCompactEachRow")
        JSONCOMPACTEACHROW("JSONCompactEachRow"),
        @com.fasterxml.jackson.annotation.JsonProperty("JSONCompactStringsEachRow")
        JSONCOMPACTSTRINGSEACHROW("JSONCompactStringsEachRow"),
        @com.fasterxml.jackson.annotation.JsonProperty("JSONEachRow")
        JSONEACHROW("JSONEachRow"),
        @com.fasterxml.jackson.annotation.JsonProperty("JSONStringsEachRow")
        JSONSTRINGSEACHROW("JSONStringsEachRow"),
        @com.fasterxml.jackson.annotation.JsonProperty("MsgPack")
        MSGPACK("MsgPack"),
        @com.fasterxml.jackson.annotation.JsonProperty("TSKV")
        TSKV("TSKV"),
        @com.fasterxml.jackson.annotation.JsonProperty("TSV")
        TSV("TSV"),
        @com.fasterxml.jackson.annotation.JsonProperty("TabSeparated")
        TABSEPARATED("TabSeparated"),
        @com.fasterxml.jackson.annotation.JsonProperty("RawBLOB")
        RAWBLOB("RawBLOB");

        java.lang.String value;

        Data_format(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Message data format
     */
    @com.fasterxml.jackson.annotation.JsonProperty("data_format")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Message data format")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Data_format data_format;

    public Data_format getData_format() {
        return data_format;
    }

    public void setData_format(Data_format data_format) {
        this.data_format = data_format;
    }

    /**
     * Kafka consumers group
     */
    @com.fasterxml.jackson.annotation.JsonProperty("group_name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka consumers group")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String group_name;

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    /**
     * Name of the table
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the table")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Kafka topics
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topics")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka topics")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.serviceintegrationspec.clickhousekafka.tables.Topics> topics;

    public java.util.List<io.aiven.v1alpha1.serviceintegrationspec.clickhousekafka.tables.Topics> getTopics() {
        return topics;
    }

    public void setTopics(java.util.List<io.aiven.v1alpha1.serviceintegrationspec.clickhousekafka.tables.Topics> topics) {
        this.topics = topics;
    }
}


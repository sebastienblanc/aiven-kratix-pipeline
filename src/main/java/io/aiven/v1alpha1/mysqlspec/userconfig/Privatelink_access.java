package io.aiven.v1alpha1.mysqlspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"mysql","mysqlx","prometheus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Privatelink_access implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enable mysql
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysql")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable mysql")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean mysql;

    public Boolean getMysql() {
        return mysql;
    }

    public void setMysql(Boolean mysql) {
        this.mysql = mysql;
    }

    /**
     * Enable mysqlx
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlx")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable mysqlx")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean mysqlx;

    public Boolean getMysqlx() {
        return mysqlx;
    }

    public void setMysqlx(Boolean mysqlx) {
        this.mysqlx = mysqlx;
    }

    /**
     * Enable prometheus
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prometheus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable prometheus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean prometheus;

    public Boolean getPrometheus() {
        return prometheus;
    }

    public void setPrometheus(Boolean prometheus) {
        this.prometheus = prometheus;
    }
}


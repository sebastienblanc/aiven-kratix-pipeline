package io.aiven.v1alpha1.cassandraspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"batch_size_fail_threshold_in_kb","batch_size_warn_threshold_in_kb","datacenter"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Cassandra implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Fail any multiple-partition batch exceeding this value. 50kb (10x warn threshold) by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("batch_size_fail_threshold_in_kb")
    @io.fabric8.generator.annotation.Max(1000000.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Fail any multiple-partition batch exceeding this value. 50kb (10x warn threshold) by default.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long batch_size_fail_threshold_in_kb;

    public Long getBatch_size_fail_threshold_in_kb() {
        return batch_size_fail_threshold_in_kb;
    }

    public void setBatch_size_fail_threshold_in_kb(Long batch_size_fail_threshold_in_kb) {
        this.batch_size_fail_threshold_in_kb = batch_size_fail_threshold_in_kb;
    }

    /**
     * Log a warning message on any multiple-partition batch size exceeding this value.5kb per batch by default.Caution should be taken on increasing the size of this thresholdas it can lead to node instability.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("batch_size_warn_threshold_in_kb")
    @io.fabric8.generator.annotation.Max(1000000.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Log a warning message on any multiple-partition batch size exceeding this value.5kb per batch by default.Caution should be taken on increasing the size of this thresholdas it can lead to node instability.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long batch_size_warn_threshold_in_kb;

    public Long getBatch_size_warn_threshold_in_kb() {
        return batch_size_warn_threshold_in_kb;
    }

    public void setBatch_size_warn_threshold_in_kb(Long batch_size_warn_threshold_in_kb) {
        this.batch_size_warn_threshold_in_kb = batch_size_warn_threshold_in_kb;
    }

    /**
     * Name of the datacenter to which nodes of this service belong. Can be set only when creating the service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("datacenter")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the datacenter to which nodes of this service belong. Can be set only when creating the service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String datacenter;

    public String getDatacenter() {
        return datacenter;
    }

    public void setDatacenter(String datacenter) {
        this.datacenter = datacenter;
    }
}


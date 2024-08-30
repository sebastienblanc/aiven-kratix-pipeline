package io.aiven.v1alpha1.serviceintegrationspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"dropped_metrics","extra_metrics"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ExternalAWSCloudwatchMetrics implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Metrics to not send to AWS CloudWatch (takes precedence over extra_metrics)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dropped_metrics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metrics to not send to AWS CloudWatch (takes precedence over extra_metrics)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.serviceintegrationspec.externalawscloudwatchmetrics.Dropped_metrics> dropped_metrics;

    public java.util.List<io.aiven.v1alpha1.serviceintegrationspec.externalawscloudwatchmetrics.Dropped_metrics> getDropped_metrics() {
        return dropped_metrics;
    }

    public void setDropped_metrics(java.util.List<io.aiven.v1alpha1.serviceintegrationspec.externalawscloudwatchmetrics.Dropped_metrics> dropped_metrics) {
        this.dropped_metrics = dropped_metrics;
    }

    /**
     * Metrics to allow through to AWS CloudWatch (in addition to default metrics)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extra_metrics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metrics to allow through to AWS CloudWatch (in addition to default metrics)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.aiven.v1alpha1.serviceintegrationspec.externalawscloudwatchmetrics.Extra_metrics> extra_metrics;

    public java.util.List<io.aiven.v1alpha1.serviceintegrationspec.externalawscloudwatchmetrics.Extra_metrics> getExtra_metrics() {
        return extra_metrics;
    }

    public void setExtra_metrics(java.util.List<io.aiven.v1alpha1.serviceintegrationspec.externalawscloudwatchmetrics.Extra_metrics> extra_metrics) {
        this.extra_metrics = extra_metrics;
    }
}


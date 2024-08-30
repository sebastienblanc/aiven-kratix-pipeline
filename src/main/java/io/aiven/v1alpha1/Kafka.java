package io.aiven.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("aiven.io")
@io.fabric8.kubernetes.model.annotation.Singular("kafka")
@io.fabric8.kubernetes.model.annotation.Plural("kafkas")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Kafka extends io.fabric8.kubernetes.client.CustomResource<io.aiven.v1alpha1.KafkaSpec, io.aiven.v1alpha1.KafkaStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}


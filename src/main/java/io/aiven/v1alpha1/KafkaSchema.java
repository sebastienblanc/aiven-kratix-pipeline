package io.aiven.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("aiven.io")
@io.fabric8.kubernetes.model.annotation.Singular("kafkaschema")
@io.fabric8.kubernetes.model.annotation.Plural("kafkaschemas")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaSchema extends io.fabric8.kubernetes.client.CustomResource<io.aiven.v1alpha1.KafkaSchemaSpec, io.aiven.v1alpha1.KafkaSchemaStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}


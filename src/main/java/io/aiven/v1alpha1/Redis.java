package io.aiven.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("aiven.io")
@io.fabric8.kubernetes.model.annotation.Singular("redis")
@io.fabric8.kubernetes.model.annotation.Plural("redis")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Redis extends io.fabric8.kubernetes.client.CustomResource<io.aiven.v1alpha1.RedisSpec, io.aiven.v1alpha1.RedisStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}


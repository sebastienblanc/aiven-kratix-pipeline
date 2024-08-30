package io.aiven.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("aiven.io")
@io.fabric8.kubernetes.model.annotation.Singular("database")
@io.fabric8.kubernetes.model.annotation.Plural("databases")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Database extends io.fabric8.kubernetes.client.CustomResource<io.aiven.v1alpha1.DatabaseSpec, io.aiven.v1alpha1.DatabaseStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}


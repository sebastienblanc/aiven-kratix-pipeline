package io.aiven.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("aiven.io")
@io.fabric8.kubernetes.model.annotation.Singular("postgresql")
@io.fabric8.kubernetes.model.annotation.Plural("postgresqls")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PostgreSQL extends io.fabric8.kubernetes.client.CustomResource<io.aiven.v1alpha1.PostgreSQLSpec, io.aiven.v1alpha1.PostgreSQLStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}


package io.aiven.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("aiven.io")
@io.fabric8.kubernetes.model.annotation.Singular("serviceuser")
@io.fabric8.kubernetes.model.annotation.Plural("serviceusers")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ServiceUser extends io.fabric8.kubernetes.client.CustomResource<io.aiven.v1alpha1.ServiceUserSpec, io.aiven.v1alpha1.ServiceUserStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}


package io.aiven.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("aiven.io")
@io.fabric8.kubernetes.model.annotation.Singular("project")
@io.fabric8.kubernetes.model.annotation.Plural("projects")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Project extends io.fabric8.kubernetes.client.CustomResource<io.aiven.v1alpha1.ProjectSpec, io.aiven.v1alpha1.ProjectStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}


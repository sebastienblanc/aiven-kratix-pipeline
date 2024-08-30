package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authSecretRef","lcCollate","lcCtype","project","serviceName","terminationProtection"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DatabaseSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication reference to Aiven token in a secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication reference to Aiven token in a secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.databasespec.AuthSecretRef authSecretRef;

    public io.aiven.v1alpha1.databasespec.AuthSecretRef getAuthSecretRef() {
        return authSecretRef;
    }

    public void setAuthSecretRef(io.aiven.v1alpha1.databasespec.AuthSecretRef authSecretRef) {
        this.authSecretRef = authSecretRef;
    }

    /**
     * Default string sort order (LC_COLLATE) of the database. Default value: en_US.UTF-8
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lcCollate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Default string sort order (LC_COLLATE) of the database. Default value: en_US.UTF-8")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String lcCollate;

    public String getLcCollate() {
        return lcCollate;
    }

    public void setLcCollate(String lcCollate) {
        this.lcCollate = lcCollate;
    }

    /**
     * Default character classification (LC_CTYPE) of the database. Default value: en_US.UTF-8
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lcCtype")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Default character classification (LC_CTYPE) of the database. Default value: en_US.UTF-8")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String lcCtype;

    public String getLcCtype() {
        return lcCtype;
    }

    public void setLcCtype(String lcCtype) {
        this.lcCtype = lcCtype;
    }

    /**
     * Project to link the database to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Project to link the database to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * PostgreSQL service to link the database to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostgreSQL service to link the database to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceName;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * It is a Kubernetes side deletion protections, which prevents the database from being deleted by Kubernetes. It is recommended to enable this for any production databases containing critical data.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("terminationProtection")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("It is a Kubernetes side deletion protections, which prevents the database from being deleted by Kubernetes. It is recommended to enable this for any production databases containing critical data.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean terminationProtection;

    public Boolean getTerminationProtection() {
        return terminationProtection;
    }

    public void setTerminationProtection(Boolean terminationProtection) {
        this.terminationProtection = terminationProtection;
    }
}


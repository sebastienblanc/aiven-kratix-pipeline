package io.aiven.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authSecretRef","authentication","connInfoSecretTarget","project","serviceName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ServiceUserSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication reference to Aiven token in a secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication reference to Aiven token in a secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceuserspec.AuthSecretRef authSecretRef;

    public io.aiven.v1alpha1.serviceuserspec.AuthSecretRef getAuthSecretRef() {
        return authSecretRef;
    }

    public void setAuthSecretRef(io.aiven.v1alpha1.serviceuserspec.AuthSecretRef authSecretRef) {
        this.authSecretRef = authSecretRef;
    }

    public enum Authentication {

        @com.fasterxml.jackson.annotation.JsonProperty("caching_sha2_password")
        CACHING_SHA2_PASSWORD("caching_sha2_password"), @com.fasterxml.jackson.annotation.JsonProperty("mysql_native_password")
        MYSQL_NATIVE_PASSWORD("mysql_native_password");

        java.lang.String value;

        Authentication(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Authentication details
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication details")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Authentication authentication;

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    /**
     * Information regarding secret creation. Exposed keys: `SERVICEUSER_HOST`, `SERVICEUSER_PORT`, `SERVICEUSER_USERNAME`, `SERVICEUSER_PASSWORD`, `SERVICEUSER_CA_CERT`, `SERVICEUSER_ACCESS_CERT`, `SERVICEUSER_ACCESS_KEY`
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connInfoSecretTarget")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Information regarding secret creation. Exposed keys: `SERVICEUSER_HOST`, `SERVICEUSER_PORT`, `SERVICEUSER_USERNAME`, `SERVICEUSER_PASSWORD`, `SERVICEUSER_CA_CERT`, `SERVICEUSER_ACCESS_CERT`, `SERVICEUSER_ACCESS_KEY`")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.aiven.v1alpha1.serviceuserspec.ConnInfoSecretTarget connInfoSecretTarget;

    public io.aiven.v1alpha1.serviceuserspec.ConnInfoSecretTarget getConnInfoSecretTarget() {
        return connInfoSecretTarget;
    }

    public void setConnInfoSecretTarget(io.aiven.v1alpha1.serviceuserspec.ConnInfoSecretTarget connInfoSecretTarget) {
        this.connInfoSecretTarget = connInfoSecretTarget;
    }

    /**
     * Project to link the user to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Project to link the user to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * Service to link the user to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Service to link the user to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceName;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}


package io.aiven.v1alpha1.opensearchspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"enabled","idp_entity_id","idp_metadata_url","idp_pemtrustedcas_content","roles_key","sp_entity_id","subject_key"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Saml implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enables or disables SAML-based authentication for OpenSearch. When enabled, users can authenticate using SAML with an Identity Provider.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enables or disables SAML-based authentication for OpenSearch. When enabled, users can authenticate using SAML with an Identity Provider.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * The unique identifier for the Identity Provider (IdP) entity that is used for SAML authentication. This value is typically provided by the IdP.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idp_entity_id")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The unique identifier for the Identity Provider (IdP) entity that is used for SAML authentication. This value is typically provided by the IdP.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String idp_entity_id;

    public String getIdp_entity_id() {
        return idp_entity_id;
    }

    public void setIdp_entity_id(String idp_entity_id) {
        this.idp_entity_id = idp_entity_id;
    }

    /**
     * The URL of the SAML metadata for the Identity Provider (IdP). This is used to configure SAML-based authentication with the IdP.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idp_metadata_url")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The URL of the SAML metadata for the Identity Provider (IdP). This is used to configure SAML-based authentication with the IdP.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String idp_metadata_url;

    public String getIdp_metadata_url() {
        return idp_metadata_url;
    }

    public void setIdp_metadata_url(String idp_metadata_url) {
        this.idp_metadata_url = idp_metadata_url;
    }

    /**
     * This parameter specifies the PEM-encoded root certificate authority (CA) content for the SAML identity provider (IdP) server verification. The root CA content is used to verify the SSL/TLS certificate presented by the server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idp_pemtrustedcas_content")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This parameter specifies the PEM-encoded root certificate authority (CA) content for the SAML identity provider (IdP) server verification. The root CA content is used to verify the SSL/TLS certificate presented by the server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String idp_pemtrustedcas_content;

    public String getIdp_pemtrustedcas_content() {
        return idp_pemtrustedcas_content;
    }

    public void setIdp_pemtrustedcas_content(String idp_pemtrustedcas_content) {
        this.idp_pemtrustedcas_content = idp_pemtrustedcas_content;
    }

    /**
     * Optional. Specifies the attribute in the SAML response where role information is stored, if available. Role attributes are not required for SAML authentication, but can be included in SAML assertions by most Identity Providers (IdPs) to determine user access levels or permissions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("roles_key")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional. Specifies the attribute in the SAML response where role information is stored, if available. Role attributes are not required for SAML authentication, but can be included in SAML assertions by most Identity Providers (IdPs) to determine user access levels or permissions.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String roles_key;

    public String getRoles_key() {
        return roles_key;
    }

    public void setRoles_key(String roles_key) {
        this.roles_key = roles_key;
    }

    /**
     * The unique identifier for the Service Provider (SP) entity that is used for SAML authentication. This value is typically provided by the SP.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sp_entity_id")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The unique identifier for the Service Provider (SP) entity that is used for SAML authentication. This value is typically provided by the SP.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sp_entity_id;

    public String getSp_entity_id() {
        return sp_entity_id;
    }

    public void setSp_entity_id(String sp_entity_id) {
        this.sp_entity_id = sp_entity_id;
    }

    /**
     * Optional. Specifies the attribute in the SAML response where the subject identifier is stored. If not configured, the NameID attribute is used by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject_key")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional. Specifies the attribute in the SAML response where the subject identifier is stored. If not configured, the NameID attribute is used by default.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String subject_key;

    public String getSubject_key() {
        return subject_key;
    }

    public void setSubject_key(String subject_key) {
        this.subject_key = subject_key;
    }
}


package io.aiven.v1alpha1.grafanaspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allow_sign_up","allowed_domains","allowed_organizations","api_url","auth_url","client_id","client_secret","name","scopes","token_url"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Auth_generic_oauth implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Automatically sign-up users on successful sign-in
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allow_sign_up")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Automatically sign-up users on successful sign-in")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean allow_sign_up;

    public Boolean getAllow_sign_up() {
        return allow_sign_up;
    }

    public void setAllow_sign_up(Boolean allow_sign_up) {
        this.allow_sign_up = allow_sign_up;
    }

    /**
     * Allowed domains
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowed_domains")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allowed domains")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> allowed_domains;

    public java.util.List<String> getAllowed_domains() {
        return allowed_domains;
    }

    public void setAllowed_domains(java.util.List<String> allowed_domains) {
        this.allowed_domains = allowed_domains;
    }

    /**
     * Require user to be member of one of the listed organizations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowed_organizations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Require user to be member of one of the listed organizations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> allowed_organizations;

    public java.util.List<String> getAllowed_organizations() {
        return allowed_organizations;
    }

    public void setAllowed_organizations(java.util.List<String> allowed_organizations) {
        this.allowed_organizations = allowed_organizations;
    }

    /**
     * API URL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("api_url")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("API URL")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String api_url;

    public String getApi_url() {
        return api_url;
    }

    public void setApi_url(String api_url) {
        this.api_url = api_url;
    }

    /**
     * Authorization URL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auth_url")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authorization URL")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String auth_url;

    public String getAuth_url() {
        return auth_url;
    }

    public void setAuth_url(String auth_url) {
        this.auth_url = auth_url;
    }

    /**
     * Client ID from provider
     */
    @com.fasterxml.jackson.annotation.JsonProperty("client_id")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^[\\040-\\176]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Client ID from provider")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String client_id;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    /**
     * Client secret from provider
     */
    @com.fasterxml.jackson.annotation.JsonProperty("client_secret")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^[\\040-\\176]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Client secret from provider")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String client_secret;

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    /**
     * Name of the OAuth integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Pattern("^[a-zA-Z0-9_\\- ]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the OAuth integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * OAuth scopes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OAuth scopes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> scopes;

    public java.util.List<String> getScopes() {
        return scopes;
    }

    public void setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
    }

    /**
     * Token URL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("token_url")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Token URL")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String token_url;

    public String getToken_url() {
        return token_url;
    }

    public void setToken_url(String token_url) {
        this.token_url = token_url;
    }
}


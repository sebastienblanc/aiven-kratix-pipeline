package io.aiven.v1alpha1.grafanaspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allow_sign_up","allowed_organizations","client_id","client_secret","team_ids"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Auth_github implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
     * Require users to belong to one of given organizations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowed_organizations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Require users to belong to one of given organizations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> allowed_organizations;

    public java.util.List<String> getAllowed_organizations() {
        return allowed_organizations;
    }

    public void setAllowed_organizations(java.util.List<String> allowed_organizations) {
        this.allowed_organizations = allowed_organizations;
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
     * Require users to belong to one of given team IDs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("team_ids")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Require users to belong to one of given team IDs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<Long> team_ids;

    public java.util.List<Long> getTeam_ids() {
        return team_ids;
    }

    public void setTeam_ids(java.util.List<Long> team_ids) {
        this.team_ids = team_ids;
    }
}


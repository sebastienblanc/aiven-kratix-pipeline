package io.aiven.v1alpha1.grafanaspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"from_address","from_name","host","password","port","skip_verify","starttls_policy","username"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Smtp_server implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Address used for sending emails
     */
    @com.fasterxml.jackson.annotation.JsonProperty("from_address")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^[A-Za-z0-9_\\-\\.+\\'&]+@(([\\da-zA-Z])([_\\w-]{,62})\\.){,127}(([\\da-zA-Z])[_\\w-]{,61})?([\\da-zA-Z]\\.((xn\\-\\-[a-zA-Z\\d]+)|([a-zA-Z\\d]{2,})))$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Address used for sending emails")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String from_address;

    public String getFrom_address() {
        return from_address;
    }

    public void setFrom_address(String from_address) {
        this.from_address = from_address;
    }

    /**
     * Name used in outgoing emails, defaults to Grafana
     */
    @com.fasterxml.jackson.annotation.JsonProperty("from_name")
    @io.fabric8.generator.annotation.Pattern("^[^\\x00-\\x1F]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name used in outgoing emails, defaults to Grafana")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String from_name;

    public String getFrom_name() {
        return from_name;
    }

    public void setFrom_name(String from_name) {
        this.from_name = from_name;
    }

    /**
     * Server hostname or IP
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Server hostname or IP")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Password for SMTP authentication
     */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    @io.fabric8.generator.annotation.Pattern("^[^\\x00-\\x1F]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Password for SMTP authentication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * SMTP server port
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Max(65535.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SMTP server port")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long port;

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    /**
     * Skip verifying server certificate. Defaults to false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skip_verify")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Skip verifying server certificate. Defaults to false")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean skip_verify;

    public Boolean getSkip_verify() {
        return skip_verify;
    }

    public void setSkip_verify(Boolean skip_verify) {
        this.skip_verify = skip_verify;
    }

    public enum Starttls_policy {

        @com.fasterxml.jackson.annotation.JsonProperty("OpportunisticStartTLS")
        OPPORTUNISTICSTARTTLS("OpportunisticStartTLS"), @com.fasterxml.jackson.annotation.JsonProperty("MandatoryStartTLS")
        MANDATORYSTARTTLS("MandatoryStartTLS"), @com.fasterxml.jackson.annotation.JsonProperty("NoStartTLS")
        NOSTARTTLS("NoStartTLS");

        java.lang.String value;

        Starttls_policy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Either OpportunisticStartTLS, MandatoryStartTLS or NoStartTLS. Default is OpportunisticStartTLS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("starttls_policy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Either OpportunisticStartTLS, MandatoryStartTLS or NoStartTLS. Default is OpportunisticStartTLS.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Starttls_policy starttls_policy;

    public Starttls_policy getStarttls_policy() {
        return starttls_policy;
    }

    public void setStarttls_policy(Starttls_policy starttls_policy) {
        this.starttls_policy = starttls_policy;
    }

    /**
     * Username for SMTP authentication
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    @io.fabric8.generator.annotation.Pattern("^[^\\x00-\\x1F]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Username for SMTP authentication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


package io.aiven.v1alpha1.grafanaspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"access_key","bucket_url","provider","secret_key"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class External_image_storage implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * S3 access key. Requires permissions to the S3 bucket for the s3:PutObject and s3:PutObjectAcl actions
     */
    @com.fasterxml.jackson.annotation.JsonProperty("access_key")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^[A-Z0-9]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("S3 access key. Requires permissions to the S3 bucket for the s3:PutObject and s3:PutObjectAcl actions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String access_key;

    public String getAccess_key() {
        return access_key;
    }

    public void setAccess_key(String access_key) {
        this.access_key = access_key;
    }

    /**
     * Bucket URL for S3
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bucket_url")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Bucket URL for S3")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String bucket_url;

    public String getBucket_url() {
        return bucket_url;
    }

    public void setBucket_url(String bucket_url) {
        this.bucket_url = bucket_url;
    }

    public enum Provider {

        @com.fasterxml.jackson.annotation.JsonProperty("s3")
        S3("s3");

        java.lang.String value;

        Provider(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Provider type
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Provider type")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Provider provider;

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    /**
     * S3 secret key
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret_key")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^[A-Za-z0-9/+=]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("S3 secret key")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secret_key;

    public String getSecret_key() {
        return secret_key;
    }

    public void setSecret_key(String secret_key) {
        this.secret_key = secret_key;
    }
}


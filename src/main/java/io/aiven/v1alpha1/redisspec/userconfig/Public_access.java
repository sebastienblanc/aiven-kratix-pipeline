package io.aiven.v1alpha1.redisspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"prometheus","redis"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Public_access implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prometheus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean prometheus;

    public Boolean getPrometheus() {
        return prometheus;
    }

    public void setPrometheus(Boolean prometheus) {
        this.prometheus = prometheus;
    }

    /**
     * Allow clients to connect to redis from the public internet for service nodes that are in a project VPC or another type of private network
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allow clients to connect to redis from the public internet for service nodes that are in a project VPC or another type of private network")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean redis;

    public Boolean getRedis() {
        return redis;
    }

    public void setRedis(Boolean redis) {
        this.redis = redis;
    }
}


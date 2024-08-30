package io.aiven.v1alpha1.grafanaspec.userconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"default_timezone","full_date","interval_day","interval_hour","interval_minute","interval_month","interval_second","interval_year"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Date_formats implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Default time zone for user preferences. Value 'browser' uses browser local time zone.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("default_timezone")
    @io.fabric8.generator.annotation.Pattern("(?i)^([a-zA-Z_]+/){1,2}[a-zA-Z_-]+$|^(Etc/)?(UTC|GMT)([+-](\\d){1,2})?$|^(Factory)$|^(browser)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Default time zone for user preferences. Value 'browser' uses browser local time zone.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String default_timezone;

    public String getDefault_timezone() {
        return default_timezone;
    }

    public void setDefault_timezone(String default_timezone) {
        this.default_timezone = default_timezone;
    }

    /**
     * Moment.js style format string for cases where full date is shown
     */
    @com.fasterxml.jackson.annotation.JsonProperty("full_date")
    @io.fabric8.generator.annotation.Pattern("^(([Hh]mm(ss)?|Mo|MM?M?M?|Do|DDDo|DD?D?D?|ddd?d?|do?|w[o|w]?|W[o|W]?|Qo?|N{1,5}|YYYYYY|YYYYY|YYYY|YY|y{2,4}|yo?|gg(ggg?)?|GG(GGG?)?|e|E|a|A|hh?|HH?|kk?|mm?|ss?|S{1,9}|x|X|zz?|ZZ?|LTS|LT|LL?L?L?|l{1,4}|[-+/T,;.: ]?)*)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Moment.js style format string for cases where full date is shown")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String full_date;

    public String getFull_date() {
        return full_date;
    }

    public void setFull_date(String full_date) {
        this.full_date = full_date;
    }

    /**
     * Moment.js style format string used when a time requiring day accuracy is shown
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interval_day")
    @io.fabric8.generator.annotation.Pattern("^(([Hh]mm(ss)?|Mo|MM?M?M?|Do|DDDo|DD?D?D?|ddd?d?|do?|w[o|w]?|W[o|W]?|Qo?|N{1,5}|YYYYYY|YYYYY|YYYY|YY|y{2,4}|yo?|gg(ggg?)?|GG(GGG?)?|e|E|a|A|hh?|HH?|kk?|mm?|ss?|S{1,9}|x|X|zz?|ZZ?|LTS|LT|LL?L?L?|l{1,4}|[-+/T,;.: ]?)*)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Moment.js style format string used when a time requiring day accuracy is shown")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String interval_day;

    public String getInterval_day() {
        return interval_day;
    }

    public void setInterval_day(String interval_day) {
        this.interval_day = interval_day;
    }

    /**
     * Moment.js style format string used when a time requiring hour accuracy is shown
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interval_hour")
    @io.fabric8.generator.annotation.Pattern("^(([Hh]mm(ss)?|Mo|MM?M?M?|Do|DDDo|DD?D?D?|ddd?d?|do?|w[o|w]?|W[o|W]?|Qo?|N{1,5}|YYYYYY|YYYYY|YYYY|YY|y{2,4}|yo?|gg(ggg?)?|GG(GGG?)?|e|E|a|A|hh?|HH?|kk?|mm?|ss?|S{1,9}|x|X|zz?|ZZ?|LTS|LT|LL?L?L?|l{1,4}|[-+/T,;.: ]?)*)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Moment.js style format string used when a time requiring hour accuracy is shown")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String interval_hour;

    public String getInterval_hour() {
        return interval_hour;
    }

    public void setInterval_hour(String interval_hour) {
        this.interval_hour = interval_hour;
    }

    /**
     * Moment.js style format string used when a time requiring minute accuracy is shown
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interval_minute")
    @io.fabric8.generator.annotation.Pattern("^(([Hh]mm(ss)?|Mo|MM?M?M?|Do|DDDo|DD?D?D?|ddd?d?|do?|w[o|w]?|W[o|W]?|Qo?|N{1,5}|YYYYYY|YYYYY|YYYY|YY|y{2,4}|yo?|gg(ggg?)?|GG(GGG?)?|e|E|a|A|hh?|HH?|kk?|mm?|ss?|S{1,9}|x|X|zz?|ZZ?|LTS|LT|LL?L?L?|l{1,4}|[-+/T,;.: ]?)*)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Moment.js style format string used when a time requiring minute accuracy is shown")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String interval_minute;

    public String getInterval_minute() {
        return interval_minute;
    }

    public void setInterval_minute(String interval_minute) {
        this.interval_minute = interval_minute;
    }

    /**
     * Moment.js style format string used when a time requiring month accuracy is shown
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interval_month")
    @io.fabric8.generator.annotation.Pattern("^(([Hh]mm(ss)?|Mo|MM?M?M?|Do|DDDo|DD?D?D?|ddd?d?|do?|w[o|w]?|W[o|W]?|Qo?|N{1,5}|YYYYYY|YYYYY|YYYY|YY|y{2,4}|yo?|gg(ggg?)?|GG(GGG?)?|e|E|a|A|hh?|HH?|kk?|mm?|ss?|S{1,9}|x|X|zz?|ZZ?|LTS|LT|LL?L?L?|l{1,4}|[-+/T,;.: ]?)*)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Moment.js style format string used when a time requiring month accuracy is shown")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String interval_month;

    public String getInterval_month() {
        return interval_month;
    }

    public void setInterval_month(String interval_month) {
        this.interval_month = interval_month;
    }

    /**
     * Moment.js style format string used when a time requiring second accuracy is shown
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interval_second")
    @io.fabric8.generator.annotation.Pattern("^(([Hh]mm(ss)?|Mo|MM?M?M?|Do|DDDo|DD?D?D?|ddd?d?|do?|w[o|w]?|W[o|W]?|Qo?|N{1,5}|YYYYYY|YYYYY|YYYY|YY|y{2,4}|yo?|gg(ggg?)?|GG(GGG?)?|e|E|a|A|hh?|HH?|kk?|mm?|ss?|S{1,9}|x|X|zz?|ZZ?|LTS|LT|LL?L?L?|l{1,4}|[-+/T,;.: ]?)*)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Moment.js style format string used when a time requiring second accuracy is shown")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String interval_second;

    public String getInterval_second() {
        return interval_second;
    }

    public void setInterval_second(String interval_second) {
        this.interval_second = interval_second;
    }

    /**
     * Moment.js style format string used when a time requiring year accuracy is shown
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interval_year")
    @io.fabric8.generator.annotation.Pattern("^(([Hh]mm(ss)?|Mo|MM?M?M?|Do|DDDo|DD?D?D?|ddd?d?|do?|w[o|w]?|W[o|W]?|Qo?|N{1,5}|YYYYYY|YYYYY|YYYY|YY|y{2,4}|yo?|gg(ggg?)?|GG(GGG?)?|e|E|a|A|hh?|HH?|kk?|mm?|ss?|S{1,9}|x|X|zz?|ZZ?|LTS|LT|LL?L?L?|l{1,4}|[-+/T,;.: ]?)*)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Moment.js style format string used when a time requiring year accuracy is shown")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String interval_year;

    public String getInterval_year() {
        return interval_year;
    }

    public void setInterval_year(String interval_year) {
        this.interval_year = interval_year;
    }
}


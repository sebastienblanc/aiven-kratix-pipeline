package org.sebi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;

@Group("org.sebi")
@Version("v1alpha1")
@ShortNames("db")
public class Database extends CustomResource<DatabaseSpec, DatabaseStatus> implements Namespaced {}

class DatabaseSpec {

    private String type; 

    private String project;

    private String plan;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    
  
}

@JsonIgnoreProperties(ignoreUnknown = true)
class DatabaseStatus {
  
}

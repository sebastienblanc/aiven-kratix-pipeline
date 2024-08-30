package org.sebi;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;

import io.aiven.v1alpha1.MySQL;
import io.aiven.v1alpha1.PostgreSQL;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {

    public static void main(String... args) {
        Quarkus.run(MyApp.class, args);
    }

    public static class MyApp implements QuarkusApplication {

        @ConfigProperty(name = "input.path", defaultValue = "src/main/resources")
        String inputPath;

        @ConfigProperty(name = "output.path", defaultValue = "src/main/resources")
        String outputPath;

        @Override
        public int run(String... args) throws Exception {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory().disable(Feature.WRITE_DOC_START_MARKER));
            Database db = mapper.readValue(new File(inputPath + "/object.yaml"), Database.class);
            String type = db.getSpec().getType();
            if (type.equals("pg")) {
                PostgreSQL postgreSQL = mapper.readValue(MyApp.class.getResourceAsStream("/postgres-cr.yml"),
                        PostgreSQL.class);
                postgreSQL.getMetadata().setName(db.getMetadata().getName());
                postgreSQL.getSpec().setPlan(db.getSpec().getPlan());
                postgreSQL.getSpec().setProject(db.getSpec().getProject());
                mapper.writeValue(new File(outputPath + "/postgres.yaml"), postgreSQL);
            } else {
                MySQL mysql = mapper.readValue(MyApp.class.getResourceAsStream("/mysql-cr.yml"), MySQL.class);
                mysql.getMetadata().setName(db.getMetadata().getName());
                mysql.getSpec().setPlan(db.getSpec().getPlan());
                mysql.getSpec().setProject(db.getSpec().getProject());
                mapper.writeValue(new File(outputPath + "/mysql.yaml"), mysql);
            }

            return 0;
        }
    }
}

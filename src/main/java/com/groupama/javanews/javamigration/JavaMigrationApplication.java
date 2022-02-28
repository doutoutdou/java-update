package com.groupama.javanews.javamigration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableResourceServer
public class JavaMigrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaMigrationApplication.class, args);
    }

}

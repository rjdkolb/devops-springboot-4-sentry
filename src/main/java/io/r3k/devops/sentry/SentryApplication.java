package io.r3k.devops.sentry;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
    info = @Info(
        title = "Sentry Demo API",
        version = "v1",
        description = "Demo endpoints exposing intentional failures to showcase Sentry integration."
    ),
    servers = {
        @Server(url = "http://localhost:8080", description = "Local")
    }
)
@SpringBootApplication
public class SentryApplication {

	static void main(String[] args) {
		SpringApplication.run(SentryApplication.class, args);
	}

}

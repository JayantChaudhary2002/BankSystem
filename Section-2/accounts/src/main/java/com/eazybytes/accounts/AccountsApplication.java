package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservices REST API Documentation",
				description = "EazyBank Accounts microservice rest api documentation",
				version = "v1",
				contact = @Contact(
						name = "Aman Kuntal",
						email = "amanKuntal@gmail.com",
						url = "http://localhost:8080/swagger-ui/index.html"
				),
				license = @License(
						name = "Apache 2.0",
						url = "http://localhost:8080/swagger-ui/index.html"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EazyBank Accounts microservice rest api documentation",
				url = "http://localhost:8080/swagger-ui/index.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}

package com.andrekreou.organisationservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "Organisation Service REST APIs",
				description = "Organisation Service REST APIs Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Andreas",
						email = "andreas.kreouzos@hotmail.com",
						url = "https://www.linkedin.com/in/andreas-kreouzos"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.linkedin.com/in/andreas-kreouzos"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Organisation Service Doc",
				url = "https://www.javaguides.net/"
		)
)
@SpringBootApplication
public class OrganisationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganisationServiceApplication.class, args);
	}

}

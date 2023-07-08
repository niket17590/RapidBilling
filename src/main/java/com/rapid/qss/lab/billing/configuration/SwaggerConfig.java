package com.rapid.qss.lab.billing.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI openApiInformation() {
		Server localServer = new Server().url("http://localhost:8080").description("Localhost Server URL");
		Contact contact = new Contact().email("niket.agrawal90@gmail.com").name("Niket Agrawal");
		Info info = new Info().contact(contact).description("Rapid Qss Lab Billing Software")
				.summary("Rapid Qss Lab Billing Software").title("Rapid Qss Lab Billing")
				.version("V1.0.0").license(new License().name("Apache 2.0").url("http://springdoc.org"));

		return new OpenAPI().info(info).addServersItem(localServer);
	}
}

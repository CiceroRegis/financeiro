package com.financeiro.configData;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

	public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title")
                        .description("my little API")
                        .version("v1.0")
                        .contact(new Contact()
                                .name("Arun")
                                .url("https://asbnotebook.com")
                                .email("asbnotebook@gmail.com"))
                        .termsOfService("TOC")
                        .license(new License().name("License").url("#"))
                );
    }
	}
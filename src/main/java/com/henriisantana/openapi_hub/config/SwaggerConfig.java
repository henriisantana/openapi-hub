package com.henriisantana.openapi_hub.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("OpenAPI Hub API")
                        .description("API documentation for the OpenAPI Hub project")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Henrii Santana")
                                .email("henrii.santana@example.com")
                                .url("https://example.com")));
    }
}

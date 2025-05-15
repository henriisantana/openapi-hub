package com.henriisantana.openapi_hub.config;

import com.henriisantana.openapi_hub.integration.JsonPlaceholderClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class HttpClientConfig {

    @Bean
    public JsonPlaceholderClient jsonPlaceholderClient() {
        RestClient restClient = RestClient.builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();
        
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(JsonPlaceholderClient.class);
    }
}

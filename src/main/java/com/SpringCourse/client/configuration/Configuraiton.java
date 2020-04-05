package com.SpringCourse.client.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Configuraiton {
    @Value("${property.repositoryURLBase}")
    private String urlBase;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    public String baseUrl(){
        return urlBase;
    }
}

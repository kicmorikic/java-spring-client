package com.SpringCourse.client.configuration;

import com.SpringCourse.client.repository.IWeatherRepository;
import com.SpringCourse.client.repository.WeatherRepository;
import com.SpringCourse.client.service.IWeatherService;
import com.SpringCourse.client.service.WeatherService;
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

    @Bean
    public String urlBase()
    {
        return  urlBase;
    }

    @Bean
    public IWeatherRepository repository(RestTemplate restTemplate){
        return new WeatherRepository(restTemplate,urlBase);
    }

}

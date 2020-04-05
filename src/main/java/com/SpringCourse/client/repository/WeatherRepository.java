package com.SpringCourse.client.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class WeatherRepository implements IWeatherRepository {
    private RestTemplate restTemplate;
    private String repositoryURLBase;
    public WeatherRepository(RestTemplate restTemplate, String repositoryURLBase){
        this.restTemplate=restTemplate;
        this.repositoryURLBase = repositoryURLBase;
    }

    @Override
    public WeatherDTO getWeather(Integer region, Integer aura){
        return restTemplate.getForObject(repositoryURLBase+"?region="+region+"&pogoda="+aura, WeatherDTO.class);
    }

}

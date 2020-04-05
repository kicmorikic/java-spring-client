package com.SpringCourse.client.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

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
        //String req= repositoryURLBase+"?region="+region+"&pogoda="+aura;
        String uri = UriComponentsBuilder.fromHttpUrl(repositoryURLBase)
                .queryParam("region",region)
                .queryParam("aura",aura)
                .build().toUriString();


        return restTemplate.getForObject(uri, WeatherDTO.class);
    }

}

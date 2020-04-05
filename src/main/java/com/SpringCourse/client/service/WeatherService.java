package com.SpringCourse.client.service;

import com.SpringCourse.client.repository.ConcreteDTO;
import com.SpringCourse.client.repository.IWeatherRepository;
import com.SpringCourse.client.repository.WeatherDTO;
import com.SpringCourse.client.repository.WeatherRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

@Service
public class WeatherService implements IWeatherService{
    private IWeatherRepository repository;
    public WeatherService(IWeatherRepository repository){
        this.repository=repository;
    }
    public String getWeather(Integer region, Integer aura){
        WeatherDTO returnedWeather = repository.getWeather(region,aura);
        String result = "Pogoda dla: "+returnedWeather.getRegion();
        result += ";Temp: "+returnedWeather.getTemperature();
        result += ";Zachmurzenie: "+returnedWeather.getCloudCoverPercent();
        result += ";Szansa na deszcze: "+returnedWeather.getPrecipitationChance();
        return result;
    }
    public Collection<String> getAllForecasts(){
        Collection<ConcreteDTO> coll = repository.getAllForecasts();
        return coll.stream().map(ConcreteDTO::toString).collect(Collectors.toList());
    }
}

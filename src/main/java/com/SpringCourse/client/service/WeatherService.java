package com.SpringCourse.client.service;

import com.SpringCourse.client.repository.IWeatherRepository;
import com.SpringCourse.client.repository.WeatherDTO;
import com.SpringCourse.client.repository.WeatherRepository;

public class WeatherService {
    private IWeatherRepository repository;
    public WeatherService(IWeatherRepository repository){
        this.repository=repository;
    }
    public String getWeather(Integer region, Integer aura){
        WeatherDTO returnedWeather = repository.getWeather(region,aura);
        return "";
    }
}

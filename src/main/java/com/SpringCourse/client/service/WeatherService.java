package com.SpringCourse.client.service;

import com.SpringCourse.client.repository.IWeatherRepository;
import com.SpringCourse.client.repository.WeatherDTO;
import com.SpringCourse.client.repository.WeatherRepository;
import org.springframework.stereotype.Service;

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
}

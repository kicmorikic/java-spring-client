package com.SpringCourse.client.service;

import java.util.Collection;

public interface IWeatherService {
    public String getWeather(Integer region, Integer aura);
    Collection<String> getAllForecasts();
}

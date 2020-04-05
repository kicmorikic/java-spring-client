package com.SpringCourse.client.repository;

import java.util.Collection;

public interface IWeatherRepository {
    WeatherDTO getWeather(Integer region, Integer aura);
    Collection<ConcreteDTO> getAllForecasts();
}

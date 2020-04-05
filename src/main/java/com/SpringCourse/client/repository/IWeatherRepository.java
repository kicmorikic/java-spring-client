package com.SpringCourse.client.repository;

public interface IWeatherRepository {
    WeatherDTO getWeather(Integer region, Integer aura);
}

package com.SpringCourse.client.controller;

import com.SpringCourse.client.repository.WeatherDTO;
import com.SpringCourse.client.service.IWeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class WeatherForecastController {
    private IWeatherService pogodynka;

    public WeatherForecastController(IWeatherService pogodynka)
    {
        this.pogodynka = pogodynka;
    }

    @GetMapping("WeatherForecast")
    public String WeatherForecast(
            @RequestParam(value = "region",required = false, defaultValue = "-1") Integer region
            , @RequestParam(value = "aura",required = false, defaultValue = "-1") Integer pogoda
    )
    {
        return pogodynka.getWeather(region,pogoda);
    }

    @GetMapping("AllForecasts")
    public Collection<String> getAllGeneratedForecasts()
    {
        return pogodynka.getAllForecasts();
    }
}

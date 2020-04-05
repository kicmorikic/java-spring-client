package com.SpringCourse.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherForecastController {
    IWeatherService pogodynka;

    public WeatherForecastController(IWeatherService pogodynka)
    {
        this.pogodynka = pogodynka;
    }

    @GetMapping("WeatherForecast")
    public String WeatherForecast(@RequestParam(value = "region",required = false, defaultValue = "-1") Integer region, @RequestParam(value = "pogoda",required = false, defaultValue = "-1") Integer pogoda)
    {

        PrognozaPogody generated= pogodynka.podajKonkretnaPrognozeDlaRegionu(region,pogoda);


        return generated;
    }
}

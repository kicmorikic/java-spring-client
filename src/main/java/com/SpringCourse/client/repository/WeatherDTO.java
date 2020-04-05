package com.SpringCourse.client.repository;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherDTO {
    private Integer temperature, precipitationChance, cloudCoverPercent;
    private String region;

    @JsonCreator
    public WeatherDTO(@JsonProperty("temperatura")Integer temperature,@JsonProperty("szansaNaDeszczProcent") Integer precipitationChance, @JsonProperty("zachmurzenieProcent") Integer cloudCoverPercent,@JsonProperty("region") String region) {
        this.temperature = temperature;
        this.precipitationChance = precipitationChance;
        this.cloudCoverPercent = cloudCoverPercent;
        this.region = region;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public Integer getPrecipitationChance() {
        return precipitationChance;
    }

    public Integer getCloudCoverPercent() {
        return cloudCoverPercent;
    }

    public String getRegion() {
        return region;
    }
}

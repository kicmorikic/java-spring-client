package com.SpringCourse.client.repository;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class ConcreteDTO {
    private String region;
    private int temperatura; // -270:6051
    private int szansaNaDeszczProcent; //0:100
    private int zachmurzenieProcent;//0:100
    private LocalDateTime creationDate;

    public ConcreteDTO(@JsonProperty("region") String region
            ,@JsonProperty("temperatura") int temperatura
            ,@JsonProperty("szansaNaDeszczProcent") int szansaNaDeszczProcent
            ,@JsonProperty("zachmurzenieProcent") int zachmurzenieProcent
            ,@JsonProperty("creationDate") LocalDateTime creationDate) {
        this.region = region;
        this.temperatura = temperatura;
        this.szansaNaDeszczProcent = szansaNaDeszczProcent;
        this.zachmurzenieProcent = zachmurzenieProcent;
        this.creationDate = creationDate;
    }

    public String getRegion() {
        return region;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getSzansaNaDeszczProcent() {
        return szansaNaDeszczProcent;
    }

    public int getZachmurzenieProcent() {
        return zachmurzenieProcent;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return "Bardzo ładna pogoda dla " +
                "regionu " + region + ": " +
                " Temperatura to " + temperatura +" C" +
                ", szansa na opady " + szansaNaDeszczProcent+ "%" +
                ", zachmurzenie " + zachmurzenieProcent + "%"+
                ", pomiar wykonany: " + creationDate +
                ".";
    }
}

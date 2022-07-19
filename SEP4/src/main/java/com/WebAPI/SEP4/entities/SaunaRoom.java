package com.WebAPI.SEP4.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SaunaRoom")

public class SaunaRoom {
    @Id
    private int saunaId;
    @Column
    private String name;
    private int Co2;
    private int temperature;
    private int humidity;

    public SaunaRoom() {
    }

    public SaunaRoom(int saunaId, String name, int co2, int temperature, int humidity) {
        this.saunaId = saunaId;
        this.name = name;
        Co2 = co2;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public int getSaunaId() {
        return saunaId;
    }

    public void setSaunaId(int saunaId) {
        this.saunaId = saunaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCo2() {
        return Co2;
    }

    public void setCo2(int co2) {
        Co2 = co2;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}

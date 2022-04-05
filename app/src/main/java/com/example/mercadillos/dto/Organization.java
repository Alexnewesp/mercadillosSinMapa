package com.example.mercadillos.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Organization {


    private String schedule;
    private String services;

    public Organization(String schedule, String services) {
        this.schedule = schedule;
        this.services = services;
    }

    public Organization() {
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services= services;
    }
}

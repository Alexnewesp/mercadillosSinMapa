package com.example.mercadillos.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mercadillo {


        private String title;
        private Address address;
        private Organization organization;
        private Location location;


        public Mercadillo ()
        {

        }

        public Mercadillo(String title, Address address, Organization organization, Location location) {
            this.title = title;
            this.address = address;
            this.organization = organization;
            this.location = location;

        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }


        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization (Organization organization) {
        this.organization = organization;
    }


    }

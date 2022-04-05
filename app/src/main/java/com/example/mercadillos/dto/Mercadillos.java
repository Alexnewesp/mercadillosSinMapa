package com.example.mercadillos.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mercadillos {

    public Mercadillos ()
    {
        this.lista_mercadillos = new ArrayList<Mercadillo>();
    }

    @JsonProperty("@graph")
    private List<Mercadillo> lista_mercadillos;

    public List<Mercadillo> getlista_mercadillos() {
        return lista_mercadillos;
    }

    public void setlista_mercadillos(List<Mercadillo> lista_mercadillos) {
        this.lista_mercadillos = lista_mercadillos;
    }
}

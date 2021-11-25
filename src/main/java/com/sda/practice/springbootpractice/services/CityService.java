package com.sda.practice.springbootpractice.services;

import com.sda.practice.springbootpractice.models.City;

import java.util.List;
import java.util.Optional;

/**
 * Service to handle City related operations
 */
public interface CityService {

    /**
     * To find all the cities
     * @return List of City
     */
    List<City> findAllCities();

    /**
     * To create a new City
     * @param city City
     */
    void createCity(City city);

    /**
     * To find a city by its name
     * @param name Name of the city
     * @return Optional of City
     */
    Optional<City> findCityByName(String name);
}
package com.sda.practice.springbootpractice.controllers;

import com.sda.practice.springbootpractice.models.City;
import com.sda.practice.springbootpractice.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;
    public List<City> getAllCities(){
        return cityService.findAllCities();

    }
}



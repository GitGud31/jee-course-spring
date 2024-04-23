package com.hitema.intro.controllers;

import com.hitema.intro.models.City;
import com.hitema.intro.models.Country;
import com.hitema.intro.services.CityService;
import com.hitema.intro.services.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    private static final Logger log = LoggerFactory.getLogger(CityController.class);

    private final CityService service;

    @Autowired
    public CityController(CityService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<City> readAll() {
        return this.service.readAll();
    }

    @GetMapping("/{id}")
    public City getOne(@PathVariable Long id) {
        return this.service.read(id);
    }

    @PostMapping("/create")
    public City createCity(@RequestBody City city) {
        return this.service.create(city);
    }

    @DeleteMapping("/remove/{id}")
    public String removeCity(@PathVariable Long id) {
        return this.service.delete(id) ? "SUCCESS: City deleted" : "FAIL: could not delete city.";
    }

    @PutMapping("/update")
    public City updateCity(@RequestBody City city) {
        return this.service.update(city);
    }
}

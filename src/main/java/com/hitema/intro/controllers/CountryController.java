package com.hitema.intro.controllers;

import com.hitema.intro.models.Country;
import com.hitema.intro.services.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {
    private static final Logger log = LoggerFactory.getLogger(CountryController.class);

    private final CountryService service;

    @Autowired
    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Country> readAll() {
        return this.service.readAll();
    }

    @GetMapping("/{id}")
    public Country getOne(@PathVariable Long id) {
        return this.service.read(id);
    }

    @PostMapping("/create")
    public Country createCountry(@RequestBody Country country) {
        return this.service.create(country);
    }

    @DeleteMapping("/remove/{id}")
    public String removeCountry(@PathVariable Long id) {
        return this.service.delete(id) ? "SUCCESS: Country deleted" : "FAIL: could not delete country.";
    }

    @PutMapping("/update")
    public Country updateCountry(@RequestBody Country country) {
        return this.service.update(country);
    }
}

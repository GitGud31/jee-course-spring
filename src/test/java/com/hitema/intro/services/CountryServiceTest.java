package com.hitema.intro.services;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CountryServiceTest {
    private static final Logger log = LoggerFactory.getLogger(CountryServiceTest.class);

    @Autowired
    CountryService service;

    @Test
    void create() {
    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void readAll() {
        service.readAll().forEach(country -> log.trace("{}", country.getCountry()));
    }
}
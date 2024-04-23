package com.hitema.intro.services;

import com.hitema.intro.models.City;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CityServiceTest {
    private static final Logger log = LoggerFactory.getLogger(CityServiceTest.class);

    @Autowired
    CityService service;

    @Test
    void create() {
    }

    @Test
    void read() {
        final Long id = 2L;
        final City city = this.service.read(id);
        log.trace("{}", city.getCity());
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void readAll() {
        service.readAll().forEach(city -> log.trace("{}", city.getCity()));
    }
}
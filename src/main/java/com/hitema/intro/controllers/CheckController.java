package com.hitema.intro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class CheckController {

    @GetMapping({"/", "/server-up"})
    public String check() {
        return String.format("SERVER UP! %s", LocalDateTime.now());
    }
}

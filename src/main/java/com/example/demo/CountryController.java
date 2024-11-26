package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryController {
    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    // Endpoint to get a list of countries, with optional filtering by name
    @GetMapping("/countries")
    public List<Country> getCountries(@RequestParam(required = false) String name) {
        return countryService.getFilteredCountries(name);
    }
}

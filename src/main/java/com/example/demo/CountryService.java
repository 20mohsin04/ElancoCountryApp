package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {
    // Hardcoded list of countries for simplicity
    private final List<Country> countries = List.of(
        new Country("Sweden", 10000000),
        new Country("UK", 67000000),
        new Country("USA", 331000000)
    );

    // Returns the full list of countries
    public List<Country> getAllCountries() {
        return countries;
    }

    // Filters countries by name, returning a subset if a filter is provided
    public List<Country> getFilteredCountries(String name) {
        if (name == null || name.isEmpty()) {
            return countries; // Return all countries if no filter is provided
        }
        return countries.stream()
            .filter(country -> country.getName().equalsIgnoreCase(name))
            .collect(Collectors.toList());
    }
}

package com.example.demo;

//Represents a country with a name and population
public class Country {
 private String name;
 private int population;

 // Constructor
 public Country(String name, int population) {
     this.name = name;
     this.population = population;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getPopulation() {
     return population;
 }
}

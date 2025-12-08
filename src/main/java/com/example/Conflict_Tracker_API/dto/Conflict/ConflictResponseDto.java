package com.example.Conflict_Tracker_API.dto.Conflict;

import com.example.Conflict_Tracker_API.dto.Country.CountryDto;
import java.time.LocalDate;
import java.util.Set;

public class ConflictResponseDto {
    public Long id;
    public String name;
    public LocalDate startDate;
    public String status;
    public String description;
    public Set<CountryDto> countries;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<CountryDto> getCountries() {
        return countries;
    }

    public void setCountries(Set<CountryDto> countries) {
        this.countries = countries;
    }
}
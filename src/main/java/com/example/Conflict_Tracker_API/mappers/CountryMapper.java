package com.example.Conflict_Tracker_API.mappers;

import com.example.Conflict_Tracker_API.dto.Country.CountryDto;
import com.example.Conflict_Tracker_API.model.Country;
import org.springframework.stereotype.Component;


@Component
public class CountryMapper {
    public CountryDto toDto(Country c) {
        if (c == null) return null;
        CountryDto dto = new CountryDto();
        dto.setId(c.getId());
        dto.setName(c.getName());
        dto.setCode(c.getCode());
        return dto;
    }
}
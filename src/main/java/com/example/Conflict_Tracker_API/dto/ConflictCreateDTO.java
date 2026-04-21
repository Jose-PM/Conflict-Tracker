package com.example.Conflict_Tracker_API.dto;

import java.time.LocalDate;
import java.util.Set;

public record ConflictCreateDTO(
        String name,
        LocalDate startDate,
        String status,
        String description,
        Set<String> countryCodes
) {}

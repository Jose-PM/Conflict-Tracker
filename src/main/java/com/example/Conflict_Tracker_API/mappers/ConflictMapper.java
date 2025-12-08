package com.example.Conflict_Tracker_API.mappers;


import com.example.Conflict_Tracker_API.dto.Conflict.ConflictCreateDto;
import com.example.Conflict_Tracker_API.dto.Conflict.ConflictResponseDto;
import com.example.Conflict_Tracker_API.dto.Conflict.ConflictUpdateDto;
import com.example.Conflict_Tracker_API.model.Conflict;
import org.springframework.stereotype.Component;


import java.util.stream.Collectors;


@Component
public class ConflictMapper {


    private final CountryMapper countryMapper;


    public ConflictMapper(CountryMapper countryMapper) {
        this.countryMapper = countryMapper;
    }


    // Convierte entidad Conflict a ConflictResponseDto
    public ConflictResponseDto toDto(Conflict entity) {
        if (entity == null) return null;
        ConflictResponseDto dto = new ConflictResponseDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setStartDate(entity.getStartDate());
        dto.setStatus(entity.getStatus() != null ? entity.getStatus().name() : null);
        dto.setDescription(entity.getDescription());
        if (entity.getCountries() != null) {
            dto.setCountries(entity.getCountries().stream()
                    .map(countryMapper::toDto)
                    .collect(Collectors.toSet()));
        }
        return dto;
    }


    // Actualiza una entidad Conflict con los valores de ConflictUpdateDto
    public void updateEntityFromDto(ConflictUpdateDto dto, Conflict entity) {
        if (dto.getName() != null) entity.setName(dto.getName());
        if (dto.getStartDate() != null) entity.setStartDate(dto.getStartDate());
        if (dto.getStatus() != null) entity.setStatus(Conflict.Status.valueOf(dto.getStatus().toUpperCase()));
        if (dto.getDescription() != null) entity.setDescription(dto.getDescription());
    }


    // Convierte ConflictCreateDto a entidad Conflict
    public Conflict toEntity(ConflictCreateDto dto) {
        Conflict c = new Conflict();
        c.setName(dto.getName());
        c.setStartDate(dto.getStartDate());
        if (dto.getStatus() != null) c.setStatus(Conflict.Status.valueOf(dto.getStatus().toUpperCase()));
        c.setDescription(dto.getDescription());
        return c;
    }
}
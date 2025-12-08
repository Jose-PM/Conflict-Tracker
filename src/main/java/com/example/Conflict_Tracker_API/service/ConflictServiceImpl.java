package com.example.Conflict_Tracker_API.service;

import com.example.Conflict_Tracker_API.dto.Conflict.ConflictCreateDto;
import com.example.Conflict_Tracker_API.dto.Conflict.ConflictResponseDto;
import com.example.Conflict_Tracker_API.dto.Conflict.ConflictUpdateDto;
import com.example.Conflict_Tracker_API.exception.ResourceNotFoundException;
import com.example.Conflict_Tracker_API.mappers.ConflictMapper;
import com.example.Conflict_Tracker_API.model.Conflict;
import com.example.Conflict_Tracker_API.repository.ConflictRepository;
import com.example.Conflict_Tracker_API.repository.CountryRepository;
import com.example.Conflict_Tracker_API.service.ConflictService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
class ConflictServiceImpl implements ConflictService {


    private final ConflictRepository conflictRepository;
    private final CountryRepository countryRepository;
    private final ConflictMapper conflictMapper;


    public ConflictServiceImpl(ConflictRepository conflictRepository, CountryRepository countryRepository, ConflictMapper conflictMapper) {
        this.conflictRepository = conflictRepository;
        this.countryRepository = countryRepository;
        this.conflictMapper = conflictMapper;
    }


    @Override
    public List<ConflictResponseDto> getAll() {
        return conflictRepository.findAll().stream().map(conflictMapper::toDto).collect(Collectors.toList());
    }


    @Override
    public ConflictResponseDto getById(Long id) {
        return conflictMapper.toDto(conflictRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Conflict not found")));
    }


    @Override
    public ConflictResponseDto create(ConflictCreateDto dto) {
        Conflict conflict = conflictMapper.toEntity(dto);
        return conflictMapper.toDto(conflictRepository.save(conflict));
    }


    @Override
    public ConflictResponseDto update(Long id, ConflictUpdateDto dto) {
        Conflict conflict = conflictRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Conflict not found"));
        conflictMapper.updateEntityFromDto(dto, conflict);
        return conflictMapper.toDto(conflictRepository.save(conflict));
    }


    @Override
    public void delete(Long id) {
        if(!conflictRepository.existsById(id)) throw new ResourceNotFoundException("Conflict not found");
        conflictRepository.deleteById(id);
    }


    @Override
    public List<ConflictResponseDto> findByStatus(String status) {
        return conflictRepository.findByStatus(Conflict.Status.valueOf(status))
                .stream().map(conflictMapper::toDto).collect(Collectors.toList());
    }


    @Override
    public List<ConflictResponseDto> findByCountryCode(String countryCode) {
        return conflictRepository.findByCountryCode(countryCode)
                .stream()
                .map(conflictMapper::toDto)
                .collect(Collectors.toList());
    }
}
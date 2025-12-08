package com.example.Conflict_Tracker_API.service;

<<<<<<< HEAD
import com.example.Conflict_Tracker_API.model.Conflict;
import com.example.Conflict_Tracker_API.repository.ConflictRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConflictService {

    private final ConflictRepository repo;

    public ConflictService(ConflictRepository repo) {
        this.repo = repo;
    }

    public List<Conflict> findAll() {
        return repo.findAll();
    }
}

=======

import com.example.Conflict_Tracker_API.dto.Conflict.*;
import java.util.List;

public interface ConflictService {
    List<ConflictResponseDto> getAll();
    ConflictResponseDto getById(Long id);
    ConflictResponseDto create(ConflictCreateDto dto);
    ConflictResponseDto update(Long id, ConflictUpdateDto dto);
    void delete(Long id);
    List<ConflictResponseDto> findByStatus(String status);
    List<ConflictResponseDto> findByCountryCode(String countryCode);
}


>>>>>>> 7593567 (Conflict-Tracker-API V1)

package com.example.Conflict_Tracker_API.service;

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


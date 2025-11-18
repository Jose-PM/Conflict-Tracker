package com.example.Conflict_Tracker_API.repository;

import com.example.Conflict_Tracker_API.model.Conflict;
import com.example.Conflict_Tracker_API.model.ConflictStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ConflictRepository extends JpaRepository<Conflict, Long> {
    List<Conflict> findByStatus(ConflictStatus status);
    List<Conflict> findByCountries_Code(String code);
}
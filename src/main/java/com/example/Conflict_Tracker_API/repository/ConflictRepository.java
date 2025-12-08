package com.example.Conflict_Tracker_API.repository;

<<<<<<< HEAD
import com.example.Conflict_Tracker_API.model.Conflict;
import com.example.Conflict_Tracker_API.model.ConflictStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ConflictRepository extends JpaRepository<Conflict, Long> {
    List<Conflict> findByStatus(ConflictStatus status);
    List<Conflict> findByCountries_Code(String code);
=======
import com.example.Conflict_Tracker_API.dto.Conflict.ConflictDto;
import com.example.Conflict_Tracker_API.model.Conflict;
import com.example.Conflict_Tracker_API.model.ConflictStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConflictRepository extends JpaRepository<Conflict, Long> {
    List<Conflict> findByStatus(Conflict.Status status);

    @Query("select c from Conflict c join c.countries co where co.code = :code")
    List<Conflict> findByCountryCode(@Param("code") String code);
>>>>>>> 7593567 (Conflict-Tracker-API V1)
}
package com.example.Conflict_Tracker_API.repository;

<<<<<<< HEAD

=======
>>>>>>> 7593567 (Conflict-Tracker-API V1)
import com.example.Conflict_Tracker_API.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Optional<Country> findByCode(String code);
<<<<<<< HEAD
}
=======
}
>>>>>>> 7593567 (Conflict-Tracker-API V1)

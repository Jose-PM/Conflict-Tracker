package com.example.Conflict_Tracker_API.model;

import jakarta.persistence.*;
import java.time.LocalDate;
<<<<<<< HEAD

@Entity
@Table(name = "events")
=======
@Entity
>>>>>>> 7593567 (Conflict-Tracker-API V1)
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
    @Column(name = "event_date", nullable = false)
    private LocalDate eventDate;

    @Column(nullable = false)
=======
    private LocalDate eventDate;
>>>>>>> 7593567 (Conflict-Tracker-API V1)
    private String location;

    @Column(columnDefinition = "TEXT")
    private String description;

<<<<<<< HEAD
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conflict_id", nullable = false)
    private Conflict conflict;

    // Constructors
    public Event() {}

    public Event(LocalDate eventDate, String location, String description, Conflict conflict) {
        this.eventDate = eventDate;
        this.location = location;
        this.description = description;
        this.conflict = conflict;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDate getEventDate() { return eventDate; }
    public void setEventDate(LocalDate eventDate) { this.eventDate = eventDate; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Conflict getConflict() { return conflict; }
    public void setConflict(Conflict conflict) { this.conflict = conflict; }
=======
    @ManyToOne
    @JoinColumn(name = "conflict_id")
    private Conflict conflict;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Conflict getConflict() {
        return conflict;
    }

    public void setConflict(Conflict conflict) {
        this.conflict = conflict;
    }
>>>>>>> 7593567 (Conflict-Tracker-API V1)
}
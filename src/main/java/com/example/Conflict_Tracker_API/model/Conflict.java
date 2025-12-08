package com.example.Conflict_Tracker_API.model;

<<<<<<< HEAD
=======
import com.example.Conflict_Tracker_API.model.Country;
import com.example.Conflict_Tracker_API.model.Event;
import com.example.Conflict_Tracker_API.model.Faction;
>>>>>>> 7593567 (Conflict-Tracker-API V1)
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
<<<<<<< HEAD
@Table(name = "conflicts")
=======
>>>>>>> 7593567 (Conflict-Tracker-API V1)
public class Conflict {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
    @Column(nullable = false)
    private String name;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ConflictStatus status;
=======
    private String name;
    private LocalDate startDate;

    @Enumerated(EnumType.STRING)
    private Status status;
>>>>>>> 7593567 (Conflict-Tracker-API V1)

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToMany
<<<<<<< HEAD
    @JoinTable(
            name = "conflict_countries",
            joinColumns = @JoinColumn(name = "conflict_id"),
            inverseJoinColumns = @JoinColumn(name = "country_id")
    )
    private Set countries = new HashSet<>();

    @OneToMany(mappedBy = "conflict", cascade = CascadeType.ALL)
    private Set factions = new HashSet<>();

    @OneToMany(mappedBy = "conflict", cascade = CascadeType.ALL)
    private Set events = new HashSet<>();


    public Conflict() {}

    public Conflict(String name, LocalDate startDate, ConflictStatus status, String description) {
        this.name = name;
        this.startDate = startDate;
        this.status = status;
        this.description = description;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
    public ConflictStatus getStatus() { return status; }
    public void setStatus(ConflictStatus status) { this.status = status; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Set getCountries() { return countries; }
    public void setCountries(Set countries) { this.countries = countries; }
    public Set getFactions() { return factions; }
    public void setFactions(Set factions) { this.factions = factions; }
    public Set getEvents() { return events; }
    public void setEvents(Set events) { this.events = events; }
=======
    @JoinTable(name = "conflict_country",
            joinColumns = @JoinColumn(name = "conflict_id"),
            inverseJoinColumns = @JoinColumn(name = "country_id"))
    private Set<Country> countries = new HashSet<>();

    @OneToMany(mappedBy = "conflict")
    private Set<Faction> factions = new HashSet<>();

    @OneToMany(mappedBy = "conflict")
    private Set<Event> events = new HashSet<>();

    public enum Status { ACTIVE, FROZEN, ENDED }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }

    public Set<Faction> getFactions() {
        return factions;
    }

    public void setFactions(Set<Faction> factions) {
        this.factions = factions;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }
>>>>>>> 7593567 (Conflict-Tracker-API V1)
}

package com.example.Conflict_Tracker_API.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
<<<<<<< HEAD
@Table(name = "countries")
=======
>>>>>>> 7593567 (Conflict-Tracker-API V1)
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true, length = 3)
    private String code;

    @ManyToMany(mappedBy = "countries")
    private Set conflicts = new HashSet<>();

    @ManyToMany(mappedBy = "supportingCountries")
    private Set supportedFactions = new HashSet<>();


    public Country() {}

    public Country(String name, String code) {
        this.name = name;
        this.code = code;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public Set getConflicts() { return conflicts; }
    public void setConflicts(Set conflicts) { this.conflicts = conflicts; }
    public Set getSupportedFactions() { return supportedFactions; }
    public void setSupportedFactions(Set supportedFactions) {
=======
    private String name;
    private String code;

    @ManyToMany(mappedBy = "countries")
    private Set<Conflict> conflicts = new HashSet<>();

    @ManyToMany(mappedBy = "supportingCountries")
    private Set<Faction> supportedFactions = new HashSet<>();

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<Conflict> getConflicts() {
        return conflicts;
    }

    public void setConflicts(Set<Conflict> conflicts) {
        this.conflicts = conflicts;
    }

    public Set<Faction> getSupportedFactions() {
        return supportedFactions;
    }

    public void setSupportedFactions(Set<Faction> supportedFactions) {
>>>>>>> 7593567 (Conflict-Tracker-API V1)
        this.supportedFactions = supportedFactions;
    }
}
package dev.hackathon.hackathon_backend.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Class to represent an athlete performance
public class AthletePerformance {
    private int place;
    private String name;
    private LocalDate birthDate;
    private String nationality;
    private double mark;
    private String competition;
    private String race;

    public AthletePerformance(String[] data) {
        this.place = Integer.parseInt(data[0]);
        this.name = data[1];
        String dateString = data[2]; // assuming this is the date string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        LocalDate birthDate = LocalDate.parse(dateString, formatter);
        this.nationality = data[3];
        this.mark = Double.parseDouble(data[4]);
        this.competition = data[5];
        this.race = data[6];
    }

    // getters and setters
    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}

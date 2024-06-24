package dev.hackathon.hackathon_backend.domain.calendar;

// Class to represent a olympic calendar event
public class Calendar {
    private String event;
    private String place;
    private String j1;
    private String j2;
    private String j3;
    private String s1;
    private String s2;
    private String s3;

    public Calendar(String event, String place, String j1, String j2, String j3, String s1, String s2, String s3) {
        this.event = event;
        this.place = place;
        this.j1 = j1;
        this.j2 = j2;
        this.j3 = j3;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    // getters and setters
}
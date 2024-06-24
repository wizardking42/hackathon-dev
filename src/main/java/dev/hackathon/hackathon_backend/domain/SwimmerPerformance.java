package dev.hackathon.hackathon_backend.domain;

// Class to represent a swimmer performance

public class SwimmerPerformance {
    private String hour;
    private String round;
    private String discipline;
    private String athlete;
    private String sex;
    private String country;
    private int year = 2024;
    private int position;
    //private String time;
    private String mark;
    private String comments;

    public SwimmerPerformance(String[] data) {
        this.hour = data[0];
        this.round = data[1];
        this.discipline = data[2];
        this.athlete = data[3];
        this.sex = data[4];
        this.country = data[5];
        this.position = Integer.parseInt(data[6]);
        this.mark = data[7];
        this.comments = data[8];
    }

    // getters and setters
    public String getAthlete() {
        return athlete;
    }

    public void setAthlete(String athlete) {
        this.athlete = athlete;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPosition() {
        return position;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}

package com.cedricmube.enterprise.model;

public class TimeSheet {

    private int employeeId;
    private String days;
    private double hours;
    private int id;

public TimeSheet(int id, String days, double hours, int employeeId){
    this.id = id;
    this.employeeId = employeeId;
    this.days = days;
    this.hours = hours;
    }

    public String getDays() {
        return days;
    }

    public double getHours() {
        return hours;
    }

    public int getId() {
        return id;
    }

}

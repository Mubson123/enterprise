package com.cedricmube.enterprise.model;

public class TimeSheet {

//  attributs of the class------------------------------------------------------------------------------------
    private int employeeId;
    private String days;
    private double hours;
    private int id;


//  constructor of the class--------------------------------------------------------------------------------
public TimeSheet(int id, String days, double hours, int employeeId){
    this.id = id;
    this.employeeId = employeeId;
    this.days = days;
    this.hours = hours;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

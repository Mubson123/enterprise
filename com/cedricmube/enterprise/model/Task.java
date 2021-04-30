package com.cedricmube.enterprise.model;

public class Task {

    private int id;
    private String name;
    private int employee_id;
    private double time;

    public Task(int id, String name, int employee_id, double time){
        this.id = id;
        this.time = time;
        this.name = name;
        this.employee_id = employee_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
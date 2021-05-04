package com.cedricmube.enterprise.model;

public class Task {

    private int id;
    private String name;
    private int employee_id;

    public Task(int id, String name, int employee_id){
        this.id = id;
        this.name = name;
        this.employee_id = employee_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

}

package com.cedricmube.enterprise.model;

public class Group {

    private int id;
    private String name;
    private int role_id;

    public Group(int id, String name, int roleId){
        this.id = id;
        this.name = name;
        this.role_id = roleId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

}

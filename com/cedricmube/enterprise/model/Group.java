package com.cedricmube.enterprise.model;

public class Group {

    private int id;
    private String name;
    private int roleId;

    public Group(int id, String name, int roleId){
        this.id = id;
        this.name = name;
        this.roleId = roleId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public int getRoleId() {
        return  roleId;
    }
}

package com.cedricmube.enterprise.model;

public class Child {

    private int id;
    private int parentId;
    private String name;

    public Child(int id, int parentId, String name){
        this.id = id;
        this.parentId = parentId;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

}

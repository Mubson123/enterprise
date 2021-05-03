package com.cedricmube.enterprise.model;

public class Child {

    private int id;
    private int parent_id;
    private String name;

    public Child(int id, int parent_id, String name){
        this.id = id;
        this.parent_id = parent_id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return this.parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.cedricmube.enterprise.model;

public class Login {

    //attributes of the class-------------------------------------------------------------------------------
    private int id;
    private String password;
    private String email;
    private int employeeId;

    //constructor of the class------------------------------------------------------------------------------
    public Login(int id ,String email, String password, int employeeId){
        this.id = id;
        this.email = email;
        this.password = password;
        this.employeeId = employeeId;
    }

    public int getId() {
        return this.id;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }
}

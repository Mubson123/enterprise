package com.cedricmube.enterprise.model;

public class Login {

    private int id;
    private String password;
    private String email;
    private int employeeId;

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

    public int getEmployeeId() {
        return this.employeeId;
    }
}

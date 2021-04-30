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
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
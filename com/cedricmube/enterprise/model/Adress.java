package com.cedricmube.enterprise.model;

public class Adress {

    private int id;
    private String country;
    private String city;
    private String street;
    private int employeeId;

    public Adress(int id, String country, String city, String street, int employeeId) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.employeeId = employeeId;
    }

    public int getId() {
        return this.id;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCity() {
        return this.city;
    }

    public String getStreet() {
        return street;
    }
}

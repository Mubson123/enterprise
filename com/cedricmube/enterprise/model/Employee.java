package com.cedricmube.enterprise.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Employee {

//  attributs of the class------------------------------------------------------------------------------------
    private String firstname;
    private String lastname;
    private int birthDate;
    private String salutation;
    private int groupeId;
    private int id;


// constructor of the class--------------------------------------------------------------------------------
    public Employee(int id, String salutation, String firstname, String lastname,
                    int birthDate, int groupeId){
        this.id = id;
        this.salutation = salutation;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate  = birthDate;
        this.groupeId = groupeId;
    }

    public int getAge( int year, int month, int day) {
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public int getGroupeId() {
        return groupeId;
    }

    public void setGroupeId(int groupeId) {
        this.groupeId = groupeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

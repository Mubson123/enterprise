package com.cedricmube.enterprise.model;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

//  attributs of the class------------------------------------------------------------------------------------
    private String firstname;
    private String lastname;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String salutation;
    private int groupeId;
    private int id;


// constructor of the class--------------------------------------------------------------------------------
    public Employee(int id, String salutation, String firstname, String lastname,int birthYear,
                    int birthMonth, int birthDay, int groupeId){
        this.id = id;
        this.salutation = salutation;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.groupeId = groupeId;
    }

    public int getAge() {
        LocalDate birthDate = LocalDate.of(this.birthYear, this.birthMonth, this.birthDay);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    public String generateEMail(){
        return this.firstname+this.lastname+"@enterpriseX.de";
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return this.birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getSalutation() {
        return this.salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public int getGroupeId() {
        return this.groupeId;
    }

    public void setGroupeId(int groupeId) {
        this.groupeId = groupeId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

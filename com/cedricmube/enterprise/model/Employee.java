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
    private int groupId;
    private int id;


// constructor of the class--------------------------------------------------------------------------------
    public Employee(int id, String salutation, String firstname, String lastname,int birthYear,
                    int birthMonth, int birthDay, int groupId){
        this.id = id;
        this.salutation = salutation;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.groupId = groupId;
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

    public String getLastname() {
        return this.lastname;
    }

    public String getSalutation() {
        return this.salutation;
    }

    public int getId() {
        return this.id;
    }

}

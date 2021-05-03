package com.cedricmube.enterprise.utils;

import com.cedricmube.enterprise.model.Employee;
import com.cedricmube.enterprise.utils.GroupeGenerator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeGenerator {
    /**
     * Array of firstname
     * Array of Lastname
     * Array of Birthdate
     */


    public static List<Employee> generateEmployee() {
        List<Employee> employees = new ArrayList<>();
        String[] firstnames = {"Simon", "Jean", "André", "Jacques", "Juda",
                "Matthias", "Marc"};
        String[] lastnames = {"Pierre", "Boanerges", "Zebedee", "Mineur", "Iscariot",
        "Justus", "Jean"};
        int[] birthYear = {1982, 1996, 1985, 1975, 1990, 1979, 1989};
        int[] birthMonth = {2, 6, 5, 5, 1, 7, 8};
        int[] birthDay = {19, 3, 15, 28, 10, 30, 1};

        for (int i = 0; i < firstnames.length; i++){
            employees.add(new Employee(i, "Mr. ", firstnames[i], lastnames[i],
                    birthYear[i], birthMonth[i], birthDay[i],
                    GroupeGenerator.generateGroup().get(i).getId()));
        }
        return  employees;
    }

}

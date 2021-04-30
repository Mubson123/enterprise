package com.cedricmube.enterprise.utils;

import com.cedricmube.enterprise.model.Login;

import java.util.ArrayList;
import java.util.List;

public class LoginGenerator {

    /** Parameters of class Employee
     * id
     * email
     * password
     * employeeId
     * @return
     */

    public static List<Login> generateLogin() {
        List<Login> loginList = new ArrayList<>();
        String[] password = {"34df23", "979frve8", "78edv57", "4567vd4", "89fv69df", "86fv89f", "fv546fvd53"};
        for (int i = 0; i < loginList.size(); i++) {
            loginList.add(new Login(i, EmployeeGenerator.generateEmployee().get(i).getFirstname()
            +EmployeeGenerator.generateEmployee().get(i).getLastname()+ "@hotmail.de", password[i],
                    EmployeeGenerator.generateEmployee().get(i).getId()));
        }
        return loginList;
    }
}

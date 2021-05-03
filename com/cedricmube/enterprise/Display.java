package com.cedricmube.enterprise;

import com.cedricmube.enterprise.model.*;
import com.cedricmube.enterprise.utils.*;

import java.util.List;

public class Display {

    public static void displayEmployees() {
        List<Employee> employeeList = EmployeeGenerator.generateEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee.getFirstname() + " " + employee.getLastname() + " : " + employee.getAge() + " years old");
        }
    }

    public static void displayTask() {
        List<Employee> employeeList = EmployeeGenerator.generateEmployee();
        List<Task> taskList = TaskGenerator.generateTask();
        for (int i = 0; i < employeeList.size(); i ++) {
            System.out.println(employeeList.get(i).getFirstname() + " " + employeeList.get(i).getLastname() + ": " + taskList.get(i).getName());
        }
    }

    public static void displayRole() {
        List<Employee> employeeList = EmployeeGenerator.generateEmployee();
        List<Role> roleList = RoleGenerator.generateRoles();
        for (int i = 0; i < employeeList.size(); i ++) {
            System.out.println(employeeList.get(i).getFirstname() + " " + employeeList.get(i).getLastname() + ": " + roleList.get(i).getName());
        }
    }

    public static void displayGroup() {
        List<Employee> employeeList = EmployeeGenerator.generateEmployee();
        List<Group> groupList = GroupeGenerator.generateGroup();
        for (int i = 0; i < employeeList.size(); i ++) {
            System.out.println(employeeList.get(i).getFirstname() + " " + employeeList.get(i).getLastname() + ": " + groupList.get(i).getName());
        }
    }

    public static void displayLogin() {
        List<Employee> employeeList = EmployeeGenerator.generateEmployee();
        List<Login> loginList = LoginGenerator.generateLogin();
        for (int i = 0; i < employeeList.size(); i ++) {
            System.out.println(employeeList.get(i).getFirstname() + " " + employeeList.get(i).getLastname() + ": email (" + loginList.get(i).getEmail()
            + "), password (" + loginList.get(i).getPassword() + ")");
        }
    }

    public static void displayAdress() {
        List<Employee> employeeList = EmployeeGenerator.generateEmployee();
        List<Adress> adressList = AdressGenerator.generateAdress();
        for (int i = 0; i < employeeList.size(); i ++) {
            System.out.println(employeeList.get(i).getFirstname() + " " + employeeList.get(i).getLastname() + ": " + adressList.get(i).getCountry()
            +" -> " + adressList.get(i).getCity() + ", " + adressList.get(i).getStreet());
        }
    }

    public static void main(String[] args) {
        displayLogin();
        displayAdress();
        displayRole();
        displayTask();
        displayGroup();
        displayEmployees();
    }
}

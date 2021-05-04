package com.cedricmube.enterprise;

import com.cedricmube.enterprise.model.*;
import com.cedricmube.enterprise.utils.*;

import java.util.List;

public class Display {

    public static void displayEmployees() {
        System.out.println();
        System.out.println("All employees");
        System.out.println("=============");
        System.out.println();
        System.out.println("firstname, lastname, age");
        System.out.println("-------------------------");
        List<Employee> employeeList = EmployeeGenerator.generateEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee.getFirstname() + ",   " + employee.getLastname() + ",     " + employee.getAge());
        }
        System.out.println();
    }

    public static void displayTask() {
        System.out.println();
        System.out.println("All tasks");
        System.out.println("=========");
        System.out.println();
        System.out.println("firstname, lastname: taskname");
        System.out.println("------------------------------");
        List<Employee> employeeList = EmployeeGenerator.generateEmployee();
        List<Task> taskList = TaskGenerator.generateTask();
        for (int i = 0; i < employeeList.size(); i ++) {
            System.out.println(employeeList.get(i).getFirstname() + ",   " + employeeList.get(i).getLastname() + ":    " + taskList.get(i).getName());
        }
        System.out.println();
    }

    public static void displayRole() {
        System.out.println();
        System.out.println("All Roles");
        System.out.println("=========");
        System.out.println();
        System.out.println("firstname, lastname:   role");
        System.out.println("----------------------------");
        List<Employee> employeeList = EmployeeGenerator.generateEmployee();
        List<Role> roleList = RoleGenerator.generateRoles();
        for (int i = 0; i < employeeList.size(); i ++) {
            System.out.println(employeeList.get(i).getFirstname() + ",   " + employeeList.get(i).getLastname() + ":    " + roleList.get(i).getName());
        }
        System.out.println();
    }

    public static void displayGroup() {
        System.out.println();
        System.out.println("All Groups");
        System.out.println("==========");
        System.out.println();
        System.out.println("firstname, lastname, group");
        System.out.println("---------------------------");
        List<Employee> employeeList = EmployeeGenerator.generateEmployee();
        List<Group> groupList = GroupeGenerator.generateGroup();
        for (int i = 0; i < employeeList.size(); i ++) {
            System.out.println(employeeList.get(i).getFirstname() + ",   " + employeeList.get(i).getLastname() + ":    " + groupList.get(i).getName());
        }
        System.out.println();
    }

    public static void displayLogin() {
        System.out.println();
        System.out.println("All Logins");
        System.out.println("==========");
        System.out.println();
        System.out.println("firstname, lastname, email, password");
        System.out.println("-------------------------------------");
        List<Employee> employeeList = EmployeeGenerator.generateEmployee();
        List<Login> loginList = LoginGenerator.generateLogin();
        for (int i = 0; i < employeeList.size(); i ++) {
            System.out.println(employeeList.get(i).getFirstname() + ",   " + employeeList.get(i).getLastname() + ",   " + loginList.get(i).getEmail()
            + "   '" + loginList.get(i).getPassword() +"' ");
        }
        System.out.println();
    }

    public static void displayAdress() {
        System.out.println();
        System.out.println("All Adresses");
        System.out.println("============");
        System.out.println();
        System.out.println("firstname, lastname, country, city, street");
        System.out.println("-------------------------------------------");
        List<Employee> employeeList = EmployeeGenerator.generateEmployee();
        List<Adress> adressList = AdressGenerator.generateAdress();
        for (int i = 0; i < employeeList.size(); i ++) {
            System.out.println(employeeList.get(i).getFirstname() + ",   " + employeeList.get(i).getLastname() + ":   " + adressList.get(i).getCountry()
            +",  " + adressList.get(i).getCity() + ", " + adressList.get(i).getStreet());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        displayEmployees();
        displayTask();
        displayRole();
        displayGroup();
        displayLogin();
        displayAdress();
    }
}

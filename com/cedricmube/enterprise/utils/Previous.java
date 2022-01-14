package com.cedricmube.enterprise.utils;

import com.cedricmube.enterprise.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Previous {

    public static void show(List<HashMap<Employee, List<TimeSheet>>> hashMapList){ // show the employees informations
        System.out.println();
        System.out.println("Alle MitarbeiterIn, ihre Alter und ihre Arbeitszeiten");
        System.out.println("-----------------------------------------------------");
        System.out.println();
        System.out.println("Vorname, Nachname, Alter : Tage -> Stunden");
        System.out.println("==========================================");
        for ( HashMap<Employee, List<TimeSheet>> hashlist : hashMapList) {
            for (Employee employee: hashlist.keySet()){
                List<TimeSheet> timeSheets = hashlist.get(employee);
                for (TimeSheet timeOfEmployee : timeSheets) {
                    System.out.println(employee.getSalutation() + " " + employee.getLastname() + ", " + employee.getFirstname() + ", " + employee.getAge() + " : " + timeOfEmployee.getDays() + " -> " + timeOfEmployee.getHours() + " hours");
                }
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void filter(List<Employee> employeeList){//show the employee belows 20 years old
        System.out.println();
        System.out.println("Alle Mitarbeiter unter 20 Jahre alt");
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("Vorname, Nachname : Alter");
        System.out.println("=========================");
        for (Employee employee : employeeList) {
            if (employee.getAge() < 20) { //all employees below 20 years old
                System.out.println(employee.getSalutation() + " " + employee.getLastname() + ", " + employee.getFirstname() + ": " + employee.getAge());
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void showRegistrationData(HashMap<Employee, Login> hashEmployeeRegistrationId){//show Any employee with his name, his email and password
        System.out.println();
        System.out.println("jede/r MitarbeiterIn mit ihren/seinen Login Daten");
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("Vorname, Nachname, Login Id : Email, Passwort");
        System.out.println("=============================================");
        for (Employee employee : hashEmployeeRegistrationId.keySet()) {
            Login login = hashEmployeeRegistrationId.get(employee);
            System.out.println(employee.getSalutation() + " " + employee.getLastname() +
                    ", " + employee.getFirstname() + ", " + login.getId() + " : Email (" +
                    login.getEmail() + "), Passwort(" + login.getPassword() + ")");
        }
        System.out.println();
        System.out.println();
    }

    public static HashMap<Employee, List<TimeSheet>> employeeTimeSheetHashMap(Employee employee, int timeSheetId, String[] days, double[] hours) {
        HashMap<Employee, List<TimeSheet>> timeSheetEmployeesMap = new HashMap<>();
        List<TimeSheet> timeSheetList = new ArrayList<>();
        for (int j = 0; j < hours.length; j++) {
            timeSheetList.add(new TimeSheet(timeSheetId, days[j], hours[j], employee.getId()));
            timeSheetEmployeesMap.put(employee, timeSheetList);
        }
        return  timeSheetEmployeesMap;
    }

    @SafeVarargs
    public static List<HashMap<Employee, List<TimeSheet>>> mapListOfEmployeeAndTheirTimeSheet(HashMap<Employee, List<TimeSheet>> ...hashEmployee) {
        return new ArrayList<>(Arrays.asList(hashEmployee));
    }

    public static void main(String[] args){

        Employee employee1 = new Employee(5100, "Herr ","Goeth", "Joerg",  1983, 12, 25, 10);
        HashMap<Employee, List<TimeSheet>> hashEmployee1 = employeeTimeSheetHashMap(employee1, 1004, new String[]{"Mondays","Tuesday","Wednesday","Thursday","Friday",}, new double[]{8.5,8.3,5.5,8.5,3.9});

        Employee employee2 = new Employee(5101, "Frau ","Heinrich", "Martha", 1990, 5, 17, 10);
        HashMap<Employee, List<TimeSheet>> hashEmployee2 = employeeTimeSheetHashMap(employee2, 1005, new String[]{"Mondays","Tuesday","Wednesday","Thursday","Friday",}, new double[]{8.0,7.5,5.5,9.0,5.2});

        Employee employee3 = new Employee(7500,"Herr ", "Reinberg", "Harry", 2002, 9, 30, 15);
        HashMap<Employee, List<TimeSheet>> hashEmployee3 = employeeTimeSheetHashMap(employee3, 2501, new String[]{"Tuesday","Tuesday","Friday"}, new double[]{8.0, 8.0, 4.0});

        Employee employee4 = new Employee(7501, "Frau ","Vongraber", "Jessica", 2003, 11, 3, 15);
        HashMap<Employee, List<TimeSheet>> hashEmployee4 = employeeTimeSheetHashMap(employee4, 2502, new String[]{"Monday","Wednesday","Thursday"}, new double[]{6.0, 6.0, 4.0});

        List<HashMap<Employee, List<TimeSheet>>> hashList;
        hashList = mapListOfEmployeeAndTheirTimeSheet(hashEmployee1, hashEmployee2, hashEmployee3, hashEmployee4);

        List<Employee> employeeList = createListOfEmployees(employee1, employee2, employee3, employee4);

        HashMap<Employee, Login> hashRegistrationIdOfEmployees1 = createLoginMapOfEmployees(2307 ,new Employee[]{employee1, employee2}, new String[]{"63656725", "8656749"});

        HashMap<Employee, Login> hashRegistrationIdOfEmployees2 = createLoginMapOfEmployees(3007 ,new Employee[]{employee3, employee4}, new String[]{"858358", "9476037"});

        show(hashList);
        filter(employeeList);
        showRegistrationData(hashRegistrationIdOfEmployees1);
        showRegistrationData(hashRegistrationIdOfEmployees2);
    }

    private static List<Employee> createListOfEmployees(Employee...employees){
        return new ArrayList<>(Arrays.asList(employees));
    }

    private static HashMap<Employee, Login> createLoginMapOfEmployees(int loginId, Employee[] employees, String[] passwords){
        HashMap<Employee, Login> loginMapOfEmployees = new HashMap<>();
        int i = 0;
        for (Employee employee : employees){
            Login login = new Login(loginId, employee.generateEMail(), passwords[i++], employee.getId());
            loginMapOfEmployees.put(employee, login);
        }
        return loginMapOfEmployees;
    }
}
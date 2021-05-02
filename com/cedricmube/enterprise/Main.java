package com.cedricmube.enterprise;

import com.cedricmube.enterprise.model.Employee;
import com.cedricmube.enterprise.model.Login;
import com.cedricmube.enterprise.model.TimeSheet;

import java.util.*;

public class Main {

    public static void show(List<HashMap<Employee, List<TimeSheet>>> hashMapList){ // show the employees informations
        System.out.println("All employees with their personal informations");


        for ( HashMap<Employee, List<TimeSheet>> hashlist : hashMapList) {
            for (Employee employee: hashlist.keySet()){
                List<TimeSheet> timeSheets = hashlist.get(employee);
                for (TimeSheet timeOfEmployee : timeSheets) {
                    System.out.println(employee.getSalutation() + " " + employee.getLastname()
                            + ", " + employee.getFirstname()
                            + "; " + employee.getAge() +
                            " years old " + ": " + timeOfEmployee.getDays() + " -> " + timeOfEmployee.getHours() + " hours");
                }
            }
        }
    }

    public static void filter(List<Employee> employeeList){//show the employee belows 20 years old
        System.out.println("All employees belows 20 years old:");

        for (Employee employee : employeeList) {
            if (employee.getAge() < 20) { //employees below 20 years old
                System.out.println(employee.getSalutation() + " " +
                        employee.getLastname() + ", " + employee.getFirstname()
                        + ": " + employee.getAge());
            }
        }
    }

    public static void showRegistrationData(HashMap<Employee, Login> hashEmployeeRegistrationId){//show Any employee with his name and password
        System.out.println("Any employee with his name and password:");
        for (Employee employee : hashEmployeeRegistrationId.keySet()) {
                Login login = hashEmployeeRegistrationId.get(employee);
                System.out.println(employee.getSalutation() + " " + employee.getLastname() +
                        ", " + employee.getFirstname() + ": email (" +
                        login.getEmail() + "), password(" + login.getPassword() + ")");
        }
    }

    public static HashMap<Employee, List<TimeSheet>> employeeTimeSheetHashMap(Employee employee, int timeSheetId, String[] days, double[] hours) {
        int i = 0;
        HashMap<Employee, List<TimeSheet>> timeSheetEmployeesMap = new HashMap<>();
        List<TimeSheet> timeSheetList = new ArrayList<>();
        timeSheetList.add(new TimeSheet(timeSheetId, days[i++], hours[i++], employee.getId()));
        timeSheetEmployeesMap.put(employee, timeSheetList);
        return  timeSheetEmployeesMap;

    }

    public static List<HashMap<Employee, List<TimeSheet>>> listOfMapForEmployeeAndTheirTimeSheet(HashMap<Employee, List<TimeSheet>> ...hashEmployee) {
        List<HashMap<Employee, List<TimeSheet>>> hashMapList = new ArrayList<>();
        hashMapList.addAll(Arrays.asList(hashEmployee));
        return hashMapList;
    }

    public static void main(String[] args){

        Employee employee1 = new Employee(5100, "Herr ","Goeth", "Joerg",  1983, 12, 25, 10);
        HashMap<Employee, List<TimeSheet>> hashEmployee1 = employeeTimeSheetHashMap(employee1, 1004, new String[]{"Mondays","Tuesday","Wednesday","Thursday","Friday",}, new double[]{8.5,8.3,5.5,8.5,3.9});

        Employee employee2 = new Employee(5101, "Frau ","Heinrich", "Martha", 1990, 5, 17, 10);
        HashMap<Employee, List<TimeSheet>> hashEmployee2 = employeeTimeSheetHashMap(employee2, 1005, new String[]{"Mondays","Tuesday","Wednesday","Thursday","Friday",}, new double[]{8.0,7.5,5.5,9.0,5.2});

        Employee employee3 = new Employee(7500,"Herr ", "Reinberg", "Harry", 2002, 9, 30, 15);
        HashMap<Employee, List<TimeSheet>> hashEmployee3 = employeeTimeSheetHashMap(employee3, 2501, new String[]{"Tuesday","Tuesday","Friday"}, new double[]{8.0, 8.0, 4.0});

        Employee employee4 = new Employee(7501, "Frau ","Vongraber", "Jessica", 2003, 11, 03, 15);
        HashMap<Employee, List<TimeSheet>> hashEmployee4 = employeeTimeSheetHashMap(employee4, 2502, new String[]{"Monday","Wednesday","Thursday"}, new double[]{6.0, 6.0, 4.0});

        List<HashMap<Employee, List<TimeSheet>>> hashList = new ArrayList<>();
        hashList = listOfMapForEmployeeAndTheirTimeSheet(hashEmployee1, hashEmployee2, hashEmployee3, hashEmployee4);

        List<Employee> employeeList = createListOfEmployees(employee1, employee2, employee3, employee4);

        HashMap<Employee, Login> hashRegistrationIdOfEmployees =
        createLoginMapOfEmployees(23 ,new Employee[]{employee1, employee2, employee3, employee4},
                new String[]{"63656725", "8656749", "858358", "9476037"});

        filter(employeeList);

        show(hashList);
        showRegistrationData(hashRegistrationIdOfEmployees);


    }
    private static List<Employee> createListOfEmployees(Employee...employees){
        List<Employee> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList(employees));
        return employeesList;
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

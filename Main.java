import java.util.*;

public class Main {

    public static void show(HashMap<Employee, List<TimeSheet>> hashEmployee){ // show the employees informations
        System.out.println("All employees with their personal informations");

        for (Employee employee : hashEmployee.keySet()) {
            List<TimeSheet> timeSheets = hashEmployee.get(employee);

            for (TimeSheet time : timeSheets){
                System.out.println(employee.getName() + ", " + employee.getSurname()
                        + "; " + employee.getAge() + " years old " +": " + time.getDay()
                        + " -> " + time.getHours() + " hours");
            }
        }
    }

    public static void filter(List<Employee> employeeList){//show the employee belows 20 years old
        System.out.println("All employees belows 20 years old:");

        for (Employee employee : employeeList) {
            if (employee.getAge() < 20) { //employees below 20 years old
                System.out.println(employee.getName() + ", " + employee.getSurname()
                        + ": " + employee.getAge());
            }
        }
    }

    public static void showRegistrationData(HashMap<Employee, Login> hashEmployeeRegistrationId){//show Any employee with his name and password
        System.out.println("Any employee with his name and password:");

        for (Employee employee : hashEmployeeRegistrationId.keySet()) {
                Login login = hashEmployeeRegistrationId.get(employee);
                System.out.println(employee.getName() + ", " + employee.getSurname() + ": email (" +
                        login.geteMail() + "), password(" + login.getPassword() + ")");
            }
        }


    public static void main(String[] args){

        Employee employee1 = new Employee("Goeth", "Joerg", "joerggeoth@hotmail.de", 28, 51210);
        TimeSheet timeSheet1 = new TimeSheet(51210, "Mondays", 8.5);
        TimeSheet timeSheet2 = new TimeSheet(51210, "Tuesday", 8.3);
        TimeSheet timeSheet3 = new TimeSheet(51210, "Wednesday", 5.5);
        TimeSheet timeSheet4 = new TimeSheet(51210, "Thursday", 8.5);
        TimeSheet timeSheet5 = new TimeSheet(51210, "Friday", 3.9);


        Employee employee2 = new Employee("Heinrich", "Martha", "marthaheinrich@hotmail.de", 32, 51835);
        TimeSheet timeSheet6 = new TimeSheet(51835, "Mondays", 8.0);
        TimeSheet timeSheet7 = new TimeSheet(51835, "Tuesday", 7.5);
        TimeSheet timeSheet8 = new TimeSheet(51835, "Wednesday", 5.5);
        TimeSheet timeSheet9 = new TimeSheet(51835, "Thursday", 9.0);
        TimeSheet timeSheet10 = new TimeSheet(51835, "Friday", 5.2);


        Employee employee3 = new Employee("Reinberg", "Harry", "harryreinberg@hotmail.de", 19, 28457);
        TimeSheet timeSheetStudent1 = new TimeSheet(28457, "Tuesday", 8.0);
        TimeSheet timeSheetStudent2 = new TimeSheet(28457, "Thursday", 8.0);
        TimeSheet timeSheetStudent3 = new TimeSheet(28457, "Friday", 4.0);

        Employee employee4 = new Employee("Vongraber", "Jessica", "jessicavongraber@hotmail.de", 18, 28256);
        TimeSheet timeSheetStudent4 = new TimeSheet(28256, "Monday", 6.0);
        TimeSheet timeSheetStudent5 = new TimeSheet(28256, "Wednesday", 6.0);
        TimeSheet timeSheetStudent6 = new TimeSheet(28256, "Thursday", 4.0);
        TimeSheet timeSheetStudent7 = new TimeSheet(28256, "Thursday", 4.0);

        HashMap<Employee, List<TimeSheet>> hashEmployee = new HashMap<>();

        List<TimeSheet> timeSheetOfEmployee1 = createTimesystems(timeSheet1, timeSheet2, timeSheet3, timeSheet4, timeSheet5);
        hashEmployee.put(employee2, timeSheetOfEmployee1);

        List<TimeSheet> timeSheetOfEmployee2 = createTimesystems(timeSheet6, timeSheet7, timeSheet8, timeSheet9, timeSheet10);
        hashEmployee.put(employee2, timeSheetOfEmployee2);

        List<TimeSheet> timeSheetOfEmployee3 = createTimesystems(timeSheetStudent1, timeSheetStudent2, timeSheetStudent3);
        hashEmployee.put(employee3, timeSheetOfEmployee3);

        List<TimeSheet> timeSheetOfEmployee4 = createTimesystems(timeSheetStudent4, timeSheetStudent5, timeSheetStudent6, timeSheetStudent7);
        hashEmployee.put(employee4, timeSheetOfEmployee4);

        List<Employee> employeeList = createListOfEmployees(employee1, employee2, employee3, employee4);

        HashMap<Employee, Login> hashRegistrationIdOfEmployees =
        createLoginMapOfEmployees(new Employee[]{employee1, employee2, employee3, employee4},
                new String[]{"63656725", "8656749", "858358", "9476037"});

        //filter(employeeList);

        //show(hashEmployee);
        //showRegistrationData(hashRegistrationIdOfEmployees);


    }

    private static List<TimeSheet> createTimesystems(TimeSheet... timeSheets){
        List<TimeSheet> timeSheetList = new ArrayList<>();
        timeSheetList.addAll(Arrays.asList(timeSheets));
        return timeSheetList;
    }

    private static List<Employee> createListOfEmployees(Employee ...employees){
        List<Employee> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList(employees));
        return employeesList;
    }

    private static HashMap<Employee, Login> createLoginMapOfEmployees(Employee[] employees, String[] passwords){
        HashMap<Employee, Login> loginMapOfEmployees = new HashMap<>();
        int i = 0;
        for (Employee employee : employees){
            Login login = new Login(employee.geteMail(), passwords[i++]);
            loginMapOfEmployees.put(employee, login);
        }
        return loginMapOfEmployees;
    }


}

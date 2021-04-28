import java.util.*;

public class Main {

    public static void show(HashMap<Employee, List<TimeSystem>> hashEmployee){ // show the employees informations
        System.out.println("All employees with their personal informations");

        for (Employee employee : hashEmployee.keySet()) {
            List<TimeSystem> timeSystems = hashEmployee.get(employee);

            for (TimeSystem time : timeSystems){
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
        TimeSystem timeSystem1 = new TimeSystem(51210, "Mondays", 8.5);
        TimeSystem timeSystem2 = new TimeSystem(51210, "Tuesday", 8.3);
        TimeSystem timeSystem3 = new TimeSystem(51210, "Wednesday", 5.5);
        TimeSystem timeSystem4 = new TimeSystem(51210, "Thursday", 8.5);
        TimeSystem timeSystem5 = new TimeSystem(51210, "Friday", 3.9);


        Employee employee2 = new Employee("Heinrich", "Martha", "marthaheinrich@hotmail.de", 32, 51835);
        TimeSystem timeSystem6 = new TimeSystem(51835, "Mondays", 8.0);
        TimeSystem timeSystem7 = new TimeSystem(51835, "Tuesday", 7.5);
        TimeSystem timeSystem8 = new TimeSystem(51835, "Wednesday", 5.5);
        TimeSystem timeSystem9 = new TimeSystem(51835, "Thursday", 9.0);
        TimeSystem timeSystem10 = new TimeSystem(51835, "Friday", 5.2);


        Employee employee3 = new Employee("Reinberg", "Harry", "harryreinberg@hotmail.de", 19, 28457);
        TimeSystem timeSystemStudent1 = new TimeSystem(28457, "Tuesday", 8.0);
        TimeSystem timeSystemStudent2 = new TimeSystem(28457, "Thursday", 8.0);
        TimeSystem timeSystemStudent3 = new TimeSystem(28457, "Friday", 4.0);

        Employee employee4 = new Employee("Vongraber", "Jessica", "jessicavongraber@hotmail.de", 18, 28256);
        TimeSystem timeSystemStudent4 = new TimeSystem(28256, "Monday", 6.0);
        TimeSystem timeSystemStudent5 = new TimeSystem(28256, "Wednesday", 6.0);
        TimeSystem timeSystemStudent6 = new TimeSystem(28256, "Thursday", 4.0);
        TimeSystem timeSystemStudent7 = new TimeSystem(28256, "Thursday", 4.0);

        HashMap<Employee, List<TimeSystem>> hashEmployee = new HashMap<>();

        List<TimeSystem> timeSystemOfEmployee1 = createTimesystems(timeSystem1, timeSystem2, timeSystem3, timeSystem4, timeSystem5);
        hashEmployee.put(employee2, timeSystemOfEmployee1);

        List<TimeSystem> timeSystemOfEmployee2 = createTimesystems(timeSystem6, timeSystem7, timeSystem8, timeSystem9, timeSystem10);
        hashEmployee.put(employee2, timeSystemOfEmployee2);

        List<TimeSystem> timeSystemOfEmployee3 = createTimesystems(timeSystemStudent1, timeSystemStudent2, timeSystemStudent3);
        hashEmployee.put(employee3, timeSystemOfEmployee3);

        List<TimeSystem> timeSystemOfEmployee4 = createTimesystems(timeSystemStudent4, timeSystemStudent5, timeSystemStudent6, timeSystemStudent7);
        hashEmployee.put(employee4, timeSystemOfEmployee4);

        List<Employee> employeeList = createListOfEmployees(employee1, employee2, employee3, employee4);

        HashMap<Employee, Login> hashRegistrationIdOfEmployees =
        createLoginMapOfEmployees(new Employee[]{employee1, employee2, employee3, employee4},
                new String[]{"63656725", "8656749", "858358", "9476037"});

        //filter(employeeList);

        //show(hashEmployee);
        showRegistrationData(hashRegistrationIdOfEmployees);
    }

    private static List<TimeSystem> createTimesystems(TimeSystem ...timeSystems){
        List<TimeSystem> timeSystemList = new ArrayList<>();
        timeSystemList.addAll(Arrays.asList(timeSystems));
        return timeSystemList;
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

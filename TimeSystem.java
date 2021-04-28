public class TimeSystem {

//  attributs of the class------------------------------------------------------------------------------------
    private int employeeId;
    private String day;
    private double hours;


//  constructor of the class--------------------------------------------------------------------------------
public TimeSystem(int employeeId, String day, double hours){
    this.employeeId = employeeId;
    this.day = day;
    this.hours = hours;
}

//  methods of the class------------------------------------------------------------------------------------

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}

public class Employee {

//  attributs of the class------------------------------------------------------------------------------------
    private String name;
    private String surname;
    private String eMail;
    private String sex;
    private int age;
    private int id;


// constructor of the class--------------------------------------------------------------------------------
    public Employee(String name, String surname, String eMail, int age, int id){
        this.name = name;
        this.surname = surname;
        this.eMail = eMail;
        this.age = age;
        this.id = id;
    }

 // name of employees--------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//  Surname of employees-----------------------------------------------------------------------------------
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

//  eMail of employees----------------------------------------------------------------------------------------
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

//  Sex of employee------------------------------------------------------------------------------------------
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

//  Age of employee------------------------------------------------------------------------------------------
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//  Id of employee---------------------------------------------------------------------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

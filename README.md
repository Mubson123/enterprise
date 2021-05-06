# enterprise

- Create a class Role (id, name)
- Create a class com.cedricmube.enterprise.model.Group (id, name, role_id)
- Create a class Login(id, email, password, employee_id)
- Adjust the class Employee(id, salutation, firstname, lastname, birthDate, groupe_id)
- Create a class Adress(id, county, city, street, employee_id)
- Adjust the class Timesheet(id, days, hours, employee_id)
- Create class Task(id, name, employee_id)
- Create a class Child(id, parent_id, name) = this class represents the child of an employee


- Create a class RoleGenerator  which generate some dummy roles (make you code nicer by using an array of rolesname)
- Create a class GroupeGenerator  which generate some dummy groupes (.....................................groupesname)
- Create a class EmployeeGenerator which generates some dummy Employee using an array of firstname, an array of lastname, an array of birthday
- Create a class LoginGenerator  which generate some logins using the generated employees
- Create a class AdressGenerator  which generate some adresses for the generated employees
- Create a class TimesheetGenerator  which generate some timesheet for the generated employees
- Create a class TaskGenerator  which generate some tasks for the generated employees

# Display this tables
- all Employees (firstname, lastname, age)
- all Employees task (firstname, lastname, taskname)
- all Employees role (firstname, lastname, role)
- all Employees groupe (firstname, lastname, groupe)
- all Employees login (firstname, lastname, email, password)
- all Employees adress (firstname, lastname, country, city, street)
- all Employees (firstname, lastname, age)

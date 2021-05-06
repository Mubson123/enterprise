# enterprise

- Create a class com.cedricmube.enterprise.model.Role (id, name)
- Create a class com.cedricmube.enterprise.model.Group (id, name, role_id)
- Create a class com.cedricmube.enterprise.model.Login(id, email, password, employee_id)
- Adjust the class com.cedricmube.enterprise.model.Employee(id, salutation, firstname, lastname, birthDate, groupe_id)
- Create a class com.cedricmube.enterprise.model.Adress(id, county, city, street, employee_id)
- Adjust the class Timesheet(id, days, hours, employee_id)
- Create class com.cedricmube.enterprise.model.Task(id, name, employee_id)
- Create a class com.cedricmube.enterprise.model.Child(id, parent_id, name) = this class represents the child of an employee


- Create a class com.cedricmube.enterprise.utils.RoleGenerator  which generate some dummy roles (make you code nicer by using an array of rolesname)
- Create a class com.cedricmube.enterprise.utils.GroupeGenerator  which generate some dummy groupes (.....................................groupesname)
- Create a class EmployeeGenerator which generates some dummy com.cedricmube.enterprise.model.Employee using an array of firstname, an array of lastname, an array of birthday
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

# TODO
- Make Generator classes leaner by improving the methods
- Create a class ModelConnector to connect Employee with other model
- Create a class ConntorManager qui appel les methodes de la Class ModelConnector afin the cree un ou des Employee(s) avec toutes ses connections(Adress, Timesheet, children...)
- pour tester pull

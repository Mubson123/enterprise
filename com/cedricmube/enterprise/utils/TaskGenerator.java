package com.cedricmube.enterprise.utils;

import com.cedricmube.enterprise.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskGenerator {

    /**
     * id,
     * name,
     * employee_id
     * hours
     */

    public static List<Task> generateTask() {
        List<Task> taskList = new ArrayList<>();
        String[] tasksNames = {"secure the city", "transport the passengers at home",
        "verify the economic's state of the enterprise", "to do meteo's previsions",
        "clean up the IT-System of the industry", "Manage employees", "take " +
                " online commands of clients", "to do reports of work of any employee"};

        for (int i = 0; i < taskList.size(); i++) {
            taskList.add(new Task(i,tasksNames[i], EmployeeGenerator.generateEmployee().get(i).getId(),
                    TimeSheetGenerator.generateTimeSheet().get(i).getHours()));
        }
        return taskList;
    }
}

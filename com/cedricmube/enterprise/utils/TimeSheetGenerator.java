package com.cedricmube.enterprise.utils;

import com.cedricmube.enterprise.model.TimeSheet;

import java.util.ArrayList;
import java.util.List;

public class TimeSheetGenerator {
    /**
     * id,
     * days,
     * hours,
     * employee_id
     */

    public static List<TimeSheet> generateTimeSheet(){
        List<TimeSheet> timeSheetList = new ArrayList<>();
        String[] days = {"Monday","Tuesday","Wednesday","Thursday",
                "Friday"};
        double[] hours = {8.0,8.0,8.0,8.0,8.0,8.0};

        for (int i = 0; i < days.length; i++) {
            timeSheetList.add(new TimeSheet(i, days[i], hours[i],
                    EmployeeGenerator.generateEmployee().get(i).getId()));
        }
        return timeSheetList;
    }
}

package com.cedricmube.enterprise.utils;

import com.cedricmube.enterprise.model.Group;
import com.cedricmube.enterprise.model.Role;

import java.util.*;

public class GroupeGenerator {

    public static List<Group> generateGroup() {
        String[] names = {"Gesundheitswesen", "Verkehr", "Sicherheit",
        "Lebensmittel", "Finanz", "Sport", "Wissenschaft und Technologie",
        "Kommunikation", "Logistik"};

        List<Role> roles = RoleGenerator.generateRoles();
        List<Group> groupList = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Group group = new Group(i, names[i], roles.get(i).getId());
            groupList.add(group);
        }
        return  groupList;
    }
}

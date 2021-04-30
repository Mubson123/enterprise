package com.cedricmube.enterprise.utils;

import com.cedricmube.enterprise.model.Role;

import java.util.*;

public class RoleGenerator {
    public static List<Role> generateRoles(){
        List<Role> roleList = new ArrayList<>();

        String[] rolesName = {"Arzt / Ärztin", "Taxifahrer/in", "Polizist/in",
                "Physiker/in", "Ingineer/in", "Fussballer/in", "Informatiker/in",
                "Wirtschaftwissenschaftler/in", "Verkaeufer/in", "Banker/in",
                "Journalist/in", "Logistiker/in"
        };

        for (int i = 0; i < rolesName.length ; i++) {
            roleList.add(new Role(i ,rolesName[i]));
        }
        return roleList;
    }
}


package com.cedricmube.enterprise.utils;

import com.cedricmube.enterprise.model.Adress;

import java.util.ArrayList;
import java.util.List;

public class AdressGenerator {
    /**
     * id
     * country
     * city
     * street
     * employee_id
     */

    public static List<Adress> generateAdress() {
        List<Adress> adressList = new ArrayList<>();
        String[] cities = {" 91054 Erlangen ", " 90402 Nuremberg ", "75001 Paris", "3001 Bern",
                "2300 Wien","Nord London", "1005 Bruessel"};

        String[] countries = {"Germany", "Germany", "France", "Swiss", "Austria",
        "Great Britain", "Belgium"};

        String[] streets = {" Haagstrasse 12", " Nuernbergerstrasse 23", " rue Laurent-Dupont 39",
        "Goathstrasse 124", "Wiener Str. 47", "Great-Hall street 98", "rue des Oilles 46"};

        for (int i = 0; i < countries.length; i++) {
            adressList.add(new Adress(i, countries[i], cities[i], streets[i],
                    EmployeeGenerator.generateEmployee().get(i).getId()));
        }
        return adressList;
    }
}

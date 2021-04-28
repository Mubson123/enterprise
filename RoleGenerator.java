import java.util.*;

public class RoleGenerator {

    public static String GenerateRole(){    // This function muss generate some roles
        List<String> someRole = new ArrayList<>();
        someRole.add("Arzt / Ärztin");
        someRole.add("Taxifahrer/in");
        someRole.add("Polizist/in");
        someRole.add("Physiker/in");
        someRole.add("Ingineer/in");
        someRole.add("Fussballer/in");
        someRole.add("Informatiker/in");
        someRole.add("Wirtschaftwissenschaftler/in");
        someRole.add("Verkaeufer/in");
        someRole.add("Banker/in");
        someRole.add("Journalist/in");
        someRole.add("Logistiker/in");


        String thisRole = "";
        for (int i = 0; i < someRole.size(); i++){
            thisRole = someRole.get((int)(Math.random() * i));
        }
        System.out.println("Sie sind: " + thisRole);
        return thisRole;
    }

    public static void main(String[] args){
        GenerateRole();
    }
}

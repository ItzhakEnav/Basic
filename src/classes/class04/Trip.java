package classes.class04;

import java.util.ArrayList;
import java.util.List;

public class Trip {
    public static String[] countriesTeatIWas() {
        return new String[]{"USA", "Bulgaria", "Grace", "Cyprus"};
    }

    public static void PrintCountry(List<String> countries) {
        for (String a : countries) {
            System.out.println(a);
        }
    }

    public static void SetTheLoveCountry(List<String> countries) {

        countries.set(0, "Bulgaria");
    }

    public static void CheckIfContain(List<String> countries) {
        int countyIndex = countries.indexOf("Germany");

        if (countyIndex != -1) {
            System.out.println("I was in Germany - " + countyIndex);
        } else {
            System.out.println("I was not in Germany");
        }
    }

    public static List<String> MyNextTrip() {
        List<String> myNextTrip = new ArrayList<>();
        myNextTrip.add(0, "India");
        myNextTrip.add(1, "japan");
        myNextTrip.add(2, "Nepal");
        return myNextTrip;
    }
}


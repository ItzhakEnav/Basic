package classes.class04;

import classes.class03.ObjectOrientedPrograming05.MainProgram;

import java.util.*;

public class CountryList {
    public static void main(String[] args) {
        // Ex01
        List<String> countries = new ArrayList<>(Arrays.asList(Trip.countriesTeatIWas()));
        // Ex02
        Trip.PrintCountry(countries);
        // Ex03
        System.out.println("Numbers of countries: " + countries.size() + "\n");
        Trip.SetTheLoveCountry(countries);
        // Ex04
        Trip.PrintCountry(countries);
        // Ex05
        Trip.CheckIfContain(countries);
        // Ex06
        System.out.println(countries.get(countries.size() - 1));
        // Ex07
        countries.addAll(Trip.MyNextTrip());
        System.out.println(countries);
        // Check if the Ex.. was Working with Set
        Set<String> s = new HashSet<String>();
        s.add("e");
        s.add("d");
        s.add("v");
        System.out.println(s);


    }
}

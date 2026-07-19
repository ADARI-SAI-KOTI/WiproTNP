/*
Develop a java class with a instance variable H1 (HashSet)  add a method saveCountryNames(String CountryName) , the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null. 
NOTE: You can test the methods using a main method.
*/

import java.util.HashSet;

public class CountryHashSet {
    private HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    public String getCountry(String CountryName) {
        for (String country : H1) {
            if (country.equalsIgnoreCase(CountryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CountryHashSet demo = new CountryHashSet();
        
        demo.saveCountryNames("India");
        demo.saveCountryNames("USA");
        demo.saveCountryNames("Japan");

        System.out.println("Searching for Japan: " + demo.getCountry("Japan"));
        System.out.println("Searching for Brazil: " + demo.getCountry("Brazil"));
    }
}
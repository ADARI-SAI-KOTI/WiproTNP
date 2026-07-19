/*
Implement the assignment 1 using TreeSet
*/

import java.util.TreeSet;

public class CountryTreeSet {
    private TreeSet<String> H1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String CountryName) {
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
        CountryTreeSet demo = new CountryTreeSet();
        
        demo.saveCountryNames("India");
        demo.saveCountryNames("USA");
        demo.saveCountryNames("Japan");

        System.out.println("TreeSet contents (Sorted automatically): " + demo.H1);
        System.out.println("Searching for India: " + demo.getCountry("India"));
        System.out.println("Searching for Germany: " + demo.getCountry("Germany"));
    }
}
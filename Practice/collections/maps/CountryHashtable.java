/*
Implement the assignment 1 using HashTable
*/

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class CountryHashtable {
    private Hashtable<String, String> M1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String CountryName, String capital) {
        M1.put(CountryName, capital);
        return M1;
    }

    public String getCapital(String CountryName) {
        return M1.get(CountryName);
    }

    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Hashtable<String, String> invertMap() {
        Hashtable<String, String> M2 = new Hashtable<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    public ArrayList<String> getCountryList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        CountryHashtable demo = new CountryHashtable();
        demo.saveCountryCapital("India", "Delhi");
        demo.saveCountryCapital("Japan", "Tokyo");

        System.out.println("Capital of India: " + demo.getCapital("India"));
        System.out.println("Country with Capital Tokyo: " + demo.getCountry("Tokyo"));
        System.out.println("Inverted Map: " + demo.invertMap());
        System.out.println("Country Names List: " + demo.getCountryList());
    }
}
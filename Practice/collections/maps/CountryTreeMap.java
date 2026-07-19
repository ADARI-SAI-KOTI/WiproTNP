/*
Implement the assignment 1 using TreeMap
*/

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class CountryTreeMap {
    private TreeMap<String, String> M1 = new TreeMap<>();

    public TreeMap<String, String> saveCountryCapital(String CountryName, String capital) {
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

    public TreeMap<String, String> invertMap() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    public ArrayList<String> getCountryList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        CountryTreeMap demo = new CountryTreeMap();
        demo.saveCountryCapital("Japan", "Tokyo");
        demo.saveCountryCapital("India", "Delhi");

        System.out.println("TreeMap contents (Sorted by key): " + demo.M1);
        System.out.println("Capital of Japan: " + demo.getCapital("Japan"));
        System.out.println("Country with Capital Delhi: " + demo.getCountry("Delhi"));
        System.out.println("Inverted Map (Sorted by Capital): " + demo.invertMap());
        System.out.println("Country Names List: " + demo.getCountryList());
    }
}
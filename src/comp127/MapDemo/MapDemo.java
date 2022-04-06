package comp127.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapDemo {
    public static void main(String[] args) {
        // HashMap keys are in random order
        // TreeMap keys are in alphabetical order (sorted)
        Map<String, Integer> map = new TreeMap<>();
        map.put("zebra", 20);
        map.put("Canary", 10);
        map.put("deer", 4);
        map.put("bear", 1);
        map.put("Aardvaark", 35);

        String k = "Canary";
        // System.out.println("For our key " + k + " there are " + map.get(k) + " of them");

        // for (String j : map.keySet()) {
        //     System.out.println("For our key " + j + " there are " + map.get(j) + " of them");
        // }

        for (Entry e : map.entrySet()) {
            // Entry is a key value pair entry in a Map
            System.out.println("For our key " + e.getKey() + " there are " + e.getValue() + " of them");
        }
    }
}

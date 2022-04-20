package lab3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sebi", 300);
        map.put("Cristi", 100);
        map.put("Andreea", 200);
        map.put("Cristi", 500);

        System.out.println(map);
        System.out.println(map.get("Sebi"));

        for(String key : map.keySet())
            map.put(key, map.get(key)+1000);
        System.out.println(map);

        Map<String, Integer> orderedMap = new LinkedHashMap<>();
        orderedMap.put("Sebi", 300);
        orderedMap.put("Cristi", 100);
        orderedMap.put("Andreea", 200);
        orderedMap.put("Cristi", 500);

        System.out.println(orderedMap);

        Map<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Sebi", 100);
        sortedMap.put("Cristi", 100);
        sortedMap.put("Andreea", 100);
        sortedMap.put("Cristi", 100);

        System.out.println(sortedMap);
    }
}

package lab3;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {

    public static void main(String[] args) {
        Map<String, Integer> salaryMap = new HashMap<>();
        salaryMap.put("Cristi", 5);
        salaryMap.put("Stefania", 15);
        salaryMap.put("Alexandra", 15);

        for(String key : salaryMap.keySet()){
            if(salaryMap.get(key) > 10)
                System.out.println(key);
        }
    }
}

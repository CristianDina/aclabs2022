package lab3;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        String str1 = new String("ceva");
        String str2 = new String("ceva");
        String str3 = new String("ceva");
        stringSet.add(str1);
        stringSet.add(str2);
        stringSet.add(str3);

        System.out.println(stringSet);
        for (String str : stringSet)
            System.out.println(str);
    }
}

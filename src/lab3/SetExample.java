package lab3;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Cristi");
        set.add("Paula");
        set.add("Alex");
        set.add("Sebi");
        set.add("Sebi");
        set.add("Andrei");

        System.out.println(set);
        set.remove("Cristi");
        System.out.println(set);

        for(String name : set)
            if(name.equals("Alex"))
                System.out.println("L-am gasit.");

        System.out.println(set.contains("Paula"));

        Set<String> orderedSet = new LinkedHashSet<>();
        orderedSet.add("Cristi");
        orderedSet.add("Paula");
        orderedSet.add("Alex");
        orderedSet.add("Sebi");
        orderedSet.add("Andrei");
        orderedSet.add("Andrei");
        System.out.println(orderedSet);

        Set<String> sortedSet = new TreeSet<>(orderedSet);
        System.out.println(sortedSet);

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        Set<Integer> numberSet = new HashSet<>(list);
        System.out.println(numberSet);
    }
}

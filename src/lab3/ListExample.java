package lab3;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(0, 5);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++)
            list.set(i, list.get(i) + 1);

        System.out.println(list);
    }
}

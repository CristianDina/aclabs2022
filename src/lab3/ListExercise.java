package lab3;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
            numberList.add(i);
        for (Integer number : numberList) {
            if (number % 2 == 0)
                System.out.println(number);
        }
    }
}

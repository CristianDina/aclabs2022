package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionExample {

    public static void readFromFile() throws FileNotFoundException {
        File myObj = new File("/Users/cristian.dina/Documents/Github/aclabs2022/src/lab3/filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }

    public static void main(String[] args) {
        try {
            List<Integer> list = new ArrayList<>();
             list.get(20);
            throw new Exception();

        } catch(IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds exception: " + e.getMessage());
        } catch(Exception e){
            System.out.println("Exception! "+ e);
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Out of try-catch");

        try {
            readFromFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Out of try-catch");
    }
}

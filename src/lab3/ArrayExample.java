package lab3;

public class ArrayExample {

    public static void main(String[] args) {
        int[] numere = new int[10];

        numere[0]=0;
        for(int i=0; i < 10; i++)
            numere[i]=i;

        for(int i=0; i < 10; i++)
            System.out.print(numere[i] + " ");

        int[] numere2 = new int[11];
        for(int i=0; i < 10; i++)
            numere2[i]=numere[i];
        numere2[10]= 10;
        System.out.println();

        for(int i=0; i < 11; i++)
            System.out.print(numere2[i] + " ");
    }
}

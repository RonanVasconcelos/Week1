package Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner getTyped = new Scanner(System.in);

        System.out.println("Digit any number: ");
        int number = getTyped.nextInt();

        for (int i = 0; i <= number;  i++){
            System.out.print(i +" ");

        }




    }
}

package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {

    public static void main(String[] args) {

        Scanner getTyped = new Scanner(System.in);
        System.out.println("Digit a number: ");
        int number = getTyped.nextInt();
        int sum = 0;

        while (number != 0){
            sum += number;
            System.out.println("The total so far is "+sum);
            if(number != 0){
                System.out.println("Digit a number: ");
                number = getTyped.nextInt();
            }
        }
    }
}

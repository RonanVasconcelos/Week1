package Week1.WhileLoops;


import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        System.out.println("- - - - - - THE NUMBER GUESSING GAME - - - - - -");

        Scanner getTyped = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("I am thinking in a number from 0 to 10, try to Guess");
        int number = getTyped.nextInt();

        int random = rand.nextInt(10);

        while (true){

            if(number == random){
                System.out.println("That's right!  My secret number was " +random);
                break;
            }if(number != random){
                System.out.println("That is incorrect. Guess again");
                number = getTyped.nextInt();
            }
        }
    }
}

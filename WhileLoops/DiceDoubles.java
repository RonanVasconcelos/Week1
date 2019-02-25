package Week1.WhileLoops;

import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args) {
        System.out.println(" - - - - - HERE COMES THE DICE - - - - - ");

        Random rand = new Random();

        int random1 = rand.nextInt(6);
        int random2 = rand.nextInt(6);

        while (true){
            System.out.println("Roll #1: " +random1);
            System.out.println("Roll #2: " +random2);
            System.out.println("------------------");

            if(random1 != random2){
                random1 = rand.nextInt(6);
                random2 = rand.nextInt(6);
            }if(random1 == random2){
                System.out.println("Roll #1: " +random1);
                System.out.println("Roll #2: " +random2);
                break;

            }

        }



    }
}

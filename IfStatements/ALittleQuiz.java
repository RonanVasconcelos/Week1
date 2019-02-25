package Week1.IfStatements;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
        Scanner getTyped = new Scanner(System.in);
        System.out.println("Are you ready for a quiz? if yes, Insert your name: ");
        String name = getTyped.nextLine();

        System.out.println("Ok " + name + "! Here it comes.");
        int score = 0;
        System.out.println();

//----------------------------------------------------------------------------------------------
        System.out.println("Q1) What is the capital of Alaska? ");
        System.out.println("1) Melbourne");
        System.out.println("2) Anchorage");
        System.out.println("3) Juneau");
        int q1 = getTyped.nextInt();

        while (true) {

            if (q1 == 1 || q1 == 2 || q1 == 3) {

                if (q1 == 3){
                    System.out.println("That's right!");
                    score += 1;
                }

                if (q1 != 3) {
                    System.out.println("That's Wrong! The Capital of Alaska is 3) Juneau!");
                }
                break;

            } else {
                System.out.println("You should digit the number 1 or 2 or 3!");
                if (q1 != 1 || q1 != 2 || q1 != 3) {
                    System.out.println("Try again!");
                    q1 = getTyped.nextInt();
                }
            }

        }

        System.out.println();
        //----------------------------------------------------------------------------------------------

        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        int q2 = getTyped.nextInt();

        while (true) {

            if (q2 == 1 || q2 == 2) {
                if (q2 == 2){
                    System.out.println("That's right!");
                    score += 1;
                }
                if (q2 != 2) {
                    System.out.println("That's Wrong! \"Cat\" is a string. ints can only store numbers");
                }
                break;
            } else {
                System.out.println("You should digit the number 1 or 2!");
                if (q2 != 1 || q2 != 2) {
                    System.out.println("Try again!");
                    q2 = getTyped.nextInt();
                }
            }

        }
        System.out.println();
//----------------------------------------------------------------------------------------------
        System.out.println("Q3) What is the result of 9+6/3?");
        System.out.println("1) 5");
        System.out.println("2) 11");
        System.out.println("3) 15/3");

        int q3 = getTyped.nextInt();

        while (true) {

            if (q3 == 1 || q3 == 2 || q3 == 3) {

                if (q3 == 2){
                    System.out.println("That's right!");
                    score += 1;
                }
                if (q3 != 2) {
                    System.out.println("That's Wrong! The result is 11!");
                }
                break;

            } else {
                System.out.println("You should digit the number 1 or 2 or 3!");

                if (q3 != 1 || q3 != 2 || q3 != 3) {
                    System.out.println("Try again!");
                    q3 = getTyped.nextInt();
                }
            }

        }
        System.out.println();
//---------------------------------------------------------------------------

        System.out.println("You score is " + score);
        if (score == 3) {
            System.out.println("Excellent job " + name + "! you were perfect!");
        }
        if (score == 2) {
            System.out.println("Overall, you got 2 out of 3 correct");
        }
        if (score == 1) {
            System.out.println("OMG, Just 1 correct ");
        }
        if (score == 0) {
            System.out.println(name +" That was Terrible!");
        }
        System.out.println(name +" Thanks for playing");

    }
}

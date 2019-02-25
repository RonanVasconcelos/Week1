package Week1.Variables;

import java.util.Scanner;

public class StillUsingVariables {
    public static void main(String[] args) {

        Scanner getTyped = new Scanner(System.in);

        System.out.println("What's your name: ?");
        String name = getTyped.nextLine();

        System.out.println("What's your graduation's year: ?");
        String yearGraduation = getTyped.nextLine();

        System.out.println("My name is " +name +" and I`ll graduate in " +yearGraduation);

    }
}

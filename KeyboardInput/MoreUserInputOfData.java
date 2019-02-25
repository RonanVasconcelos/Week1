package Week1.KeyboardInput;

import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner getTyped = new Scanner(System.in);

        System.out.println("Digit your first name: ");
        String firstName = getTyped.nextLine();

        System.out.println("Digit your last name: ");
        String lastName = getTyped.nextLine();
        int grade = 0;

        while (true) {
            System.out.println("Digit your grade( 9 - 12 ): ");
            grade = getTyped.nextInt();

            if (grade >= 9 && grade <= 12) {
                break;
            } else {
                System.out.println("Your grade Should be between  9 and 12. Try again!");
            }
        }


        System.out.println("Digit your Student ID: ");
        int studentId = getTyped.nextInt();

        System.out.println("Digit you login: ");
        Scanner getTyped1 = new Scanner(System.in);
        String login = getTyped1.nextLine();


        double gpa = 0;

        while (true) {
            System.out.println("Digit your GPA (0.0-4.0) ");
            gpa = getTyped.nextDouble();

            if (gpa >= 0 && gpa <= 4) {
                break;
            } else {
                System.out.println("Your gpa Should be between  0.0 and 4.0! Try again!");
            }

        }

        System.out.println("Your Information: ");
        System.out.println("          Login: " + login);
        System.out.println("          ID:    " + studentId);
        System.out.println("          Name:  " + lastName +", " +firstName);
        System.out.println("          GPA:   " + gpa);
        System.out.println("          Grade: " + grade);

    }
}

package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner getTyped = new Scanner(System.in);

        System.out.println("Hello. Whats your name?");
        String name = getTyped.nextLine();

        System.out.println("Hi, "+name +"! How old are you?");
        int idade = getTyped.nextInt();

        System.out.println("Did you know that in five years you will be " +(idade + 5) +" years old?");
        System.out.println("And five years ago you were " +(idade - 5) +"! Imagine That!");
    }
}

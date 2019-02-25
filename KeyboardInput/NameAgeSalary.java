package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner getTyped = new Scanner(System.in);

        System.out.println("Hello there! What's your name: ?");
        String name = getTyped.nextLine();

        System.out.println("Hi " +name +"! What's your Age: ?");
        int age = getTyped.nextInt();

        if (age > 50){
            System.out.println("So, you`re " +age + "!. You are getting old, but don't worry! Everybody dies at the End ;) ");
        }else{
            System.out.println("So, you`re " +age + "!. That`s not old at all.");
        }

        System.out.println("How much Thousands per year do you make " +name+"?");
        int salary = getTyped.nextInt();

        if(salary < 50){
            System.out.println("" +salary +" Don`t give up! Life`s not easy!");
        }
        if (salary > 50){
            System.out.println("" +salary +" is a good value!");

        }if (50 < salary && salary > 100 ){

        }if (salary > 100) {
            System.out.println("Do you mind in share your salary with me? :) I could be a good friend! ");

        }
    }
}

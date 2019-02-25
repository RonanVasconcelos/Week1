package Week1.ForLoops;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {

            boolean printed = false;

            if (i % 3 == 0) {
                printed = true;
                System.out.print("Fizz");
            } else if (i % 5 == 0) {
                printed = true;
                System.out.print("Buzz");
            }

            if (Integer.valueOf(i).toString().indexOf("3") != -1) {
                // When i has the digit 3 in it, then print "Bizz"
                printed = true;
                System.out.print("Bizz");
            } else if (Integer.valueOf(i).toString().indexOf("5") != -1) {
                // When i has the digit 5 in it, then print "Fuzz"
                printed = true;
                System.out.print("Fuzz");
            }

            if (printed == false) {
                // The number does not satisfy any of the special conditions above.
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
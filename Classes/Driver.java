package Week1.Classes;

public class Driver {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(5,7,"Blue");
        Rectangle rec2 = new Rectangle(10, 2, "Green");
        Rectangle rec3 = new Rectangle(15, 12, "Red");

        rec1.draw();

        rec2.draw();

        rec3.draw();
    }
}
package R;

import java.awt.Rectangle;

public class R06 {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10, 20, 30);
        System.out.println(rect.getX());
        System.out.println(rect.getY());
        rect.add(0, 0);
        // expected no change
        System.out.println(rect.getX());
        System.out.println(rect.getY());

        addTest(5, 10, 20, 30, 20, 30);
    }

    static void addTest(int currentX, int currentY, int addX, int addY, int expectedX, int expectedY) {
        Rectangle rect = new Rectangle(currentX, currentY, 20, 30);
        rect.add(addX, addY);

        if (expectedX == rect.getX()) {
            System.out.printf("Expected X: %f is the same as Current X: %f%n", expectedX, rect.getX());
        } else if (expectedY == rect.getY()) {
            System.out.printf("Expected X: %f is the same as Current X: %f%n", expectedY, rect.getY());
        } else {
            System.out.printf("New x: %.2f and new y: %.2f%n", rect.getX(), rect.getY());
        }
    }
}
package E;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double width = sc.nextDouble();
        double expected = 2 * (height + width);

        AreaTester2 at = new AreaTester2();
        at.testPerimeter(height, width, expected);
        sc.close();
    }
}

class AreaTester2 {
    void testArea(double height, double width, double expected) {
        Rectangle2 rectangle = new Rectangle2(height, width);
        double actual = rectangle.area();
        if (expected != actual) {
            System.out.printf("Incorrect: Expected: %.2f , Actual: %.2f", expected, actual);
        } else {
            System.out.println("Correct");
        }

    }

    void testPerimeter(double height, double width, double expected) {
        Rectangle2 rectangle = new Rectangle2(height, width);
        double actual = rectangle.perimeter();
        if (expected != actual) {
            System.out.printf("Incorrect: Expected: %.2f , Actual: %.2f", expected, actual);
        } else {
            System.out.println("Correct");
        }

    }

}

class Rectangle2 {
    private double height;
    private double width;

    Rectangle2() {
    }

    Rectangle2(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double getHeight() {
        return height;
    }

    double getWidth() {
        return width;
    }

    double area() {
        return this.height * this.width;
    }

    double perimeter() {
        // P=2(l+w)
        return 2 * (height + width);
    }

}
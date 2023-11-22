package R;

import java.util.Scanner;

public class R03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double height = sc.nextDouble();
        double width = sc.nextDouble();
        double expected = height * width;

        AreaTester at = new AreaTester();
        at.test(height, width, expected);
        sc.close();
    }

}

class AreaTester {
    void test(double height, double width, double expected) {
        Rectangle rectangle = new Rectangle(height, width);
        double actual = rectangle.area();
        if (expected != actual) {
            System.out.printf("Incorrect: Expected: %.2f , Actual: %.2f", expected, actual);
        } else {
            System.out.println("Correct");
        }

    }

}

class Rectangle {
    private double height;
    private double width;

    Rectangle() {
    }

    Rectangle(double height, double width) {
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

}
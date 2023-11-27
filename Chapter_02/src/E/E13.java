package E;

import java.util.Random;

public class E13 {
    public static void main(String[] args) {

        int roll = DieSimulator.roll();
        System.out.println(roll);
    }
}

class Generator {

    public int nextInt(int number) {
        Random rand = new Random();

        return rand.nextInt(number);
    }
}

// Die Simulator
class DieSimulator {
    static int roll() {
        Generator generator = new Generator();
        return generator.nextInt(6) + 1;
    }
}
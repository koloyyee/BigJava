package Exercise;

public class Counter {
    private int value;

    public static void main(String[] args) {
        double x =(2.9999999);
        System.out.printf(" %.2f", x);
    }


    public void undo() {
        if (value > 0) {
            value -= 1;
        } else {
            return;
        }
    }

    public void add() {
        value += 1;
    }

    public int getValue() {
        return value;
    }
}

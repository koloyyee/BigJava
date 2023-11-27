package E;

public class E14 {

    public static void main(String[] args) {
        double randPrice = RandomPrice.getPrice(10.00, 19.95);
        System.out.println(randPrice);
    }
}

class RandomPrice {
    public static double getPrice(double lower, double upper) {
        return Math.floor(Math.random() * (upper - lower + 1) + lower);
    }
}

public class CopyArray {
    public static void main(String[] args) {
        double[] values = { 32, 54, 67.5, 29, 34.5, 80, 115, 44.5, 100, 0 };

        double[] newValues = new double[values.length];

        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        System.out.println(values);
        System.out.println(newValues);

    }

}

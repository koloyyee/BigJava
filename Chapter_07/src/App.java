public class App {
    public static void main(String[] args) throws Exception {
        double[] values = { 32, 54, 67.5, 29, 34.5, 80, 115, 44.5, 100, 0 };

        int currentSize = values.length;
        int pos = 5;
        double newElement = 99;
        for (int i = currentSize - 1; i > pos; i--) {
            
            values[i] = values[i - 1];
        }
        values[pos] = newElement;
    }
}

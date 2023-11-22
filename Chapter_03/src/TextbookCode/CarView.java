package TextbookCode;

import javax.swing.*;

public class CarView {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setSize(300, 400);
        jf.setTitle("Two Cars");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarComponent cc = new CarComponent();
        jf.add(cc);
        jf.setVisible(true);

    }
}

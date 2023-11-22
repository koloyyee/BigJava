package TextbookCode;

import javax.swing.*;
import java.awt.*;

public class CarComponent extends JComponent {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Car c1 = new Car(0,0);

        int x =  getWidth() - 30;
        int y =  getHeight() - 60;

        Car c2 = new Car(x, y);

        c1.draw(g2);
        c2.draw(g2);
    }
}

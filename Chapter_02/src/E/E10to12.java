package E;

import java.awt.Color;

import javax.swing.JFrame;

public class E10to12 {
    // BrighterDemo
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 400);
        Color myColor = new Color(50, 100, 150);

        System.out.println(myColor.brighter());
        Color.RED.darker();
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

// class Color {
// private int red;
// private int green;
// private int blue;

// public Color(int red, int green, int blue) {

// this.blue = blue;
// this.green = green;
// this.red = red;
// }

// public String brighter() {
// return String.format("%s %s %s", red, green, blue);
// }

// }
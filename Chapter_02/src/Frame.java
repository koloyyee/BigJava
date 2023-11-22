import java.awt.Rectangle;

import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("An Empty Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
	}

}

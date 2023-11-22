/**
 * 
 */
package R;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

/**
 * 
 */
public class PrintMyName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int width = 500;
		int height = 100;

		BufferedImage bufferedImage = new BufferedImage(
				width, height, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = bufferedImage.getGraphics();

		Graphics2D graphics2D = (Graphics2D) graphics;
		graphics2D.setRenderingHint(
				RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		graphics2D.drawString("cow", 10, 20);

		for (int i = 0; i < height; i++) {

			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < width; j++) {
				sb.append(bufferedImage.getRGB(j, i) == -16777216 ? " " : "$");
			}
			if (sb.toString().trim().isEmpty()) {
				continue;
			}
			System.out.println(sb);
		}
	}

}

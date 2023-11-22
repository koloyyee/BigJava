package R;

public class PaintingHouse {

	private double width;
	private double length;
	private double height;
	private int windows;
	private int doors;

	public PaintingHouse(
			double width,
			double length,
			double height,
			int windows,
			int doors) {
		this.doors = doors;
		this.windows = windows;
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double calculate() {
		return (this.height * this.width * this.length) + this.windows + this.doors;
	}

}

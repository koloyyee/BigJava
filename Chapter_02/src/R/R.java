package R;

import java.awt.Rectangle;

public class R {

	public static void main(String[] args) {

		// R2.7
		int mystery = 1;
		mystery = 1 - 2 * mystery;
		mystery = mystery + 1;
		System.out.println("m: " + mystery); // 0
		// R2.8
		int mystery2 = 1;
		mystery2 = mystery2 + 1;
		mystery2 = 1 - 2 * mystery2;
		System.out.println("m2 : " + mystery2); // -3

		/**
		 *  
		 */
		// R2.12
		System.out.println("Hello".replace("H", "h"));
		// R2.13
		System.out.println("Hello, world".replace(",", ""));
		// R2.14
		/**
		 * 
		 * Object is a variable that has a data type and method
		 * Object variable is variable that instantiate an object class.
		 * a reference to an object in memory (pointer).
		 */

		// R2.16
		new Rectangle(50, 50, 50, 50).translate(100, 100);
		String content = "Hello, Dave";
		System.out.println(content);
		// R2.17
		new Rectangle(50, 50, 50, 50).translate(100, 100);
		String content2 = "Hello, Dave";
		System.out.println(content2);
	}

	// R2.10
	public void printInt(int i) {
		System.out.println(i);
	}

	public int returnInt(int i) {
		return i;
	}

	public String returnString(String i) {
		return i;
	}

}
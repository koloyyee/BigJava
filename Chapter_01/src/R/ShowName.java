package R;

import java.util.Scanner;

/**
 * E1.5
 */
public class ShowName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = scanner.nextLine();
		if (!name.isEmpty()) {
			print(name);
		} else {
			System.out.println("Input cannot be empty.");
		}
	}

	public static void print(String name) {

		System.out.print(" ");
		for (int i = 0; i < name.length() * 2 - 1; ++i) {
			System.out.print("-");
		}
		System.out.println(" ");

		System.out.print("|");

		for (int i = 0; i < name.length() / 2; ++i) {
			System.out.print("+");
		}
		System.out.print(name);
		for (int i = 0; i < name.length() / 2; ++i) {
			System.out.print("+");
		}

		System.out.println("|");

		System.out.print(" ");
		for (int i = 0; i < name.length() * 2 - 1; ++i) {
			System.out.print("-");
		}
		System.out.println(" ");
	}

}

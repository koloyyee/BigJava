package R;

import java.util.Scanner;

/**
 * E1.3
 */
public class PrintProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("A upperbound any whole number: ");
		int max = Integer.valueOf(scanner.nextLine());

		System.out.println("A lowerbound any whole number: ");
		int min = Integer.valueOf(scanner.nextLine());

		int result = times(min, max);
		System.out.println(result);
	}

	public static int times(int min, int max) {
		int result = min;
		for (int i = min; i < max; i++) {
			result *= i;
		}
		return result;
	}
}

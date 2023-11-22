package R;

/**
 * E1.4
 */

import java.util.Scanner;

public class PrintBalance {

	double balance = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many years in the bank?");
		int years = Integer.valueOf(scanner.nextLine());

		PrintBalance pb = new PrintBalance();
		pb.growth(0.05, years);
		double balance = pb.getBalance();
		System.out.println(balance);

	}

	public void growth(double interest, int years) {
		for (int i = 1; i <= years; i++) {
			balance = balance * (1.0 + interest);
			System.out.println(balance);
		}

	}

	public double getBalance() {
		return balance;
	}

}

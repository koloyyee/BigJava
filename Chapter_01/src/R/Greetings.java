package R;

import java.util.Scanner;

/**
 * E1.1
 */
public class Greetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which country you are from?");
		String input = scanner.nextLine();
		greetIn(input);
	}

	public static void greetIn(String lang) {
		switch (lang.toLowerCase()) {
			case "hong kong":
				System.out.println("哈囉!");
				break;
			case "japan":
				System.out.println("こんばんわ!");
				break;
			case "spain":
			case "argentina":
			case "chille":
				System.out.println("Hola!");
				break;
			case "us":
			case "canada":
			case "uk":
			case "britain":
				System.out.println("Hello!");
				break;
			default:
				System.out.println("Hello!");
				break;
		}
	}

}

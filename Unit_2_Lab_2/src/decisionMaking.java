import java.util.Scanner;

public class decisionMaking {

	public static void main(String[] args) {
		char cont;
		Scanner scnr = new Scanner(System.in);
		Scanner scnr2 = new Scanner(System.in);
		System.out.println("Hi! Please enter your name: ");

		String userName = scnr.nextLine();

		do {
			System.out.println("Hi " + userName + ", Please enter a number between 1 and 100:");
			int userInput = scnr2.nextInt();
			if (userInput <= 0 || userInput > 100) {
				System.out.println("Sorry, " + userName + " the number you entered is out of range.");
				System.out.println("Continue? y/n:");
			} else if (userInput % 2 == 1 && userInput > 60) {
				System.out.println("Odd and over 60.");
				System.out.println("Continue? y/n:");
			} else if (userInput % 2 == 1 && userInput < 60) {
				System.out.println(userInput + " and Odd.");
				System.out.println("Continue? y/n:");
			} else if (userInput % 2 == 0 && userInput < 25) {
				System.out.println("Even and less than 25");
				System.out.println("Continue? y/n:");
			} else if (userInput % 2 == 0 && userInput > 60) {
				System.out.println(userInput + " and Even.");
				System.out.println("Continue? y/n:");

			} else {
				System.out.println("Even");
				System.out.println("Continue? y/n:");
			}
			Scanner scnr3 = new Scanner(System.in);
			cont = scnr3.next().charAt(0);
		} while (cont == 'Y' || cont == 'y');
		System.out.println("Bye " + userName + "!");
	}

}

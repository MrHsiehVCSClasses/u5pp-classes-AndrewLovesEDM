package u5pp;
//package.u5pp;

import java.util.Scanner;

public class InputHelper {
	//creates scanner
	Scanner sc;
	public InputHelper(Scanner sc) {
		//sets input as new scanner
		this.sc = sc;
	}
	public boolean getYesNoInput(String prompt) {
		while (true) {
			System.out.println("please answer yes or no.");
			String urmom = sc.nextLine();
			urmom.toLowerCase();
			
			if (urmom.equals("yes")) {
				return true;
			}
			else if (urmom.equals("y")) {
				return true;
			}
			else if (urmom.equals("no")) {
				return false;
			}
			else if (urmom.equals("n")) {
				return false;
			}
			else {
				System.out.println("Invalid input - does not start with \"y\" or \"n\". Please try again.");
			}
		}
		
	}
	public int getIntegerInput(String prompt, int min, int max) {
		while (true) {
			System.out.println("please chose a number between " + min + " and " + max + "(inclusive).");
			//int urdad = sc.nextLine();
			int urdad = Integer.parseInt(sc.nextLine());
			String stringValue = "" + urdad;
			
			if (urdad <= max && urdad >= min) {
				return urdad;
			}
			else if (urdad >= max) {
				System.out.println("Invalid input - too high. Please try again.");
			}
			else if (urdad <= min) {
				System.out.println("Invalid input - too low. Please try again.");
			}
			else if (stringValue.equals("")) {
				System.out.println("Invalid input - empty line. Please try again.");
			}
			else {
				System.out.println("Invalid input - not a number. Please try again.");
			}
		}
		
	}
}
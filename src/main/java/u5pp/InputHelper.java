package u5pp;
//package.u5pp;

//import java.util.Scanner;

//public class InputHelper {
//	//creates scanner
//	Scanner sc;
//	public InputHelper(Scanner sc) {
//		//sets input as new scanner
//		this.sc = sc;
//	}
//	public boolean getYesNoInput(String prompt) {
//		while (true) {
//			System.out.println("please answer yes or no.");
//			String urmom = sc.nextLine();
//			
//			//checks if 0 is Y or N
//			int letterToCheck = 0;
//			urmom.toLowerCase();
//			String characterToCheck = "y";
//			String characterToCheck2 = "n";
//			
//			String urGrandad = urmom.substring(letterToCheck, letterToCheck + 1);
//			
//			if (urGrandad.equals(String.valueOf(characterToCheck))) {
//				return true;
//			}
//			else if (urGrandad.equals(String.valueOf(characterToCheck2))) {
//				return false;
//			}
////			if (urmom.equals("yes")) {
////				return true;
////			}
////			else if (urmom.equals("y")) {
////				return true;
////			}
////			else if (urmom.equals("no")) {
////				return false;
////			}
////			else if (urmom.equals("n")) {
////				return false;
////			}
//			else {
//				System.out.println("Invalid input - does not start with \"y\" or \"n\". Please try again.");
//			}
//		}
//		
//	}
//	public int getIntegerInput(String prompt, int min, int max) {
//		while (true) {
//			System.out.println("please chose a number between " + min + " and " + max + "(inclusive).");
//			//int urdad = sc.nextLine();
//			int urdad = Integer.parseInt(sc.nextLine());
//			String stringValue = "" + urdad;
//			
//			if (urdad <= max && urdad >= min) {
//				return urdad;
//			}
//			else if (urdad >= max) {
//				System.out.println("Invalid input - too high. Please try again.");
//			}
//			else if (urdad <= min) {
//				System.out.println("Invalid input - too low. Please try again.");
//			}
//			else if (stringValue.equals("")) {
//				System.out.println("Invalid input - empty line. Please try again.");
//			}
//			else {
//				System.out.println("Invalid input - not a number. Please try again.");
//			}
//		}
//	}
	
	import java.util.Scanner;

	public class InputHelper {
	    private Scanner sc;
	    public InputHelper(Scanner scanner) {
	        this.sc = scanner;
	    }

	    // Method to get Yes/No input
	    public boolean getYesNoInput(String prompt) {
	        while (true) {
	            System.out.print(prompt + " (y/n): ");
	            String input = sc.next();
	            input.trim();
	            input.toLowerCase();
	            // if y its true if n its false or makes the user put something different
	            if (input.equals("y")) {
	                return true;
	            } else if (input.equals("n")) {
	                return false;
	            } else {
	                System.out.println("Invalid input - does not start with \"y\" or \"n\". Please try again.");
	            }
	        }
	    }

	    // Method to get integer input within a range
	    public int getIntegerInput(String prompt, int min, int max) {
	        while (true) {
	            System.out.print(prompt + " (" + min + " - " + max + "): ");

	            // Check if the input is an integer
	            if (sc.hasNextInt()) {
	                int urdad = sc.nextInt();

	                // Check if the integer is between the max and min
	                if (urdad <= max && urdad >= min) {
	                    return urdad;
	                } else {
	                    System.out.println("Invalid input. Please enter an integer between " + min + " and " + max + ".");
	                }
	            } else {
	                System.out.println("Invalid input - empty line. Please try again.");
	                sc.nextLine();
	            }
	        }
	    }
	}

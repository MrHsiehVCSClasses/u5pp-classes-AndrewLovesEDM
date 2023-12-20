package u5pp;
//
//import java.util.Scanner;
//
//
//
//public class Card {
//	//naming instance variables
//	Scanner sc;
//	private String currentValue;// make these public static
//	private String currentSuit; // make these public static
//	//private String toString;
//	// make these public static
//	
//	public Card() {
//		this.currentValue = "2";
//		this.currentSuit = "clubs";
//	}
//	public Card(String suit) {
//		this.currentSuit = suit;
//	}
//	public Card(String suit, String value) {
//		this.currentSuit = suit;
//		this.currentValue = value;
//	}
//	//String getValue() returns the value of the Card
//	//String getSuit() returns the suit of the Card
//	//String toString() returns the phrase "The <value> of <suit>"
//	public String getValue() {
//		return currentValue;
//	}
//	public String getSuit() {
//		return currentSuit;
//	}
//	public String toString() {
//		System.out.println("The " + currentValue + " of " + currentSuit);
//		return currentSuit;
//	}
//	//boolean equals(Card c) returns true if both this Card 
//	//and c have the same suit and value, and false otherwise
//	public boolean equals(Card c) {
//		//checks if current value of the card currently has the same value as card c
//		if (this.currentValue == c.currentValue && this.currentSuit == c.currentSuit) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	public void changeSuit(String suit) {
//		//Valid Inputs: clubs, diamonds, hearts, or spades
//		currentSuit.toLowerCase();
//		String clubs = "clubs";
//		String diamonds = "diamonds";
//		String hearts = "hearts";
//		String spades = "spades";
//		if (suit.equals(clubs) || suit.equals(diamonds) || suit.equals(hearts) || suit.equals(spades)) {
//			this.currentSuit = suit;
//		}
//	}
//	public void changeValue(String value) {
//		currentValue.toLowerCase();
//		if (currentValue.equals("ace")) {
//			currentValue = "1";
//		}
//		if (currentValue.equals(jack) || currentValue.equals(jock)) {
//			currentValue = "11";
//		}
//		if (currentValue.equals("queen")) {
//			currentValue = "12";
//		}
//		if (currentValue.equals("king")) {
//			currentValue = "13";
//		}
//		else {
//			System.out.println("Invalid input, try again!");
//		}
//		String minimum = "1";
//		//checks to see if valuey is between minimum and maximum
//		int minimumE = Integer.parseInt(minimum);
//		String maximum = "13";
//		int maximumE = Integer.parseInt(maximum);
//		int valuey = Integer.parseInt(currentValue);
//		if (valuey >= minimumE) {
//			if (valuey <= maximumE){
//				this.currentValue = value;
//			}
//		}
//	}
//	
//	
//	
//	
//	
//	
//}


public class Card {
	private String currentValue;// make these public static
	private String currentSuit; // make these public static
    public Card() {
    	// default values :)
        this.currentValue = "2";
        this.currentSuit = "clubs";
    }
    public Card(String suit) {
        this.currentValue = "2";
        changeSuit(suit);
    }
    public Card(String suit, String value) {
        changeSuit(suit);
        changeValue(value);
    }
    public String getValue() {
        return currentValue;
    }
    public String getSuit() {
        return currentSuit;
    }
    public String toString() {
        return "The " + currentValue + " of " + currentSuit;
    }
    public boolean equals(Card c) {
    	//comparing the two suits and values to see if they are equal to each other or not
        return this.currentSuit.equalsIgnoreCase(c.currentSuit) && this.currentValue.equalsIgnoreCase(c.currentValue);
    }
    public void changeSuit(String newSuit) {
        String stuffs = newSuit.toLowerCase();
        // checks to see if the suit if one of the four suits
        if (stuffs.equals("spades") || stuffs.equals("diamonds") || stuffs.equals("hearts") || stuffs.equals("clubs")) {
            this.currentSuit = stuffs;
        }
     // unsuccessful attempt to fix errors (jock stuff)
//		String jack = "jack";
//		String jock = "JOCK";
    }
    public void changeValue(String newValue) {
    	String newerValue = newValue.toLowerCase();
    	// checks to see if the value is one of the values listed
        if (newerValue.equals("2") || newerValue.equals("3") || newerValue.equals("4") || newerValue.equals("5") || newerValue.equals("6") || newerValue.equals("7") || newerValue.equals("8") || newerValue.equals("9") || newerValue.equals("10") || newerValue.equals("jack") || newerValue.equals("queen") || newerValue.equals("king") || newerValue.equals("ace")) {
            this.currentValue = newerValue;
        }
    }
}

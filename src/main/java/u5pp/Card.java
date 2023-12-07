package u5pp;

import java.util.Scanner;



public class Card {
	//naming instance variables
	Scanner sc;
	private String currentValue;// make these public static
	private String currentSuit; // make these public static
	//private String toString;
	// make these public static
	
	public Card() {
		this.currentValue = "2";
		this.currentSuit = "clubs";
	}
	public Card(String suit) {
		this.currentSuit = suit;
	}
	public Card(String suit, String value) {
		this.currentSuit = suit;
		this.currentValue = value;
	}
	//String getValue() returns the value of the Card
	//String getSuit() returns the suit of the Card
	//String toString() returns the phrase "The <value> of <suit>"
	//example: "The 2 of clubs", "The queen of spades"
	public String getValue() {
		return currentValue;
	}
	public String getSuit() {
		return currentSuit;
	}
	public String toString() {
		System.out.println("The " + currentValue + " of " + currentSuit);
		return currentSuit;
	}
	//boolean equals(Card c) returns true if both this Card 
	//and c have the same suit and value, and false otherwise
	public boolean equals(Card c) {
		//checks if current value of the card currently has the same value as card c
		if (this.currentValue == c.currentValue && this.currentSuit == c.currentSuit) {
			return true;
		}
		else {
			return false;
		}
	}
	public void changeSuit(String suit) {
		//Valid Inputs: clubs, diamonds, hearts, or spades
		currentSuit.toLowerCase();
		String clubs = "clubs";
		String diamonds = "diamonds";
		String hearts = "hearts";
		String spades = "spades";
		if (suit.equals(clubs) || suit.equals(diamonds) || suit.equals(hearts) || suit.equals(spades)) {
			this.currentSuit = suit;
		}
	}
	public void changeValue(String value) {
		currentValue.toLowerCase();
		if (currentValue.equals("ace")) {
			currentValue = "1";
		}
		if (currentValue.equals("jack")) {
			currentValue = "11";
		}
		if (currentValue.equals("queen")) {
			currentValue = "12";
		}
		if (currentValue.equals("king")) {
			currentValue = "13";
		}
		String minimum = "1";
		int minimumE = Integer.parseInt(minimum);
		String maximum = "13";
		int maximumE = Integer.parseInt(maximum);
		int valuey = Integer.parseInt(currentValue);
		if (valuey >= minimumE) {
			if (valuey <= maximumE){
				this.currentValue = value;
			}
		}
	}
	
	
	
	
	
	
}
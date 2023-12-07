package u5pp;

import java.util.Scanner;


public class Dice {
	Scanner sc;
	//naming instance variables
	private int numSides;
	private String color;
	private int currentSide;
	
	public Dice() {
		//these are the default settings for the dice
		this.currentSide = 1;
		this.numSides = 6;
		this.color = "green";
	
	}
	public int getSides() {
		//returns the set number of sides
		return numSides;
	}
	
	public int getCurrentSide() {
		//returns the set current number on the dice
		return currentSide;
	}
	public String getColor() {
		return color;
	}
	public boolean equals(Dice d) {
		//checks if current side of dice currently has the same side as dice d
		return this.currentSide == d.currentSide;
	}
	
	public String toString() {
		return "The " + color + " " + numSides + " -sided dice is showing " + currentSide;
	}
	
	public Dice(int numSides) {
		this.numSides = numSides;
	}
	public Dice(int numSides, int startingSide) {
		this.numSides = numSides;
		this.currentSide = startingSide;
	}
	public Dice(int numSides, int startingSide, String color) {
		this.numSides = numSides;
		this.currentSide = startingSide;
		this.color = color;
	}
	public int roll() {
		//rolls a random number between 1 and max number of sides
		sc.nextLine();
		currentSide = (int) (Math.random() * numSides) + 1;
		return currentSide;
	}
	public void changeSide(int num) {
		if (1 <= num && num <= numSides) {
			this.currentSide = num;
		}
	}
	public void changeColor(String color) {
		this.color = color;
	}
	public void changeNumSides(int num) {
		this.numSides = num;
	}
	
}

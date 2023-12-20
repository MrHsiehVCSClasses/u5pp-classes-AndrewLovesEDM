package u5pp;

import java.util.Scanner;
import java.util.Random;

public class Dice {
	//instance variables
	Scanner sc;
	private int numSides;
	private String color;
	private int currentSide;
	
	public Dice() {
		this.currentSide = 1;
		this.numSides = 6;
		this.color = "green";
	
	}
	public int getSides() {
		return numSides;
	}
	
	public int getCurrentSide() {
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
		return "The " + color + " " + numSides + "-sided dice is showing " + currentSide;
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
	private int maximumValue;
    private Random urdad;

    // creates the maximum
    public void random(int maximum) {
        maximumValue = maximum;
        urdad = new Random();
    }

	public int roll() {
		//rolls a random number between 1 and max number of sides
		sc.nextLine();
		//currentSide = (int) (Math.random());
		return urdad.nextInt(maximumValue) + 1;
		//return currentSide;
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

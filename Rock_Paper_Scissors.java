package projects;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;


//COMPLETED!!!
//NOTE: I Should have made a seperate class to store this information in... That would have been much easier.

public class Rock_Paper_Scissors {

	public static void main(String[] args) {
	
		
		Scanner userChoice = new Scanner(System.in);
		Random rand = new Random();
		String user;
		int randNum;
		
		
		System.out.println("This is a Rock-Paper-Scissors game.");
		System.out.println("Please say what you want to select: ");
		
		user = userChoice.nextLine();
		
		
		//Asks you what you are gonna choose
		if(user.equals("Rock") || user.equals("rock")) {
			System.out.println("You chose rock!");
		}else if(user.equals("Paper") || user.equals("paper")) {
			System.out.println("You chose paper!");
		}else if(user.equals("Scissors") || user.equals("scissors")) {
			System.out.println("You chose scissors!");
		}else {
			System.out.println("That's not a rock, paper or scissor!");
		}
		
		
		System.out.println("Now it's the computer's turn!");
		System.out.println("...");
		System.out.println("...");
		
		//Makes randNUm generate random numbers from 15 or below.
		randNum = rand.nextInt(15);
		
		String compChoice;
		
		//Lets the computer do something depending on the number generated
		if (randNum <= 5) {
			System.out.println("The computer chose rock!");
		}else if (randNum <= 10 && randNum > 5) {
			System.out.println("The computer chose paper!");
		}else if(randNum <= 15 && randNum > 10) {
			System.out.println("The computer chose scissors!");
		}
		
		
		
		//Decide the outcome if player chose rock
		if((user.equals("Rock") || user.equals("rock")) && randNum <= 5) {
			
			System.out.println("Tie!");
			
		}else if((user.equals("Rock") || user.equals("rock")) && randNum > 5 && randNum <= 10) {
			
			System.out.println("Computer Wins!");
			
		}else if((user.equals("Rock") || user.equals("rock")) && randNum > 10 && randNum <= 15) {
			
			System.out.println("You Win!");
			
		}
		
		
		
		//Decide the outcome if player chose paper
		if((user.equals("Paper") || user.equals("paper")) && randNum <= 5) {
			
				System.out.println("You Win!");
			
		}else if((user.equals("Paper") || user.equals("paper")) && randNum > 5 && randNum <= 10) {
			
				System.out.println("Tie!");
			
		}else if((user.equals("Paper") || user.equals("paper")) && randNum > 10 && randNum <= 15) {
			
				System.out.println("Computer Wins!");
			
		}
		
		
		//Decide the outcome if player chose scissors
		if((user.equals("Scissors") || user.equals("scissors")) && randNum <= 5) {
			
			System.out.println("Computer Wins!");
		
	}else if((user.equals("Scissors") || user.equals("scissors")) && randNum > 5 && randNum <= 10) {
		
			System.out.println("You Win!");
		
	}else if((user.equals("Scissors") || user.equals("scissors")) && randNum > 10 && randNum <= 15) {
		
			System.out.println("Tie!");
		
	}
		
		
		
	}
	
	}



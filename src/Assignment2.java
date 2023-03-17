/*-------------------------------------------------------------
// AUTHOR: Justin Lee
// FILENAME: Assignment2.java
// SPECIFICATION: Make a program to play rock paper scissors.
// FOR: CS 1400 - Assignment #2
// TIME SPENT: 20 minutes
//-----------------------------------------------------------*/
import java.util.*;
public class Assignment2 {
    public static void main(String[] Args) {
        Scanner s = new Scanner(System.in);
        //Asks for Player 1 input. Then creates a String p1, scans and stores the first input as all lowercase.
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String p1 = s.nextLine().toLowerCase();
        //Asks for Player 2 input. Then creates a String p2, scans and stores the second input as all lowercase.
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String p2 = s.nextLine().toLowerCase();
        //Check if any of the inputs were not "rock", "scissors", or "paper", and returns "Wrong choice" if any are invalid.
        if ((!p1.equals("rock") && !p1.equals("paper") && !p1.equals("scissors")) || (!p2.equals("rock") && !p2.equals("paper") && !p2.equals("scissors"))) {
            System.out.println("Wrong choice");
        }
        //Checks if the two inputs are the same and returns a tie if they are.
        else if (p1.equals(p2)) {
            System.out.println("It is a tie.");
        }
        //Checks winning conditions for Player 1 and returns "Player 1 wins".
        else if ((p1.equals("rock") && p2.equals("scissors")) || (p1.equals("scissors") && p2.equals("paper")) || (p1.equals("paper") && p2.equals("rock"))){
            System.out.println("Player 1 wins.");
        }
        //If the inputs are valid, it's not a tie, and Player 1 did not win, Player 2 must have won.
        else {
            System.out.println("Player 2 wins.");
        }
    }
}

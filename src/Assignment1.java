/*
// AUTHOR: Justin Lee
// FILENAME: Assignment1.java
// SPECIFICATION: Convert javelin throw distances from meters.
// FOR: CS 1400 - ASSIGNMENT #1
// TIME SPENT: 1 hour
//*/
import java.util.*;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the competitor's name: ");
        String name = s.nextLine();
        System.out.println("\n\t\t\t\tOlympic Javelin Throws\n\t\tEnter the distances, in meters, for " + name + "\n");
        double[] Throw = new double[3];
        for (int i = 1; i < 4; i++) {
            System.out.print("Please enter the distance for throw " + i + ": ");
            Throw[i-1] = s.nextDouble();
        }
        s.close();
        System.out.printf("\n%-15s %-15s %-15s %-15s \n", "Yards", "Feet", "Inches", "Cm");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15.2f %-15.2f %-15.2f %-15.2f \n", Throw[i] * 1.093, Throw[i] * 3 * 1.093, Throw[i] * 12 * 3 * 1.093, Throw[i] * 100);
        }
    }
}
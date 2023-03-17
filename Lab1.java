import java.util.Scanner;

/*
// AUTHOR: Justin Lee
// FILENAME: Lab1.java
// SPECIFICATION: Find the average score of three tests.
// FOR: CS 1400 - Lab 1
// TIME SPENT: 30 minutes
//*/
public class Lab1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] test = new int[3];
        String[] number = {"first", "second", "third"};
        double total = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the score on the " + number[i] + " test: ");
            test[i] = s.nextInt();
            total += test[i];
        }
        double average = total / test.length;
        System.out.printf("%s %.4f", "Your average score is: ", average);
    }
}

/*-------------------------------------------------------------
// AUTHOR: Justin Lee
// FILENAME: Assignment3.java
// SPECIFICATION: Practice using a loop and switch statement.
// FOR: CS 1400- Assignment #3
// TIME SPENT: 30 minutes
//-----------------------------------------------------------*/
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        char input;
        Scanner s = new Scanner(System.in);
        int i = 0;
        System.out.println("Please enter a string.");
        String s1 = s.next();
        System.out.println("Please enter another string.");
        String s2 = s.next();
        System.out.println("Command Options\n-----------------------------------");
        System.out.println("a: find if the lengths of the strings are equal");
        System.out.println("b: find if the two strings are the same");
        System.out.println("c: find which string is lexically larger");
        System.out.println("d: print the first character of each string");
        System.out.println("e: concatenate the two strings");
        System.out.println("f: print both strings in uppercase");
        System.out.println("q: quit this program\n");
        while (i == 0) {
            System.out.println("\nPlease, enter an option from the menu.");
            switch (s.next()) {
                case "a":
                    if (s1.length() == s2.length()) {
                        System.out.println("\nThe lengths are the same.");
                    }
                    else {
                        System.out.println("\nThe lengths are not the same.");
                    }
                    break;
                case "b":
                    if (s1.equals(s2)) {
                        System.out.println("\nThe two strings are the same.");
                    }
                    else {
                        System.out.println("\nThe two strings are different.");
                    }
                    break;
                case "c":
                    if (s1.length() > s2.length()) {
                        System.out.println("\nThe first string is lexically larger.");
                    }
                    else if (s2.length() > s1.length()) {
                        System.out.println("\nThe second string is lexically larger.");
                    }
                    else {
                        System.out.println("\nThe two strings are the same length.");
                    }
                    break;
                case "d":
                    System.out.println("\nThe first character of the first string is " + s1.substring(0, 1) + "\nThe first character of the second string is " + s2.substring(0, 1));
                    break;
                case "e":
                    System.out.println("\nThe concatenation of the two strings is \"" + s1 + s2 + "\"");
                    break;
                case "f":
                    System.out.println("\nThe first string using upper case letters: " + s1.toUpperCase() + "\nThe second string using upper case letters: " + s2.toUpperCase());
                    break;
                case "q":
                    System.out.println("\nGoodbye!");
                    i++;
                    break;
                default:
                    System.out.println("\nInvalid option.");
                    break;
            }
        }
    }
}
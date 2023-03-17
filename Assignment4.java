/*-------------------------------------------------------------
// AUTHOR: Justin Lee
// FILENAME: Assignment4.java
// SPECIFICATION: Make a program to test if positive integers that are entered are prime and then count, add, and average them.
// FOR: CS 1400 - Assignment #4
// TIME SPENT: 40 minutes
//-----------------------------------------------------------*/
import java.util.*;
import static java.lang.Integer.MAX_VALUE;

public class Assignment4 {
    public static void main(String[] Args) {
        Scanner s = new Scanner(System.in);
        int max = -1;
        int min = MAX_VALUE;
        int sum = 0;
        int count = 0;
        double average = 0;
        do {
            System.out.println("Enter a positive integer. Enter -1 to quit.");
            int num = s.nextInt();
            if (num == -1) {
                System.out.println("The maximum positive number is: " + max);
                System.out.println("The minimum positive number is: " + min);
                System.out.println("The sum is: " + sum);
                System.out.println("The count of number(s) is: " + count);
                System.out.printf("%s %.2f", "The average is: ", average);
                break;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
            count++;
            average = average(sum, count);
            System.out.println(isPrime(num));
        } while (true);
    }
    public static double average(double sum, double count) {
        double avg = sum / count;
        return avg;
    }
    public static String isPrime(int num) {
        if (num == 1) {
            return "The number " + num + " is not a prime number.";
        }
        int div = 3;
        if (num % 2 == 0) {
            div = 2;
        }
        for (int i = 2; i <= num / div; i++) {
            if (num % i == 0) {
                return "The number " + num + " is not a prime number.";
            }
        }
        return "The number " + num + " is a prime number.";
    }

}

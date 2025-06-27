// Question:
// Write a Java program using while loop to check whether a given number is a Perfect Number or not.
// A Perfect Number is a positive integer that is equal to the sum of its proper divisors (excluding itself).
// Example: 6 is a perfect number because 1 + 2 + 3 = 6.

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        int i = 1;

        while (i < num) {
            if (num % i == 0) {
                sum += i;  // Add the divisor
            }
            i++;
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }
    }
}

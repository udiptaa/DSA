
// Write a Java program to check whether a given number is a palindrome or not using while loop.


import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;        
            reversed = reversed * 10 + digit; 
            num = num / 10;                 
        }
        System.out.println(reversed);
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

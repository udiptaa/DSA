import java.util.Scanner;

public class ArmstrongNumber {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int org = num;

        
        int count = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        
        int sum = 0;
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);// yahan pr explict conversion krna prta agar += ki jagha method 2 use krte   -->  sum =sum+(int)Math.pow(digit, count);
            temp = temp / 10;
        }

        
        if (sum == org) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not an Armstrrong");
        }
    }
}

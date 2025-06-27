// WAP to count number of digits of a number 

import java.util.Scanner;

public class NumberofDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter sny random number: ");
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}

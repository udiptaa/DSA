import java.util.Scanner;
// a number whose sum of digits is equal to the sum of the digits of its prime factors

public class BostonNo {
    // // Function to return sum of digits
    // public static int sumOfDigits(int num) {
    //     int sum = 0;
    //     while(num > 0) {
    //         sum += num % 10;
    //         num /= 10;
    //     }
    //     return sum;
    // }

    // // Function to check Boston number
    // public static boolean isBostonNumber(int num) {
    //     int sumDigits = sumOfDigits(num);
    //     int temp = num;
    //     int sumPrimeDigits = 0;
    //     int i = 2;

    //     while (temp > 1 && i <= temp) {
    //         while (temp % i == 0) {
    //             sumPrimeDigits += sumOfDigits(i);
    //             temp /= i;
    //         }
    //         i++;
    //     }

    //     return sumDigits == sumPrimeDigits;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number to check if it's a Boston number: ");
    //     int num = sc.nextInt();

    //     if (isBostonNumber(num))
    //         System.out.println(num + " is a Boston number.");
    //     else
    //         System.out.println(num + " is NOT a Boston number.");
    // }
    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numbeer ti o check if it's a Boston number: ");
    int num =sc.nextInt();
    int dNum=num;
    //For finding sum of digits 
    int digSum=0;
    while(dNum!=0){
        int rem =dNum%10;
        digSum+=dNum;
        dNum/=10;
    }

    
    int pNum=num;
    int pSum=0;
    // for finding sum of prime factors
    for(int i=1;i<=pNum;i++){
        if(pNum%i==0){
            if(i/10!=0){
                int pRem=0;
                while(i!=0){
                    pRem=pRem+(i%10);
                    i=i/10;
                    
                }
                pSum=pSum+pRem;    
            }
            else{
                pSum=pSum+i;
            }
        }
    }


    if(pSum==digSum){
        System.out.println("Boston number");
    }
    else{
        System.out.println("Not a boston number;");
    }
   } 
}

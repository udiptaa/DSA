import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two numbers to find their HCF:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            while (num2 != 0) {
                int remainder = num1 % num2;
                num1 = num2;
                num2 = remainder;
            }
            System.out.println("HCF is: " + num1);
        }
    }

// int hcf=1;
// for(int i=2;i<=Math.min(num1,num2);i++){
//     if (num1%i==0 && num2%i==0){
//         hcf=i;
//     }
// }
//  System.out.println(hcf);

// ye wala method sir ka hai isko vv try krna haai 
